package com.manning.openbanking.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.notNullValue;

import com.manning.openbanking.services.TransactionService;


@WebMvcTest
public class TransactionalControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TransactionService transactionService;


    @Test
    void testTransactionControllerIntegration() throws Exception {

        mockMvc.perform(get("/api/transactions/123456789").contentType(MediaType.APPLICATION_JSON))

        .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$[*]date", notNullValue())) // todos las tranasaction con valor en date
            .andExpect(jsonPath("$[*]id", notNullValue())); // todos las tranasaction con valor en date
            
    }
}
