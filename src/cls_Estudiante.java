public class cls_Estudiante extends cls_Persona2 {

    private int beca;
    private String corroEs;

    public cls_Estudiante() {
    }

    public cls_Estudiante(int beca, String corroEs) {
        this.beca = beca;
        this.corroEs = corroEs;
    }

    public int getBeca() {
        return beca;
    }

    public void setBeca(int beca) {
        this.beca = beca;
    }

    public String getCorroEs() {
        return corroEs;
    }

    public void setCorroEs(String corroEs) {
        this.corroEs = corroEs;
    }
}
