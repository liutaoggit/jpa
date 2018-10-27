/*
 * 文件名：Thread_JoinTest.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：liutao
 * 修改时间：2018年10月7日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package thread;


/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年10月7日
 * @see Thread_JoinTest
 * @since 1.0
 */
public class Thread_JoinTest {
    public static void main(String[] args) {
        Thread thread=new Thread(new MyRunnable());
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i+"优先级："+Thread.currentThread().getPriority());
            if(30==i){
                thread.start();
//                thread.setPriority(Thread.MAX_PRIORITY);
//                Thread.yield();
//                try {
//                    thread.join(); //让当前线程执行完毕后，才释放cpu资源
//                    thread.sleep(2);//暂停当前线程指定时间,
//                    Thread.currentThread().sleep(2);
//                }
//                catch (InterruptedException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
            }
        }
    }
}
