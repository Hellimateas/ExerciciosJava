package Lampada;

public class Main {
  public static void main(String[] args) {
    Lampada veter = new Lampada("ssg", 12.5);
    System.out.println(veter.getMarca() + veter.getPreco());
    Lampada feli = new Lampada();
    veter.setPotencia(20);
    feli.setPotencia(40);
    feli.setMarca("t1");
    System.out.println(feli.getPotencia());
    System.out.println(veter.getPotencia());

     if(feli.getPotencia()>veter.getPotencia()){
       System.out.println("feli é com potência maior!");
     }else{
       System.out.println("veter é maior");
     }
  }
}
