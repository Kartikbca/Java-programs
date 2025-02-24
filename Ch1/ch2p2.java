import java.util.Scanner;
class ch1p2
{
    public static void main(String args[])
    {
        int x;
        double i,emi;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter loan amount ::");
        x=sc.nextInt();
        System.out.println("Enter intrest ::");
        i=sc.nextDouble();
        emi=x*i/(100*60);
        System.out.println("The emi ::"+emi);
    }
}