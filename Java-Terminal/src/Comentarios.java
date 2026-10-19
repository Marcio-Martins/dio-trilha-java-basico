package br.com.marciomartins.terminal;

/**
 * Exemplos de comentários e de uma operação simples de soma ou multiplicação.
 */
public class Comentarios {
    public static void main(String[] args) {
        // Comentário de uma única linha.

        /*
         * Comentário de múltiplas linhas.
         * Use comentários para explicar decisões importantes.
         */
    }

    /**
     * Multiplica os valores quando a operação é "M"; caso contrário, soma.
     *
     * @param n primeiro número inteiro
     * @param x segundo número inteiro
     * @param operacao "M" para multiplicar; qualquer outro valor para somar
     * @return resultado da operação
     */
    public int somaMultiplica(int n, int x, String operacao) {
        if ("M".equals(operacao)) {
            return n * x;
        }
        return n + x;
    }
}