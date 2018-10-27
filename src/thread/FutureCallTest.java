/*
 * 文件名：FutureCallTest.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：liutao
 * 修改时间：2018年10月7日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年10月7日
 * @see FutureCallTest
 * @since 1.0
 */
public class FutureCallTest {
    public static void main(String[] args) {
        Callable<Integer> callable=new MyCallable();
        FutureTask<Integer> futureTask=new FutureTask<>(callable);
        //futuretast既可以作为Thread的target也可以包装Callable，从而获得线程的返回值
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i==30){
                Thread t=new Thread(futureTask);
                t.start();
            }
        }
        System.out.println("主线程for循环执行完毕");
        try {
            Integer integer = futureTask.get();
            //直到call()方法执行完毕才能获取线程返回值
            System.out.println(integer);
        }
        catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

//Callable不同于Runnable的是 其具有返回值，且能抛出异常
class MyCallable implements Callable<Integer>{

    private int i=0;
    /**
     * {@inheritDoc}
     */
    @Override
    public Integer call()
        throws Exception {
        int sum=0;
        for(;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            sum+=i;
        }
        return sum;
    }
    
}
