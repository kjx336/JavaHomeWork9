/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork9;

/**
 *
 * @author kjx33
 */
class Demo extends ThreadDemo{
    private Thread t;
    private String threadName;
    private long begin;
    Demo(String name){
        super(name);
        this.threadName = name;
    }
    public void run() {
      System.out.println("Thread进程" + this.threadName + "正在运行");
      try {
        while(1==1) {
            if((System.currentTimeMillis()-begin)<=1000000)
                System.out.println("进程" + threadName + "开始运行，距离上次过了" + (((float)(System.currentTimeMillis()-begin))/1000) + "秒");
            begin = System.currentTimeMillis();
            Thread.sleep(5000);
         }
      }catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread进程" + this.threadName + "已经死亡");
   }
}
public class sleep5 {
    public static void main(String[] args) {
        Demo A = new Demo("A");
        Demo B = new Demo("B");
        Demo C = new Demo("C");
        A.start();
        B.start();
        C.start();
    }
    
}
