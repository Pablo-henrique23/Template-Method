package org.example;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Modifier;
import java.util.List;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


class AtendimentoTest {

    @Test
    void deveExecutarAtendimentoRotina() {
        Atendimento atendimento = new AtendimentoRotina();

        List<String> esperado = List.of(
                "Registrar paciente",
                "Avaliação clínica de rotina",
                "Orientações preventivas",
                "Finalizar atendimento"
        );

        assertEquals(esperado, atendimento.executar());
    }

    @Test
    void deveExecutarAtendimentoEmergencia() {
        Atendimento atendimento = new AtendimentoEmergencia();

        List<String> esperado = List.of(
                "Registrar paciente",
                "Classificação de risco",
                "Estabilização imediata",
                "Encaminhar para observação",
                "Finalizar atendimento"
        );

        assertEquals(esperado, atendimento.executar());
    }

    @Test
    void deveManterOrdemDasEtapas() {
        Atendimento atendimento = new AtendimentoEmergencia();

        List<String> etapas = atendimento.executar();

        assertEquals("Registrar paciente", etapas.get(0));
        assertEquals("Finalizar atendimento", etapas.get(etapas.size() - 1));
    }

    @Test
    void templateMethodDeveSerFinal() throws NoSuchMethodException {
        var metodo = Atendimento.class.getDeclaredMethod("executar");

        assertTrue(Modifier.isFinal(metodo.getModifiers()));
    }
}