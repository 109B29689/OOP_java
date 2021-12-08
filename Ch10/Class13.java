class Caaa {
  public int num1;
  public int num2;

  public void show() {
    System.out.println("num1=" + num1 + " num2=" + num2);
  }

  public Caaa() {
    num1 = 1;
    num2 = 1;
    System.out.println("呼叫Caaa()將num1、num2定為1");
  }

  public Caaa(int a, int b) {
    num1 = a;
    num2 = b;
    System.out.println("呼叫Caaa(int a,int b)將num1、num2分別定為a、b");
  }

}

class Cbbb extends Caaa {
  public void set_num(int a, int b) {
    num1 = a;
    num2 = b;
    System.out.println("呼叫Cbbb子類別,變更繼承自Caaa父類別的num1與num2");
  }

  public Cbbb(int a, int b) {
    super(a, b);
    System.out.println("用呼叫Cbbb(int a,int b)內的super(a,b)去呼叫Caaa(int a,int b)");
  }
  public Cbbb(){
    super();
    System.out.println("呼叫Cbbb()用super()來呼叫沒有索引的父類別Caaa()來設定初值");
  }
}

public class Class13 {
  public static void main(String[] args) {
    Caaa aa = new Caaa();
    aa.show();
    aa = new Caaa(2, 3);
    aa.show();
    Cbbb bb = new Cbbb(3, 6);
    bb.show();
    Cbbb cb=new Cbbb();
    cb.show();
  }
}
