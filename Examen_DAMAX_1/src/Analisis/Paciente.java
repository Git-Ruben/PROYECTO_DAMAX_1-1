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
public class Paciente {
   
    protected String nombre;
    protected String apellidos;
    protected String DNI;
    protected LocalDate fechaNacimiento;
    protected boolean haPasadoelCovid;
    protected Estado estadoPaciente;
    protected int prioridadPaciente;

    public Paciente(String nombre, String apellidos, String DNI, LocalDate fechaNacimiento, boolean haPasadoelCovid, Estado estadoPaciente) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.haPasadoelCovid = haPasadoelCovid;
        this.estadoPaciente = estadoPaciente;
    }

    public Paciente() {
    }

    public String cualEsElEstadodelPaciente() {
        if (this.estadoPaciente instanceof Vacuna) {
            return "vacunado";
        } else if (this.estadoPaciente instanceof Contagio) {
            return "contagiado";

        } else {
            return "puro";
        }
    }

    @Override
    public boolean equals(Object obj) {
        Paciente aComparar = new Sanitario();
        if (obj instanceof Paciente) {
            aComparar = (Paciente) obj;
        }
        if (this.DNI.equalsIgnoreCase(aComparar.getDNI())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "\n"+"Paciente: " + "\n\tNombre: " + nombre + "\n\t Apellidos: " + apellidos + "\n\tDNI: " + DNI
                + "\n\tFecha Nacimiento: " + fechaNacimiento + "\n\t" + (haPasadoelCovid ? "Ha pasado la Covid" : "No ha pasado la Covid")
                + "\n\t" + "Estado paciente: " + this.cualEsElEstadodelPaciente();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isHaPasadoelCovid() {
        return haPasadoelCovid;
    }

    public void setHaPasadoelCovid(boolean haPasadoelCovid) {
        this.haPasadoelCovid = haPasadoelCovid;
    }

    public Estado getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(Estado estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    public int getPrioridadPaciente() {
        return prioridadPaciente;
    }

}


