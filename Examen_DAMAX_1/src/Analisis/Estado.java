/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analisis;

import java.time.LocalDate;

/**
 *
 * @author Belén
 */
public abstract class Estado {
    protected LocalDate fechaEstado;

    public Estado(LocalDate fechaEstado) {
        this.fechaEstado = fechaEstado;
    }
  
}
