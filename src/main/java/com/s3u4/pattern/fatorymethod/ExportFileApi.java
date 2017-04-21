package com.s3u4.pattern.fatorymethod;

/**
 * Created by Captain on 4/21/17.
 */
public abstract class ExportFileApi {

    public boolean export() {
        Object exportData = getExportData();
        return concreteExport(exportData);
    }

    /**
     * 详细的导出细节操作
     * @return
     */
    public abstract boolean concreteExport(Object object);

    /**
     * 获取导出数据
     * @return
     */
    public abstract Object getExportData();

}
