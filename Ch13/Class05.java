public class Class05{
  public static void main(String args[]){
    int num=12;
    int den[]={12,0,3,0,0,4};
    for(int i=0;i<10;i++){    
      try{
        System.out.println("ans="+num/den[i]);
      }catch(ArithmeticException a){               //捕捉的錯誤訊息為java.lang.ArithmeticException(算術異常)
        System.out.println("除數為0");
      }catch(ArrayIndexOutOfBoundsException b){    //捕捉的錯誤訊息為java.lang.ArrayIndexOutOfBoundsException(陣列索引值超出範圍)
        System.out.println("陣列索引值超出了範圍");
      }
    }
  }
}

/*output-------------
ans=1
除數為0
ans=4
除數為0
除數為0
ans=3
陣列索引值超出了範圍
陣列索引值超出了範圍
陣列索引值超出了範圍
陣列索引值超出了範圍
--------------------*/
