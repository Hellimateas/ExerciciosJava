import java.util.Scanner;

// Faça um programa para calcular o estoque médio de uma peça, sendo que:
// ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.

public class Exercicio01 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade máxima do estoque: ");
        int quantidadeMaxima = input.nextInt();

         System.out.println("Digite a quantidade mínima do estoque: ");
         int quantidadeMinima = input.nextInt();

         int estoqueMedia = (quantidadeMaxima+quantidadeMinima)/2;

         System.out.printf("A quantidade média do estoque é %d ", estoqueMedia);
        

        input.close();
    }
}