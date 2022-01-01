package com.lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> mult = new ArrayList<>();
		List<Integer> num = new ArrayList<>();
		for (int i = 1; i <= 4; i++) {
			num.add(input.nextInt());
		}
		for (int i = 0; i < num.size(); i++) {
			for (int j = 1; j < num.size(); j++) {
				if (num.get(i) >= num.get(j))
					continue;
				mult.add(num.get(i) * num.get(j));
			}
		}

		int indice = 0;
		for (int i = 0; i < num.size(); i++) {
			for (int j = 1; j < num.size(); j++) {
				if (num.get(i) >= num.get(j))
					continue;
				System.out.printf("A multiplicação de %s e %s dá %s\n", num.get(i), num.get(j), mult.get(indice));
				indice++;
			}
		}
		mult.clear();

		for (int i = 0; i < num.size(); i++) {
			for (int j = 1; j < num.size(); j++) {
				if (num.get(i) >= num.get(j))
					continue;
				mult.add(num.get(i) + num.get(j));
			}
		}

		indice = 0;
		for (int i = 0; i < num.size(); i++) {
			for (int j = 1; j < num.size(); j++) {
				if (num.get(i) >= num.get(j))
					continue;
				System.out.printf("A soma de %s e %s dá %s\n", num.get(i), num.get(j), mult.get(indice));
				indice++;
			}
		}

		input.close();
	}

}
