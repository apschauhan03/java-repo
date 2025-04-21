
public class Tut2 {
   public static void main(String[] args) {

      //Assignment Operator, Arithematic Operator
      int age = 25;
      int nextYearAge = age + 1;
      System.out.println(nextYearAge);

      //Conditional Operator
      boolean eligible = age >= 18;
      System.out.println(eligible);

      //Assignment Operator,Bitwise Operator
      age += 5;
      int bitResult = (age & 0x0F)>>1;
      System.out.println(bitResult);

      //Unary Operator
      int count = -age;

      //Ternary Operator
      String result = (age >= 18 && count < 0) ? "Adult" : "Minor";
      System.out.println(result);
   }

}
