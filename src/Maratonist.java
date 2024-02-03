public class Maratonist extends Sportiv{
    public Maratonist(String tara, String sport) {
        super(tara, sport);
    }

    @Override
    void seAntreneaza() {
        System.out.println("Maratonistul se antreneaza");
    }

    public void seOdihneste(){
        System.out.println("Maratonistul se odihneste");
    }
}