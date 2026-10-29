package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Atendimento {

    // Template Method
    public final List<String> executar() {
        List<String> etapas = new ArrayList<>();

        etapas.add("Registrar paciente");
        etapas.add(avaliarPaciente());
        etapas.add(definirConduta());

        if (necessitaObservacao()) {
            etapas.add("Encaminhar para observação");
        }

        etapas.add("Finalizar atendimento");

        return etapas;
    }

    protected abstract String avaliarPaciente();

    protected abstract String definirConduta();

    // Hook: pode ser sobrescrito pelas subclasses
    protected boolean necessitaObservacao() {
        return false;
    }
}