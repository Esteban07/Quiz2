/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FAMILIA
 */
public class Personal extends Empleado{
    private String Titulo; 

    public Personal(String Titulo, String Nombre, String Apellido, double Salario, int Oficina, String fechaCont) {
        super(Nombre, Apellido, Salario, Oficina, fechaCont);
        this.Titulo = Titulo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    @Override
    public int getOficina() {
        return Oficina;
    }

    @Override
    public void setOficina(int Oficina) {
        this.Oficina = Oficina;
    }

    @Override
    public String getFechaCont() {
        return fechaCont;
    }

    @Override
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
