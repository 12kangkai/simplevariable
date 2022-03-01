/*
运算符：对常量或者变量进行操作的符号
表达式：用运算符把常量或变量连接起来符合java语法的句子就可以称为表达式。
不同运算符连接的表达式体现的是不同类型的表达式。
 */
public class SimpleCalculate {
    public static void main(String[] args){
        int a = 20;
        int b = 10;
        int c = a+b;//"+"是运算符，并且是算术运算符，此式为算术表达式。
        System.out.println(c);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);//取商
        System.out.println(a%b);//取余数

        //整数相除只能得到整数，要想得到小数，必须有浮点数的參与
        System.out.println(20.0/4);
    }
}
