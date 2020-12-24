package dev.alvarocar.msscbeerservice.business.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.alvarocar.msscbeerservice.model.dto.Beer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BeerController.class)
class BeerControllerTest {

    private final String uriBase = "/api/v1/beer/";

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getBeerByIdTest() throws Exception{
        mockMvc.perform(get(uriBase + UUID.randomUUID().toString())
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void saveNewBeerTest() throws Exception{
        var beer = Beer.builder().build();
        String beerJson = objectMapper.writeValueAsString(beer);

        mockMvc.perform(post(uriBase)
        .contentType(MediaType.APPLICATION_JSON)
        .content(beerJson))
                .andExpect(status().isCreated());
    }

    @Test
    void updateBeerByIdTest() throws Exception{
        var beer = Beer.builder().build();
        String beerJson = objectMapper.writeValueAsString(beer);

        mockMvc.perform(put(uriBase)
        .contentType(MediaType.APPLICATION_JSON)
        .content(beerJson))
                .andExpect(status().isNoContent());
    }
}