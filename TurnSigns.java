/*
自动类型转换：
把一个表示数据范围小的数值或者变量賦值给另一个表示数据范围大的变量
byte<short<int<long<float<double
char<int<long<float<double

强制类型转换：
把一个表示数据范围大的数值或者变量赋值给另一个表示数据范围小的变量
格式：目标数据类型 变量名=(目标数据类型)值或者变量；
范例：int k = (int)88.88;
 */
public class TurnSigns {
    public static void main(String[] args){
        //自动类型转换
        double a = 10;
        System.out.println(a);

        //定义byte类型的变量
        byte b = 10;
        System.out.println((short) b);

        //char x = b;此行代码报错，byte和char类型不兼容，需要强制类型转换
        //强制类型转换
        char x = (char) b;
        System.out.println(x);
        int k = (int) 88.88;
        System.out.println(k);

    }
}
