interface iVolume{
  public void showData();
  public double vol();
}
abstract class CSphere implements iVolume{
  final double pi=3.14;
  protected int x;
  protected int y;
}
class CCircle extends CSphere{
  private int r;
  public CCircle(int X,int Y,int R){
    x=X;
    y=Y;
    r=R;
  }
  public double vol(){
    return (r*r*r*pi*4/3);
  }
  public void showData(){
    System.out.println("球心：("+x+","+y+")");
    System.out.println("半徑："+r);
    System.out.println("球體積："+vol());
  }
}
class Class14ab {  
  public static void main(String args[]) { 
    CCircle cir=new CCircle(8,6,2);
    cir.showData();
  } 
}

/*output-------------------
球心：(8,5)
半徑：2
球體積：33.49333333333333
-------------------------*/
interface iVolume{
  public void showData();
  public double vol();
}
abstract class CSphere implements iVolume{
  final double pi=3.14;
  protected int x;
  protected int y;
}
class CCircle extends CSphere{
  private int r;
  public CCircle(int X,int Y,int R){
    x=X;
    y=Y;
    r=R;
  }
  public double vol(){
    return (r*r*r*pi*4/3);
  }
  public void showData(){
    System.out.println("球心：("+x+","+y+")");
    System.out.println("半徑："+r);
    System.out.println("球體積："+vol());
  }
}
class Main {  
  public static void main(String args[]) { 
    CCircle cir=new CCircle(8,6,2);
    cir.showData();
    System.out.println("個人見解，我認為之所以抽象類別實作介面不一定要定義介面內的抽象函數之處理方式，而只要繼承自此抽象類別的一般類別去定義處理方式也能正常運行，可能是因為一般類別(被當父類別繼承時)與介面(被實作時)能用它們的名稱來建立新物件，而抽象類別卻無法如此，所以沒有要求抽象類別實作介面必須定義處理方式;又或是抽象類別能有一般函數(能定義處理方式)跟抽象函數(不能定義處理方式)，而介面內的所有函數都是必須是抽象函數，所以就給抽象類別較為寬鬆，都類似於範本的概念。");
  } 
}

/*output------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
球心：(8,5)
半徑：2
球體積：33.49333333333333
個人見解，我認為之所以抽象類別實作介面不一定要定義介面內的抽象函數之處理方式，而只要繼承自此抽象類別的一般類別去定義處理方式也能正常運行，可能是因為一般類別(被當父類別繼承時)與介面(被實作時)能用它們的名稱來建立新物件，而抽象類別卻無法如此，所以沒有要求抽象類別實作介面必須定義處理方式;又或是抽象類別能有一般函數(能定義處理方式)跟抽象函數(不能定義處理方式)，而介面內的所有函數都是必須是抽象函數，所以就給抽象類別較為寬鬆，都類似於範本的概念。
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
