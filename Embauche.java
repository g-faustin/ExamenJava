import java.time.LocalDate;

public class Embauche extends  Employe{

    double salaire;
    LocalDate dateEmb;

    //Propriete Navigationnelle
    private  Service serEmp;

    public Embauche(int id, String nomComplet,  double salaire, LocalDate dateEmb){
        super(id, nomComplet);
        this.salaire = salaire;
        this.dateEmb = dateEmb;

    }

    public Service getSerEmp() {
        return serEmp;
    }

    public void setSerEmp(Service serEmp) {
        this.serEmp = serEmp;
    }

    public double getSalaire() {
        return salaire;
    }

    public LocalDate getDateEmb() {
        return dateEmb;
    }

    public void setDateEmb(LocalDate dateEmb) {
        this.dateEmb = dateEmb;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String affiche() {
        return  super.affiche() + "Salaire " + salaire + "Date Embauche " + dateEmb;
    }


}
