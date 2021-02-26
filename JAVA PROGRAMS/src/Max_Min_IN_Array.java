
public class Max_Min_IN_Array {

	public static void main(String[] args) {
		 int[] a = {1,2,3,4};
		 int max = a[0];
		 for(int i=1; i<=a.length-1;i++){
			 if(a[i]>max){
				 max = a[i];
			 }
		 }
		 System.out.println("The maximum number in an array is: "+max);
		 
		 
		 int min  = a[0];
		 for(int i=1;i<=a.length-1;i++){
			 if(a[i]<min){
				 min = a[i];
			 }
		 }
		 System.out.println("The minimum number in an array is: "+min);
	}

}
