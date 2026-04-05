package com.jenkins_docker_demo.jenkins_docker_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsDemoController {
    @GetMapping("/demo")
    public String jenkinsDocker(){
        return "Jenkins Docker Demo";
    }
}
