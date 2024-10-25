package org.zerock.docker1.dto;

import lombok.Data;
import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class SampleDTO {
    private String title;

    private MultipartFile[] files;

    private List<String> uploadedFileNames;
}
