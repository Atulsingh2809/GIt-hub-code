package Java_KT;

@FunctionalInterface
interface A
{
    int add(int a, int b);
    
}
public class practThree 
{
    public static void main(String[] args) 
    {
        A obj = new A() 
        {
            public int add(int a, int b)
            {
               return a+b;
            }
            
        };
           
        int result = obj.add(5,4); 

        System.out.println(result);
        
    }
    
}
