package execicioCaneta;



public class caneta {
  private String marca;
  private String cor;
  private int tamanho;
  
  public String getCor() {
    return cor;
  }

  public String getMarca() {
    return marca;
  }

  public int getTamanho() {
    return tamanho;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
  }
  
  @Override
  public String toString() {
    return super.toString();
  }

  
}
