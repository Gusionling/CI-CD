package com.hyeongkyu.template.controller;

import com.hyeongkyu.template.global.common.ResponseDto;
import com.hyeongkyu.template.global.constants.Constants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName   : com.hyeongkyu.template.controller
 * Author        : imhyeong-gyu
 * Data          : 2025. 3. 31.
 * Description   :
 */

@RestController
@RequestMapping(Constants.API_PREFIX+"/health")
public class HealthCheckController {

    @Value("${server.address}")
    private String address;

    @Value("${spring.profiles.active}")
    private String env;

    @GetMapping("/env")
    public ResponseDto<?> healthCheck() {
        return ResponseDto.ok(env);
    }

    @GetMapping("/address")
    public ResponseDto<?> getServerAddress(){
        return ResponseDto.ok("서버 주소: " + address);
    }
}
