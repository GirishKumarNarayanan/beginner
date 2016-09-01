import java.util.*;
public class UniqueElement1 {
public static void main(String[] args) {
Scanner x=new Scanner(System.in);
String q=x.nextLine();
String arr[]=q.split(",");
int i=0;
String output="";
//String a="";
int count=0;
for(i=0;i<arr.length;i++){
	for(int j=0;j<arr.length;j++)
		if(Integer.parseInt(arr[i])==Integer.parseInt(arr[j]))
			count=count+1;	
	if(count==1)
		output=output+arr[i]+" ";
	count=0;
}
System.out.println(output);
	}
}