Public class Utilidades [][]{
    public ObjAlmacen [][] llenarAlmacen(ObjAlmacen[][] a, Scanner) {

        import java.util.Scanner;

        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < a.length; j++) {

                System.out.println("Ingrese el nombre del producto: ");
                String nombre = sc.next();
                System.out.println("Ingrese el precio del producto: ");
                double precio = sc.nextDouble();
                System.out.println("Ingrese el stock del producto: ");
                int cantidad = sc.nextInt();
                
                ObjAlmacen o = new ObjAlmacen(nombre, precio, cantidad);
                a[i][j] = o;
            }
        }

        return a;
    }

    public void mostrarAlmacen(ObjAlmacen[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("Nombre del Producto: " + a[i][j].getNombre() + ", Precio del Producto: " + a[i][j].getPrecio() + ", Stock del producto: " + a[i][j].getCantidad());
            }
        }
    }


}
