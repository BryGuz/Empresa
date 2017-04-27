/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Excepciones.ExcepcionLenguaje;
import Excepciones.ExcepcionSalario;
import Excepciones.ExceptionNombre;

/**
 *
 * @author Estudiante
 */
public class Programador extends Empleado {
    protected String Lenguaje;

    public Programador(String Lenguaje, String name, double SalarioM, int id) throws ExceptionNombre, ExcepcionSalario, ExcepcionLenguaje {
        super(name, SalarioM, id);
        
        if(Lenguaje.equals("go"))
            throw new ExcepcionLenguaje();
        
        this.Lenguaje = Lenguaje;
    }

    public String getLenguaje() {
        return Lenguaje;
    }
  
    @Override
    public double CalcularSalario() {
        double SalarioTotal = 0;
        if(this.Lenguaje.equals("java"))
            SalarioTotal +=(this.SalarioM*0.2);
       return SalarioTotal;
        
    }

    @Override
    public String ListarInformacion() {
         return "Programador: " + "ID: " + this.id + " " + "Nombre: " +  this.name;
    }
    
}
