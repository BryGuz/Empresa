/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Excepciones.ExcepcionSalario;
import Excepciones.ExceptionNombre;

/**
 *
 * @author Estudiante
 */
public class Administrador extends Empleado{

    public Administrador(String name, int id) throws ExceptionNombre, ExcepcionSalario{
        super(name, 1000000, id);
    }

    public String getName() {
        return name;
    }

    public double getSalarioM() {
        return SalarioM;
    }
    
    
    

    @Override
    public double CalcularSalario() {
      return  this.SalarioM;
    }

    @Override
    public String ListarInformacion() {
         return "Administrador: " + "ID: " + this.id + " " + "Nombre: " +  this.name;
    }
    
    
    
}
