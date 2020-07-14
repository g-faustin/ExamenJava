public class Journalier  extends Employe{
    private  int duree;
    private double forfait;

    public Journalier(int id, String nomComplet, int duree, double forfait) {
        super( id,  nomComplet);
        this.forfait = forfait;
        this.duree = duree;
    }

    public int getDuree() {
        return duree;
    }

    public double getForfait() {
        return forfait;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setForfait(double forfait) {
        this.forfait = forfait;
    }

    @Override
    public String affiche() {
        return super.affiche() + " Duree " + duree + " forfait  "+ forfait ;
    }
}
