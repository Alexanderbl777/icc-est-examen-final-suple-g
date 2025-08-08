package models;

import java.util.*;

public class Producto implements Comparable<Producto> {

  private String nombre;
  private String codigo;
  private List<Double> precio;
  private int porcentajeCaracteresUnicos;
  private int catidadPreciosRepetidos;


  public Producto(String nombre, String codigo, List<Double> precio) {
    this.nombre = nombre;
    this.codigo = codigo;
    this.precio = precio;
  }

  public String getNombre() {
    return nombre;
  }


  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  public String getCodigo() {
    return codigo;
  }


  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }


  public List<Double> getPrecio() {
    return precio;
  }


  public void setPrecio(List<Double> precio) {
    this.precio = precio;
  }


  public int getPorcentajeCaracteresUnicos() {
    int cont =0;
    Set<Character> total = new LinkedHashSet<>();
    String nombreSinEsp = nombre.replace(" ", "").toLowerCase();
    for (Character c : nombreSinEsp.toCharArray()) {
      if(total.add(c)){
        cont++;
      }
    }
    int result = (cont*100)/nombreSinEsp.length();
    return result;
  }

  public int getCatidadPreciosRepetidos() {
    int cont =0;
    Set<Double> repetidos = new LinkedHashSet<>();
    for (double d : precio) {
      if(!repetidos.add(d)){
        cont++;
      }
    }
    return cont;
  }

  @Override
  public int compareTo(Producto o) {
    int porCodigo = codigo.compareTo(o.getCodigo());
    if(porCodigo==0){
      return 0;
    }else{
      int porNombre = nombre.compareTo(o.getNombre());
      if(porNombre!=0){
        return porNombre;
      }else{
        return porCodigo;
      }
    }

  }

  @Override
  public String toString() {
    return nombre + " -> codigo: " + codigo + ", precio: " + precio;
  }

  

}
