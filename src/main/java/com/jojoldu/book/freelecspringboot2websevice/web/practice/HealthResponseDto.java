package com.jojoldu.book.freelecspringboot2websevice.web.practice;

import lombok.Getter;

import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter

@RequiredArgsConstructor

public class HealthResponseDto {

    private final String status;

    // TODO: timestamp 필드 (LocalDateTime 타입)를 추가하세요
    private final LocalDateTime timestamp;

}
