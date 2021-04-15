import java.util.*;

class Co_ordinates
{
  int x1;
  int y1;
  int x2;
  int y2;

  float length;

  void setCo_ordinates()
  {
	System.out.println("Enter co-ordinates for line ");
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
    line1.setCo_ordinates();
    float length_line1=line1.get_length();
    System.out.println("Length of line is " + length_line1+'\n');
  }
} 