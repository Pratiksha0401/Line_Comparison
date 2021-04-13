import java.util.*;
class line_comparison 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x1 and y1 co-ordinates for 1st point:  ");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		System.out.println("Enter x2 and y2 co-ordinates for 2nd point:  ");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		float length;
		length=(float)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("Length is " + length);		
	}
}
