package projeto.teste.calculadora;

public class Calculadora {
	
	public static int soma(int a, int b) {
	    return a + b;
	  }
	  
	  public static int subtrai(int a, int b) {
	    return a - b;
	  }
	  
	  public static int multiplica(int a, int b) {
	    return a * b;
	  }
	  
	  public static int divide(int a, int b) {
	    if (b == 0) {
	      throw new IllegalArgumentException("Não é possível dividir por zero!");
	    }
	    return a / b;
	  }
	}


