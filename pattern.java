import java.util.Scanner;
class pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
         System.out.println("Enter a number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=2*i;j++)
        {
             System.out.print("*");
        }
        System.out.println();
}
}
}

