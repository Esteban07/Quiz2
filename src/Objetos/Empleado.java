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
public abstract class Empleado extends Persona{
    protected int Oficina;
    protected String fechaCont;

    public Empleado(String Nombre, String Apellido, int Salario, int Oficina, String fechaCont) {
        super(Nombre, Apellido, Salario);
        this.Oficina = Oficina;
        this.fechaCont = fechaCont;
    }

    public int getOficina() {
        return Oficina;
    }

    public void setOficina(int Oficina) {
        this.Oficina = Oficina;
    }

    public String getFechaCont() {
        return fechaCont;
    }

    public void setFechaCont(String fechaCont) {
        this.fechaCont = fechaCont;
    }


    
   
}
