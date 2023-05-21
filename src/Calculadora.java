public class Calculadora {
    public static void main(String[] args) throws Exception {
    	
    	int a=2, b=1;
        
        while (true) {
            //Calculadora 
        }
        
        suma(a, b);
        resta(a, b);

    }
    
    

    //! Funciones principales de la calculadora
    
    // Suma (+) Jaime Barrios Miguel
    public static int suma(int a, int b) {
    	return (a+b);
    }
    
    // Resta - Miguel Gonzalez Pascual
    public static int resta(int a, int b) {
    	return (a-b);
    }

    // Multiplicacion - Leire Solano Álvarez
	public static int multiplicar(int a, int b) {

		return (a*b);

	}
    // Division - Viorel Alin Vranau
	public static void division(int a, int b) {
		int division;
		if (b != 0) {
			division = a / b;
			System.out.println(division);
		} else {
			System.out.println("No se puede dividir entre 0");
		}
	}
    // Potencia ** - Pablo Vaquerizo Ruiz
	public static int potencia(int a, int b) {
    int resultado = 1;
    for (int i = 0; i < b; i++) {
        resultado *= a;
    }
    return resultado;
}

	//Raíz Cuadrada - David Andrei Florea
	public static double calcularRaizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }

        double aproximacionInicial = numero / 2; // Aproximación inicial
        double epsilon = 0.00001; // Precisión deseada
        double raizCuadrada = aproximacionInicial;

        while (Math.abs(raizCuadrada * raizCuadrada - numero) > epsilon) {
            raizCuadrada = (raizCuadrada + numero / raizCuadrada) / 2;
        }

        return raizCuadrada;
    }
	
	//Logaritmo DiegoPizarro Garrido
	public static double Logaritmo(double num) {
		return Math.log10(num)
	}

	//Factorial ! Guillermo Perea Castellano
	public int factorial() {
		int factorial = 1;
		if(num1 < 0)
			return -1;
		else if(num1 == 0)
			return 0;
		if(num1>15)
			return -1;
		else {
			while (num1>0) {
	    			factorial=factorial*num1; 
	    			num1--;
	    		}
	    	}
	    	return factorial;
	    }
		
   
    // Valor Absoluto Alonso Guerrero
	public int valorAbsoluto(int valor){
		return(Math.abs(valor));

	}

}
