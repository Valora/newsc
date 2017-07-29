package com.sc.storage;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {

    void init();

    Boolean store(MultipartFile file, String newfilename);

    Stream<Path> loadAll();

    Path load(String filename);

    File loadAsFile(String filename);

    Resource loadAsResource(String filename);

    void deleteAll();

    void deleteByFigurePath(String figurepath);
    
    Boolean isImage(String fileName);

    String getFileType(String fileName);

    boolean storeAndCompress(MultipartFile multipartFile, String newfilename, String thfilename);
}
