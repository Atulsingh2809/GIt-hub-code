package Java_KT;

enum status
{
    Running, failed, success, pending;
}

public class practFive 
{
    public static void main(String[] args) 
    {
        // status s = status.Running;
        // System.out.println(s);

        status s = status.Running;

        switch(s)
        {
            case Running:
            System.out.println("Running...");
            break;

            case failed:
            System.out.println("Try Again");
            break;

            case pending:
            System.out.println("please wait...");
            break;

            default:
            System.out.println("Done");
            break;


        }
        
    }
    
}
