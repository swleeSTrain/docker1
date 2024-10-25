package org.zerock.docker1.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@Log4j2
@RequiredArgsConstructor
public class SampleController {

    private final DataSource dataSource;

    @GetMapping("hello")
    public String[] hello() {

        log.info("hello");
        log.info("===============");

        log.info(dataSource);

        log.info("===============");

        return new String[]{"LEE", "Sangwon", "lsw", dataSource.toString()};
    }
}
