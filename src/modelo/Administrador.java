/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class Administrador {
    private int adclIdAdmin;
    private int adclCedula;
    private String adclNombres;
    private String adclNickname;
    private int adclTelefono;
    private String adclCorreo;
    
    //MÉTODOS CONSTRUCTORES
    public Administrador(){}
    
    public Administrador(int adclIdAdmin, 
            int adclCedula, 
            String adclNombres,
            String adclNickname,
            int adclTelefono,
            String adclCorreo){
        this.adclIdAdmin = adclIdAdmin;
        this.adclCedula = adclCedula;
        this.adclNombres = adclNombres;
        this.adclNickname = adclNickname;
        this.adclTelefono = adclTelefono;
        this.adclCorreo = adclCorreo;
    }
    
    //MÉTODOS DE ENCAPSULAMIENTO
    //Id Admin
    public int getAdclIdAdmin(){
        return adclIdAdmin;
    }
    
    public void setAdclIdAdmin(int adclIdAdmin){
        this.adclIdAdmin = adclIdAdmin;
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
    
    //Nickname
    public String getAdclNickname(){
        return adclNickname;
    }
    
    public void setAdclNickname(String adclNickname){
        this.adclNickname = adclNickname;
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
        System.out.println("*** DATOS DEL ADMINISTRADOR ***" + 
                "Id: " + adclIdAdmin +
                "Cédula: " + adclCedula +
                "Nombre: " + adclNombres + 
                "Nickname: " + adclNickname + 
                "Teléfono: " + adclTelefono +
                "Correo: " + adclCorreo);
    }
}
