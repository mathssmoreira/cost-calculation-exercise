package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double gastoTotal = 0.0;

        System.out.println("*** Gasto Familiar ***");

        System.out.println("Insira o valor da conta de luz: ");
        Double contaLuz =  scanner.nextDouble();
        System.out.println("Insira o valor da conta de água: ");
        Double contaAgua =  scanner.nextDouble();
        System.out.println("Insira o valor da conta de telefone: ");
        Double contaTelefone =  scanner.nextDouble();
        System.out.println("Insira o valor da Escola: ");
        Double contaEscola =  scanner.nextDouble();
        System.out.println("Insira o valor da fatura do cartão: ");
        Double contaCartão =  scanner.nextDouble();
        System.out.println("Insira o valor do supermercado: ");
        Double contaSupermercado =  scanner.nextDouble();

        gastoTotal += contaLuz;
        gastoTotal += contaAgua;
        gastoTotal += contaTelefone;
        gastoTotal += contaEscola;
        gastoTotal += contaCartão;
        gastoTotal += contaSupermercado;

        System.out.println("Gasto mensal familiar foi de " + gastoTotal);


    }
}