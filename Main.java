package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        Main main = new Main(); // Criar uma instância de Main
        try {
            // Chamar o método contar a partir da instância de Main
            main.contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }

    }

    // Método estático para realizar a contagem
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            for(int valor = 0; valor <= contagem; valor++ ){
                System.out.println("imprimindo o valor: " + valor);
            }
        }
    }

    // Classe interna para representar a exceção de parâmetros inválidos
    public static class ParametrosInvalidosException extends Exception {
    }
}
