package com.jojoldu.book.freelecspringboot2websevice.web.practice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static javax.swing.UIManager.get;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// TODO: 필요한 import (Autowired, WebMvcTest, MockMvc, get, status, content)

@WebMvcTest(controllers = EchoController.class)

public class EchoControllerTest {

    @Autowired

    private MockMvc mvc;

    @Test

    public void spring을_거꾸로_뒤집으면_gnirps() throws Exception {
        String gnirps = "gnirps";
        mvc.perform(MockMvcRequestBuilders.get("/echo/spring"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(gnirps));

        // TODO: GET /echo/spring 요청 → status 200 → content "gnirps" 검증

    }

}
