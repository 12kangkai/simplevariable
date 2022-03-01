/*
变量使用注意事项：
  1,变量名不能重复
  2,变量未赋值，不能使用
  3,long类型的变量定义的时候，为了防止整数过大，后面要加L
  4,float类型的变量定义的时候，为了防止类型不兼容，后面要加F
 */
public class variable1
{
    public static void main(String[] args) {
        //定义byte类型的变量
        byte b = 10;//byte 1字节
        System.out.println(b);

        //定义short类型的变量
        short c = 100;//short 2字节
        System.out.println(c);

        //定义int类型的变量
        int d = 2147483647;//int 4字节（最大存放2^32-1这么大的数）
        System.out.println(d);

        //定义double类型的变量
        double e = 13.14;//double 8字节
        System.out.println(e);

        //定义char类型的变量
        char f = 's';//char 2字节
        System.out.println(f);

        //定义boolean类型的变量
        boolean g =true;//boolean 1字节
        System.out.println(g);

        //定义long类型的变量
        long h =1000L;//long 8字节
        System.out.println(h);

        //定义float类型的变量
        float i= 5.21F;//float 4字节
        //在Java中声明float类型，如果带有小数，必须在数值后面跟f或F标注，否则默认为double类型
        System.out.println(i);
    }
}