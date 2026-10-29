package org.example;

public class AtendimentoRotina extends Atendimento {

    @Override
    protected String avaliarPaciente() {
        return "Avaliação clínica de rotina";
    }

    @Override
    protected String definirConduta() {
        return "Orientações preventivas";
    }
}