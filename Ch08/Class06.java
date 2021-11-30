class CCircle{
  double pi=3.14;
  double radius;
  public CCircle(){
    this.radius=2.0;
   System.out.println("this更改radius");
  }
  void show_periphery(){
    System.out.println("periphery="+2*pi*radius);
  }
}
class Class06{
  public static void main(String args[]){
    CCircle cir1=new CCircle();
   cir1.show_periphery();
    cir1.radius=3.0;
   System.out.println("物件cir1更改radius");
    cir1.show_periphery();
  }
}

/*output-----------
this更改radius
periphery=12.56
物件cir1更改radius
periphery=18.84
-----------------*/
