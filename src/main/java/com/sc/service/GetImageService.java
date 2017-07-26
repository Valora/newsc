package com.sc.service;

import com.sc.storage.StorageService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

/**
 * Created by valora on 2017/6/26.
 */
@Service
public class GetImageService {
    @Autowired
    private StorageService storageService;


    /**
     * 返回图片
     * @param path 路径
     * @param response http响应
     */
    public void getImg(String path, HttpServletResponse response) {
        if (StringUtils.isEmpty(path)) {
            return;
        }
        try {
            File file = storageService.loadAsFile(path);
            String fileType = storageService.getFileType(file.getAbsolutePath());
            if (fileType != null) {
                response.setContentType("image/" + fileType);
                BufferedImage bufferedImage = ImageIO.read(file);
                OutputStream outputStream = response.getOutputStream();
                ImageIO.write(bufferedImage, fileType, outputStream);
                outputStream.close();
            } else {
                // 载入图像
                BufferedImage buffImg = ImageIO.read(new FileInputStream(path));
                response.setContentType("image/png");
                // 将图像输出到Servlet输出流中。
                ServletOutputStream sos = response.getOutputStream();
                ImageIO.write(buffImg, "png", sos);
                sos.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return;
        }
    }

    /**
     * 返回视频
     * @param path 路径
     * @param response 响应
     */
    public void getVideo(String path, HttpServletResponse response) {
        if (StringUtils.isEmpty(path)) {
            return;
        }
        try {
            File file = storageService.loadAsFile(path);
            response.setContentType("video/mp4");
            BufferedImage bufferedImage = ImageIO.read(file);
            OutputStream outputStream = response.getOutputStream();
            ImageIO.write(bufferedImage, "jpg", outputStream);
            outputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            return;
        }
    }
}
