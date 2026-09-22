/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.prog.grupo9tp5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Grupo9
 */
public class Main {

    public static void main(String[] args) {
        Directorio directorio = new Directorio();

        // --- A. Probamos agregarContacto() ---
        System.out.println("=== Agregando contactos ===");
        System.out.println(directorio.agregarContacto(2645551111L, 30111222, "Ana", "Gomez", "San Luis", "Calle 1"));
        System.out.println(directorio.agregarContacto(2645552222L, 30222333, "Luis", "Perez", "Merlo", "Calle 2"));
        System.out.println(directorio.agregarContacto(2645553333L, 30333444, "Juan", "Saez", "San Luis", "Calle 3"));
        System.out.println(directorio.agregarContacto(2645554444L, 30444555, "Sofia", "Gomez", "Villa Mercedes", "Calle 4"));
        System.out.println(directorio.agregarContacto(2645555555L, 30555666, "Marta", "Diaz", "San Luis", "Calle 5"));

        // Probamos que NO deje agregar un teléfono repetido
        System.out.println("Intento repetir teléfono (debe dar false): " + directorio.agregarContacto(2645551111L, 99999999, "Otro", "Otro", "X", "X"));

        // --- B. Probamos buscarContacto() ---
        System.out.println("\n=== buscarContacto(2645553333) ===");
        Cliente encontrado = directorio.buscarContacto(2645553333L);
        System.out.println(encontrado);

        System.out.println("buscarContacto(9999999999) - no existe: "
                + directorio.buscarContacto(9999999999L));

        // --- C. Probamos buscarTelefono() ---
        System.out.println("\n=== buscarTelefono(\"Gomez\") ===");
        Set<Long> telefonos = directorio.buscarTelefono("Gomez");
        for (Long tel : telefonos) {
            System.out.println(tel);
        }

        // --- D. Probamos buscarContactos() ---
        System.out.println("\n=== buscarContactos(\"San Luis\") ===");
        ArrayList<Cliente> clientesSanLuis = directorio.buscarContactos("San Luis");
        for (Cliente c : clientesSanLuis) {
            System.out.println(c);
        }

        // --- E. Probamos borrarContacto() ---
        System.out.println("\n=== borrarContacto(2645552222) ===");
        System.out.println(directorio.borrarContacto(2645552222L)); // true
        System.out.println(directorio.borrarContacto(2645552222L)); // false, ya no existe

        // Verificamos el estado final recorriendo con entrySet() + Iterator
        System.out.println("\n=== Estado final del directorio ===");
        Iterator<Map.Entry<Long, Cliente>> it = directorio.getContactos().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Long, Cliente> entry = it.next();
            System.out.println("Tel: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
