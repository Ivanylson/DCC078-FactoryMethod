import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetricaDeLealdadeClienteTest {
    @Test
    void returnSatisfacaoMetricaDeLealdadeCliente() {
        ISatisfacao satisfacao = SatisfacaoFactory.calcularSatisfaçãoDaEmpresa("MetricaDeLealdadeCliente");
        assertEquals(80, satisfacao.calcularMétrica());
    }
}