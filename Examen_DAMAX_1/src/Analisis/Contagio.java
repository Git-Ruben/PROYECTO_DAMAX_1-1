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
public class Contagio extends Estado{
    private int nivelCargaVirica;
    private boolean huboIngresoHospitalario;

    public Contagio(LocalDate fechaEstado, int nivelCargaVirica, boolean huboIngresoHospitalario) {
        super(fechaEstado);
        this.nivelCargaVirica=nivelCargaVirica;
        this.huboIngresoHospitalario=huboIngresoHospitalario;
    }
}