package aula_2;

public class camisa {
  public String tamanho;
  public String cor;
  public String marca;
  public String modelo;

  public void comprar() {
	  System.out.println("A camisa: " + modelo + "foi comprada");
  }
  public void getcamisa() { 
	  System.out.println(
			  "Tamanho: " + tamanho +
			  "\nCor: " + cor +
			  "\nMarca: " + marca +
			  "\nModelo: " + modelo
 			  );
  }
}

