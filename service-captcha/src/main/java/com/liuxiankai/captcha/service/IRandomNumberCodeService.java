package com.liuxiankai.captcha.service;

public interface IRandomNumberCodeService {

    /**
     * 生成指定长度的随机数字
     *
     * @param length 随机码长度
     * @return 随机码
     */
    int generatorRandomNumberCode(int length);
}
