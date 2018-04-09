package pl.edu.ur.oopl5;
import java.util.Scanner;

public class Pracownik 
{    
    public String imie;
    public String nazwisko;
    public int wiek;
    public String stanowisko;
    public int pensja;
    Scanner imp = new Scanner(System.in);

    public void npracownik(String imie, String nazwisko, int wiek, String stan, int mon) 
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko = stan;
        this.pensja = mon;
    }

    public void npracownik(String imie, String nazwisko) 
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void pokazDane() {
        System.out.println("Dane pracownika");
        System.out.println("Imię: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Zarobek: " + this.pensja);
        System.out.println("Stanowisko: " + this.stanowisko);
        System.out.println("Wiek: " + this.wiek + " lat");
    }
    
    public Pracownik()
    {
        
    }
    
    public Pracownik newpracownik()
    {
        System.out.println("Podaj imie pracownika");
        this.imie = imp.nextLine();
        System.out.println("Podaj nazwisko pracownika");
        this.nazwisko = imp.nextLine();
        System.out.println("Podaj stanowisko pracownika");
        this.stanowisko = imp.nextLine();
        System.out.println("Podaj wiek pracownika");
        this.wiek = imp.nextInt();
        System.out.println("Ustal zarobki pracownika");
        this.pensja = imp.nextInt();
        return this;
    }
    
}
