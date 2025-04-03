package ch07.unit05;

import java.util.Calendar;
import java.util.Scanner;

public class Quize02_01 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // 생년월일을 입력 받아 나이 구하기
      // 생년월일은 2004-10-10, 2004.10.10, 2004/10/10 형식으로 입력 가능
      
      String birth;
      
      do {
         System.out.print("생년월일 ? ");
         birth = sc.next();
         
         birth = birth.replaceAll("(\\-|]].|\\/)", "");
      } while(! birth.matches("^\\d{8}$"));
      
      
      int a = toAge(birth);
      System.out.println("나이는 " + a + " 입니다.");
      
      sc.close();
   }
   
   public static int toAge(String birth) {
      int age = 0;
      
      birth = birth.replaceAll("(\\-|]].|\\/)", "");
      Calendar cal = Calendar.getInstance();
      
      int y = Integer.parseInt(birth.substring(0,4));
      age = cal.get(Calendar.YEAR) - y;
      
      // 생일이 현재와 같은 달이거나 더 늦은 달일 때
      
      int m1 = Integer.parseInt(birth.substring(5,6));
      int m2 = cal.get(Calendar.MONTH) +1;
      
      int d1 = Integer.parseInt(birth.substring(7,8));
      int d2 = cal.get(Calendar.DATE);
      
      if((m1 == m2 && d1 > d2) || m1 > m2) {
         age--;
      }
      
      
      
      return age;
   }

}
