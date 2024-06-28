package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int parametroUm;
        int parametroDois;
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro:");
            parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            parametroDois = terminal.nextInt();
            // Fechando o scanner após o uso
        }

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }

        int totalIteracoes = parametroDois - parametroUm + 1;
        System.out.println("Total de iterações: " + totalIteracoes);
    }
}
