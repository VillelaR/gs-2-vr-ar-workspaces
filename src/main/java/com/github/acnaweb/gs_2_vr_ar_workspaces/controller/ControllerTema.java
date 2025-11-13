package com.github.acnaweb.gs_2_vr_ar_workspaces.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.acnaweb.gs_2_vr_ar_workspaces.dto.tema.TemaResponse;

@RestController
@RequestMapping("/api/${api.version}/tema")
public class ControllerTema {
    
    @Value("${api.version}")
    private String version;

    @GetMapping("/info")
    public ResponseEntity<TemaResponse> getInfo() {
        TemaResponse response = new TemaResponse();
        response.setTema("Ambientes de trabalho com Realidade Virtual ou Aumentada");
        response.setMembro1("Nome do Membro 1");
        response.setMembro2("Nome do Membro 2");
        response.setDescricao(
            "Esta API foi desenvolvida para suportar ambientes de trabalho inovadores que utilizam " +
            "tecnologias de Realidade Virtual (VR) e Realidade Aumentada (AR). O objetivo é criar " +
            "plataformas que permitam colaboração remota imersiva, reuniões virtuais em espaços 3D, " +
            "treinamentos interativos e ambientes de trabalho híbridos que combinam elementos físicos " +
            "e digitais. A solução visa transformar a forma como as equipes trabalham, oferecendo " +
            "experiências mais envolventes e produtivas através de tecnologias imersivas."
        );
        
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<TemaResponse> getInfoRoot() {
        return getInfo();
    }

    @GetMapping("/ping")
    public String ping() {
        return "Pong";
    }

    @GetMapping("/version")
    public String version() {
        return "Versão: " + version;
    }

}

