package pl.edu.ur.oopl5;
import java.util.*;

public class Stos
{
    int[] stack; //0 oznacza brak danych
    int index;
    int cap;
    
    public void start(int n)
    {
        index = 0;
        stack = new int[n];
        cap = n-1;
    }
    public boolean isEmpty()
    {
        if(stack[0]==0)
        {
            return true;
        }else
        {
            return false;
        }
    }
    public boolean isFull()
    {
        if(stack[cap]!=0)
        {
            return true;
        }else
        {
            return false;
        }
    }
    public void push(int i)
    {
        if(isFull())
        {
            return;
        }else
        {
            stack[index] = i;
            index+=1;
        }
    }
    public void pop(int i)
    {
        if(isEmpty())
        {
            return;
        }else
        {
            stack[index] = 0;
            index-=1;
        }
    }
}
