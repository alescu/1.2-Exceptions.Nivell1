public class Producte {
    private String nom;
    private Double preu;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPreu() {
        return preu;
    }

    public void setPreu(Double preu) {
        this.preu = preu;
    }

    Producte(String nom, Double preu){
        this.nom = nom;
        this.preu = preu;
    }
}