public class CircleComputation { 
 public static void main(String[] args) {

 double length,width, area, perimeter;

 scanner in=new scanner(system.in);
 system.out.print("enetr length of the rectangle:");
 length=in.nextdouble();
 system.out.print("enter width of rectangle:");
 width=in.nextdouble();
 
 area =length * width;
 perimeter = 2*(length+width);
 
 
 System.out.println("The perimeter of the rectangle is"+perimeter+"units."); 
 System.out.println("area of rectangle is"+area+"sq.units."); 

 }
}
