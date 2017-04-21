package com.s3u4.pattern.fatorymethod;

/**
 * Created by Captain on 4/21/17.
 */
public class ExportTxt extends ExportFileApi {

    @Override
    public boolean concreteExport(Object object) {
        System.out.println("将数据导出到txt文件");
        return false;
    }

    @Override
    public Object getExportData() {
        System.out.println("获取详细数据");
        return null;
    }
}
