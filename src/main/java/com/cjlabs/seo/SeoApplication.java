package com.cjlabs.seo;

@SpringBootApplication
public class SeoApplication {

    public static void main(String[] args) {
        ApplicationContextRunnerWrapper.run(RemoteApplication.class, args);
    }
}
