public class SmokeTests {
    public static void main(String[] args) {
        testarCalculadora();
        testarSmartTv();
        System.out.println("Todos os testes automatizados passaram.");
    }

    private static void testarCalculadora() {
        Calculadora calculadora = new Calculadora();
        verificar(calculadora.somar(2, 3) == 5, "2 + 3 deve ser 5");
        verificar(calculadora.somar(-2, 2) == 0, "-2 + 2 deve ser 0");
        verificar(calculadora.somar(0, 0) == 0, "0 + 0 deve ser 0");
    }

    private static void testarSmartTv() {
        SmartTv tv = new SmartTv();
        verificar(!tv.ligada, "A TV deve iniciar desligada");
        verificar(tv.canal == 1, "O canal inicial deve ser 1");
        verificar(tv.volume == 25, "O volume inicial deve ser 25");

        tv.ligar();
        verificar(tv.ligada, "A TV deve ligar");

        tv.mudarCanal(13);
        verificar(tv.canal == 13, "O canal deve mudar para 13");

        tv.aumentarCanal();
        verificar(tv.canal == 14, "O canal deve aumentar para 14");

        tv.diminuirCanal();
        verificar(tv.canal == 13, "O canal deve diminuir para 13");

        tv.aumentarVolume();
        verificar(tv.volume == 26, "O volume deve aumentar para 26");

        tv.diminuirVolume();
        verificar(tv.volume == 25, "O volume deve diminuir para 25");

        tv.desligar();
        verificar(!tv.ligada, "A TV deve desligar");
    }

    private static void verificar(boolean condicao, String mensagem) {
        if (!condicao) {
            throw new AssertionError(mensagem);
        }
    }
}
