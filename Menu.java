import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Boolean continuar = false;
    while (continuar) {
        System.out.println("Bienvenido al sistema de inventario");
        System.out.println("Ingrese la dimensión del almacén (filas y columnas):");
        int n = sc.nextInt();  
        
        objAlmacen[][] almacen1 = new objAlmacen[n][n];
        objAlmacen[][] almacen2 = new objAlmacen[n][n];
        objAlmacen[][] almacenUnificado = new objAlmacen[n][n*n];
        System.out.println("Seleccione una opción:");
        System.out.println("1. Llenar Almacen #1");
        System.out.println("2. Mostrar Almacen #1");
        System.out.println("3. Llenar Almacen #2");
        System.out.println("4. Mostrar Almacen #2");
        System.out.println("5. Buscar producto por nombre");
        System.out.println("6. Unificar Almacenes");
        System.out.println("7. Mostrar Almacen Unificado");
        System.out.println("8. Salir");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                almacen1 = Utilidades.llenarAlmacen(almacen1, sc);

                break;
            case 2:
                u.MostrarAlmacen(almacen1);
                break;
            case 3:
                almacen2 = Utilidades.llenarAlmacen(almacen2, sc);
                break;
            
            case 4:
                u.MostrarAlmacen(almacen2);
                break;
            case 5:
                // Llamar al método para mostrar el almacén
                break;
            case 6:
                // Llamar al método para mostrar el almacén
                break;
            case 7:
                u.MostrarAlmacen(almacenUnificado);
                break;       
            case 8:
                System.out.println("Fin del inventario.");
                break;
            default:
                System.out.println("Opción no válida, intente nuevamente.");
        }
    }
    }
    
}
