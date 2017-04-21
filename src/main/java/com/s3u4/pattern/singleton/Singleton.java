package com.s3u4.pattern.singleton;

/**
 * 单例模式
 * Created by Captain on 4/19/17.
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    /**
     * 双重检测,避免多线程环境下生成多个实例
     * @return
     */
    public static Singleton getInstance(){
        if ( singleton == null ){
            synchronized (Singleton.class){
                if ( singleton == null ){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    // doSomething

}
