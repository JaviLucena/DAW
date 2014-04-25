/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo_Controlador;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 * Grado en ingeniería del Software
 * @author  Javier Lucena Fernández, EXP: 37
 *          Elena Salcedo Ortega, EXP: 46
 */

public class Producto {

    private int idProducto;
    private String nombre;
    private double precio;
    private String categoria;

    public Producto() {
    }

    public Producto(HttpServletRequest request) {
        this.idProducto=Integer.parseInt(request.getParameter("idProducto"));
        this.nombre=request.getParameter("nombreProducto");
        this.precio=Double.parseDouble(request.getParameter("precio"));
    }
    
    public Producto(int id, String nombre, double precio, List<Usuario> usuarios) {
        this.idProducto = id;
        this.nombre = nombre;
        this.precio = precio;
        this.usuarios = usuarios;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    private List<Usuario> usuarios;

    public int getId() {
        return idProducto;
    }

    public void setId(int id) {
        this.idProducto = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
