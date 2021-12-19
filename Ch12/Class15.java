class Class15 {  
  public static void main(String args[]) { 
    float f1=123.45F,f2;
    System.out.println("f1=直接給值->"+(Float.toString(f1)).length());
    f2=Float.parseFloat("123.45");
    System.out.println("f2=字串轉符點數->"+(Float.toString(f2)).length());
  } 
}

/*output------------
f1=直接給值->6
f2=字串轉符點數->6
------------------*/
