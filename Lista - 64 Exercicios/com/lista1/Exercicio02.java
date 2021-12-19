package com.lista1;
import java.util.Scanner;

/*
Faça um programa que: 
- Leia a cotação do dólar 
- Leia um valor em dólares 
- Converta esse valor para Real 
- Mostre o resultado
*/
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a cotação do dólar hoje: ");
        double cotacaoDolar = input.nextDouble();

        System.out.println("Digite o valor em dólares: ");
        double dolar = input.nextFloat();

        double real = cotacaoDolar * dolar;

        System.out.printf("O valor em reais é %f", real);
        input.close();
    }
}
