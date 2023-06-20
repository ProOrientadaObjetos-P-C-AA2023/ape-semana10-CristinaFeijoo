/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import Paquete5.Persona;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.InstitutoEducativo;
import paquete4.PrestamoEducativo;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Prestamo[] prestamos=new Prestamo[500];
        int cantidadPrestamos=0;
        boolean ingresarDatos=true; //Bandera para iniciar
        while (ingresarDatos){
            System.out.println("Seleccione la opcion de prestamo que desea relizar");
            System.out.println("1 para PRESTAMO AUTOMÓVIL");
            System.out.println("2 para PRESTAMO EDUCATIVO");
            System.out.println("3 para SALIDA");
            System.out.println("OPCION: ");
            int opcionSelecta=teclado.nextInt();
            teclado.nextLine();
            switch (opcionSelecta){
                case 1:
                    //Adquirir datos del beneficiario
                    System.out.println("Nombre beneficiario");
                    String nomBeneficiario=teclado.nextLine();
                    System.out.println("Apellidos beneficiario");
                    String apellidosBeneficiario=teclado.nextLine();
                    System.out.println("User Beneficiario");
                    String userBeneficiario=teclado.nextLine();
                    //Crea el beneficiario con los parametros/datos adquiridos
                    Persona beneficiario=new Persona(nomBeneficiario,apellidosBeneficiario,userBeneficiario);
                    //Prestamo
                    System.out.println("Tiempo para el prestamo en meses");
                    double timePrestamoMes=teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("Ciudad donde fue el prestamo");
                    String ciudadPrestamo=teclado.nextLine();
                    //Datos del automovil
                    System.out.println("Indique el tipo de automovil");
                    String tipoAuto=teclado.nextLine();
                    System.out.println("indique la marca del automovil");
                    String marcaAuto=teclado.nextLine();
                    System.out.println("indique el valor del automovil");
                    double valorAuto=teclado.nextDouble();
                    teclado.nextLine();
                    //Adquirir datos del garante
                    System.out.println("Nombre Garante");
                    String nomGarante=teclado.nextLine();
                    System.out.println("Apellido Garante");
                    String apellidoGarnte=teclado.nextLine();
                    System.out.println("User del garante");
                    String userGarante=teclado.nextLine();
                    Persona garante1=new Persona(nomGarante,apellidoGarnte,userGarante);
                    PrestamoAutomovil prestamoAutomovil= new PrestamoAutomovil(beneficiario,timePrestamoMes,ciudadPrestamo
                    ,tipoAuto,marcaAuto,garante1,valorAuto);
                    prestamos[cantidadPrestamos]=prestamoAutomovil;
                    cantidadPrestamos++;
                    break;
                case 2:
                    System.out.println("Ingrese los datos para el prestamo educativo");
                    //Adquirir datos del beneficiario
                    System.out.println("Nombre beneficiario");
                    String nomBeneficiarioEdu=teclado.nextLine();
                    System.out.println("Apellidos beneficiario");
                    String apellidosBeneficiarioEdu=teclado.nextLine();
                    System.out.println("User Beneficiario");
                    String userBeneficiarioEdu=teclado.nextLine();
                    //Crea el beneficiario con los parametros/datos adquiridos
                    Persona beneficiarioEdu=new Persona(nomBeneficiarioEdu,apellidosBeneficiarioEdu,userBeneficiarioEdu);
                    //Prestamo
                    System.out.println("Tiempo para el prestamo en meses");
                    double timePrestamoMesEdu=teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("Ciudad donde fue el prestamo");
                    String ciudadPrestamoEdu=teclado.nextLine();
                    System.out.println("Ingrese el nivel de estudio");
                    String nivelEdu=teclado.nextLine();
                    System.out.println("Nombre de la institucion");
                    String nomInst=teclado.nextLine();
                    System.out.println("Siglas de la institucion");
                    String siglasInst=teclado.nextLine();
                    System.out.println("Valor carrera");
                    double valorCarreraEdu=teclado.nextDouble();
                    teclado.nextLine();
                    InstitutoEducativo institutoEdu= new InstitutoEducativo(nomInst,siglasInst);
                    PrestamoEducativo prestamoEdu= new PrestamoEducativo(beneficiarioEdu,timePrestamoMesEdu,ciudadPrestamoEdu,nivelEdu,institutoEdu,valorCarreraEdu);
                    prestamos[cantidadPrestamos]=prestamoEdu;
                    cantidadPrestamos++;
                    break;
                case 3:
                    ingresarDatos=false;
                    break;

            }
        }
        System.out.println("Lista de prestamos");
        for (int i = 0; i < cantidadPrestamos; i++) {
            System.out.println(prestamos[i]);

        }
    }
    
}
