package Java_KT;

interface A
{
     void show();
}



class practSix
{
    public static void main(String[] args) 
    {

        A obj = new A() {
            public void show()
            {
                System.out.println("in A show");
            }
        };

        obj.show();
        
    }
}