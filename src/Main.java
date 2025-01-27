import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
/**
    Crea una classe anomenada "Producte" amb els atributs nom i preu, i una altra classe anomenada "Venda".
    Aquesta classe té com a atributs una col·lecció de productes i el preu total de la venda.

    La classe "Venda", té un mètode anomenat calcularTotal() que llança l’excepció personalitzada "VendaBuidaException"
    i mostra per pantalla “Per fer una venda primer has d’afegir productes” si la col·lecció de productes està buida.
    Si la col·lecció té productes, llavors ha de recórrer la col·lecció i guardar la suma de tots els preus dels productes a l’atribut preu total de la venda.

    L’excepció personalitzada "VendaBuidaException" ha de ser filla de la classe Exception. Al seu constructor li hem
    de passar el missatge  “Per fer una venda primer has d’afegir productes” i quan capturem l’excepció, l’hem de mostrar
    per pantalla amb el mètode getMessage() de l’excepció.

    Escriu el codi necessari per a generar i capturar una excepció de tipus "IndexOutOfBoundsException".
 **/
    public static void main(String args[]){

        ArrayList<Venda> llistatVendas = new ArrayList<>();

        Producte prod_1 = new Producte("Detergent",12.1);
        Producte prod_2 = new Producte("Macarrons",2.2);
        Producte prod_3 = new Producte("Clips",0.25);

        Venda novaVenda = new Venda();
        ArrayList<Producte> llistatProductes = new ArrayList<Producte>(Arrays.asList(prod_1,prod_2,prod_3));
        novaVenda.setProductes(llistatProductes);

        Venda novaVenda2 = new Venda();

        llistatVendas.add(novaVenda);
        llistatVendas.add(novaVenda2);

        try{
            int idVenda = 1;
            for(Venda venda : llistatVendas){
                System.out.println("Venda "+ idVenda + ".........");
                if(venda.getProductes().isEmpty()){
                    throw new VendaBuidaException("Per fer una venda primer has d’afegir productes\n");
                }else{
                    System.out.println("    Preu total venda... " + venda.getPreuTotal()+"\n");
                }
                idVenda++;
            }
        } catch(VendaBuidaException ee){
            System.out.println(ee.getMessage());
        }

        try{
            llistatVendas.get(3);
        }catch(IndexOutOfBoundsException ee){
            System.out.println("IndexOutOfBoundsException provocada: "+ee.getMessage()+"\n");

        }

    }



}
