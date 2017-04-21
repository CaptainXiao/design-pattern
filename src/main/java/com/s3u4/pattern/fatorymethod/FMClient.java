package com.s3u4.pattern.fatorymethod;

/**
 * Created by Captain on 4/21/17.
 */
public class FMClient {

    public static void main(String[] args) {
        ExportFileApi api = new ExportTxt();
        api.export();
    }

}
