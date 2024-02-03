public class Animal {
    String nume;
    String culoare;
    boolean vegetarian;

    public Animal() {
        nume = "unknown";
        culoare = "unknown";
        vegetarian = false;
    }

    public Animal(String nume) {
        this.nume = nume;
    }

    public Animal(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }

    public Animal(String nume, String culoare, boolean vegetarian) {
        this.nume = nume;
        this.culoare = culoare;
        this.vegetarian = vegetarian;
    }

    public void mananca(){
        System.out.println(nume+" mananca");
    }

    public void doarme(){
        System.out.println(nume+" doarme");
    }

    public String afiseaza(){
        return nume+" are culoarea "+culoare;
    }

}
