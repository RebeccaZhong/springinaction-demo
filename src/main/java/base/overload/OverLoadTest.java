package base.overload;

import java.io.Serializable;

/**
 * 重载的调用顺序
 * 利用这个方式测试，就能得到相应的结果
 * char>int>long>Character>Serializable>Object>char…
 * 基本变量>引用类型>实现的接口>继承的父类>参数的个数
 * 参考地址：https://blog.csdn.net/weixin_41751625/article/details/79968522
 * @Author: 钟燕
 * @Description:
 * @Date: Created in 2019/1/4 15:29
 * @Modified By:
 */
public class OverLoadTest {
    public static void main (String[] args) {
        new OverLoadTest().print('a');
    }

    public void print(Object some){
        System.out.println("print object");
    }

    public void print(Character some){
        System.out.println("print Character");
    }

    public void print(char some){
        System.out.println("print char");
    }

    public void print(int some){
        System.out.println("print int");
    }

    public void print(long some){
        System.out.println("print long");
    }

    public void print(char... some){
        System.out.println("print char...");
    }

    public void print(Serializable some){
        System.out.println("print Serializable");
    }

    public void print(String s) {
        System.out.println("String");
    }
}
