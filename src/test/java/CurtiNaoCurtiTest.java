import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurtiNaoCurtiTest {
    @Test
    void  retornoSatisfacaoCurtiNaoCurti () {
        ISatisfacao satisfacao = SatisfacaoFactory.calcularSatisfaçãoDaEmpresa("CurtiNaoCurti");
        assertEquals(98, satisfacao.calcularMétrica());
    }
}