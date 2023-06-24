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

    /**
     * 获取随机长度的数字码
     * @param length 指定验证码长度
     * @return 指定长度的随机码
     */
    @GetMapping("RandomNumberCode/{length}")
    public String randomNumberCode(@PathVariable("length") int length) {
        int randomNumberCode = randomNumberCodeService.generatorRandomNumberCode(length);
        return String.valueOf(randomNumberCode);
    }
}
