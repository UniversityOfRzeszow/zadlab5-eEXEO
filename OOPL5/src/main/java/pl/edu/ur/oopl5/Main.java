package pl.edu.ur.oopl5;

public class Main {

    public static void main(String[] args) 
    {
        Liczba lb = new Liczba();
        
        lb.dodaj("1111");
        lb.mnozenie(1111);
        
        System.out.println(lb.wypisz());
        System.out.println(lb.silnia(8));
        
        Stos stack = new Stos();
        
        stack.start(5);
    }
    
}
