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
public class Facultad extends Empleado{
    private char Rango;

    public Facultad(String Nombre, String Apellido, double Salario, int Oficina, String fechaCont, char Rango) {
        super(Nombre, Apellido, Salario, Oficina, fechaCont);
        this.Rango = Rango;
    }

    public char getRango() {
        return Rango;
    }

    public void setRango(char Rango) {
        this.Rango = Rango;
    }

    @Override
    public int getOficina() {
        return Oficina;
    }

    @Override
    public String getFechaCont() {
        return fechaCont;
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
    public double getSalario() {
        return Salario;
    }
    
}
