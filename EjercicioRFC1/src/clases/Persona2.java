/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lab2
 */
public class Persona2 extends Persona{
    //Declaración de Atributos
    private double peso;
    private double estatura;
    private double imc;
    private String salud;
    
    //Declaración de Métodos
    public void setPeso(double peso){
        this.peso= peso;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    public void calcularImc(){
        imc= peso/Math.pow(estatura, 2);
    }
    
    public void calcularSalud(){
        if(imc <18.5){
            salud= "Bajo peso";
        }else if (imc <25){
            salud= "Peso normal";
        }else if(imc <30){
            salud= "Sobre peso";
        }else{
            salud= "Obesidad";
        }
    }

    public double getImc() {
        return imc;
    }

    public String getSalud() {
        return salud;
    }
    
    
    
}//Fin de la clase
