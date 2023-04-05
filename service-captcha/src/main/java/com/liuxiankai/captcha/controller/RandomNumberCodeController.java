package com.liuxiankai.captcha.controller;

import com.liuxiankai.captcha.service.IRandomNumberCodeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RandomNumberCodeController {

    @Resource(name = "RandomNumberCodeService")
    private IRandomNumberCodeService randomNumberCodeService;

    @GetMapping("RandomNumberCode/{length}")
    public String randomNumberCode(@PathVariable("length") int length) {
        int i = randomNumberCodeService.generatorRandomNumberCode(length);
        return "";
    }
}
