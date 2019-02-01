public class Travail {
        private String travail;
        private String OccupationContact;

        public Travail (String _OccupationContact, String _travail){
            travail = _travail;
            OccupationContact = _OccupationContact;
        }

    public void setOccupationContact(String occupation) { this.OccupationContact = occupation; }

    public String getOccupationContact() { return OccupationContact; }

    public String getTravail() { return travail; }

    public void setTravail(String travail) { this.travail = travail; }
    }
