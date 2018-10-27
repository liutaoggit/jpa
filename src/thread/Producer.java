/*
 * 文件名：Producer.java
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
 * @see Producer
 * @since 1.0
 */
public class Producer extends Thread
{
   public void run()
   {
      for (int i = 0; i < 100; i++)
      {
         System.out.println("I am Producer : Produced Item " + i);
//         Thread.yield();
      }
   }
}
