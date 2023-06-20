
package paquete3;

import Paquete5.Persona;
import paquete2.Prestamo;

public class PrestamoAutomovil extends Prestamo {
    public String tipoAuto;
    public String marcaAuto;
    public Persona garante1;
    public double valorAuto;
    public double valorMesPagoPrestamo;

    public PrestamoAutomovil(Persona beneficiario, double timePrestamoMes, String ciudadPrestamo, String tipoAuto, String marcaAuto, Persona garante1, double valorAuto) {
    }

    public PrestamoAutomovil(String tipoAuto, String marcaAuto, Persona garantel, double valorAuto) {
        this.tipoAuto = tipoAuto;
        this.marcaAuto = marcaAuto;
        this.garante1 = garante1;
        this.valorAuto = valorAuto;
    }

    public PrestamoAutomovil(Persona beneficiario, double timePrestamoMes, String ciudadPrestamo, String tipoAuto,
                             String marcaAuto, Persona garantel, double valorAuto, double valorMesPagoPrestamo) {

        super(beneficiario, timePrestamoMes, ciudadPrestamo);
        this.tipoAuto = tipoAuto;
        this.marcaAuto = marcaAuto;
        this.garante1 = garante1;
        this.valorAuto = valorAuto;
        this.valorMesPagoPrestamo = valorMesPagoPrestamo;
    }
}
