package com.chyson.polymorphic;

/**
 * Created with IntelliJ IDEA.
 * Author: Think
 * Date: 2018/10/24
 * Time: 14:50
 */
public class ExportFinancialHtmlFile implements ExportFile{

    @Override
    public boolean export(String data) {
        System.out.println("导出财务办Html数据。"+data);
        return false;
    }
}
