public class Fibonacciwithoutrecursion
{
public static void main(String args[])
{
int n=10,firstterm=0,secondterm=1,thirdterm;
System.out.print(firstterm + " " + secondterm);
for( int i=2;i<n;++i)
{
thirdterm=firstterm+secondterm;
System.out.print(" " + thirdterm);
firstterm=secondterm;
secondterm=thirdterm;
}
}
}
