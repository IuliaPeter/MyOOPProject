public class Persoana {
    int varsta;
    String sex;
    String nume;
    String prenume;

    public Persoana() {
        varsta = 20;
        sex="M";
        nume="Unknown";
        prenume="Unknown";
    }

    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    //TO DO adaugati un constructor care sa primeasca nume, varsta, sex si creati un obiect nou

    public Persoana(int varsta, String sex, String nume) {
        this.varsta = varsta;
        this.sex = sex;
        this.nume = nume;
    }
}