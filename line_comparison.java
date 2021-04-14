import java.util.*;
class line_comparison 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter co-ordinates for 1st line  ");
		System.out.println("Enter x1 and y1 co-ordinates for 1st point:  ");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		System.out.println("Enter x2 and y2 co-ordinates for 2nd point:  ");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		float length_L1;
		length_L1=(float)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		String L1=String.valueOf(length_L1);    
		System.out.println("Length is " + length_L1+ '\n');	
		
		System.out.println("Enter co-ordinates for 1st line  ");
		System.out.println("Enter x3 and y3 co-ordinates for 1st point:  ");
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		System.out.println("Enter x4 and y4 co-ordinates for 2nd point:  ");
		int x4=sc.nextInt();
		int y4=sc.nextInt();
		float length_L2;
		length_L2=(float)Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2));
		String L2=String.valueOf(length_L2);   
		System.out.println("Length is " + length_L2  + '\n');
		
		int length_compare = L1.compareTo( L2 );
		if(length_compare>0)
			System.out.println("Length of line L1 is greater than line L2  " );
		else if(length_compare<0)
			System.out.println("Length of line L1 is smaller than line L2  " );
		else
			System.out.println("Length of line L1 is equal to line L2  " );
	}
}
