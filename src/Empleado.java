/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FAMILIA
 */
public class Empleado extends Persona{
    protected int Oficina;
    protected String fechaCont;

    public Empleado(String Nombre, String Apellido, double Salario) {
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
