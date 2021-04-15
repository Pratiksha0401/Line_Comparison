import java.util.*;

class Co_ordinates
{
  int x1;
  int y1;
  int x2;
  int y2;

  float length;

  void setCo_ordinates(int line_number)
  {
	System.out.println("Enter co-ordinates for line "+line_number);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st point(x1,y1) : ");
	x1=sc.nextInt();
	y1=sc.nextInt();
	System.out.println("Enter 2nd point(x2,y2) : ");
	x2=sc.nextInt();
	y2=sc.nextInt();
  }

  float get_length()
  {
    length=(float)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    return length;
  }
}

class line_comparison
{
	public static void main(String[] args) 
	{
		Co_ordinates line1=new Co_ordinates();
    line1.setCo_ordinates(1);
    float length_line1=line1.get_length();
    System.out.println("Length Line 1 is " + length_line1+'\n');
    String length_l=String.valueOf(length_line1); 

    Co_ordinates line2=new Co_ordinates();
    line2.setCo_ordinates(2);
    float length_line2=line2.get_length();
    System.out.println("Length Line 2 is " + length_line2+'\n');
    String length_2=String.valueOf(length_line2); 

        System.out.println("Lenght of line 1 and line 2  isEquals "+length_l.equals(length_2));
	}
}