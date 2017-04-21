package com.s3u4.pattern.singleton;

/**
 * Created by Captain on 4/19/17.
 */
public class SingletonClient {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println( s1 == s2 );

    }

}
