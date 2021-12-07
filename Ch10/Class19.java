class CRectangle{
  protected int length;
  protected int width;
  public CRectangle(int l,int w){
    length=l;
    width=w;
  }
}
class Main {  
  public static void main(String args[]) { 
    CRectangle rect=new CRectangle(2,6);
    System.out.println("length="+rect.length+",width="+rect.width+",area="+rect.length*rect.width);
  } 
}

/*output-------------------
length=2,width=6,area=12
-------------------------*/
