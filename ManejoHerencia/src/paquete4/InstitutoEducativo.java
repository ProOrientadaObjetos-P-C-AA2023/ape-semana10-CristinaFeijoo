package paquete4;

public class InstitutoEducativo {
    public String nomInst;
    public String siglasInst;

    public InstitutoEducativo() {
    }

    public InstitutoEducativo(String nomInst, String siglasInst) {
        this.nomInst = nomInst;
        this.siglasInst = siglasInst;
    }

    public String getNomInst() {
        return nomInst;
    }

    public void setNomInst(String nomInst) {
        this.nomInst = nomInst;
    }

    public String getSiglasInst() {
        return siglasInst;
    }

    public void setSiglasInst(String siglasInst) {
        this.siglasInst = siglasInst;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n NOMBRE INSTITUTO  " + nomInst +
                "\n SIGLAS INSTITUTO  " + siglasInst;
    }
}
