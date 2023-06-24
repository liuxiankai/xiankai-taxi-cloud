package com.liuxiankai.passenger.controller;

import com.liuxiankai.passenger.pojo.dto.VerificationCodeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificationCodeController {

    /**
     * 验证码获取接口
     * @param verificationCodeDTO 获取验证码入参--接受验证码的电话号码
     * @return 返回随机验证码
     */
    @GetMapping("/verification-code")
    public String verificationCode(@RequestBody VerificationCodeDTO verificationCodeDTO) {
        String passengerPhone = verificationCodeDTO.getPassengerPhone();
        System.out.println(passengerPhone);
        return "";
    }
}
