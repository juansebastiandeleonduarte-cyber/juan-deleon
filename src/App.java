import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner sc= new Scanner(System.in);

        int cantidad = cantidadcargas(sc);
        double[] pesos = new double[cantidad];
        
        cargarpesos(pesos, sc);
        double total = calcularsuma(pesos);
        int entre5y80 = contarelrango(pesos, 5, 80);
        double mayor=contarmayor(pesos, total);
        
    }

    public static int cantidadcargas(Scanner sc) {
        int cantidad;
        
        do {
            System.out.print("ingrese la cantidad de cargas entre 3 y 20: ");
            cantidad = sc.nextInt();
            
            if (cantidad < 3 || cantidad > 20) {
                System.out.println("dato invalido");
            }

        } while (cantidad < 3 || cantidad > 20);
        return cantidad;
    }

    public static boolean espesovalido(double peso) {
        
        if (peso >= 5 && peso <= 200) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void cargarpesos(double[] pesos, Scanner sc) {
        for (int i = 0; i < pesos.length; i++) {
            double peso;
            
            do {
                System.out.print("Ingrese el peso de la carga " + (i + 1) + " (entre 5 y 200 kg): ");
                peso = sc.nextDouble();
                
                if (!espesovalido(peso)) {
                    System.out.println("debe ser un peso entre 5 y 200");
                }
                
            } while (!espesovalido(peso));
            pesos[i] = peso;
        }
    }

    public static double calcularsuma(double[] pesos) {
        double suma = 0;
        
        for (int i = 0; i < pesos.length; i++) {
            suma = suma + pesos[i];
        }
        return suma;
    }
     
    public static int contarelrango(double[] pesos, double min, double max) {
        int contador = 0;
        for (int i = 0; i < pesos.length; i++) {
            if (pesos[i] >= min && pesos[i] <= max) {
                contador = contador + 1;
            }
        }
        return contador;
    }
    public static int contarmayor(double[] pesos, double limite) {
        int contador = 0;

        for (int i = 0; i < pesos.length; i++) {
            
            if (pesos[i] > limite) {
                contador++;
            }
        }
       
        return contador;
    }

    public static double calcularPromedio(double[] pesos) {
        double suma = calcularsuma(pesos);

        return suma / pesos.length;
    }
    

}
