/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Objetos.*;
import java.util.TreeMap;
import java.io.*;
import java.util.StringTokenizer;
/**
 *
 * @author Grimma
 */
public class BasedeDatos {
    private final TreeMap<String,Estudiante> DatosEstudiantes;
    private final TreeMap<String,Facultad> DatosFacultad;
    private final TreeMap<String,Personal> DatosPersonal;

    public BasedeDatos() {
        this.DatosEstudiantes = new TreeMap<>();
        this.DatosFacultad = new TreeMap<>();
        this.DatosPersonal = new TreeMap<>();
    }
    
    public void AddEstudiante(Estudiante a){
        this.DatosEstudiantes.put(a.getNombre()+" "+a.getApellido(), a);
    }
    public void AddFacultad(Facultad a){
        this.DatosFacultad.put(a.getNombre()+" "+a.getApellido(), a);
    }
    public void AddPersonal(Personal a){
        this.DatosPersonal.put(a.getNombre()+" "+a.getApellido(), a);
    }
    
    public void InterpretarDatos(){
        
        File A = new File("datos.txt");
        try{
            FileReader Reader = new FileReader(A);
            BufferedReader reader2 = new BufferedReader(Reader);
            String Datos;
            while((Datos=reader2.readLine())!=null){
                StringTokenizer Token = new StringTokenizer(Datos,",");
                String[] Tokens = new String[Token.countTokens()];
                for(int i = 0; i<Tokens.length; i++){
                    Tokens[i]=Token.nextToken();
                }
                if("STUDENT".equals(Tokens[0])){
                    CriptografiadeCesar w = new CriptografiadeCesar(Tokens[1]);
                    CriptografiadeCesar x = new CriptografiadeCesar(Tokens[2]);
                    CriptografiadeCesar y = new CriptografiadeCesar(Tokens[3]);
                    int z = Integer.parseInt(Tokens[4]);
                    Estudiante a = new Estudiante(w.Descifrar(),x.Descifrar(),z,y.Descifrar());
                    AddEstudiante(a);
                }else if("FACULTY".equals(Tokens[0])){
                    CriptografiadeCesar w = new CriptografiadeCesar(Tokens[1]);
                    int m = Integer.parseInt(Tokens[2]);
                    CriptografiadeCesar x = new CriptografiadeCesar(Tokens[4]);
                    CriptografiadeCesar y = new CriptografiadeCesar(Tokens[5]);
                    int z = Integer.parseInt(Tokens[6]);
                    Facultad a = new Facultad(x.Descifrar(),y.Descifrar(),z,m,Tokens[3],w.Descifrar());
                    AddFacultad(a);
                    
                }else if("STAFF".equals(Tokens[0])){
                    CriptografiadeCesar w = new CriptografiadeCesar(Tokens[1]);
                    int m = Integer.parseInt(Tokens[2]);
                    CriptografiadeCesar x = new CriptografiadeCesar(Tokens[4]);
                    CriptografiadeCesar y = new CriptografiadeCesar(Tokens[5]);
                    int z = Integer.parseInt(Tokens[6]);
                    Personal a = new Personal(w.Descifrar(),x.Descifrar(),y.Descifrar(),z,m,Tokens[3]);
                    AddPersonal(a);
                }
                
            }
        }catch(Exception ex){
            System.out.println("No se esncuentra el Doc.");
        }
        
        
    }
    
    public void Lista(){
        System.out.println("");
        System.out.println("Lista de Estudiantes :");
        System.out.println("");
        for(Estudiante a : this.DatosEstudiantes.values()){
            System.out.println("- "+a.getNombre()+" "+a.getApellido()+" : "+a.getEstatuto()+" $"+a.getSalario());
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Lista de Facultad :");
        System.out.println("");
        for(Facultad a : this.DatosFacultad.values()){
            System.out.println("- "+a.getNombre()+" "+a.getApellido()+" : "+a.getRango()+" $"+a.getSalario());
            System.out.println("  Desde "+a.getFechaCont()+" - Asignado a  la oficina "+a.getOficina());
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Lista de Personal :");
        System.out.println("");
        for(Personal a : this.DatosPersonal.values()){
            System.out.println("- "+a.getNombre()+" "+a.getApellido()+" : "+a.getTitulo()+" $"+a.getSalario());
            System.out.println("  Desde "+a.getFechaCont()+" - Asignado a la oficina "+a.getOficina());
            System.out.println("");
        }
        System.out.println("");
    }
    
    public int SalarioGerencia(){
        int cont = 0;
        for(Personal a : this.DatosPersonal.values()){
            if("GERENTE".equalsIgnoreCase(a.getTitulo())){
                cont += a.getSalario();
            }
        }
        return cont;
    }
    
    public int Costos(){
        int cont = 0;
        for(Estudiante a : this.DatosEstudiantes.values()){
            cont += a.getSalario();
        }
        for(Facultad a : this.DatosFacultad.values()){
            cont += a.getSalario();
        }
        for(Personal a : this.DatosPersonal.values()){
            cont += a.getSalario();
        }
        return cont;
    }
    
}
