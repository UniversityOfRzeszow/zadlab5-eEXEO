package pl.edu.ur.oopl5;
import java.util.Arrays;

public class Liczba 
{
    /*
    Zdefiniuj klasę Liczba, która przechowuje w tablicy cyfry liczby dziesiętnej. Zdefiniuj operacje wypisywania liczby, 
    nadawania jej wartości (w postaci parametru konstruktora będącego napisem) oraz mnożenia przez liczbę typu int. 
    W przypadku gdy w czasie mnożenia okaże się, że tablica jest za mała, procedura mnożąca powinna kopiować jej zawartość do większej. 
    Zdefiniuj metodę silnia, która policzy silnię zadanej jako parametr liczby typu int.
    */
    
    int[] liczba = new int[] {0};
    
    public int silnia(int i)
    {
        if (i < 1)
        {
            return 1;
        }
        else
        {
        return i * silnia(i - 1);            
        }

    }
    
    public void mnozenie(int lic)
    {
        int imp = wypisz();
        imp = imp*lic;
        liczba = new int[] {0};
        dodaj(Integer.toString(imp));
        
    }
    
    public void dodaj(String liczb)
    {
        String slicz = liczb;
        
        int len = slicz.length();
        
        for(int i = 0; i<len; i++)
        {
            int nd = Integer.parseInt(slicz.substring(i, i+1));
            
            if(i==0)
            {
                liczba[0] = nd;
            }
            if(i>0)
            {
                liczba = Arrays.copyOf(liczba, len + 1);
                liczba[i] = nd;
            }
            
        }
        liczba = Arrays.copyOf(liczba, liczba.length - 1);
    }
    
    public int wypisz()
    {
        String temp = "";
        for(int i = 0;i<liczba.length;i++)
        {
            
            temp = temp + Integer.toString(liczba[i]);
        }
        return Integer.parseInt(temp);
    }
}
