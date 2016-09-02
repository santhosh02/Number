import java.util.*;
class Camel
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=new String(s.nextLine());
String[] s1=str.split(" ");
for(int i=0;i<s1.length;i++)
{
System.out.print(Character.toUpperCase(s1[i].charAt(0)));
for(int j=1;j<s1[i].length();j++)
{
System.out.print(s1[i].charAt(j));
}
System.out.print(" ");
}
}
}