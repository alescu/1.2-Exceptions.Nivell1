import java.util.ArrayList;

public class Venda {
    private ArrayList<Producte> productes = new ArrayList<>();
    private Double preuTotal = 0.0;

    public ArrayList<Producte> getProductes() {
        return productes;
    }

    public void setProductes(ArrayList<Producte> productes) {
        this.productes = productes;
    }

    public Double getPreuTotal() {
        for(Producte producte : productes){
            System.out.println("    "+producte.getNom()+" / "+producte.getPreu());
            preuTotal += producte.getPreu();
        }
        return preuTotal;
    }

    public void calcularTotal(){

    }
}