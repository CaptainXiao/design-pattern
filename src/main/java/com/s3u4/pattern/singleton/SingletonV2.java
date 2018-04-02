package com.s3u4.pattern.singleton;

/**
 * Created by Captain on 02/04/2018.
 */
public class SingletonV2 {

    private SingletonV2(){}

    private static class SingletonV2Holder {
        private static SingletonV2 instance = new SingletonV2();
    }

    public static SingletonV2 getInstance(){
        return SingletonV2Holder.instance;
    }

}
