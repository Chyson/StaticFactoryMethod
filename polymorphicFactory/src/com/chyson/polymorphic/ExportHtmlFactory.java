package com.chyson.polymorphic;

/**
 * Created with IntelliJ IDEA.
 * Author: Think
 * Date: 2018/10/24
 * Time: 14:56
 */
public class ExportHtmlFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if(type.equals("standard")){
            return new ExportStandardHtmlFile();
        }else if("financial".equals(type)){
            return new ExportFinancialHtmlFile();
        }else{
            throw new RuntimeException("没有找到对象");
        }
    }
}
