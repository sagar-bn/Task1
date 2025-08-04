import java.util.Scanner;

class Calculator{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;
    char operator;
    float result;
    char decide;

    do{
        System.out.print("Enter num1: ");
        num1 =sc.nextInt();
        System.out.print("what operation(+,-,*,/): ");
        operator = sc.next().charAt(0);
        System.out.print("Enter num2: ");
        num2 =sc.nextInt();
        result = calculate(num1,operator,num2);
        System.out.println("your result: "+num1+" "+operator+" "+num2+" = "+result);
        System.out.print("To continue press y/Y (or) other key to exit: ");
        decide =sc.next().charAt(0);
    }while(decide=='y'||decide=='Y');
     sc.close();
     System.out.print("you are exited!");
  }
   static float  calculate(int num1, char operator,int num2){
      return switch(operator){
          case '+' -> num1+num2;
          case '-' -> num1-num2;
          case '*' -> num1*num2;
          case '/' ->num2 !=0 ? (float)num1/num2 :0;
          default -> 0;
      };
    }
}