package models;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Producto implements Comparable<Producto> {

  private String nombre;
  private String codigo;
  private List<Integer> precios;
  private int porcentajeCaracteresUnicos;
  private int catidadPreciosRepetidos;

  public Producto(String nombre, String codigo, List<Integer> precios) {
    this.nombre = nombre;
    this.codigo = codigo;
    this.precios = precios;
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

  public List<Integer> getPrecios() {
    return precios;
  }

  public void setPrecios(List<Integer> precios) {
    this.precios = precios;
  }

  public int getPorcentajeCaracteresUnicos() {
    String nombres = nombre.replace(" ", "");
    long den = nombres.chars().count();
    long porc = nombres.chars().distinct().count();
    long total = (porc * 100) / den;
    return (int) total;
  }

  public int getCatidadPreciosRepetidos() {
    int cont = 0;
    Stack<Integer> precio = new Stack<>();
    for (int d : precios) {
      precio.add(d);
      while (!precio.isEmpty()) {
        if (d == precio.pop()) {
          cont++;
        }
      }
    }

    return cont;
  }

  @Override
  public int compareTo(Producto produ) {
    int byName= nombre.compareToIgnoreCase(produ.getNombre());
    if(byName == 0){
      int byCode = codigo.compareToIgnoreCase(produ.getCodigo());
      return byCode;
    }
    return byName;
  }
  

}
