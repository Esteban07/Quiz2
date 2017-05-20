/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Objetos.*;
import java.util.TreeMap;
import java.io.*;
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
                
            }
        }catch(Exception ex){
            System.out.println("No se esncuentra el Doc.");
        }
        
        
        
    }
}
