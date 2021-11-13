class CCount {
  int cnt = 0;
  int t;

  public void setZero() {
    cnt = 0;
    System.out.println("setZero()呼叫,cnt=" + cnt);
  }

  public void setValue(int n) {
    cnt = n;
    System.out.println("setValue(int n)呼叫,cnt=" + cnt);
  }

  public static void count() {
    System.out.println("cnt為類別變數");
    System.out.println("count()為兩者皆可");
  }
}

public class Class05 {
  public static void main(String[] args) {
    CCount cc = new CCount();
    cc.setZero();
    cc.setValue(3);
    cc.count();
    CCount.count();
  }
}

/* output-------------
setZero()呼叫,cnt=0
setValue(int n)呼叫,cnt=3
cnt為類別變數
count()應為兩者皆可      
cnt為類別變數
count()應為兩者皆可
--------------------*/
