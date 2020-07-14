import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String choix;
        Scanner clavier=new Scanner(System.in);

        Application appli =new Application();
        do {

            System.out.println("1-Ajouter Service");
            System.out.println("2-Lister les services");
            System.out.println("3-Ajouter un employé");
            System.out.println("4-Lister les journaliers");
            System.out.println("5- les embauchés d'un service");
            System.out.println("6- Quitter");
            System.out.println("FAITE VOTRE CHOIX");
            choix=clavier.nextLine();

            switch(choix){
                case "1":
                    System.out.println("Entrer le libelle du service");
                    String nomService =clavier.nextLine();

                    //Generation id
                    int id = appli.getNbreService() + 1;
                    Service ser = new Service(nomService, id);
                    appli.ajouterService(ser);

                    break;
                case "2":
                    appli.listerService();
                    break;
                case "3":

                    id = appli.getNbreEmp() + 1;
                    System.out.println("EnVeuillez saisir le nom complet de l'employe");
                    String nomEmp =clavier.nextLine();
                    System.out.println("EnVeuillez saisir le STATUT de l'employe EMBAUCHE / JOURNALIER" );
                    String statut =clavier.nextLine();

                    if (statut.equals("JOURNALIER") ){

                        System.out.println("Saisir son forfait ");
                        Double forfait =clavier.nextDouble();
                        System.out.println("Saisir son durée ");
                        int duree =clavier.nextInt();

                        Employe emp = new Journalier(id, nomEmp ,duree, forfait);
                        appli.ajouterEmploye(emp);

                    } else  if (statut.equals("EMBAUCHE")) {
                        System.out.println("Saisir son salaire ");
                        Double salaire =clavier.nextDouble();
                        LocalDate dateEmb =  LocalDate.now();

                        System.out.println("Saisir l'id de son service  ");
                        appli.listerService();
                        int idService =clavier.nextInt();
                        Service serviceEmp = new Service();
                        serviceEmp.setId(idService);

                        Embauche emp = new Embauche(id, nomEmp,  salaire, dateEmb );
                        emp.setSerEmp(serviceEmp);
                        appli.ajouterEmploye(emp);
                    }
                    break;


                case "4":
                    appli.listerJournalier();
                    break;

                case "5":
                    System.out.println("Saisir l'ID du service");
                    appli.listerService();
                    int idService =clavier.nextInt();
                    Service serviceEmp = new Service();
                    serviceEmp.setId(idService);
                    appli.listerEmpService(serviceEmp);
                    break;

            }

        } while (!choix.equals("6"));
    }
}
