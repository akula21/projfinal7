package lukas.projfinal;

import lukas.projfinal.controller.FileUploadController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;

@SpringBootApplication
public class ProjfinalApplication {

    public static void main(String[] args) {

        new File(FileUploadController.uploadDirectory).mkdir();

        SpringApplication.run(ProjfinalApplication.class, args);
    }
}
