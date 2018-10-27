/*
 * 文件名：Thread_SafeTest.java
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
 * @see Thread_SafeTest
 * @since 1.0
 */
public class Thread_SafeTest {

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account("123456", 1000);
        DrawMoneyRunnable drawMoneyRunnable = new DrawMoneyRunnable(account, 700);
        Thread myThread1 = new Thread(drawMoneyRunnable);
        Thread myThread2 = new Thread(drawMoneyRunnable);
        myThread1.start();
        myThread2.start();
    }

}

class DrawMoneyRunnable implements Runnable {

    private Account account;
    private double drawAmount;

    public DrawMoneyRunnable(Account account, double drawAmount) {
        super();
        this.account = account;
        this.drawAmount = drawAmount;
    }

    public void run() {
        synchronized(Account.class){
            if (account.getBalance() >= drawAmount) {  //1
                System.out.println("取钱成功， 取出钱数为：" + drawAmount);
                double balance = account.getBalance() - drawAmount;
                account.setBalance(balance);
                System.out.println("余额为：" + balance);
            }
        }
        
    }
}

class Account {

    private String accountNo;
    private double balance;

    public Account() {

    }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}