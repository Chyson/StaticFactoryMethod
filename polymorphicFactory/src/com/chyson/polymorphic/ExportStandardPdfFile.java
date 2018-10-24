package com.chyson.polymorphic;

/**
 * Created with IntelliJ IDEA.
 * Author: Think
 * Date: 2018/10/24
 * Time: 14:53
 */
public class ExportStandardPdfFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("导出标准版Pdf数据"+data);
        return false;
    }
}
