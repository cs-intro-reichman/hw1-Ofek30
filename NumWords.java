// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) 
	{
		int num = Integer.parseInt(args[0]);
		int a,b,c;
		a=num/100;
		b=(num-a*100)/10;
		c=(num-b*10)-a*100;
	    // Replace this comment with your code
		//5 hundreds, 1 tens, and 7 ones.
		System.out.println(a + " hundreds, " + b + " tens, and " + c + " ones.");
		
	}
}
