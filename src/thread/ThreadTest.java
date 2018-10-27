/*
 * 文件名：ThreadTest.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：liutao
 * 修改时间：2018年10月7日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */

package thread;

import org.junit.Test;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年10月7日
 * @see ThreadTest
 * @since 1.0
 */
public class ThreadTest {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    for(int j=0;j<10;j++)
                        System.out.println(Thread.currentThread().getName()+" "+j);
                }
            });
            thread.start();
        }
    }
    @Test
    public void func1(){
        String str1="aaa";
        String str2="aaa";
        System.out.println(str1==str2);
    }
    @Test
    public void func2(){
        String str1=new String("aaa"); //所有new出来的对象都是存放于heap中的
        String str2="aaa"; //aaa存放于Stack中 而Stack中的值共享
        System.out.println(str1==str2);

    }
    @Test
    public void fun3(){
        Integer i1=10000;
        Integer i2=10000;
        Integer i3=new Integer(100);
        System.out.println(i1==i2);
    }

    @Test
    public void func4() {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        Thread thread = new Thread();
        thread.start();
        // String name2 = thread.getName();
        // System.out.println(name2);
    }

    /**
     * <一句话功能简述>
     * <功能详细描述>
     * @param x
     * @param y
     * @see
     * @since 1.0
     */
    void test(int x,String y) {}

}
