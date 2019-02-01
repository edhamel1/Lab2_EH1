public class Telephone {
    private String information;
    private String numero;

    public String getInformation() { return information; }

    public String getNumero() { return numero; }

    public void setInformation(String information) { this.information = information; }

    public void setNumero(String numero) { this.numero = numero; }

    public Telephone ( String _information, String _numero){

        information = _information;
        numero = _numero;
    }
}
