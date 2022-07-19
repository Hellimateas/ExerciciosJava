package com.lista1;
/* 
Efetuar o cálculo da quantidade  de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 
12  Km  por  litro.  Para  obter  o  cálculo,  o  usuário  deve  fornecer  o  tempo  gasto  na  viagem  e  a  velocidade  média. 
Desta  forma,  será  possível  obter  a  distância  percorrida  com  a  fórmula  DISTANCIA  =  TEMPO  *  VELOCIDADE. 
Tendo  o  valor  da  distância,  basta  calcular  a  quantidade  de  litros  de  combustível  utilizada  na  viagem  com  a 
fórmula:  LITROS_USADOS  =  DISTANCIA  /  12.  O  programa  deve  apresentar  os  valores  da  velocidade  média, 
tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais. 
*/

import java.util.Scanner;

public class Exercicio05 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Quanto tempo de viagem você levou na viagem e qual a velocidade média: ");
    double tempoDeViagem = input.nextDouble();
    double velocidadeMedia = input.nextDouble();

    double quantidadeLitros;
    double distanciaPecorrida;
    
    distanciaPecorrida = tempoDeViagem * velocidadeMedia;
    quantidadeLitros = distanciaPecorrida / 12;

    System.out.println();
    System.out.println("Os valores são:");
    System.out.printf("Velocidade média: %.2f \n", velocidadeMedia);
    System.out.printf("tempo gasto: %.2f \n", tempoDeViagem);
    System.out.printf("distância da viagem: %.2f \n", distanciaPecorrida);
    System.out.printf("quantidade de litros: %.2f \n", quantidadeLitros);
    input.close();
  }
}
