import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String rev = "";
		int len = name.length();
		
		for(int i = len-1; i>=0; i--){
			rev = rev+name.charAt(i);
		}
		System.out.println(rev);
        System.out.println("---------------------------------------");
        
        // Revrse a String using charecter array
        
        char a[] = name.toCharArray();
        String reverse ="";
        int length = a.length;
        for(int i=length-1; i>=0;i--){
            reverse = reverse+a[i];
        }
        System.out.println(rev);
        System.out.println("----------------------------------------");
        
        
        //string buffer class
        
        StringBuffer sb = new StringBuffer(name);
        StringBuffer rev1 = sb.reverse();
        System.out.println(rev1);
	}

}
