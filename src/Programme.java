import java.util.Scanner;

public class Programme {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        boolean quiiterMenu = false;
        int choixMenu;

        while (quiiterMenu == false){
            System.out.println( " Que voulez-vous faire " + "\n 1-Ajouter un contact " + " \n 2-Modifier un contact " + " \n 3-Afficher les contacts " + " \n 4-Quitter ");
            choixMenu = clavier.nextInt();
            Contact tabContact[] = new Contact[50];
            for(int i =0; i < tabContact.length; i++){
                tabContact[i] = new Contact();
            }
            //Créer un contact
            if ( choixMenu == 1){

                int numContact =0;
                numContact++;
                System.out.println( " Pour accéder à votre nouveau contact entrer: " + numContact + " sur le clavier. Voici un exemple pour l'information en lien avec celui-ci : ");

                System.out.println(" Prénom : " ); tabContact[numContact].setPrenom(clavier.next());

                System.out.println( " Nom : "); tabContact[numContact].setNom(clavier.next());

                System.out.println( " ====================ADRESSE==================== ");
                System.out.println( " \nNumero de porte : "); tabContact[numContact].getAdressecontact().setNumeroPorte(clavier.next());
                System.out.println( " \nRue : " ); tabContact[numContact].getAdressecontact().setRue(clavier.next());
                System.out.println( " \nAppartement (si non, écrire : aucun) : "); tabContact[numContact].getAdressecontact().setAppartement(clavier.next());
                System.out.println( " \nVille : "); tabContact[numContact].getAdressecontact().setVille(clavier.next());
                System.out.println( " \nPays : "); tabContact[numContact].getAdressecontact().setPays(clavier.next());
                System.out.println( " \nProvince : "); tabContact[numContact].getAdressecontact().setProvince(clavier.next());
                System.out.println( " \n===============================================");

                System.out.println( " ====================OCCUPATION==================== ");
                System.out.println( " \nTravail : "); tabContact[numContact].getOccupationContact().setTravail(clavier.next());
                System.out.println( " \nNom entreprise : ");  tabContact[numContact].getEntrepriseContact().setNomEntreprise(clavier.next());
                System.out.println( " \nNumero porte entreprise : ");  tabContact[numContact].getEntrepriseContact().setNumeroPorteEntreprise(clavier.next());
                System.out.println( " \nRue entreprise : ");  tabContact[numContact].getEntrepriseContact().setRueEntreprise(clavier.next());
                System.out.println( " \nAppartement entreprise (si non, écrire : aucun) : ");  tabContact[numContact].getEntrepriseContact().setAppartementEntreprise(clavier.next());
                System.out.println( " \nVille entreprise : " );  tabContact[numContact].getEntrepriseContact().setVilleEntreprise(clavier.next());
                System.out.println( " \nPays : "); tabContact[numContact].getEntrepriseContact().setPaysEntreprise(clavier.next());
                System.out.println( " \nProvince : " );  tabContact[numContact].getEntrepriseContact().setProvinceEntreprise(clavier.next());
                System.out.println( " \n==================================================");


                boolean nTelephone = true;

                while ( nTelephone == true){
                    int decision = 0;
                    System.out.println(" 10 numéros vous sont accessible, voulez-vous en entrer un? 1-Oui \n2-Non");
                    if (decision == 1){
                        int numCaseTelephone = 0;

                        numCaseTelephone ++;
                        System.out.println( " Numero de téléphone (XXX-XXX-XXXX) : "); tabContact[numContact].getTabnTelephone(numCaseTelephone).setNumero(clavier.next());

                        System.out.println( " Cellulaire/maison/travail ");  tabContact[numContact].getTabnTelephone(numCaseTelephone).setInformation(clavier.next());
                    }
                    else if (decision ==2){
                        nTelephone = false;
                    }
                    else {
                        System.out.println(" Entrer un option valide " );
                    }
                }
                System.out.println(" Votre contact a été créer à la position " + numContact + " de votre liste de contact " );
            }


            //Modifier un contact
            else if ( choixMenu ==2 ){

                int numContact=0;

                System.out.println(" Quel contact voulez-vous modifier, entrer la position du contact ");
                numContact = clavier.nextInt();
                System.out.println( " Le contact à modifier sera " + tabContact[numContact].getPrenom()+tabContact[numContact].getNomFamille());

                System.out.println(" Prénom (" + tabContact[numContact].getPrenom()+ "): ");
                String changerPrenom = clavier.next();
                if (!changerPrenom.equals("")){
                    tabContact[numContact].setPrenom(changerPrenom);
                }
                System.out.println( " Nom de famille ("+ tabContact[numContact].getNom()+ " ): ");
                String changerNom = clavier.next();
                if (!changerNom.equals("")){
                    tabContact[numContact].setNom(changerNom);
                }


                System.out.println( " ADRESSE ");
                System.out.println( " Numero de porte (" + tabContact[numContact].getAdressecontact().getNumeroPorte() + " ): ");
                String changerNoPorte = clavier.next();
                if (!changerNoPorte.equals("")){
                    tabContact[numContact].getAdressecontact().setNumeroPorte(changerNoPorte);
                }
                System.out.println( " Rue : " );
                String changerRue = clavier.next();
                if (!changerRue.equals("")){
                    tabContact[numContact].getAdressecontact().setRue(changerRue);
                }
                System.out.println( " Appartement ( " + tabContact[numContact].getAdressecontact().getAppartement() + "): ");
                String changerAppartement = clavier.next();
                if (!changerAppartement.equals("")){
                    tabContact[numContact].getAdressecontact().setAppartement(clavier.next());
                }
                System.out.println( " Ville  ( " + tabContact[numContact].getAdressecontact().getVille() + "): ");
                String changerVille = clavier.next();
                if (!changerVille.equals("")){
                    tabContact[numContact].getAdressecontact().setVille(changerVille);
                }
                System.out.println( " Pays ( " + tabContact[numContact].getAdressecontact().getPays() + "): ");
                String changerPays = clavier.next();
                if (!changerPays.equals("")){
                    tabContact[numContact].getAdressecontact().setPays(changerPays);
                }
                System.out.println( " Province ( " + tabContact[numContact].getAdressecontact().getProvince() + "): ");
                String changerProvince = clavier.next();
                if (!changerProvince.equals("")){
                    tabContact[numContact].getAdressecontact().setProvince(changerProvince);
                }

                System.out.println( " OCCUPATION ");
                System.out.println( " Travail ( " + tabContact[numContact].getOccupationContact().getTravail() + "): ");
                String changerTravail = clavier.next();
                if (!changerTravail.equals("")){
                    tabContact[numContact].getOccupationContact().setTravail(changerTravail);
                }

                System.out.println( " Nom entreprise ( " + tabContact[numContact].getEntrepriseContact().getNomEntreprise() + "): ");
                String changerNomEntreprise = clavier.next();
                if (!changerNomEntreprise.equals("")){
                    tabContact[numContact].getEntrepriseContact().setNomEntreprise(changerNomEntreprise);
                }
                System.out.println( " Numero porte entreprise ( " + tabContact[numContact].getEntrepriseContact().getNumeroPorteEntreprise() + "): ");
                String changerNoPorteEntreprise = clavier.next();
                if (!changerNoPorteEntreprise.equals("")){
                    tabContact[numContact].getEntrepriseContact().setNumeroPorteEntreprise(changerNoPorteEntreprise);
                }
                System.out.println( " Rue entreprise : ( " + tabContact[numContact].getEntrepriseContact().getRueEntreprise() + "): ");
                String changerRueEntreprise = clavier.next();
                if (!changerRueEntreprise.equals("")){
                    tabContact[numContact].getEntrepriseContact().setRueEntreprise(changerRueEntreprise);
                }
                System.out.println( " Appartement entreprise ( " + tabContact[numContact].getEntrepriseContact().getAppartementEntreprise() + "): ");
                String changerAppartementEntreprise = clavier.next();
                if (!changerAppartementEntreprise.equals("")){
                    tabContact[numContact].getEntrepriseContact().setAppartementEntreprise(changerAppartementEntreprise);
                }
                System.out.println( " Ville entreprise ( " + tabContact[numContact].getEntrepriseContact().getVilleEntreprise() + "): ");
                String changerVilleEntreprise = clavier.next();
                if (!changerVilleEntreprise.equals("")){
                    tabContact[numContact].getEntrepriseContact().setVilleEntreprise(changerVilleEntreprise);
                }
                System.out.println(  " Pays ( " + tabContact[numContact].getEntrepriseContact().getPaysEntreprise() + "): ");
                String changerPaysEntreprise = clavier.next();
                if (!changerPaysEntreprise.equals("")){
                    tabContact[numContact].getEntrepriseContact().setPaysEntreprise(changerPaysEntreprise);
                }
                System.out.println( " Province ( " + tabContact[numContact].getEntrepriseContact().getNomEntreprise() + "): ");
                String changerProvinceEntreprise = clavier.next();
                if (!changerProvinceEntreprise.equals("")){
                    tabContact[numContact].getEntrepriseContact().setProvinceEntreprise(changerProvinceEntreprise);
                }


                boolean modiferNumero = true;
                while (modiferNumero == true){
                    System.out.println(" Quel numero de téléphone doit être changé " + tabContact[numContact].getTelephoneContact() + "\n Veuillez entrer sa position, si aucun -) 0");
                    int positionNumeroTelephone = clavier.nextInt();

                    if (positionNumeroTelephone != 0){
                        System.out.println(" Quel sera le nouveau numéro");

                        String nouveauNumero = clavier.next();

                        tabContact[numContact].getTabnTelephone(positionNumeroTelephone).setNumero(nouveauNumero);
                    }
                    System.out.println(" Voulez-vous modifier un autre numéro ? 1-Oui 2-Non " );
                    int choix = clavier.nextInt();

                    if (choix == 1){
                        modiferNumero = true;
                    }
                    else if (choix == 2){
                        modiferNumero = false;
                    }
                    else {
                        System.out.println( " Entrer un option valide ");
                    }
                }

                boolean modiferInfo = true;
                while (modiferInfo == true){
                    System.out.println(" Quel information d'un numero de téléphone doit être changé " + tabContact[numContact].getTelephoneContact() + "\n Entrer la position de celui-ci, si aucun ne doit être changé, entrer le nombre 0 ");
                    int positionNumeroTelephone = clavier.nextInt();

                    if (positionNumeroTelephone != 0){
                        System.out.println(" Quel sera la nouvelle information");

                        String nouvelleInfo = clavier.next();

                        tabContact[numContact].getnTelephone(positionNumeroTelephone).setInformation(nouvelleInfo);
                    }
                    System.out.println(" Voulez-vous modifier un information d'un autre numéro ? 1-Oui 2-Non " );
                    int choix = clavier.nextInt();

                    if (choix == 1){
                        modiferInfo = true;
                    }
                    else if (choix == 2){
                        modiferInfo = false;
                    }
                    else {
                        System.out.println( " Entrer un option valide ");
                    }
                }



                //Consulter un contact
            }
            else if ( choixMenu ==3 ){

                System.out.println(" Quel contact voulez-voir, écrire la position où il se trouve ");
                int numContact;
                numContact = clavier.nextInt();

                System.out.println(" Prénom : " + tabContact[numContact].getPrenom());
                System.out.println( " Nom : "+ tabContact[numContact].getNom());

                System.out.println( " ====================ADRESSE==================== ");
                System.out.println( " \nNumero de porte : "+ tabContact[numContact].getAdressecontact().getNumeroPorte());
                System.out.println( " \nRue : " + tabContact[numContact].getAdressecontact().getRue());
                System.out.println( " \nAppartement : "+ tabContact[numContact].getAdressecontact().getAppartement());
                System.out.println( " \nVille : "+ tabContact[numContact].getAdressecontact().getVille());
                System.out.println( " \nPays : "+ tabContact[numContact].getAdressecontact().getPays());
                System.out.println( " \nProvince : "+ tabContact[numContact].getAdressecontact().getProvince());
                System.out.println( " \n===============================================");

                System.out.println( " ====================OCCUPATION==================== ");
                System.out.println( " \nTravail : " + tabContact[numContact].getOccupationContact().getTravail());
                System.out.println( " \nNom entreprise : " +  tabContact[numContact].getEntrepriseContact().getNomEntreprise());
                System.out.println( " \nNumero porte entreprise : " +  tabContact[numContact].getEntrepriseContact().getNumeroPorteEntreprise());
                System.out.println( " \nRue entreprise : " +  tabContact[numContact].getEntrepriseContact().getRueEntreprise());
                System.out.println( " \nAppartement entreprise (si non, écrire : aucun) : " +  tabContact[numContact].getEntrepriseContact().getAppartementEntreprise());
                System.out.println( " \nVille entreprise : " +  tabContact[numContact].getEntrepriseContact().getVilleEntreprise());
                System.out.println( " \nPays : " + tabContact[numContact].getEntrepriseContact().getPaysEntreprise());
                System.out.println( " \nProvince : " +  tabContact[numContact].getEntrepriseContact().getProvinceEntreprise());
                System.out.println( " \n==================================================");


                System.out.println( " Numero de téléphone (XXX-XXX-XXXX) : " + tabContact[numContact].getTelephoneContact().getNumero());
                System.out.println( " Cellulaire/maison/travail " + tabContact[numContact].getTelephoneContact().getInformation());

            }

            else if ( choixMenu == 4){
                System.out.println( " Bonne journée :) ! ");
                quiiterMenu = true;
            }
            else {
                System.out.println( " Erreur, veuillez choisir une option valide. ");
            }
        }
        clavier.close();
    }
}
