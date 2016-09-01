import java.util.*;
public class Last {
public static void main(String[] args) {
Scanner q=new Scanner(System.in);
String s=q.nextLine();
String r[]=s.split(",");
int i=0;
String out1="";
String a="";
int count=0;
for(i=0;i<r.length;i++){
	for(int j=0;j<r.length;j++)
		if(Integer.parseInt(r[i])==Integer.parseInt(r[j]))
			count=count+1;	
	if(count==1)
		out1=out1+r[i]+" ";
	count=0;
}
System.out.println(out1);
	}
}