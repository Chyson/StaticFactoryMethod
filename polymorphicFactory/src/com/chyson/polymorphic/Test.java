package com.chyson.polymorphic;

/**
 * Created with IntelliJ IDEA.
 * Author: Think
 * Date: 2018/10/24
 * Time: 15:14
 */
public class Test {
    public static void main(String[] args){
        String data="export file";
        ExportFactory exportFactory=new ExportHtmlFactory();
        ExportFile financial = exportFactory.factory("standard");
        financial.export(data);
    }
}
