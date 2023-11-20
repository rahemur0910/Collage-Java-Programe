// Declear a string method
/*
String s1 = "";
String s2 = new string();
String s3 = "gendu";
Srring s4 = new string("gendu");
String s5 = new string(s3);
*/
/*
import java.io.*;
class MyStr
{
	String s1;
	String s2 = "Hello";
	BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
	public void getData()
	{
		try
		{
			System.out.print("Enter a name: ");
			s1 = ad.readLine();
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
	}
	
	public void showData()
	{
		System.out.print(s2+" "+s1);
		System.out.print(s1.lastIndexOf("r"));
		System.out.print(s1.to("r"));
	}
}

class Demo
{
	public static void main(String[] args)
	{
		MyStr ob = new MyStr();
		ob.getData();
		ob.showData();
	}
}*/
/*
a.lastIndexOf(x) --> return last index
a.toLowerCase(x) 
a.toUpperCase(x)
a.length (x)
a.replace(x,y)
a.charAt("x")
a.indexOf(x")
a.compareTo(b);
a.equals(b)
a.equalsIgnoreCase()
a.substring(n)
a.substring(n,m)
a.tocharArray() 
*/
/*

StringBuffer sb1 = new StringBuffer();
StringBuffer sb2 = new StringBuffer("SunSet");
StringBuffer sb3 = new StringBuffer(sb2);

String sb1 = new String("soham");

sb1.reverse()

*/

/*

new StringTokenizer(String)
new StringTokenizer(string,delemeter)

nextToken() --> trancate string as token and set the parameter next of delemeter
String a = gsfgsifgirwfgifgigigighigihgiugisisdgigigifgigisghiudgiudg

hasMoreToken() --> return true if rest of string exists otherwise false
countToken() --> return number of token

*/

import java.util.StringTokenizer;

class StrToken {
    String str = "Hello From JavaClass";

    public void showData() {
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String ts = st.nextToken();
            System.out.print(ts + " ");
        }
    }
}

class Demo {
    public static void main(String[] args) {
        StrToken ob = new StrToken();
        ob.showData();
    }
}

/*  Enter a String and a word wap to print frequency of the word.............