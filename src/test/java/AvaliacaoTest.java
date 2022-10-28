import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvaliacaoTest {
    @Test
    void retornoSatisfacaoAvaliacao() {
        ISatisfacao satisfacao = SatisfacaoFactory.calcularSatisfaçãoDaEmpresa("Avaliacao");
        assertEquals(4, satisfacao.calcularMétrica());
    }
}