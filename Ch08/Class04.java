class CBox{
  int length;
  int width;
  int height;
}
class Class04 {  
  public static void main(String args[]) { 
     CBox box;
     box=new CBox();
     box.length=15;
     box.width=10;
     box.height=25;
     System.out.println("length="+box.length);
     System.out.println("width="+box.width);
     System.out.println("height="+box.height);
  } 
}

/*output-----
length=15
width=10
height=25
-----------*/
