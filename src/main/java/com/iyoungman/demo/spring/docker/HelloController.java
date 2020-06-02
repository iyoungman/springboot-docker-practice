package com.iyoungman.demo.spring.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by iyoungman on 2020-05-28.
 */

@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "hello";
    }
}
