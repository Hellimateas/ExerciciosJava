package com.lista1;

import java.util.Scanner;

/*
 * Fa�a um programa para pagamento de comiss�o de vendedores de pe�as, levando-se em considera��o que sua
  comiss�o ser� de 5% do total da venda e que voc� tem os seguintes dados:
- Identifica��o do vendedor
- C�digo da pe�a
- Pre�o unit�rio da pe�a
- Quantidade vendida

*/

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome do vendedor: ");
		String vendedor = input.nextLine();
		System.out.println("Digite o pre�o da pe�a: ");
		int precoPeca = input.nextInt();
		System.out.println("Digite a quantidade de pe�as: ");
		int quantidade = input.nextInt();
		
		double comissao;
		
		comissao = (precoPeca * quantidade)*0.05;
		
		
		
		System.out.printf("O %s vai receber %.2f pelas %d pe�as ",vendedor,comissao,quantidade );
		input.close();
	}
}
