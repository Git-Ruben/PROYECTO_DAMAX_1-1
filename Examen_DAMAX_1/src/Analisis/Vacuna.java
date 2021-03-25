/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analisis;

import java.time.LocalDate;

/**
 *
 * @author DAM1
 */
public class Vacuna extends Estado{
    private marcasVacunas marcaVacuna;
    private int topeEdad;
    
    enum marcasVacunas{
        Pfizer, Moderna, Astrazeneca
    }

    public Vacuna(LocalDate fechaEstado) {
        super(fechaEstado);
    }
    
    

    public Vacuna(marcasVacunas marcaVacuna, int topeEdad, LocalDate fechaEstado) {
        super(fechaEstado);
        this.marcaVacuna = marcaVacuna;
        this.topeEdad = topeEdad;
    }

    public marcasVacunas getMarcaVacuna() {
        return marcaVacuna;
    }

    public void setMarcaVacuna(marcasVacunas marcaVacuna) {
        this.marcaVacuna = marcaVacuna;
    }

    public int getTopeEdad() {
        return topeEdad;
    }

    public void setTopeEdad(int topeEdad) {
        this.topeEdad = topeEdad;
    }
}
