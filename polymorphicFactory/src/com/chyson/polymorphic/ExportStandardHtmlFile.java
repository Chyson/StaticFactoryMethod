package com.chyson.polymorphic;

/**
 * Created with IntelliJ IDEA.
 * Author: Think
 * Date: 2018/10/24
 * Time: 14:52
 */
public class ExportStandardHtmlFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("导出标准版Html数据"+data);
        return false;
    }
}
