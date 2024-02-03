import java.util.ArrayList;

public class MyArrayList {
    //static ArrayList<String> cursuri = new ArrayList<>();
    public static void afiseazaListaCursuri(ArrayList<String> oriceLista){
        System.out.println("Elementele listei sunt:");
        for (String c: oriceLista){
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> listaNoastra = new ArrayList<>();
        listaNoastra.add("First");
        listaNoastra.add("Second");
        listaNoastra.add("Third");
        listaNoastra.set(0,"First-replaced");
        listaNoastra.remove(2);

        for (String element:listaNoastra){
            System.out.println(element);
        }

        System.out.println(listaNoastra.size());
        System.out.println(listaNoastra.contains("Second"));
        System.out.println(listaNoastra.indexOf("Second"));


        //Ex 1 Structuri de date

        ArrayList<String> cursuri = new ArrayList<>();
        cursuri.add("Testare manuala");
        cursuri.add("Testare automata");
        cursuri.add("Front-end");
        cursuri.add("Java");

        System.out.println("Elementul de pe a doua pozitie este "+cursuri.get(1));
        System.out.println("Lungimea listei este "+cursuri.size());

        //System.out.println("Elementele sunt ");

        afiseazaListaCursuri(cursuri);

        ArrayList<String> filme = new ArrayList<>();
        filme.add("Harry Potter");
        filme.add("Home alone");

        afiseazaListaCursuri(filme);



    }



}