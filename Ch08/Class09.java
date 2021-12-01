class CCalculator{
  int a;
  int b;
  int c;
  public void set_value(int x,int y,int z){
    a=x;
    b=y;
    c=z;
  }
  public int add(){
    int add=(a+b+c);
    return add;
  }
  public int sub(){
    int sub=(a-b-c);
    return sub;
  }
  public int mul(){
    int mul=(a*b*c);
    return mul;
  }
  public double avg(){
    double avg=(sub()/2.0);
    System.out.println("hi");
    return avg;
  }
  public void show(){
    System.out.println("a="+a+" b="+b+" c="+c+" add="+add()+" sub="+sub()+" mul="+mul()+" avg="+avg());
  }
}
class Class09 {  
  public static void main(String args[]) {
    CCalculator obj=new CCalculator();
    obj.set_value(25,3,7);
    obj.show();
  } 
}

/*output----------------------------------------------------
a=25 b=3 c=7 add=35 sub=15 mul=525 avg=11.666666666666666
----------------------------------------------------------*/
