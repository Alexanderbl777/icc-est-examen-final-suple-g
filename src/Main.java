import java.util.Arrays;
import java.util.List;

import controller.ProductoController;
import models.Producto;

public class Main {
    public static void main(String[] args) {
        List<Producto> lista = Arrays.asList(
                new Producto("Cámara Digital", "001", Arrays.asList(99, 101, 100)),
                new Producto("Cámara Ddafadsigital", "001", Arrays.asList(99, 101, 101, 100)),
                new Producto("Mouse Inalámbrico", "002", Arrays.asList(45, 50, 55, 55)),
                new Producto("Pantalla OLED", "003", Arrays.asList(200, 190, 195, 195, 190)),
                new Producto("Teclado Mecánico", "004", Arrays.asList(80, 82, 78)),
                new Producto("Tablet Android", "005", Arrays.asList(150, 155, 150, 160)),
                new Producto("Auriculares Bluetooth", "006", Arrays.asList(60, 62, 60, 65, 62)),
                new Producto("Impresora Láser", "007", Arrays.asList(120, 125, 120, 130, 125, 120)),
                new Producto("Disco Duro Externo", "008", Arrays.asList(80, 85, 90, 85)),
                new Producto("Monitor LED", "009", Arrays.asList(200, 210, 200, 215, 210)),
                new Producto("Altavoz Portátil", "010", Arrays.asList(45, 50, 45, 55, 50, 45)),
                new Producto("Smartwatch", "011", Arrays.asList(100, 105, 110, 105)),
                new Producto("Router WiFi", "012", Arrays.asList(70, 75, 70, 80, 75)),
                new Producto("Cargador USB", "013", Arrays.asList(20, 22, 20, 25)),
                new Producto("Proyector", "014", Arrays.asList(250, 260, 250, 255, 260, 250)),
                new Producto("SSD Interno", "015", Arrays.asList(90, 95, 100, 95, 90)),
                new Producto("Webcam HD", "016", Arrays.asList(40, 42, 40, 45, 42)),
                new Producto("Microfono USB", "017", Arrays.asList(35, 38, 35, 40)),
                new Producto("Lámpara LED", "018", Arrays.asList(25, 27, 25, 30, 27)),
                new Producto("Memoria USB", "019", Arrays.asList(15, 17, 15, 20, 17, 15)),
                new Producto("Silla Gamer", "020", Arrays.asList(180, 185, 180, 190, 185)),
                new Producto("Tablet Gráfica", "021", Arrays.asList(110, 115, 120, 115, 110)),
                new Producto("Cámara Web 4K", "022", Arrays.asList(130, 135, 130, 140, 135)),
                new Producto("Teclado Inalámbrico", "023", Arrays.asList(60, 62, 60, 65)),
                new Producto("Mouse Gamer", "024", Arrays.asList(55, 58, 55, 60, 58)),
                new Producto("Hub USB", "025", Arrays.asList(18, 20, 18, 22, 20)),
                new Producto("Batería Externa", "026", Arrays.asList(35, 37, 35, 40, 37)),
                new Producto("Repetidor WiFi", "027", Arrays.asList(28, 30, 28, 32)),
                new Producto("Smart TV Box", "028", Arrays.asList(75, 78, 75, 80, 78, 75)),
                new Producto("Soporte Celular", "029", Arrays.asList(10, 12, 10, 15, 12)),
                new Producto("Ventilador USB", "030", Arrays.asList(8, 10, 8, 12, 10))

        );

        ProductoController pC = new ProductoController();
        System.out.println("Producto");
        System.out.println();
        for (Producto p : lista) {
            System.out.print(p.getNombre()+" -> "+p.getPorcentajeCaracteresUnicos()+"% - ");
            System.out.println(p.getNombre()+" -> "+p.getCatidadPreciosRepetidos());
            System.out.println(pC.ordenarProducto(lista));
            System.out.println(pC.clasificarPorUnicidad(lista));
            System.out.println(pC.obtenerDestacados(lista));
            System.out.println(pC.buscarPorNombre(lista, "Hub USB"));
        }
        


    }
}
