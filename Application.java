public class Application {
    final int TAILLE=100;

    private Employe tabEmp[];
    private Service []tabService;

    private int nbreService=0;
    private int nbreEmp=0;


    public int getNbreEmp() {
        return nbreEmp;
    }

    public int getNbreService() {
        return nbreService;
    }

    public Application(){
        //Creation du Tableau
        tabEmp=new Employe[TAILLE];
        tabService=new Service[TAILLE];
    }

    public void ajouterEmploye(Employe emp) {
        tabEmp[nbreEmp] = emp;
        nbreEmp++;
    }

    public  void ajouterService(Service ser) {
        tabService[nbreService] = ser;
        nbreService++;
    }

    public void listerJournalier(){
        for(int i=0; i<nbreEmp; i++){
            if(tabEmp[i].isJouurnalier()){
                System.out.println(tabEmp[i].affiche());
            }
        }
    }

    public void listerService(){
        for(int i=0; i<nbreService; i++){
            System.out.println(tabService[i].affiche());
        }
    }

    public void  listerEmpService(Service serviceEmp) {
        for(int i=0; i<nbreEmp; i++){
            if (tabEmp[i].isEmbauche()) {
                if (serviceEmp.compare(((Embauche)tabEmp[i]).getSerEmp().getId())) {
                    System.out.println(tabEmp[i].affiche());
                }
            }

        }
    }
}
