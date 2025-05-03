package com.daffodilschool.schoolmanagement.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.UUID;
@Service
public class StudentPhotoService {

    @Value("${app.env}")
    private String appEnv;

    @Value("${app.photo.local-path}")
    private String localPath;

  /*  @Autowired
    private AmazonS3 amazonS3;*/

    /*@Value("${cloud.aws.s3.bucket}")
    private String bucketName;*/

    public String saveStudentPhoto(String base64, String filename) throws IOException {
        byte[] decodedBytes = Base64.getDecoder().decode(base64);
        String uniqueFilename = UUID.randomUUID() + "_" + filename;

        if ("local".equalsIgnoreCase(appEnv)) {
            // Save locally
            Path filePath = Paths.get(localPath + File.separator + uniqueFilename);
            Files.write(filePath, decodedBytes);
            return filePath.toString();
        } else {
            // Upload to AWS S3
           /* InputStream inputStream = new ByteArrayInputStream(decodedBytes);
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentLength(decodedBytes.length);
            amazonS3.putObject(bucketName, uniqueFilename, inputStream, metadata);
            return amazonS3.getUrl(bucketName, uniqueFilename).toString();*/
            return null;
        }
    }
}

