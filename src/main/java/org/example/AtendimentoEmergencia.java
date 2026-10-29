package org.example;

public class AtendimentoEmergencia extends Atendimento {

    @Override
    protected String avaliarPaciente() {
        return "Classificação de risco";
    }

    @Override
    protected String definirConduta() {
        return "Estabilização imediata";
    }

    @Override
    protected boolean necessitaObservacao() {
        return true;
    }
}