
public class Palindrome
{
public static void main(String args[])
{
int num=123321,reverse=0,rem,temp;
temp=num;
while(temp !=0)
{
rem=temp % 10;
reverse=reverse * 10 + rem;
temp /=10;
}
if(num == reverse)
System.out.println(num + "Palindrome");
else
System.out.println(num + "not a palindrome");
}
}

