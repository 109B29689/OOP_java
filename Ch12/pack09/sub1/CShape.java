package pack09.sub1;
import pack09.Class09;
public class CShape extends Class09{
	public CShape(double r) {
		radius=r;
	}
	public void show() {
		System.out.println("Shape="+radius*radius*radius*pi*4/3);
		System.out.println("Trapezoid="+(upper+base)*height/2);
	}
}
