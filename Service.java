public class Service implements IService {

    private  String libelle;
    private int id;

    public  Service () {

    }

    public  Service (String libelle, int id) {
        this.libelle = libelle;
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    @Override
    public String affiche() {
        return "ID " + id + " Libelle " + libelle;
    }

    public boolean compare(int id) {
        return  this.id == id;
    }

    public boolean compare(String libelle) {
        return  this.libelle == libelle;
    }
}
