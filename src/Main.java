import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String w=scan.nextLine();
        String str []=w.split(" ",3);
        String A=str[0];
        String op=str[1];
        String B=str[2];
        char Op=op.charAt(0);
        int a=Integer.parseInt(A);
        int b=Integer.parseInt(B);
        switch (Op){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(b==0){
                    System.out.println("除数不能为0");
                }
                else
                {
                    if (a%b!=0);
                    {
                        System.out.println((double)a /(double) b);
                    }
                    System.out.println(a / b);
                }
                break;
                default:
                    System.out.println("请输入四则运算符");


        }
    }
}