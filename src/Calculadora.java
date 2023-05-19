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



		
    // Raiz -*
    // Factorial !
    // Logaritmo log()
    // Valor Absoluto ||

}
