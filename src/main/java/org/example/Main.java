package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Informe o numero da agencia");
        int numConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe a agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o saldo disponível na conta: ");
        float saldo = scanner.nextFloat();

        scanner.close();

        System.out.println("ola senhor(a) " + nome + " obrigado por criar uma conta em nosso banco!, sua agencia é "+ agencia
        + " conta numero: " + numConta + " e seu saldo de: " + saldo + " esta disponivel para saque!");

        
    }
}