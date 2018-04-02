package com.s3u4.pattern.singleton;

/**
 * Created by Captain on 02/04/2018.
 */
public class LazySingleton {

    private LazySingleton(){}

    private static LazySingleton instance;

    /**
     * 加锁影响并发性能
     * @return
     */
    public synchronized static LazySingleton getInstance(){
        if ( instance == null ){
            instance = new LazySingleton();
        }
        return instance;
    }

}
