import java.io.IOException;
import java.util.HashSet;
//import  java.lang.ArrayIndexOutOfBoundsException;
public class Duplicates_in_An_Array {

	public static void main(String[] args)throws IOException {
		String [] a = {"Java","c","c++","Python","Java"};
		
		/*boolean flag=false;
		for(int i=0; i<=a.length; i++){
			for(int j=i+1; j<=a.length; j++){
				if(a[i] == a[j]){
					System.out.println("Found the duplicate element. The duplicate element in an array is "+a[i]);
					flag=true;
				}
			}
		}
		if(flag == false){
			System.out.println("Duplicates not found");
		}*/
		
		//Approac-2
		HashSet <String> langs = new HashSet();
		/*System.out.println(langs.add("Java"));
		System.out.println(langs.add("Python"));
		System.out.println(langs.add("Java"));*/
		System.out.println("Message:\n HashSet not allows duplicates.");
		for(String l:a){
			System.out.println(langs.add(l));
		}
		
		

	}

}
