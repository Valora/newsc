package com.sc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.alibaba.fastjson.util.TypeUtils;
import com.sc.storage.StorageProperties;
import com.sc.storage.StorageService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan(basePackages = "com.sc.mapper")
@EnableConfigurationProperties(StorageProperties.class)
@EnableAsync
public class NewscApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewscApplication.class, args);
    }

    @Bean
    CommandLineRunner init(StorageService storageService) {
        return (args) -> {
        };
    }

    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        TypeUtils.compatibleWithJavaBean = true;
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        FastJsonHttpMessageConverter fastConvert = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.WriteDateUseDateFormat, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullListAsEmpty);
        fastConvert.setFastJsonConfig(fastJsonConfig);
        return new HttpMessageConverters((HttpMessageConverter<?>) fastConvert);
    }

}
