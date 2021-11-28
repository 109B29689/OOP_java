interface Data {
  public void best();

  public void failed();
}

interface Test extends Data {
  public void showData();

  public double average();
}

class CStu implements Test {
  protected String name;
  protected int math;
  protected int english;

  public void best() {
    if (math > english) {
      System.out.println(name + "的數學比英文好");
    } else {
      System.out.println(name + "的英文比數學好");
    }
  }

  public void failed() {
    if (math < 60) {
      System.out.println(name + "的數學被當掉了");
    }
    if (english < 60) {
      System.out.println(name + "的英文被當掉了");
    }
    if (math < 60 && english < 60) {
      System.out.println(name + "的數學&英文都被當掉了");
    }
    if (math > 60 && english > 60) {
      System.out.println(name + "的數學&英文都沒被當掉");
    }
  }

  public void showData() {
    System.out.println("姓名:" + name);
    System.out.println("數學成績:" + math);
    System.out.println("英文成績:" + english);
    System.out.println("平均成績:" + average());
  }

  public double average() {
    double average = (math + english) / 2.0;
    return average;
  }

  public CStu(String a, int b, int c) {
    name = a;
    math = b;
    english = c;
  }

  public void show() {
    showData();
    best();
    failed();
  }
}

public class Class12 {
  public static void main(String[] args) {
    CStu stu = new CStu("Judy", 58, 91);
    stu.show();
  }
}

/* output------------
姓名:Judy
數學成績:58
英文成績:91
平均成績:74.5
Judy的英文比數學好
Judy的數學被當掉了
--------------------*/
