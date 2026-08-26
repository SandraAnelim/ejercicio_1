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

     public void MostrarAlmacen(ObjAlmacen[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("Nombre del Producto: " + a[i][j].getNombre() + ", Precio del Producto: " + a[i][j].getPrecio() + ", Stock del producto: " + a[i][j].getCantidad());
                
            }
        }
    }
//a[0].length es para cuando tengo casois de matrices n*m y no n*n, permite reconocer la columna
    public void objAlmacen[][] unificarAlmacen(ObjAlmacen[][] a,ObjAlmacen[][] b, ObjAlmacen[][] c) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                for (int i1 = 0; i1 < b.length; i1++) {
                    for (int j1 = 0; j1 < b[0].length; j1++){
                       if (a[i][j].getNombre().equalsIgnoreCase(b[i1][j1].getNombre()))) {
                            a[i][j].setCantidad(a[i][j].getCantidad()+ b[i1][j1].getCantidad());
                            b[i1][j1].setNombre(nombre:null)
                       }
                    }
                }
            }
        }
        
        int auxf= a.length, auxc=a.length;

        for (int i = 0; i < c.length; i++){
            for (int j = 0; j < c.length; j++){
                c[i][j] = a[i][j];
                
            }
            

        }
    }


}
