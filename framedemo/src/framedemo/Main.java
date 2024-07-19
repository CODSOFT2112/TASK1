package framedemo;


	import java.util.*;

	public class Main
	{
		public static void main(String[] args) {
			int marks[] = new int[] {70,50,80,90,100};
			int len = marks.length;
			int total_mark = 0;
			for(int i = 0; i<len;i++){
			    total_mark = total_mark+i;
			}
			System.out.println(total_mark);
			int a_p = total_mark/len;
			System.out.println(a_p);
			if(a_p>=90){
			    System.out.println("Grade is A");
			}
			else if(a_p>=80){
			    System.out.println("Grade is B");
			}
			else if(a_p>=70){
			    System.out.println("Grade is C");
			}
			else if(a_p>=60){
			    System.out.println("Grade is D");
			}
			else{
			    System.out.println("Grade is F");
			}
			
		}
	}

