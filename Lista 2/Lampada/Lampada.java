package Lampada;

public class Lampada {
  private String tipo; 
  private int voltagem; 
  private String cor;
  private String marca;
  private Double preco;
  private int potencia;
  private boolean status;
  
  public Lampada(String marca, Double preco) {
    this.marca = marca;
    this.preco = preco;
  }

  public Lampada() {
  }

  public Lampada(String tipo, int voltagem, String cor, String marca, Double preco, int potencia, boolean status) {
    this.tipo = tipo;
    this.voltagem = voltagem;
    this.cor = cor;
    this.marca = marca;
    this.preco = preco;
    this.potencia = potencia;
    this.status = status;
  }

  public void ascender() {
    this.status = true;
  }

  public void apagar() {
    this.status = false;
  }
  
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public int getVoltagem() {
    return voltagem;
  }
  public void setVoltagem(int voltagem) {
    this.voltagem = voltagem;
  }
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }
  public String getMarca() {
    return marca;
  }
  public void setMarca(String marca) {
    this.marca = marca;
  }
  public Double getPreco() {
    return preco;
  }
  public void setPreco(Double preco) {
    this.preco = preco;
  }
  public int getPotencia() {
    return potencia;
  }
  public void setPotencia(int potencia) {
    this.potencia = potencia;
  }
  public boolean isStatus() {
    return status;
  }
  public void setStatus(boolean status) {
    this.status = status;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "tipo: \n" + tipo + "voltagem: \n" + voltagem + "cor: \n" + cor + "marca: \n" + marca +
    "preço: \n"+ preco + "potência: \n" + potencia + "status: "+status;


  }

}
