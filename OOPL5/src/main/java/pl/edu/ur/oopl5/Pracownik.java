package pl.edu.ur.oopl5;

public class Pracownik 
{    
    public String imie;
    public String nazwisko;
    public int wiek;
    public String stanowisko;

    public void npracownik(String imie, String nazwisko, int wiek, String stan) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko = stan;
    }

    public void npracownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void pokazDane() {
        System.out.println("Dane pracownika");
        System.out.println("Imię: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Stanowisko: " + this.stanowisko);
        System.out.println("Wiek: " + this.wiek + " lat");
    }
    
}
