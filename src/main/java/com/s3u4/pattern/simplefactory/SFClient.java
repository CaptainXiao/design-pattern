package com.s3u4.pattern.simplefactory;

/**
 * Created by Captain on 4/21/17.
 */
public class SFClient {

    public static void main(String[] args) throws Exception {

        Api api = SimpleFactory.createApi("A");
        api.operation();

    }

}
