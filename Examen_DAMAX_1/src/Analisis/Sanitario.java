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
public class Sanitario extends Paciente{
    private String nombreHospital;

    public Sanitario(String nombreHospital, String nombre, String apellidos, String DNI, LocalDate fechaNacimiento, boolean haPasadoelCovid, Estado estadoPaciente) {
        super(nombre, apellidos, DNI, fechaNacimiento, haPasadoelCovid, estadoPaciente);
        this.prioridadPaciente=3;
        this.nombreHospital = nombreHospital;
    }

    public Sanitario() {
    }

   
    @Override
    public String toString() {
        return super.toString()+"\n\tNombre del hospital del sanitario: "+nombreHospital;
    }

    public String getNombreHospital() {
        return nombreHospital;
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