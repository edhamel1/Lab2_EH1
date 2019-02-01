public class Adresse {


    private String pays;
    private String rue;
    private String appart;
    private String ville;
    private String nPorte;
    private String province;
    private String Adressecontact;

    public Adresse ( String _nPorte, String _rue, String _appart, String _ville, String _province, String _pays, String _Adressecontact ){
        nPorte = _nPorte;
        rue = _rue;
        appart = _appart;
        ville = _ville;
        province = _province;
        pays = _pays;
        Adressecontact = _Adressecontact;

    }

    public void setVille(String ville) { this.ville = ville; }

    public void setNumeroPorte(String nPorte) { this.nPorte = nPorte; }

    public void setProvince(String province) { this.province = province; }

    public void setAppartement(String appart) { this.appart = appart; }

    public void setPays(String pays) { this.pays = pays; }

    public void setRue(String rue) { this.rue =  rue; }

    public String getNumeroPorte() { return nPorte; }

    public String getRue() { return rue; }

    public String getPays() { return pays; }

    public String getAppartement() { return appart; }

    public String getVille() { return ville; }

    public String getProvince() { return province; }

    public String getAdresseContact() { return Adressecontact; }

    public void setAdresseContact(String AdresseContact) { Adressecontact = AdresseContact; }
}