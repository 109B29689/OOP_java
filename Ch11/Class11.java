interface Data {
  public void showData();
}

interface Test {
  public void showScore();

  public double calcu();
}

class CStu implements Data, Test {
  protected String id;
  protected String name;
  protected int mid;
  protected int finl;
  protected int common;

  public CStu(String a, String b, int c, int d, int e) {
    id = a;
    name = b;
    mid = c;
    finl = d;
    common = e;
  }

  public void showData() {
    System.out.println("學號:" + id);
    System.out.println("姓名:" + name);
  }

  public void showScore() {
    System.out.println("期中成績:" + mid);
    System.out.println("期末成績:" + finl);
    System.out.println("平時成績:" + common);
    System.out.println("學期成績:" + calcu());
  }

  public double calcu() {
    double calcu = ((mid + finl) * 0.3 + common * 0.4);
    return calcu;
  }

  public void show() {
    showData();
    showScore();
  }
}

public class Class11 {
  public static void main(String[] args) {
    CStu stu = new CStu("940001", "Fiona", 90, 92, 85);
    stu.show();
  }
}

/* output-----
學號:940001
姓名:Fiona
期中成績:90
期末成績:92
平時成績:85
學期成績:88.6
-------------*/
