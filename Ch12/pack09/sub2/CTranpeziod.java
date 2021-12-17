package pack09.sub2;
public class CTranpezoid{
	private int upper,base,height;
	public CTranpezoid(int u,int b, int h) {
		upper=u;
		base=b;
		height=h;
	}
	public void show(){
		System.out.println("Trapezoid="+(upper+base)*height/2);
	}
}
