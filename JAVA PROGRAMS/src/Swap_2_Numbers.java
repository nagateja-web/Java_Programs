
public class Swap_2_Numbers {

	public static void main(String[] args) {
		
		//logic 1 Swapping using temporary variable
		
		System.out.println("(1) Swapping using teporary variable");
		System.out.println();
		
		int a = 10, b = 20, temp;
		System.out.println("    Before Swapping a and b= "+a+" "+b);
		
		
		temp = a; //temp = 10
		a = b;    //a = 20
		b = temp; // b = 10
	
		System.out.println("    After Swapping a and b = "+a+" "+b);
		System.out.println("-------------------------------------------------");
		
		//logic 2 without using third variable
		int g = 30, h = 40;
		System.out.println("(2) Swapping of two Numbers without using third variable");
		System.out.println("    Before Swapping g and h= "+g+" "+h);
		g = g+h;
		h = g-h; 
		g = g-h;
		
		System.out.println("    After Swapping g and h= "+g+" "+h);
		System.out.println("---------------------------------------------------");
		
		// logic 3 using * and / without using third variable
		// values should not be zero
		System.out.println("(3) Swapping of two numbers using Multiplication and division");
		int i =10, j=20;
		System.out.println("    Before Swapping i and j= "+i+" "+j);
		i = i*j;// 10*20 = 200
		j = i/j;// 200/20 = 10
		i = i/j; // 200/10 = 20
		System.out.println("    After swapping i and j = "+i+" "+j);
		System.out.println("--------------------------------------------------------");
		
		//logic 4 bitwise x-or (^)
		System.out.println("(4) Swapping using x-or operator");
		int c = 10, d = 20;
		System.out.println("    Before Swapping c and d= "+c+" "+d);
		c = c^d;// 10^20 = 30
		d = c^d;// 30^20 = 10
		c = c^d; //30^10 = 20
		System.out.println("    After swapping c and d: "+c+" "+d);
		System.out.println("--------------------------------------------------------");
		
		//logic 5 single statement
		System.out.println("(5) Swapping using a equation");
		int e = 10, f = 20;
		System.out.println("    Before Swapping e and f= "+e+" "+f);
		f = e+f-(e=f);
		System.out.println("    After swapping e and f= "+e+" "+f);
		
		
		
		

	}

}
