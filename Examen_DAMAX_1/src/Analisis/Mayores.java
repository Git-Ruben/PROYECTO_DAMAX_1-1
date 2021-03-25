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
public class Mayores extends Paciente {

    private boolean esResidente;

    public Mayores(boolean esResidente, String nombre, String apellidos, String DNI, LocalDate fechaNacimiento, boolean haPasadoelCovid, Estado estadoPaciente) {
        super(nombre, apellidos, DNI, fechaNacimiento, haPasadoelCovid, estadoPaciente);
        this.prioridadPaciente=2;
        this.esResidente = esResidente;

    }

    public Mayores() {
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t" + (esResidente ? "es residente" : "no es residente");
    }

    public boolean esEsResidente() {
        return esResidente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public boolean isHaPasadoelCovid() {
        return haPasadoelCovid;
    }

    public Estado getEstadoPaciente() {
        return estadoPaciente;
    }

    public int getPrioridadPaciente() {
        return prioridadPaciente;
    }
    
}
