package Paquete5;
public class Persona {
    public String nomPersona;
    public String apellidosPersona;
    public String userPersona;

    public Persona() {
    }

    public Persona(String nomPersona, String apellidosPersona, String userPersona) {
        this.nomPersona = nomPersona;
        this.apellidosPersona = apellidosPersona;
        this.userPersona = userPersona;
    }

    public void setNomPersona(String nomPersona) {
        this.nomPersona = nomPersona;
    }

    public void setApellidosPersona(String apellidosPersona) {
        this.apellidosPersona = apellidosPersona;
    }

    public void setUserPersona(String userPersona) {
        this.userPersona = userPersona;
    }

    public String getNomPersona() {
        return nomPersona;
    }

    public String getApellidosPersona() {
        return apellidosPersona;
    }

    public String getUserPersona() {
        return userPersona;
    }

    @Override
    public String toString() {
        return "Nombre del beneficiario " + nomPersona +
                "\n Apellidos beneficiario " + apellidosPersona +
                "\n Usuario de Beneficiario " + userPersona ;
    }
}
