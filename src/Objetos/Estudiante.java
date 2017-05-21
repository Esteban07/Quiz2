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
public class Estudiante extends Persona{
    private String Estatuto;

    public Estudiante(String Nombre, String Apellido, int Salario, String Estatuto) {
        super(Nombre, Apellido, Salario);
        this.Estatuto = Estatuto;
    }

    public String getEstatuto() {
        return Estatuto;
    }

    public void setEstatuto(String Estatuto) {
        this.Estatuto = Estatuto;
    }

    @Override
    public String getNombre() {
        return Nombre;
    }

    @Override
    public String getApellido() {
        return Apellido;
    }

    @Override
    public int getSalario() {
        return Salario;
    }
    
}
