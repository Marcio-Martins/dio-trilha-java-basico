import br.com.marciomartins.calculadora.Calculadora;
import br.com.marciomartins.smarttv.SmartTv;

public class SmokeTests {
    public static void main(String[] args) {
        testarCalculadora();
        testarSmartTv();
        testarLimitesSmartTv();
        System.out.println("Todos os testes automatizados passaram.");
    }

    private static void testarCalculadora() {
        Calculadora calculadora = new Calculadora();
        verificar(calculadora.somar(2, 3) == 5, "2 + 3 deve ser 5");
        verificar(calculadora.somar(-2, 2) == 0, "-2 + 2 deve ser 0");
        verificar(calculadora.somar(0, 0) == 0, "0 + 0 deve ser 0");
        verificar(calculadora.somar(Integer.MAX_VALUE, 0) == Integer.MAX_VALUE,
                "Somar zero ao maior inteiro deve preservar o valor");
    }

    private static void testarSmartTv() {
        SmartTv tv = new SmartTv();
        verificar(!tv.isLigada(), "A TV deve iniciar desligada");
        verificar(tv.getCanal() == 1, "O canal inicial deve ser 1");
        verificar(tv.getVolume() == 25, "O volume inicial deve ser 25");
        tv.ligar();
        verificar(tv.isLigada(), "A TV deve ligar");
        tv.mudarCanal(13);
        verificar(tv.getCanal() == 13, "O canal deve mudar para 13");
        tv.aumentarCanal();
        verificar(tv.getCanal() == 14, "O canal deve aumentar para 14");
        tv.diminuirCanal();
        verificar(tv.getCanal() == 13, "O canal deve diminuir para 13");
        tv.aumentarVolume();
        verificar(tv.getVolume() == 26, "O volume deve aumentar para 26");
        tv.diminuirVolume();
        verificar(tv.getVolume() == 25, "O volume deve diminuir para 25");
        tv.desligar();
        verificar(!tv.isLigada(), "A TV deve desligar");
    }

    private static void testarLimitesSmartTv() {
        SmartTv tv = new SmartTv();
        verificarLanca(IllegalArgumentException.class, () -> tv.mudarCanal(0), "Canal zero deve ser rejeitado");
        verificarLanca(IllegalArgumentException.class, () -> tv.mudarCanal(-1), "Canal negativo deve ser rejeitado");
        verificarLanca(IllegalStateException.class, tv::diminuirCanal, "Não deve diminuir abaixo do canal 1");
        for (int i = 0; i < 75; i++) tv.aumentarVolume();
        verificar(tv.getVolume() == 100, "O volume máximo deve ser 100");
        verificarLanca(IllegalStateException.class, tv::aumentarVolume, "Não deve ultrapassar o volume 100");
        for (int i = 0; i < 100; i++) tv.diminuirVolume();
        verificar(tv.getVolume() == 0, "O volume mínimo deve ser 0");
        verificarLanca(IllegalStateException.class, tv::diminuirVolume, "Não deve diminuir o volume abaixo de zero");
    }

    private static void verificar(boolean condicao, String mensagem) {
        if (!condicao) throw new AssertionError(mensagem);
    }

    private static void verificarLanca(Class<? extends Throwable> tipoEsperado, Runnable acao, String mensagem) {
        try {
            acao.run();
        } catch (Throwable erro) {
            if (tipoEsperado.isInstance(erro)) return;
            throw new AssertionError(mensagem + ". Exceção inesperada: " + erro, erro);
        }
        throw new AssertionError(mensagem + ". Nenhuma exceção foi lançada.");
    }
}