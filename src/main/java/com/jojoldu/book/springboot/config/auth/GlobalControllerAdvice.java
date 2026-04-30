package com.jojoldu.book.springboot.config.auth;

import com.jojoldu.book.springboot.config.auth.dto.SessionUser;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.web.bind.annotation.ModelAttribute;

import jakarta.servlet.http.HttpSession;

@RequiredArgsConstructor

@ControllerAdvice

public class GlobalControllerAdvice {

    private final HttpSession httpSession;

    @ModelAttribute("userName")

    public String userName() {

        SessionUser user = (SessionUser) httpSession.getAttribute("user");

        return user != null ? user.getName() : null;

    }

}
