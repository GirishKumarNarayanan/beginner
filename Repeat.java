import java.util.*;
public class Repeat{
public static void main(String[] args) {
Scanner x=new Scanner(System.in);
System.out.println("Enter the number of registration:");
int a=x.nextInt();
int s[]=new int[a];
int i=0;
System.out.println("Enter the array:");
for(i=0;i<a;i++)
s[i]=x.nextInt();
int count=0;
Set<Integer> o=new TreeSet<Integer>();
for(i=0;i<s.length;i++){
	count=0;
	for(int j=0;j<s.length;j++){
		if(s[i]==s[j])
			count++;
		if(count>=2)
		o.add(s[i]);	
}
}
System.out.println(o);
}

}
