import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner sc= new Scanner(System.in);

    
    }

    public static int leerCantidadCargas(Scanner sc) {
        int cantidad;
        do {
            System.out.print("Ingrese la cantidad de cargas (entre 3 y 20): ");
            cantidad = sc.nextInt();
            if (cantidad < 3 || cantidad > 20) {
                System.out.println("Dato invalido");
            }
        } while (cantidad < 3 || cantidad > 20);
        return cantidad;
    }

        
    


}
