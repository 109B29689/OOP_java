import java.util.Scanner;

class RadiusTooLarge extends Exception{
}
class RadiusIsNegative extends Exception{
}
class CCircle{
	private double radius;
	public void setRadius(double r) throws RadiusTooLarge,RadiusIsNegative{
		if(r==0) throw new RadiusIsNegative();
		else if(r>100) throw new RadiusTooLarge();
		else radius=r;
	}
	public void show() {
		System.out.println("area="+3.14*radius*radius);
	}
}
public class Class10{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		CCircle cir=new CCircle();
			try {
			cir.setRadius(sc.nextDouble());
			}
			catch(RadiusTooLarge a) {
			System.out.println(a+" throwed");
			}
			catch(RadiusIsNegative b) {
			System.out.println(b+" throwed");
			}
	}
}

/*output--------------------
input 0.0
RadiusIsNegative throwed

input 101.0
RadiusTooLarge throwed
--------------------------*/
