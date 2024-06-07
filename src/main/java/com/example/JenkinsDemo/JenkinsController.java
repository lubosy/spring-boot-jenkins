package com.example.JenkinsDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping("text")
    public String getText(){
        return "Jenkins CI CD Complete";
    }

    @GetMapping("text")
    public String getDemo(){
        return "Jenkins CI CD Demo";
    }
}
