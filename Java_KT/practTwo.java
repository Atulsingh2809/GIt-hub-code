package Java_KT;

class A
{
    public void show()
    {
        System.out.println("in A show");
    }

}

public class practTwo 
{
    public static void main(String[] args) 
    {
        A obj = new A()            // Anonynous class
        {
            public void show()
            {
                System.out.println("in B show");
            }

        };
        obj.show();
        
    }
}
