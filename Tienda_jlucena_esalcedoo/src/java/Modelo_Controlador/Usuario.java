/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo_Controlador;

/**
 * Grado en ingeniería del Software
 * @author  Javier Lucena Fernández, EXP: 37
 *          Elena Salcedo Ortega, EXP: 46
 */

public class Usuario {
    
    private int id;
    private String nombreApellidos;
    private String direccion;
    
    public Usuario (){
        
    }
    
    public Usuario (int id, String nombreApellidos, String direccion){
        this.id = id;
        this.nombreApellidos = nombreApellidos;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "Nombre y Apellidos= " + nombreApellidos + ", dirección= " + direccion + "}";
    }
}
