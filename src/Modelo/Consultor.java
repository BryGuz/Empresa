/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Estudiante
 */
public class Consultor extends Trabajador {
    private String Labor;

    public Consultor(String Labor, int id) {
        super(id);
        this.Labor = Labor;
    }

    public String getLabor() {
        return Labor;
    }

    
    @Override
    public double CalcularSalario() {
       return 220;
    }

    @Override
    public String ListarInformacion() {
       return "consultor: " + "ID: " + this.id + " " + "Labor: " +  this.Labor;
    }
    
    
}
