package com.github.acnaweb.gs_2_vr_ar_workspaces.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.acnaweb.gs_2_vr_ar_workspaces.dto.tema.TemaResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Tema Controller", description = "Controller para informações do tema do projeto")
public class TemaController {

    @GetMapping("/info")
    @Operation(
        summary = "Obter informações do tema", 
        description = "Retorna informações sobre o tema do projeto, membros do grupo e descrição"
    )
    @ApiResponses(value = {
        @ApiResponse(
            responseCode = "200", 
            description = "Informações do tema retornadas com sucesso",
            content = @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = TemaResponse.class)
            )
        )
    })
    public ResponseEntity<TemaResponse> getInfo() {
        TemaResponse response = new TemaResponse();
        response.setTema("Ambientes de trabalho com Realidade Virtual ou Aumentada");
        response.setMembro1("Rafael Bueno Villela");
        response.setMembro2("Cesar Iglesias");
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

}

