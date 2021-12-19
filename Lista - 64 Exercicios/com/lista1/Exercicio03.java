package com.lista1;

import java.util.Scanner;

/*
 * Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
  comissão será de 5% do total da venda e que você tem os seguintes dados:
- Identificação do vendedor
- Código da peça
- Preço unitário da peça
- Quantidade vendida

*/

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome do vendedor: ");
		String vendedor = input.nextLine();
		System.out.println("Digite o preço da peça: ");
		int precoPeca = input.nextInt();
		System.out.println("Digite a quantidade de peças: ");
		int quantidade = input.nextInt();
		
		double comissao;
		
		comissao = (precoPeca * quantidade)*0.05;
		
		
		
		System.out.printf("O %s vai receber %.2f pelas %d peças ",vendedor,comissao,quantidade );
		input.close();
	}
}
