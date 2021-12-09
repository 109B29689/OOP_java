interface iVolume{
  public void showData();
  public double vol();
}
abstract class CShape implements iVolume{
  final double pi=3.14;
  protected int x;
  protected int y;
  protected int r;
  public double vol(){
    return (r*r*r*pi*4/3);
  }
  public void showData(){
    System.out.println("球心：("+x+","+y+")");
    System.out.println("半徑："+r);
    System.out.println("球體積："+vol());
  }
}
class CCircle extends CShape{
  public CCircle(int X,int Y,int R){
    x=X;
    y=Y;
    r=R;
  }
  public double vol(){
    return super.vol();
  }
  public void showData(){
    super.showData();
  }
}
class Class14c {  
  public static void main(String args[]) { 
    CCircle cir=new CCircle(8,6,2);
    cir.showData();
  } 
}
