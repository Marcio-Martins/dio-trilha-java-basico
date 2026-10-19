import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {
    private final Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("soma dois números positivos")
    void deveSomarNumerosPositivos() {
        assertEquals(5, calculadora.somar(2, 3));
    }

    @Test
    @DisplayName("soma números negativos e positivos")
    void deveSomarNumerosDeSinaisOpostos() {
        assertEquals(0, calculadora.somar(-2, 2));
    }

    @Test
    @DisplayName("soma zeros")
    void deveSomarZeros() {
        assertEquals(0, calculadora.somar(0, 0));
    }

    @Test
    @DisplayName("preserva o maior inteiro ao somar zero")
    void devePreservarMaiorInteiroAoSomarZero() {
        assertEquals(Integer.MAX_VALUE, calculadora.somar(Integer.MAX_VALUE, 0));
    }
}
