package com.jojoldu.book.freelecspringboot2websevice.web.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HealthController {
    // TODO: GET /health 매핑
    @GetMapping("/health")
    public HealthResponseDto health() {
        return new HealthResponseDto("OK", LocalDateTime.now());
    }

}
