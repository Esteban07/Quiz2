package Objetos;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FAMILIA
 */
public abstract class Persona {
    protected String Nombre; 
    protected String Apellido;
    protected double Salario;

    public Persona(String Nombre, String Apellido, double Salario) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Salario = Salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    
      
}
