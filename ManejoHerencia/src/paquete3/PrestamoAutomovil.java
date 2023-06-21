
package paquete3;

import Paquete5.Persona;
import paquete2.Prestamo;

public class PrestamoAutomovil extends Prestamo {
    public String tipoAuto;
    public String marcaAuto;
    public Persona garante1;
    public double valorAuto;
    public double valorAuto_PrestamoAuto;


    public PrestamoAutomovil(String tipoAuto, String marcaAuto, Persona garante1, double valorAuto) {
        this.tipoAuto = tipoAuto;
        this.marcaAuto = marcaAuto;
        this.garante1 = garante1;
        this.valorAuto = valorAuto;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public String getMarcaAuto() {
        return marcaAuto;
    }

    public void setMarcaAuto(String marcaAuto) {
        this.marcaAuto = marcaAuto;
    }

    public Persona getGarante1() {
        return garante1;
    }

    public void setGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    public double getValorAuto() {
        return valorAuto;
    }

    public double calcularValorAutoPrestamo() {
        this.valorAuto_PrestamoAuto=valorAuto/timePrestamoMes;
        return valorAuto_PrestamoAuto;
    }

    @Override
    public String toString() {
        return super.toString()+
         "Prestamo  Automovil" +
                "\n tipoAuto  " + tipoAuto +
                "\n marcaAuto  " + marcaAuto +
                "\n garante1 " + garante1 +
                "\n valorAuto  " + valorAuto +
                "\n Valor del auto con el prestamo de meses " + valorAuto_PrestamoAuto;
    }
}
