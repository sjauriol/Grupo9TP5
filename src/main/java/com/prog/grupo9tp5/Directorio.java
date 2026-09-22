/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog.grupo9tp5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Grupo9
 */
public class Directorio {

    private TreeMap<Long, Cliente> contactos;

    public Directorio() {
        contactos = new TreeMap<>();
    }

    ////////////////////////////////
    public boolean agregarContacto(long telefono, int dni, String nombre,
            String apellido, String ciudad, String domicilio) {
        if (contactos.containsKey(telefono)) {
            return false; // ya existe ese teléfono
        }
        Cliente c = new Cliente(dni, nombre, apellido, ciudad, domicilio); // sin teléfono
        contactos.put(telefono, c); // el teléfono queda SOLO acá, como key
        return true;
    }

    ////////////////////////////////
    public boolean borrarContacto(long telefono) {
        if (contactos.containsKey(telefono)) {
            contactos.remove(telefono);
            return true;
        }
        return false;
    }

    ////////////////////////////////
    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> resultado = new TreeSet<>();
        Iterator<Map.Entry<Long, Cliente>> it = contactos.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Long, Cliente> entry = it.next();
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                resultado.add(entry.getKey());
            }
        }
        return resultado;
    }

    //////////////////////////////// 
    public Cliente buscarContacto(long telefono) {
        return contactos.get(telefono);
    }

    ////////////////////////////////      
public ArrayList<Cliente> buscarContactos(String ciudad) {
        ArrayList<Cliente> resultado = new ArrayList<>();
        Iterator<Cliente> it = contactos.values().iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            if (c.getCiudad().equalsIgnoreCase(ciudad)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    ///////***********//////////
public TreeMap<Long, Cliente> getContactos() {
        return contactos;
    }

///////***********//////////
    
}
