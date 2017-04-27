/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Excepciones.ExcepcionLenguaje;
import Excepciones.ExcepcionSalario;
import Excepciones.ExceptionNombre;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class LiderProyecto extends Programador{

    private ArrayList<Programador> programadores;

    public LiderProyecto( String Lenguaje, String name, double SalarioM, int id)throws ExceptionNombre, ExcepcionSalario, ExcepcionLenguaje {
        super(Lenguaje, name, SalarioM, id);
        this.programadores = new ArrayList<>();
    }

   



    public ArrayList<Programador> getProgramadores() {
        return programadores;
    }

      
   public void agregarProgramador(Programador p){
       this.programadores.add(p);
   }

   public double CalcularSalario(){
       double SalarioTotal = 0;
              SalarioTotal += super.CalcularSalario()*(this.programadores.size() * 0.1);
              return SalarioTotal;
   }
   
   @Override
    public String ListarInformacion(){
        
       String informacion=super.ListarInformacion();
       for(Programador programador : programadores){
           informacion+= programador.ListarInformacion();
           
       }
       return informacion;
               }
}
