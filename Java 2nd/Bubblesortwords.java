package default2;
import java.util.*;
public class Bubblesortwords {
	public static void main(String[]args) {
		Scanner br=new Scanner(System.in);
		String sentence=br.nextLine();
		String[] arr=sentence.split(" ");
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				int a=arr[j].compareTo(arr[j+1]);
				if(a>0)
					swap(arr, j, j+1);
			}
		}
		for(String it:arr)
			System.out.print(it+" ");
	}
	public static void swap(String[]arr, int i, int j) {
		String temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}
}
