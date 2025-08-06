package controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import models.Producto;

public class ProductoController {

  public ProductoController(){

  }
  
  public TreeSet<Producto> ordenarProducto(List<Producto> producto){
    TreeSet<Producto> arbol = new TreeSet<>();
    for (Producto p : producto) {
      arbol.add(p);
    }
    return arbol;
  }

  public Map<String, List<Producto>> clasificarPorUnicidad(List<Producto> producto){
    LinkedList<Producto> primeros = new LinkedList<>();
    Map<String, List<Producto>> dicc = new HashMap<>();


    return dicc;
  }

  public TreeSet<Producto> obtenerDestacados(List<Producto> producto){
    TreeSet<Producto> destacados = new TreeSet<>();
    for (Producto p : producto) {
      if(p.getCatidadPreciosRepetidos()>1){
        destacados.add(p);
      }
    }
    return destacados;
  }

  public Producto buscarPorNombre(List<Producto> lista, String nombre){
    for (Producto p : lista) {
      if(p.getNombre().equalsIgnoreCase(nombre)){
        return p;
      }
    }
    return null;
  }



}
