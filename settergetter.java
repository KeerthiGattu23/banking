import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		Rectangle rectangle=new Rectangle();//10000
		//calling setLength method with rectangle object
		rectangle.setLength(100);
		System.out.println(rectangle.getLength());
		System.out.println();
		rectangle.setBreadth(25);
		//10000.setBreadth
		rectangle.setBreadth(30);
		//10000
		int br=rectangle.getBreadth();//30
		System.out.println(br);
		
		Rectangle rectangle1=new Rectangle();//20000
		rectangle1.setLength(300);
		//20000.setLength(300)
		System.out.println(rectangle1.getLength());
		
	}

}
public class Rectangle {
//member variables or instance variable -they are part of object
	//memory allocates only when we create an object
private int length;
private int breadth;
//instance method--method which is called with object
//setter method
public void setLength(int length)//local variable 100
{	//20000
	this.length=length;//this is used to refer to current object
}
//getter method
public int getLength()
{
	return length;
}
public void setBreadth(int br)
{
	breadth=br;
}

public int getBreadth()
{
	return breadth;
}
}


