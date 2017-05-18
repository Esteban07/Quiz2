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
    private char Estatuto;

    public Estudiante(String Nombre, String Apellido, double Salario) {
        super(Nombre, Apellido, Salario);
        this.Estatuto = Estatuto;
    }

    public char getEstatuto() {
        return Estatuto;
    }

    public void setEstatuto(char Estatuto) {
        this.Estatuto = Estatuto;
    }

    @Override
    public String getNombre() {
        return Nombre;
    }

    @Override
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String getApellido() {
        return Apellido;
    }

    @Override
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public double getSalario() {
        return Salario;
    }

    @Override
    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
}
