package pl.edu.ur.oopl5;
import java.util.Scanner;

public class Firma 
{
    public Pracownik pracownicy[];
    Scanner imp = new Scanner(System.in);
    
    public Firma()
    {
        this.pracownicy = new Pracownik[100];
    }
    
    public void pokazPracownikow() 
    {
        for (int i = 0; i < this.pracownicy.length; i++) 
        {
            if (this.pracownicy[i] != null) 
            {
                System.out.println("Imie: " + this.pracownicy[i].imie);
                System.out.println("Naziwsko: " + this.pracownicy[i].nazwisko);
                System.out.println("Wiek: " + this.pracownicy[i].wiek);
                System.out.println("Pensja: " + this.pracownicy[i].pensja);
                System.out.println("Stanowisko: " + this.pracownicy[i].stanowisko);
            } else 
            {
                break;
            }

        }
    }
    
    public void dodajPracownika(Pracownik prac, int id) 
    {
        this.pracownicy[id] = prac;
    }

    public void zmienPracownika(int id) 
    {
        System.out.println("Podaj imie pracownika");
        this.pracownicy[id].imie = imp.nextLine();
        System.out.println("Podaj nazwisko pracownika");
        this.pracownicy[id].nazwisko = imp.nextLine();
        System.out.println("Podaj wiek pracownika");
        this.pracownicy[id].wiek = imp.nextInt();
        System.out.println("Podaj zarobki pracownika");
        this.pracownicy[id].pensja = imp.nextInt();
        System.out.println("Podaj stanowsiko pracownika");
        this.pracownicy[id].pensja = imp.nextInt();
    }  
}
