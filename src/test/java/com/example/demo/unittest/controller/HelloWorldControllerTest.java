package com.example.demo.unittest.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(value = HelloWorldController.class)
@RunWith(SpringRunner.class)
public class HelloWorldControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void helloWorld_basic() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/esraa")
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk())
                .andExpect(content().string("Hello esraa")).andReturn();
       // assertEquals("Hello esraa",result.getResponse().getContentAsString());
    }
}
