import br.com.marciomartins.terminal.Comentarios;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComentariosTest {
    private final Comentarios exemplo = new Comentarios();

    @Test
    @DisplayName("multiplica quando a operação é M")
    void deveMultiplicarQuandoOperacaoForM() {
        assertEquals(12, exemplo.somaMultiplica(3, 4, "M"));
    }

    @Test
    @DisplayName("compara o conteúdo da string, não sua identidade")
    void deveMultiplicarComOutraInstanciaDeString() {
        assertEquals(12, exemplo.somaMultiplica(3, 4, new String("M")));
    }

    @Test
    @DisplayName("soma quando a operação não é M")
    void deveSomarQuandoOperacaoNaoForM() {
        assertEquals(7, exemplo.somaMultiplica(3, 4, "S"));
    }

    @Test
    @DisplayName("trata operação nula como soma")
    void deveSomarQuandoOperacaoForNula() {
        assertEquals(7, exemplo.somaMultiplica(3, 4, null));
    }
}