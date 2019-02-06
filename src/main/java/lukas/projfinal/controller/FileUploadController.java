package lukas.projfinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class FileUploadController {

    public static String uploadDirectory = "src/main/resources/static/uploads";

    @RequestMapping("/upload")
    public String UploadPage(Model model) {

        return "uploadview";
    }

    @RequestMapping("/uploaded")
    public String uploadModel(Model model, @RequestParam("files") MultipartFile[] files) {

        StringBuilder fileNames = new StringBuilder();

        for (MultipartFile file: files) {

            Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());

            fileNames.append(file.getOriginalFilename() + " ");

            try {
                Files.write(fileNameAndPath, file.getBytes());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        model.addAttribute("msg", "Successfully uploaded files " +fileNames.toString());

        return "uploadstatview";
    }
}
