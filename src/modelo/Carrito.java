/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class Carrito {
    private int adclIdCarrito;
    private double adclSubtotal;
    private double adclDescuento;
    private String adclFormaPago;
    private String adclResumenCompra;
    
    //MÉTODOS CONTRUCTORES
    public Carrito(){}
    
    public Carrito(int adclIdCarrito,
            double adclSubtotal,
            double adclDescuento,
            String adclFormaPago,
            String adclResumenCompra){
        this.adclIdCarrito = adclIdCarrito;
        this.adclSubtotal = adclSubtotal;
        this.adclDescuento = adclDescuento;
        this.adclFormaPago = adclFormaPago;
        this.adclResumenCompra = adclResumenCompra;
    }
    
    //MÉTODOS DE ENCAPSULAMIENTO
    //Id Carrito
    public int getAdclIdCarrito(){
        return adclIdCarrito;
    }
    
    public void setAdclIdCarrito(int adclIdCarrito){
        this.adclIdCarrito = adclIdCarrito;
    }
    
    //Subtotal
    public double getAdclSubtotal(){
        return adclSubtotal;
    }
    
    public void setAdclSubtotal(int adclSubtotal){
        this.adclIdCarrito = adclSubtotal;
    }
    
    //Descuento
    public double getAdclDescuento(){
        return adclDescuento;
    }
    
    public void setAdclDescuento(int adclDescuento){
        this.adclDescuento = adclDescuento;
    }
    
    //Forma de pago
    public String getAdclFormaPago(){
        return adclFormaPago;
    }
    
    public void setAdclFormaPago(String adclFormaPago){
        this.adclFormaPago = adclFormaPago;
    }
    
    //Resumen de compra
    public String getAdclResumenCompra(){
        return adclResumenCompra;
    }
    
    public void setAdclResumenCompra(String adclResumenCompra){
        this.adclResumenCompra = adclResumenCompra;
    }
    
    //MÉTODOS IMPRIMIR
    public void imprimir(){
        System.out.println("*** DATOS DEL CARRITO ***" + 
                "Id: " + adclIdCarrito +
                "Subtotal: " + adclSubtotal +
                "Descuento: " + adclDescuento + 
                "Forma Pago: " + adclFormaPago + 
                "Resumen Compra: " + adclResumenCompra);
    }
}
