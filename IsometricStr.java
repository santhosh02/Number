import java.io.*;
import java.lang.*;
import java.util.*;
class IsometricStr
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1=s.next();
String s2=s.next();
HashMap<Character,Character> hm=new HashMap<Character,Character>();
if(s1.length()==0 && s2.length()==0)
{
System.out.println("false");
}
else if(s1.length()!=s2.length())
{
System.out.println("False");
}
else if(s1.length()==s2.length())
{
	for(int i=0;i<s1.length();i++)
	{
	char c1=s1.charAt(i);
	char c2=s2.charAt(i);

		if(hm.containsKey(c1))
		{
  		if(hm.get(c1)!=c2)
 		{
			System.out.println("false");
			System.exit(0);
 		}
		}
		else
		{
 	 	if(hm.containsValue(c2))
    		{
  		System.out.println("false");
 		System.exit(0);
   		}
		hm.put(c1,c2);
		}
	}
}
System.out.println("true");
}

}