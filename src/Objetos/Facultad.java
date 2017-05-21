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
    private String Rango;

    public Facultad(String Nombre, String Apellido, int Salario, int Oficina, String fechaCont, String Rango) {
        super(Nombre, Apellido, Salario, Oficina, fechaCont);
        this.Rango = Rango;
    }

    public String getRango() {
        return Rango;
    }

    public void setRango(String Rango) {
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
    public int getSalario() {
        return Salario;
    }
    
}
