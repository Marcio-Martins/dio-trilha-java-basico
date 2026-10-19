/**
 * Representa uma Smart TV com controle básico de canal, volume e energia.
 */
public class SmartTv {
    private static final int VOLUME_MINIMO = 0;
    private static final int VOLUME_MAXIMO = 100;

    private boolean ligada;
    private int canal;
    private int volume;

    public SmartTv() {
        ligada = false;
        canal = 1;
        volume = 25;
    }

    public boolean isLigada() { return ligada; }
    public int getCanal() { return canal; }
    public int getVolume() { return volume; }

    public void mudarCanal(int novoCanal) {
        if (novoCanal < 1) {
            throw new IllegalArgumentException("O canal deve ser maior ou igual a 1.");
        }
        canal = novoCanal;
        System.out.println("Canal alterado para: " + canal);
    }

    public void aumentarCanal() {
        mudarCanal(canal + 1);
        System.out.println("Avançando para o canal: " + canal);
    }

    public void diminuirCanal() {
        if (canal == 1) {
            throw new IllegalStateException("A TV já está no menor canal permitido.");
        }
        canal--;
        System.out.println("Retrocedendo para o canal: " + canal);
    }

    public void aumentarVolume() {
        if (volume == VOLUME_MAXIMO) {
            throw new IllegalStateException("O volume já está no máximo.");
        }
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        if (volume == VOLUME_MINIMO) {
            throw new IllegalStateException("O volume já está no mínimo.");
        }
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar() { ligada = true; }
    public void desligar() { ligada = false; }
}
