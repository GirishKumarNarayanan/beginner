package Common;
import java.util.*;
public class Common {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of arrays:");
		int no=in.nextInt();
		int count=1;
		int i=0,j=0;
		long l=0;
		String str="";
		String temp="";
		for(i=0;i<no;i++){
			temp=in.next();
			str=str+temp;
			if(i!=no-1)
				str=str+",";
		}
		String s[]=str.split(",");
		int arr[]=new int[s.length];
		for(i=0;i<s.length;i++){
			arr[i]=Integer.parseInt(s[i]);
		}
		Arrays.sort(arr);
		for(i=0;i<arr.length;i++){
			count=1;
			for(j=i+1;j<arr.length;j++){
				if(arr[i]==(arr[j])){
					count++;
				}
			}
				if(count==no){
					System.out.println(s[i]);
				}
			}
       //System.out.print(arr[i]+" ");
		}
	}


