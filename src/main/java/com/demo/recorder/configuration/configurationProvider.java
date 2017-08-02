package com.demo.recorder.configuration;

import com.demo.recorder.ReadExcel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/2.
 */
@Component
public class configurationProvider {

    public static String Excel_File;

    @Value("${excel.file}")
    public void setExcel_File(String excel_File) {
        Excel_File = excel_File;
    }

    public static void main(String[] args) {
        System.out.print(ReadExcel.getCellContent(1,0,"D:\\aa.xlsx"));
    }

}
