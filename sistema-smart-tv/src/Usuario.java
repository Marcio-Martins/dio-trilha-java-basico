/**
 * Demonstra as operações disponíveis na Smart TV.
 */
public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: " + smartTv.getCanal());
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.getCanal());
        System.out.println("Volume atual: " + smartTv.getVolume());
        System.out.println("TV ligada? " + smartTv.isLigada());

        smartTv.ligar();
        System.out.println("Novo status — TV ligada? " + smartTv.isLigada());
        smartTv.desligar();
        System.out.println("Novo status — TV ligada? " + smartTv.isLigada());
    }
}
