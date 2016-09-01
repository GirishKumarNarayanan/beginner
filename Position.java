import java.util.*;
public class Position {
public static void main(String[] args) {
Scanner x=new Scanner(System.in);
String s1=x.nextLine();
String z= FindIndex(s1);
System.out.println(z);
}
public static String FindIndex(String str1){
String str2="";
String str[]=str1.split(",");
Arrays.sort(str);
for(int i=0;i<str.length;i++)
{
if(i==Integer.parseInt(str[i]))
{str2=str2+i+" ";}
}
return str2;
}
}
