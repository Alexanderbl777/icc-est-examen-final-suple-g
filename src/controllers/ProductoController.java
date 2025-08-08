package controllers;

import java.util.*;

import models.Producto;

public class ProductoController {

  public ProductoController(){

  }
  
  public TreeSet<Producto> ordenarProducto(List<Producto> lista){
    TreeSet<Producto> arbol = new TreeSet<>();
    for (Producto p : lista) {
      arbol.add(p);
    }
    return arbol;
  }

  public Map<String, List<Producto>> clasificarPorUnicidad(Set<Producto> arbol){
    Map<String, List<Producto>> dicc = new LinkedHashMap<>();
    dicc.put("A", new LinkedList<>());
    dicc.put("B", new LinkedList<>());
    dicc.put("C", new LinkedList<>());
    dicc.put("D", new LinkedList<>());
    dicc.put("E", new LinkedList<>());

    for (Producto p : arbol) {
      if(p.getPorcentajeCaracteresUnicos()>=90){
        dicc.get("A").add(p);
      }else if(p.getPorcentajeCaracteresUnicos()>=70){
        dicc.get("B").add(p);
      }else if(p.getPorcentajeCaracteresUnicos()>=50){
        dicc.get("C").add(p);
      }else if(p.getPorcentajeCaracteresUnicos()>=30){
        dicc.get("D").add(p);
      }else{
        dicc.get("E").add(p);
      }
    }
    return dicc;
  }

  public List<Producto> obtenerDestacados(List<Producto> lista){
    List<Producto> nueva = new ArrayList<>();
    for (Producto p : lista) {
      if(p.getCatidadPreciosRepetidos()>=1){
        nueva.add(p);
      }
    }

    for(int i=1; i<nueva.size();i++){
      Producto key = nueva.get(i);
      int j =i-1;

      while (j>=0 && nueva.get(j).getNombre().compareTo(key.getNombre())>0) {
        nueva.set(j + 1, nueva.get(j));
        j--;
      }
      nueva.set(j + 1, key);
    }

    return nueva;
  }

  public Producto buscarPorNombre(List<Producto> lista, String nombre){
    int izq = 0;
    int der = lista.size()-1;

    while (izq <= der) {
      int mitad = (der+izq)/2;
      Producto ind = lista.get(mitad);
      int comp = ind.getNombre().compareTo(nombre);

      if(comp ==0){
        return ind;
      }else if(comp<0){
        izq = mitad+1;
      }else{
        der = mitad -1;
      }
    }
    return null;
  }
  

}
