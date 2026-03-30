package com.cjlabs.seo;

import com.cjlabs.boot.runner.ApplicationContextRunnerWrapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeoApplication {

    public static void main(String[] args) {
        ApplicationContextRunnerWrapper.run(SeoApplication.class, args);
    }
}
