package br.com.marciomartins.fundamentos;

/**
 * Demonstra declaração de variáveis, conversão de tipos e constantes.
 */
public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500.00;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroConvertido = (short) numeroNormal;
        final double VALOR_DE_PI = 3.14;

        System.out.println("Salário de referência: " + salarioMinimo);
        System.out.println("Valor convertido: " + numeroConvertido);
        System.out.println("Valor de PI: " + VALOR_DE_PI);
    }
}