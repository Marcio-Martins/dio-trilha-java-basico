import br.com.marciomartins.fundamentos.Operadores;
import br.com.marciomartins.fundamentos.TiposVariaveis;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FundamentosExamplesTest {
    @Test
    @DisplayName("exemplo de operadores demonstra o resultado esperado")
    void deveExecutarExemploDeOperadores() {
        String saida = capturarSaida(() -> Operadores.main(new String[0]));
        assertTrue(saida.lines().anyMatch("1"::equals), "A saída deve conter o resultado 1.");
    }

    @Test
    @DisplayName("exemplo de tipos demonstra variáveis, conversão e constante")
    void deveExecutarExemploDeTiposVariaveis() {
        String saida = capturarSaida(() -> TiposVariaveis.main(new String[0]));
        assertTrue(saida.contains("Salário de referência:"), "Deve demonstrar a variável double.");
        assertTrue(saida.contains("Valor convertido: 1"), "Deve demonstrar a conversão de tipo.");
        assertTrue(saida.contains("Valor de PI: 3.14"), "Deve demonstrar a constante.");
    }

    private String capturarSaida(Runnable exemplo) {
        PrintStream saidaOriginal = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try (PrintStream captura = new PrintStream(buffer, true, StandardCharsets.UTF_8)) {
            System.setOut(captura);
            exemplo.run();
        } finally {
            System.setOut(saidaOriginal);
        }
        return buffer.toString(StandardCharsets.UTF_8);
    }
}