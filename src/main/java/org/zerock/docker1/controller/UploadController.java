package org.zerock.docker1.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.docker1.dto.SampleDTO;
import org.zerock.docker1.util.CustomFileUtil;

import java.util.Arrays;
import java.util.List;
@Log4j2
@RestController
@RequestMapping("/api/v1/file")
@RequiredArgsConstructor
public class UploadController {

    private final CustomFileUtil customFileUtil;

    @PostMapping("upload")
    public List<String> upload(SampleDTO sampleDTO) {
        log.info(sampleDTO);

        List<String> fileNames =
                customFileUtil.saveFiles(Arrays.asList(sampleDTO.getFiles()));

        log.info(fileNames);
        return fileNames;
    }


}
