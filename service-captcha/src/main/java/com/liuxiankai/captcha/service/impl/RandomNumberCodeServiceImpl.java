package com.liuxiankai.captcha.service.impl;

import com.liuxiankai.captcha.service.IRandomNumberCodeService;
import org.springframework.stereotype.Service;

@Service("RandomNumberCodeService")
public class RandomNumberCodeServiceImpl implements IRandomNumberCodeService {


    @Override
    public int generatorRandomNumberCode(int length) {

        return 0;
    }
}
