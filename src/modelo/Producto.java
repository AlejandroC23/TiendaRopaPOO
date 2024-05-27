/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class Producto {
    private int adclIdProducto;
    private String adclDescLarga;
    private String adclDescCorta;
    private String adclTalla;
    private String adclMaterial;
    private String adclColor;
    private int adclStock;
    
    //MÉTODOS CONSTRUCTORES
    public Producto(){}
    
    public Producto(int adclIdProducto, 
            String adclDescLarga,
            String adclDescCorta,
            String adclTalla,
            String adclMaterial,
            String adclColor,
            int adclStock){
        this.adclIdProducto = adclIdProducto;
        this.adclDescLarga = adclDescLarga;
        this.adclDescCorta = adclDescCorta;
        this.adclTalla = adclTalla;
        this.adclMaterial = adclMaterial;
        this.adclColor = adclColor;
        this.adclStock = adclStock;
    }
    
    //MÉTODOS DE ENCAPSULAMIENTO
    //Id Producto
    public int getAdclIdProducto(){
        return adclIdProducto;
    }
    
    public void setAdclIdProducto(int adclIdProducto){
        this.adclIdProducto = adclIdProducto;
    }
    
    //Descripción Larga
    public String getAdclDescLarga(){
        return adclDescLarga;
    }
    
    public void setAdclDescLarga(String adclDescLarga){
        this.adclDescLarga = adclDescLarga;
    }
    
    //Descripción Corta
    public String getAdclDescCorta(){
        return adclDescCorta;
    }
    
    public void setAdclDescCorta(String adclDescCorta){
        this.adclDescCorta = adclDescCorta;
    }
    
    //Talla
    public String getAdclTalla(){
        return adclTalla;
    }
    
    public void setAdclTalla(String adclTalla){
        this.adclTalla = adclTalla;
    }
    
    //Material
    public String getAdclMaterial(){
        return adclMaterial;
    }
    
    public void setAdclMaterial(String adclMaterial){
        this.adclMaterial = adclMaterial;
    }
    
    //Color
    public String getAdclColor(){
        return adclColor;
    }
    
    public void setAdclColor(String adclColor){
        this.adclColor = adclColor;
    }
    
    //Stock
    public int getAdclStock(){
        return adclStock;
    }
    
    public void setAdclStock(int adclStock){
        this.adclStock = adclStock;
    }
    
    //MÉTODOS IMPRIMIR
    public void imprimir(){
        System.out.println("*** DATOS DEL PRODUCTO ***" + 
                "Id: " + adclIdProducto +
                "Descripción Larga: " + adclDescLarga +
                "Descripción Corta: " + adclDescCorta + 
                "Talla: " + adclTalla + 
                "Material: " + adclMaterial +
                "Color: " + adclColor +
                "Stock: " + adclStock);
    }
}
