package com.github.acnaweb.gs_2_vr_ar_workspaces.dto.tema;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Resposta com informações do tema do projeto")
public class TemaResponse {
    
    @Schema(
        description = "Nome do tema escolhido", 
        example = "Ambientes de trabalho com Realidade Virtual ou Aumentada",
        required = true
    )
    private String tema;
    
    @Schema(
        description = "Nome e RM do primeiro membro", 
        example = "Rafael Bueno Villela - RM550275",
        required = true
    )
    private String membro1;
    
    @Schema(
        description = "Nome e RM do segundo membro", 
        example = "Cesar Iglesias - RM98007",
        required = true
    )
    private String membro2;
    
    @Schema(
        description = "Descrição detalhada do tema", 
        example = "Esta API foi desenvolvida para suportar ambientes de trabalho inovadores que utilizam tecnologias de Realidade Virtual (VR) e Realidade Aumentada (AR). O objetivo é criar plataformas que permitam colaboração remota imersiva, reuniões virtuais em espaços 3D, treinamentos interativos e ambientes de trabalho híbridos que combinam elementos físicos e digitais. A solução visa transformar a forma como as equipes trabalham, oferecendo experiências mais envolventes e produtivas através de tecnologias imersivas.",
        required = true
    )
    private String descricao;

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getMembro1() {
        return membro1;
    }

    public void setMembro1(String membro1) {
        this.membro1 = membro1;
    }

    public String getMembro2() {
        return membro2;
    }

    public void setMembro2(String membro2) {
        this.membro2 = membro2;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}


