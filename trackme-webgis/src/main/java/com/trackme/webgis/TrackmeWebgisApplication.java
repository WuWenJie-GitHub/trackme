package com.trackme.webgis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.trackme.webgis.mapper")
@SpringBootApplication
public class TrackmeWebgisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrackmeWebgisApplication.class, args);
    }

}
