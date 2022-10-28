import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndiceSatisfacaoDoClienteTest {
    @Test
    void retornoIndiceSatisfacaoDoCliente() {
        ISatisfacao satisfacao = SatisfacaoFactory.calcularSatisfaçãoDaEmpresa("IndiceSatisfacaoDoCliente");
        assertEquals(75, satisfacao.calcularMétrica());
    }
}