
package Modelo;

import Excepciones.ExcepcionSalario;
import Excepciones.ExceptionNombre;


public abstract class Empleado extends Trabajador{
    protected String name;
    protected double SalarioM;

    public Empleado(String name, double SalarioM, int id) throws ExceptionNombre, ExcepcionSalario {
        super(id);
        if(name.length()<10)
            
            throw new ExceptionNombre();
        
        if(SalarioM < 10)
            throw new ExcepcionSalario();
        
        this.name = name;
        this.SalarioM = SalarioM;
        
        
    }

    public String getName() {
        return name;
    }

    public double getSalarioM() {
        return SalarioM;
    }
    

}
