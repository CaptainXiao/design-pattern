package com.s3u4.pattern.simplefactory;

/**
 * Created by Captain on 4/21/17.
 */
public class SimpleFactory {

    /**
     * 具体创建Api对象的方法
     * @param condition
     * @return
     */
    public static Api createApi(String condition){
        Api api;
        switch (condition){
            case "A":
                api = new ApiImplA();
                break;
            case "B":
                api = new ApiImplB();
                break;
            default:
                api = null;
                break;
        }
        return api;
    }

}
