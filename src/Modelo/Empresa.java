/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Empresa {
      private ArrayList<Trabajador> trabajadores;
      
      public Empresa(){
          this.trabajadores = new ArrayList<>();
      }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }
      
      
      public void AgregarTrabajador(Trabajador t){
          this.trabajadores.add(t);
      }
      public double CalcularSalarioTotal(){
          double salarioTotal =0;
          for (Trabajador trabajador : trabajadores) {
              salarioTotal+=trabajador.CalcularSalario();
          }
          return salarioTotal;
      }
      public String ListarInformacionTrabajadores(){
          String informacion="";
          for (Trabajador trabajador : trabajadores) {
              informacion += " " + trabajador.ListarInformacion();
          }
          return informacion;
     
              
      }
      
}
      

