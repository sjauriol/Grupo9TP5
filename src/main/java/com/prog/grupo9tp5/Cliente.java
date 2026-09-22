/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog.grupo9tp5;

/**
 *
 * @author Grupo9
 */
public class Cliente {

    private int Dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String domicilio;

    public Cliente(int Dni, String nombre, String apellido, String ciudad, String domicilio) {
        this.Dni = Dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.domicilio = domicilio;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    ////////////////////////////////
    @Override
    public String toString() {
        return "Cliente{" + "Dni=" + Dni + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad + ", domicilio=" + domicilio + '}';
    }
}
