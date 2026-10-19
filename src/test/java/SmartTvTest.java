import br.com.marciomartins.smarttv.SmartTv;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartTvTest {
    private SmartTv tv;

    @BeforeEach
    void configurar() {
        tv = new SmartTv();
    }

    @Test
    @DisplayName("inicia desligada, no canal 1 e volume 25")
    void deveIniciarComEstadoPadrao() {
        assertFalse(tv.isLigada());
        assertEquals(1, tv.getCanal());
        assertEquals(25, tv.getVolume());
    }

    @Test
    @DisplayName("liga e desliga")
    void deveAlternarEnergia() {
        tv.ligar();
        assertTrue(tv.isLigada());

        tv.desligar();
        assertFalse(tv.isLigada());
    }

    @Test
    @DisplayName("altera e navega entre canais")
    void deveAlterarCanal() {
        tv.mudarCanal(10);
        assertEquals(10, tv.getCanal());

        tv.aumentarCanal();
        assertEquals(11, tv.getCanal());

        tv.diminuirCanal();
        assertEquals(10, tv.getCanal());
    }

    @Test
    @DisplayName("rejeita canal zero ou negativo")
    void deveRejeitarCanalInvalido() {
        assertAll(
            () -> assertThrows(IllegalArgumentException.class, () -> tv.mudarCanal(0)),
            () -> assertThrows(IllegalArgumentException.class, () -> tv.mudarCanal(-1))
        );
    }

    @Test
    @DisplayName("impede canal abaixo de 1")
    void naoDeveDiminuirAlemDoCanalMinimo() {
        assertThrows(IllegalStateException.class, tv::diminuirCanal);
        assertEquals(1, tv.getCanal());
    }

    @Test
    @DisplayName("mantém o volume entre 0 e 100")
    void deveRespeitarLimitesDeVolume() {
        for (int i = 0; i < 75; i++) {
            tv.aumentarVolume();
        }
        assertEquals(100, tv.getVolume());
        assertThrows(IllegalStateException.class, tv::aumentarVolume);

        for (int i = 0; i < 100; i++) {
            tv.diminuirVolume();
        }
        assertEquals(0, tv.getVolume());
        assertThrows(IllegalStateException.class, tv::diminuirVolume);
    }
}