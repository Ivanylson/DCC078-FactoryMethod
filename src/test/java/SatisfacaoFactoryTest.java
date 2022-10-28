import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SatisfacaoFactoryTest {
    @Test
    void returnNotFoundSatisfaction() {
        try {
            ISatisfacao satisfacao = SatisfacaoFactory.calcularSatisfaçãoDaEmpresa("Classe não encontrada");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de satisfação não encontrado", e.getMessage());
        }
    }

    @Test
    void returnInvalidSatisfaction() {
        try {
            ISatisfacao satisfacao = SatisfacaoFactory.calcularSatisfaçãoDaEmpresa("OutroSemSatisfacao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de satisfação não encontrado", e.getMessage());
        }
    }
}