/*
 * 文件名：ExecutorTest.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：liutao
 * 修改时间：2018年10月7日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */

package executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年10月7日
 * @see ExecutorTest
 * @since 1.0
 */
public class ExecutorTest {
    public static void main(String[] args) {
        //使用线程池启动线程
        ExecutorService exec = Executors.newCachedThreadPool();
        Executors.newFixedThreadPool(2);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        for(int i=0;i<5;i++){
            exec.execute(new MyThread());
        }
    }
}
class MyThread implements Runnable {    
    public void run() {        
        System.out.println(Thread.currentThread().getName() + "正在执行。。。"); 
        }
}

