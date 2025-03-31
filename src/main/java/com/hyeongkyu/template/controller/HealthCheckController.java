package com.hyeongkyu.template.controller;

import com.hyeongkyu.template.global.common.ResponseDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName   : com.hyeongkyu.template.controller
 * Author        : imhyeong-gyu
 * Data          : 2025. 3. 31.
 * Description   :
 */

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public ResponseDto<?> healthCheck() {
        return ResponseDto.ok("health check");
    }

}
