import java.util.Scanner;
class patterns{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
         System.out.println("Enter a number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        for(int j=1;j<=n-i;j++)
{

        if(i==1||i==n||j==1||j==n)
        {
            System.out.print("*");
        }
        else
        {
            System.out.print(" ");
        }
    }
    System.out.println();
}

 }
}
