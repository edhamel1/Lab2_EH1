public class Contact {

    private String nPorte;
    private String rue;
    private String appartement;
    private String ville;
    private String province;
    private String pays;
    private String Nom;
    private String Prenom;
    private String travail;
    private String OccupationContact;
    private String EntrepriseContact;


    public Contact ( String _numeroPorte, String _rue, String _appartement, String _ville, String _province, String _pays, String _Nom, String _Prenom, String _OccupationContact, String _travail, String _EntrepriseContact ){
        nPorte = _numeroPorte;
        rue = _rue;
        appartement = _appartement;
        ville = _ville;
        province = _province;
        pays = _pays;
        Nom = _Nom;
        Prenom = _Prenom;
        travail = _travail;
        OccupationContact = _OccupationContact;
        EntrepriseContact = _EntrepriseContact;

    }

    public void setNumeroPorte(String numeroPorte) { this.nPorte = numeroPorte; }
    public void setRue(String  rue) { this.rue =  rue; }
    public void setAppartement(String  appartement) { this.appartement = appartement; }
    public void setVille(String ville) { this.ville = ville; }
    public void setProvince(String Province) { this.province = province; }
    public void setPays(String pays) { this.pays = pays; }
    public String getNumeroPorte() { return nPorte; }
    public String getRue() { return rue; }
    public String getAppartement() { return appartement; }
    public String getVille() { return ville; }
    public String getProvince() { return province; }
    public String getPays() { return pays; }
    public String getNom() { return Nom; }
    public void setNom(String nom) { Nom = nom; }
    public String getPrenom() { return Prenom; }
    public void setPrenom(String prenom) { Prenom = prenom; }
    public void setOccupationContact(String occupation) { this.OccupationContact = occupation; }
    public String getOccupationContact() { return OccupationContact; }
    public String getTravail() { return travail; }
    public void setTravail(String travail) { this.travail = travail; }
    public String getEntrepriseContact() { return EntrepriseContact; }
    public void setEntrepriseContact(String entrepriseContact) { EntrepriseContact = entrepriseContact; }
}
