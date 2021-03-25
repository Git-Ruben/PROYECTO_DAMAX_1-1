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
public class Docente extends Paciente {

    private String nombreCentro;
    private cualificacionDocente cualificacionDocente;

    enum cualificacionDocente {
        Primaria, Secundaria
    }

    public Docente(String nombreCentro, cualificacionDocente cualificacionDocente, String nombre, String apellidos, String DNI, LocalDate fechaNacimiento, boolean haPasadoelCovid, Estado estadoPaciente) {
        super(nombre, apellidos, DNI, fechaNacimiento, haPasadoelCovid, estadoPaciente);
        this.prioridadPaciente=1;
        this.nombreCentro = nombreCentro;
        this.cualificacionDocente = cualificacionDocente;
    }

    public Docente() {
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tNombre del centro de trabajo del docente: " + nombreCentro + "\n\tCualificación docente: " + cualificacionDocente;
    }

    public int getSituacionDocente() {
        if (this.cualificacionDocente == cualificacionDocente.Primaria && this.estadoPaciente instanceof Vacuna) {
            return 0;
        } else if (this.cualificacionDocente == cualificacionDocente.Primaria && !(this.estadoPaciente instanceof Vacuna)) {
            return 1;
        } else if (this.cualificacionDocente == cualificacionDocente.Secundaria && this.estadoPaciente instanceof Vacuna) {
            return 2;
        } else { //Hay que tener en cuenta que si se agregaran más cualificaciones docentes, por ejemplo incluyendo aquí docentes Universitarios, habría que ampliar este código, ya que el else no sería una deducción correcta
            return 3;
        }
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public cualificacionDocente getCualificacionDocente() {
        return cualificacionDocente;
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
