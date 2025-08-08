import java.util.*;

import controllers.ProductoController;
import models.Producto;

public class Main {
    public static void main(String[] args) {
        List<Producto> lista = Arrays.asList(
                new Producto("Cámara Digital", "001", Arrays.asList(99.0, 101.0, 100.0)),
                new Producto("Cámara Ddafadsigital", "001", Arrays.asList(99.0, 101.0, 101.0, 100.0)),
                new Producto("Mouse Inalámbrico", "002", Arrays.asList(45.0, 50.0, 55.0, 55.0)),
                new Producto("Pantalla OLED", "003", Arrays.asList(200.0, 190.0, 195.0, 195.0, 190.0)),
                new Producto("Teclado Mecánico", "004", Arrays.asList(80.0, 82.0, 78.0)),
                new Producto("Tablet Android", "005", Arrays.asList(150.0, 155.0, 150.0, 160.0)),
                new Producto("Auriculares Bluetooth", "006", Arrays.asList(60.0, 62.0, 60.0, 65.0, 62.0)),
                new Producto("Impresora Láser", "007", Arrays.asList(120.0, 125.0, 120.0, 130.0, 125.0, 120.0)),
                new Producto("Disco Duro Externo", "008", Arrays.asList(80.0, 85.0, 90.0, 85.0)),
                new Producto("Monitor LED", "009", Arrays.asList(200.0, 210.0, 200.0, 215.0, 210.0)),
                new Producto("Altavoz Portátil", "010", Arrays.asList(45.0, 50.0, 45.0, 55.0, 50.0, 45.0)),
                new Producto("Smartwatch", "011", Arrays.asList(100.0, 105.0, 110.0, 105.0)),
                new Producto("Router WiFi", "012", Arrays.asList(70.0, 75.0, 70.0, 80.0, 75.0)),
                new Producto("Cargador USB", "013", Arrays.asList(20.0, 22.0, 20.0, 25.0)),
                new Producto("Proyector", "014", Arrays.asList(250.0, 260.0, 250.0, 255.0, 260.0, 250.0)),
                new Producto("SSD Interno", "015", Arrays.asList(90.0, 95.0, 100.0, 95.0, 90.0)),
                new Producto("Webcam HD", "016", Arrays.asList(40.0, 42.0, 40.0, 45.0, 42.0)),
                new Producto("Microfono USB", "017", Arrays.asList(35.0, 38.0, 35.0, 40.0)),
                new Producto("Lámpara LED", "018", Arrays.asList(25.0, 27.0, 25.0, 30.0, 27.0)),
                new Producto("Memoria USB", "019", Arrays.asList(15.0, 17.0, 15.0, 20.0, 17.0, 15.0)),
                new Producto("Silla Gamer", "020", Arrays.asList(180.0, 185.0, 180.0, 190.0, 185.0)),
                new Producto("Tablet Gráfica", "021", Arrays.asList(110.0, 115.0, 120.0, 115.0, 110.0)),
                new Producto("Cámara Web 4K", "022", Arrays.asList(130.0, 135.0, 130.0, 140.0, 135.0)),
                new Producto("Teclado Inalámbrico", "023", Arrays.asList(60.0, 62.0, 60.0, 65.0)),
                new Producto("Mouse Gamer", "024", Arrays.asList(55.0, 58.0, 55.0, 60.0, 58.0)),
                new Producto("Hub USB", "025", Arrays.asList(18.0, 20.0, 18.0, 22.0, 20.0)),
                new Producto("Batería Externa", "026", Arrays.asList(35.0, 37.0, 35.0, 40.0, 37.0)),
                new Producto("Repetidor WiFi", "027", Arrays.asList(28.0, 30.0, 28.0, 32.0)),
                new Producto("Smart TV Box", "028", Arrays.asList(75.0, 78.0, 75.0, 80.0, 78.0, 75.0)),
                new Producto("Soporte Celular", "029", Arrays.asList(10.0, 12.0, 10.0, 15.0, 12.0)),
                new Producto("Ventilador USB", "030", Arrays.asList(8.0, 10.0, 8.0, 12.0, 10.0))

        );

        ProductoController pC = new ProductoController();
        System.out.println("Producto");
        System.out.println();
        for (Producto p : lista) {
            System.out.print(p.getNombre()+" -> "+p.getPorcentajeCaracteresUnicos()+"% - ");
            System.out.println(" -> "+p.getCatidadPreciosRepetidos());
        }
        System.out.println();
        System.out.println("Ordenada");
        System.out.println();
        for (Producto p1 : pC.ordenarProducto(lista)) {
            System.out.println(p1.getNombre()+" - "+p1.getCodigo());
        }
        System.out.println();
        System.out.println("Clasificados");
        System.out.println();

        Map<String, List<Producto>> clasificados = pC.clasificarPorUnicidad(pC.ordenarProducto(lista));
        for (String clave : clasificados.keySet()) {
            System.out.println("Categoría " + clave + ":");
            for (Producto p : clasificados.get(clave)) {
                System.out.println("  " + p.getNombre() + " (" + p.getPorcentajeCaracteresUnicos() + "%)");
            }
        }

        System.out.println();
        System.out.println("Destacados");
        System.out.println();
        for (Producto p3 : pC.obtenerDestacados(lista)) {
            System.out.println(p3.getNombre()+" - "+p3.getCodigo());
        }
        System.out.println();
        System.out.println("Busqueda");
        System.out.println();

        System.out.println(pC.buscarPorNombre(pC.obtenerDestacados(lista), "Smart TV Box").getNombre());


        /**
        System.out.println();
        System.out.println("ListaOriginal");
        System.out.println();
        System.out.println(lista);
        System.out.println();
        System.out.println("OrdenarProducto");
        System.out.println();
        System.out.println(pC.ordenarProducto(lista));
        System.out.println();
        System.out.println("ClasificarPorUnicidad");
        System.out.println();
        System.out.println(pC.clasificarPorUnicidad((pC.ordenarProducto(lista))));
        System.out.println();
        System.out.println("Destacados");
        System.out.println();
        System.out.println(pC.obtenerDestacados(lista));
        System.out.println();
        System.out.println("Buscar");
        System.out.println();
        System.out.println(pC.buscarPorNombre(pC.obtenerDestacados(lista), "Smart TV Box"));
        
        
        List<Producto> prueba = new ArrayList<>();
        prueba.add(new Producto("Teclado Logitech", "001", Arrays.asList(50.0, 55.0, 50.0, 60.0)));
        prueba.add(new Producto("Teclado Logitech", "001", Arrays.asList(50.0, 55.0, 50.0, 60.0)));
        prueba.add(new Producto("Beclado Logitech", "004", Arrays.asList(50.0, 55.0, 50.0, 60.0)));
        prueba.add(new Producto("Teclado Logitech", "005", Arrays.asList(50.0, 55.0, 50.0, 60.0)));
        for (Producto p : prueba) {
            System.out.print(p.getNombre()+" -> "+p.getPorcentajeCaracteresUnicos()+"% - ");
            System.out.println(" -> "+p.getCatidadPreciosRepetidos());
        } 
        System.out.println( pC.ordenarProducto(prueba));
        System.out.println(pC.clasificarPorUnicidad((pC.ordenarProducto(prueba))));
        System.out.println(pC.obtenerDestacados(prueba));
        System.out.println(pC.buscarPorNombre(pC.obtenerDestacados(prueba), "Beclado Logitech"));
         */


    }
}
