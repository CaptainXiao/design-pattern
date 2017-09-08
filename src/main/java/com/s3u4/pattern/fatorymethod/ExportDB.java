package com.s3u4.pattern.fatorymethod;

/**
 * Created by Captain on 4/21/17.
 */
public class ExportDB extends ExportFileApi {


    @Override
    protected boolean concreteExport(Object obj) {
        System.out.println("将数据导出至 DB");
        return false;
    }

    @Override
    protected Object getExportData() {
        System.out.println("获取待导出的数据");
        return null;
    }
}
