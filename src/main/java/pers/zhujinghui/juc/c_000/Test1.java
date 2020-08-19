package pers.zhujinghui.juc.c_000;

import java.util.concurrent.TimeUnit;

/**
 * 线程的基本概念
 *
 * @author 朱景辉
 * @createTime 2020/8/19 23:34
 */
public class Test1 {
    private static class T1 extends Thread {
        @Override
        public void run() {
            for (int i=0; i<10; i++) {
                try {
                    TimeUnit.MICROSECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T1");
            }
        }
    }

    public static void main(String[] args) {
        //new T1().run();
        new T1().start();
        for (int i=0; i<10; i++) {
            try {
                TimeUnit.MICROSECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main");
        }
    }
}
