package pack09.sub1;
public class CSphere{
	private final double pi=3.14;
	private double radius;
	public CSphere(double r) {
		radius=r;
	}
	public void show() {
		System.out.println("Shphere="+radius*radius*radius*pi*4/3);
	}
}
