
//area of circle
public class Main
{
	public static void main(String[] args) {
	    Circle c = new Circle(5);
	    double area = c.AreaCircle();
	    System.out.println("Area of circle : "+area);
	 
	}
}
class Circle{
    public final double PI = 3.1416;
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public double AreaCircle(){
        return PI*radius*radius;
    }
}
