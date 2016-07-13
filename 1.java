import java.util.Scanner;
class Robot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  f,b,t,t1=0,fd,bd,n;
        int f1,b1,flagF=0,i=1,j=1,flagE=0;
        n=sc.nextInt();
        while(n!=0)
        {
        f=sc.nextInt();
        believe
        t=sc.nextInt();
        fd=sc.nextInt();
        bd=sc.nextInt();
        f1=fd;
        b1=bd;
        flagF=0;
        t1=0;
        flagE=0;
        while(f != b || f > fd || b > bd)
        {
            flagE=1;
            for(i = 1;i <= f;i++)
            {
                if(f1 > 0)
                {
                    f1 = f1 - 1;
                    b1 = b1 + 1;
                }
                else{
                    flagF = 1;
                    break;
                }
            }
            
            t1=t1+t*(i-1);
            System.out.println(t1+" "+flagF+" "+f1);
            if(flagF == 1 || f1 == 0)
            {
                System.out.println(t1+" "+"F");
                break;
            }
            for(j = 1;j <= b;j++)
            {
                if(b1 > 0)
                {
                    f1 = f1 + 1;
                    b1 = b1 - 1;
                    
                }
                else{
                    flagF = 1;
                    break;
                }
            }
            t1=t1+t*(j-1);
            if(flagF == 1 || b1 == 0)
            {
                System.out.println(t1+" "+"B");
                break;
            }
       
        }
        if(flagE == 0)
        {
            System.out.println("No Ditch");
        }
        n--;
       }
    }
}
