package Java_KT;

class A
{
    public void show()
    {
        System.out.println("in A show");
    }
    class C
    {
        public void show()
        {
            System.out.println(" in C show");
        }
    }
}
class B extends A
{
    
    public void show()
    {
        System.out.println("in B show");
    }

}
class practOne
{
    
    public static void main(String[] args) 
    {

        A obj = new A();
        // obj.show();

        A.C obj1 = obj.new C();
        obj1.show();
        
    }
}
