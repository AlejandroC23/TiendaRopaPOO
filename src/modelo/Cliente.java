/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class Cliente {
    private int adclIdCliente;
    private int adclCedula;
    private String adclNombres;
    private String adclApellidos;
    private String adclDireccion;
    private String adclCorreo;
    private int adclTelefono;
    
    //MÉTODOS CONSTRUCTORES
    public Cliente(){}
    
    public Cliente(int adclIdCliente, 
            int adclCedula, 
            String adclNombres,
            String adclApellidos,
            String adclDireccion,
            String adclCorreo,
            int adclTelefono){
        this.adclIdCliente = adclIdCliente;
        this.adclCedula = adclCedula;
        this.adclNombres = adclNombres;
        this.adclApellidos = adclApellidos;
        this.adclDireccion = adclDireccion;
        this.adclTelefono = adclTelefono;
        this.adclCorreo = adclCorreo;
    }
    
    //MÉTODOS DE ENCAPSULAMIENTO
    //Id Cliente
    public int getAdclIdCliente(){
        return adclIdCliente;
    }
    
    public void setAdclIdCliente(int adclIdCliente){
        this.adclIdCliente = adclIdCliente;
    }
    
    //Cédula
    public int getAdclCedula(){
        return adclCedula;
    }
    
    public void setAdclCedula(int adclCedula){
        this.adclCedula = adclCedula;
    }
    
    //Nombres
    public String getAdclNombres(){
        return adclNombres;
    }
    
    public void setAdclNombres(String adclNombres){
        this.adclNombres = adclNombres;
    }
    
    //Apellidos
    public String getAdclApellidos(){
        return adclApellidos;
    }
    
    public void setAdclApellidos(String adclApellidos){
        this.adclApellidos = adclApellidos;
    }
    
    //Dirección
    public String getAdclDireccion(){
        return adclDireccion;
    }
    
    public void setAdclDireccion(String adclDireccion){
        this.adclDireccion = adclDireccion;
    }
    
    //Teléfono
    public int getAdclTelefono(){
        return adclTelefono;
    }
    
    public void setAdclTelefono(int adclTelefono){
        this.adclTelefono = adclTelefono;
    }
    
    //Correo
    public String getAdclCorreo(){
        return adclCorreo;
    }
    
    public void setAdclCorreo(String adclCorreo){
        this.adclCorreo = adclCorreo;
    }
    
    //MÉTODOS IMPRIMIR
    public void imprimir(){
        System.out.println("*** DATOS DEL CLIENTE ***" + 
                "Id: " + adclIdCliente +
                "Cédula: " + adclCedula +
                "Nombres: " + adclNombres + 
                "Apellidos: " + adclApellidos +
                "Dirección: " + adclDireccion + 
                "Teléfono: " + adclTelefono +
                "Correo: " + adclCorreo);
    }
}
