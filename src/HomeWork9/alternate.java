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
class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;
    RunnableDemo(String name){
        this.threadName = name;
        System.out.println("Runnable进程" + this.threadName + "已创建");
    }
    public void run(){
        System.out.println("Runnable进程" + this.threadName + "正在运行");
    }
    public void start () {
      System.out.println("Runnable进程" + this.threadName + "开始运行");
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}
class ThreadDemo extends Thread {
   private Thread t;
   private String threadName;
   ThreadDemo(String name) {
      threadName = name;
      System.out.println("Thread进程" + this.threadName + "已创建");
   }
   public void run() {
      System.out.println("Thread进程" + this.threadName + "正在运行");
   }
   public void start () {
      System.out.println("Thread进程" + this.threadName + "开始运行");
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

public class alternate {
    public static void main(String[] args) {
        RunnableDemo R = new RunnableDemo("Runnable项目");
        ThreadDemo T = new ThreadDemo("Thread项目");
        while(1==1){
            R.start();
            T.start();
        }
    }
    
}
