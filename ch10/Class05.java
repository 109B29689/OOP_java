class Caaa{
  private int num;
  public Caaa(int n){
    num=n;
  }
  public int get(){
    return num;
  }
}
class Cbbb extends Caaa{
  public Cbbb(int n){
    super(n);
  }
  public void show(){
    System.out.println("當執行新物件bb=new Cbbb()時，
      將會呼叫Cbbb()或Caaa()來初始化數值，
      而由於沒有Cbbb()，
      所以程式將執行Caaa()，
      但又因這是有引數的建構元，
      所以必須給予數值，
      而給予數值的是物件bb=new Cbbb()中的括弧，
      而又因類別Cbbb內沒有有引數的Cbbb建構元，
      而出現錯誤，
      解決方式就是在類別Cbbb內建有引數的Cbbb建構元，
      然後在第一行用有引數的super來呼叫有引數的Caaa建構元");
    System.out.println("num="+get());
  }
}
class Main {  
  public static void main(String args[]) { 
    Cbbb bb=new Cbbb(2);
    bb.show();
  } 
}

/*output-----------------------------------------
當執行新物件bb=new Cbbb()時，
將會呼叫Cbbb()或Caaa()來初始化數值，
而由於沒有Cbbb()，
所以程式將執行Caaa()，
但又因這是有引數的建構元，
所以必須給予數值，
而給予數值的是物件bb=new Cbbb()中的括弧，
而又因類別Cbbb內沒有有引數的Cbbb建構元，
而出現錯誤，
解決方式就是在類別Cbbb內建有引數的Cbbb建構元，
然後在第一行用有引數的super來呼叫有引數的Caaa建構元
num=2
------------------------------------------------*/