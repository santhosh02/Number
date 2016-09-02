import java.util.*;
class Factotial
{
public static void main(String args[])
{
Scanner si=new Scanner(System.in);
int n=si.nextInt();
int s=1;
for(int i=1;i<=n;i++)
{
s=s*i;
}
System.out.println(s);
}
}