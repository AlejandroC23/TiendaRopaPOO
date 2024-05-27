/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Administrador;
import modelo.Carrito;
import modelo.Cliente;
import modelo.Producto;
import modelo.Vendedor;

/**
 *
 * @author Alejandro
 */
public class Main {
    public static void main(String[] args) {
        final int numObjects = 10;
        
        Scanner s = new Scanner(System.in);
        
        Administrador[] pAdmins = new Administrador[numObjects];
        Carrito[] nCarritos = new Carrito[numObjects];
        Cliente[] pClientes = new Cliente[numObjects];
        Producto[] nProductos = new Producto[numObjects];
        Vendedor[] pVendedores = new Vendedor[numObjects];
        
        for(int i = 0; i < numObjects; i++){
            System.out.println("Ingrese datos del adminstrador N°" + (i+1) + ": ");
            Administrador a = new Administrador(s.nextInt(), 
                    s.nextInt(), 
                    s.next(), 
                    s.next(), 
                    s.nextInt(), 
                    s.next());
            pAdmins[i] =  a;
        }
        
        for(int i = 0; i < numObjects; i++){
            System.out.println("Ingrese datos del vendedor N°" + (i+1) + ": ");
            Vendedor v = new Vendedor(s.nextInt(), s.nextInt(), 
                    s.next(), 
                    s.next(), 
                    s.next(), 
                    s.next(), 
                    s.next(), 
                    s.nextInt());
            pVendedores[i] =  v;
        }
        
        for(int i = 0; i < numObjects; i++){
            System.out.println("Ingrese datos del cliente N°" + (i+1) + ": ");
            Cliente c = new Cliente(s.nextInt(), 
                    s.nextInt(), 
                    s.next(), 
                    s.next(), 
                    s.next(), 
                    s.next(), 
                    s.nextInt());
            pClientes[i] =  c;
        }
        
        for(int i = 0; i < numObjects; i++){
            System.out.println("Ingrese datos del producto N°" + (i+1) + ": ");
            Producto p = new Producto(s.nextInt(), 
                    s.next(), 
                    s.next(), 
                    s.next(), 
                    s.next(), 
                    s.next(), 
                    s.nextInt());
            nProductos[i] =  p;
        }
        
        for(int i = 0; i < numObjects; i++){
            System.out.println("Ingrese datos del carrito N°" + (i+1) + ": ");
            Carrito cr = new Carrito(s.nextInt(), 
                    s.nextDouble(), 
                    s.nextDouble(), 
                    s.next(), 
                    s.next());
            nCarritos[i] =  cr;
        }
    }
}
