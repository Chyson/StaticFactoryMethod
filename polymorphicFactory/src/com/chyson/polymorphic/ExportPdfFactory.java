package com.chyson.polymorphic;

/**
 * Created with IntelliJ IDEA.
 * Author: Think
 * Date: 2018/10/24
 * Time: 14:59
 */
public class ExportPdfFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if ("standard".equals(type)) {
            return new ExportStandardPdfFile();
        }else if("financial".equals(type)){
            return new ExportFinancialPdfFile();
        }else{
            throw new RuntimeException("没有找到对象");
        }
    }
}
