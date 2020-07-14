public abstract class Employe implements IService{
    private int  id;
    private  String nomCompet;



    public  Employe () {

    }

    public  Employe (int id, String nomComplet) {
        this.nomCompet = nomComplet;
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public String getNomCompet() {
        return nomCompet;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomCompet(String nomCompet) {
        this.nomCompet = nomCompet;
    }

    public String affiche() {
        return "ID: "+id+" Prenom et NOM: "+nomCompet;
    }

    public boolean isEmbauche() {
        if (this instanceof  Embauche) {
            return  true;
        }
        return  false;
    }

    public  boolean isJouurnalier() {
        if (this instanceof  Journalier) {
            return  true;
        }
        return  false;
    }
}
