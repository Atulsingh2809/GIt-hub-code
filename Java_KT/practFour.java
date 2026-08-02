package Java_KT;

interface A
{
    void show();
    void config();
}

class B implements A
{
    public void show()
    {
        System.out.println("in B show");
    }

    public void config()
    {
        System.out.println("in B config");
    }
}


public class practFour 
{
    public static void main(String[] args) 
    {
        A obj;
        obj = new B();
        obj.config();
        obj.show();
        
    }
    
}
