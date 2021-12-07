class Caaa{
  private int value;
  public Caaa(){
    this.value=10;
    System.out.println("Caaa()被呼叫,value="+value);
  }
  public Caaa(int i){
    value=i;
    System.out.println("Caaa(int i)被呼叫,value="+value);
  }
}
class Class03 {  
  public static void main(String args[]) {
    Caaa obj1=new Caaa();
    Caaa obj2=new Caaa(12);
    System.out.println("class Caaa不能宣告為public,因為宣告為public的class之類別名稱須為檔名(Class03.java)=>public class Class03");
    System.out.println("value變更為public並不會有影響,因值分別在不同的記憶體中(obj1,obj2)");
  } 
}

/*output-------------------------------------------------------------------------------------------------
Caaa()被呼叫,value=10
Caaa(int i)被呼叫,value=12
class Caaa不能宣告為public,因為宣告為public的class之類別名稱須為檔名(Class03.java)=>public class Class03
value變更為public並不會有影響,因值分別在不同的記憶體中(obj1,obj2)
-------------------------------------------------------------------------------------------------------*/
