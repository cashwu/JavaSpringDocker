package com.cashwu.javadocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author cash.wu
 * @since 2024/05/28
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {

        return String.format("Hello World! %s", DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")
                                                                 .format(LocalDateTime.now()));
    }
}
