package com.s3u4.pattern.singleton;

/**
 * Created by Captain on 02/04/2018.
 */
public class HungerSingleton {

    private HungerSingleton(){}

    private static final HungerSingleton instance = new HungerSingleton();

    /**
     * 无法确定实例的生成时间，实现最为简单
     * @return
     */
    public static HungerSingleton getInstance(){
        return instance;
    }

}
