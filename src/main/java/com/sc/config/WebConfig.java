package com.sc.config;

import org.springframework.context.annotation.Configuration;

/**
 * 配置https
 * Created by valora on 2017/4/27.
 */
@Configuration
public class WebConfig {
    //Https证书位置与端口
//    @Bean
//    public EmbeddedServletContainerCustomizer containerCustomizer() {
//        return container -> {
//            Ssl ssl = new Ssl();
//            ssl.setKeyStore("src/main/resources/mykeys.jks");
//            ssl.setKeyStorePassword("tzhlkj");
//            container.setSsl(ssl);
//            container.setPort(8443);
//        };
//    }
//
//    //Http重定向到Https
//    @Bean
//    public EmbeddedServletContainerFactory servletContainerFactory() {
//        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory() {
//            @Override
//            protected void postProcessContext(Context context) {
//                SecurityConstraint securityConstraint = new SecurityConstraint();
//                securityConstraint.setUserConstraint("CONFIDENTIAL");
//                SecurityCollection collection = new SecurityCollection();
//                collection.addPattern("/*");
//                securityConstraint.addCollection(collection);
//                context.addConstraint(securityConstraint);
//            }
//        };
//        factory.addAdditionalTomcatConnectors(createHttpConnector());
//        return factory;
//    }
//
//    private Connector createHttpConnector() {
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setScheme("http");
//        connector.setSecure(false);
//        connector.setPort(8080);
//        connector.setRedirectPort(8443);
//        return connector;
//    }
}