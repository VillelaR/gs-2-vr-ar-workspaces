package com.github.acnaweb.gs_2_vr_ar_workspaces.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ControllerTemaTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetInfo() throws Exception {
        mockMvc.perform(get("/api/v1/tema/info"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.tema").exists())
                .andExpect(jsonPath("$.membro1").exists())
                .andExpect(jsonPath("$.membro2").exists())
                .andExpect(jsonPath("$.descricao").exists())
                .andExpect(jsonPath("$.tema").value("Ambientes de trabalho com Realidade Virtual ou Aumentada"))
                .andExpect(jsonPath("$.membro1").value("Rafael Bueno Villela - RM550275"))
                .andExpect(jsonPath("$.membro2").value("Cesar Iglesias - RM98007"));
    }

    @Test
    void testPing() throws Exception {
        mockMvc.perform(get("/api/v1/tema/ping"))
                .andExpect(status().isOk())
                .andExpect(content().string("Pong"));
    }

    @Test
    void testVersion() throws Exception {
        mockMvc.perform(get("/api/v1/tema/version"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.containsString("Versão")));
    }

    @Test
    void testInfoRoot() throws Exception {
        mockMvc.perform(get("/info"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.tema").exists())
                .andExpect(jsonPath("$.membro1").value("Rafael Bueno Villela - RM550275"))
                .andExpect(jsonPath("$.membro2").value("Cesar Iglesias - RM98007"));
    }
}
