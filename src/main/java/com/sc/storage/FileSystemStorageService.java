package com.sc.storage;

import net.coobird.thumbnailator.Thumbnails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.*;
import java.util.stream.Stream;

@Service
public class FileSystemStorageService implements StorageService {

    private final Path rootLocation;

    @Autowired
    public FileSystemStorageService(StorageProperties properties) {
        this.rootLocation = Paths.get(properties.getLocation());
    }

    @Override
    public Boolean store(MultipartFile file, String newfilename) {
        try {
            if (file.isEmpty()) {
                throw new StorageException("Failed to store empty file " + file.getOriginalFilename());
            }
            Path newPath = this.rootLocation.resolve(newfilename);
            if (!Files.exists(newPath))
                Files.createDirectories(newPath);
            Files.copy(file.getInputStream(), newPath, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception e) {
            throw new StorageException("Failed to store file " + file.getOriginalFilename(), e);
        }
    }

    @Override
    public Stream<Path> loadAll() {
        try {
            return Files.walk(this.rootLocation, 1)
                    .filter(path -> !path.equals(this.rootLocation))
                    .map(this.rootLocation::relativize);
        } catch (IOException e) {
            throw new StorageException("Failed to read stored files", e);
        }

    }

    @Override
    public Path load(String filename) {
        return rootLocation.resolve(filename);
    }

    @Override
    public File loadAsFile(String filename) {
        if (StringUtils.isEmpty(filename)) {
            return null;
        }
        return new File(filename);
    }


    @Override
    public Resource loadAsResource(String filename) {
        try {
            Path file = load(filename);
            Resource resource = new UrlResource(file.toUri());
            if (resource.exists() || resource.isReadable()) {
                return resource;
            } else {
                throw new StorageFileNotFoundException("Could not read file: " + filename);
            }
        } catch (MalformedURLException e) {
            throw new StorageFileNotFoundException("Could not read file: " + filename, e);
        }
    }

    @Override
    public void deleteAll() {
        FileSystemUtils.deleteRecursively(rootLocation.toFile());
    }

    @Override
    public void deleteByFigurePath(String figurepath) {
        File file = new File(figurepath);
        if (file.exists()) {
            file.delete();
        }
    }

    @Override
    public void init() {
        try {
            Files.createDirectory(rootLocation);
        } catch (IOException e) {
            throw new StorageException("Could not initialize storage", e);
        }
    }

    @Override
    public Boolean isImage(String fileName) {
        String[] img_type = new String[]{".jpg", ".jpeg", ".png", ".gif", ".bmp", "blob"};
        if (fileName == null) {
            return false;
        }
        fileName = fileName.toLowerCase();
        for (String type : img_type) {
            if (fileName.endsWith(type)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getFileType(String fileName) {
        if (fileName != null && fileName.indexOf(".") >= 0) {
            return fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
        }
        return "png";
    }

    @Override
    public boolean storeAndCompress(MultipartFile multipartFile, String newfilename, String thfilename) {
        try {
            if (multipartFile.isEmpty()) {
                throw new StorageException("Failed to store empty file " + multipartFile.getOriginalFilename());
            }
            Path newPath = this.rootLocation.resolve(newfilename);
            if (!Files.exists(newPath))
                Files.createDirectories(newPath);
            Files.copy(multipartFile.getInputStream(), newPath, StandardCopyOption.REPLACE_EXISTING);
            Thumbnails.of("C:\\" + newfilename).scale(0.2f).toFile("C:\\" + thfilename);
            return true;
        } catch (Exception e) {
            throw new StorageException("Failed to store file " + multipartFile.getOriginalFilename(), e);
        }
    }
}
