package com.renshihan.pay.common.utils;

import java.text.DecimalFormat;

public class FeeUtil {
    private static final DecimalFormat DECIMAL_FORMAT=new DecimalFormat("");
    enum FEE_SUFFIX{
        YUAN("元",100);
        private String name;
        private int number;

        FEE_SUFFIX(String name, int number) {
            this.name = name;
            this.number = number;
        }
    }
    public static String toFee(String num){
        if(StringHelper.isBlank(num)){
            return num;
        }
        if(num.contains("%")||num.contains(".")){
            num=num.trim().replace("%","");
            if(StringHelper.isBlank(num)){
                return num;
            }
            Double aDouble= Double.parseDouble(num) * 100;
            num=DECIMAL_FORMAT.format(aDouble);
        }
        return num;
    }
}
