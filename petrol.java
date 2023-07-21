import java.util.*;
class petrol
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a1=obj.nextInt();
        int b1=obj.nextInt();
        int c1=obj.nextInt();
        int d1=obj.nextInt();
        int e1=obj.nextInt();
        int a2=obj.nextInt();
        int b2=obj.nextInt();
        int c2=obj.nextInt();
        int d2=obj.nextInt();
        int e2=obj.nextInt();
        int sol1=0,sol2=0,n=60,pet=0,dies=0;
        sol1=c1+(d1/a1*b1)+e1;
        pet=sol1*n;
        sol2=c2+((d2/a2)*b2)+e2;
        dies=sol2*n;
        if(dies>pet)
        System.out.println("petrol");
        else if(pet>dies)
        System.out.println("diesel");

    }
}