/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import Paquete5.Persona;
import paquete2.Prestamo;

public class PrestamoEducativo extends Prestamo {
    public String nivelEstudio;
    public InstitutoEducativo centroEdcuativo;
    public double valorCarrera;
    public double valorMesPrestamoCarrera;

    public PrestamoEducativo() {
    }

    public PrestamoEducativo(String nivelEstudio,
                             InstitutoEducativo centroEdcuativo, double valorCarrera) {
        this.nivelEstudio = nivelEstudio;
        this.centroEdcuativo = centroEdcuativo;
        this.valorCarrera = valorCarrera;
    }

    public PrestamoEducativo(Persona beneficiario, double timePrestamoMes, String ciudadPrestamo, String nivelEstudio,
                             InstitutoEducativo centroEdcuativo, double valorCarrera) {
        super(beneficiario, timePrestamoMes, ciudadPrestamo);
        this.nivelEstudio = nivelEstudio;
        this.centroEdcuativo = centroEdcuativo;
        this.valorCarrera = valorCarrera;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public InstitutoEducativo getCentroEdcuativo() {
        return centroEdcuativo;
    }

    public void setCentroEdcuativo(InstitutoEducativo centroEdcuativo) {
        this.centroEdcuativo = centroEdcuativo;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void calcularValorMesPrestamoCarrera() {
        this.valorMesPrestamoCarrera=(valorCarrera/timePrestamoMes)-(0.1*(valorCarrera/timePrestamoMes));
    }

    @Override
    public String toString() {
        return super.toString()+"Prestamo Educativo" +
                "\n Nivel de estudio " + nivelEstudio +
                "\n Valor de la carrera " + valorCarrera +
                "\n Valor de a carrera por el prestamo en meses  " + valorMesPrestamoCarrera;
    }
}
