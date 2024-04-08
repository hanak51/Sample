package Sample;

import javax.xml.stream.events.EntityReference;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("処理開始");
        
        try {
            System.out.println("割り算計算");
            int a = 10 / 0;
            System.out.println(a);
            
        } catch  (ArithmeticException e){
            System.out.println("arithmeticExceptonが発生：" + e.getMessage());
        }finally {
            System.out.println("割り算終了");
            
            
        }
        
        System.out.println("処理完了");
        
            
        

    }

}
