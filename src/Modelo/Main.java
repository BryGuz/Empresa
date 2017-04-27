
package Modelo;

import Archivos.*;
import Excepciones.ExcepcionLenguaje;
import Excepciones.ExcepcionSalario;
import Excepciones.ExceptionNombre;
import com.sun.org.glassfish.external.probe.provider.annotations.Probe;
import java.io.FileNotFoundException;


public class Main {

    
    public static void main(String[] args) {
        Empresa emp = new Empresa();
        Consultor c = new Consultor("Ing", 1);
        Administrador a = null;
        
        try{
            a= new Administrador(("Juanito Perez"), 2);
        }catch(ExceptionNombre e){
            e.printStackTrace();
           
        }catch(ExcepcionSalario e){
            e.printStackTrace();
        }
        emp.AgregarTrabajador(a);
        try{
            Programador p = new Programador("C++", "superduperprogramador", 22323, 1);
            
            LiderProyecto l = new LiderProyecto("java", "kasjdksajdks", 15643, 2);
            l.agregarProgramador(p);
                    
        emp.AgregarTrabajador(l);
        emp.AgregarTrabajador(p);
        }catch(ExceptionNombre | ExcepcionSalario | ExcepcionLenguaje e){
            e.printStackTrace();
        }
        ArchivoDB arc = new ArchivoDB();
        try{
            arc.guardarInformacion(emp);
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
}
