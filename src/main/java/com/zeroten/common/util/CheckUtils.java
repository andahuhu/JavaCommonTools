package com.zeroten.common.util;

public class CheckUtils {
    /*
    * 判断传入的多个String字符串是否为空
    * */
    public static boolean isAnyEmpty(String... strings){
        String[] strs = strings;
        for (String str : strs) {
            if(str == null || "".equals(str.trim())){
                return false;
            }
        }
        return true;
    }
    /*
     * 判断传入的Object数组是否为空
     * */
    public static boolean isEmpty(Object[] arr){
        if(arr == null || arr.length ==0){
            return true;
        }
        return false;
    }
    /*
     * 判断字符串是否相等
     * */
    public static boolean equals(String str1, String str2){
        if(str1 != null && str1.equals(str2)){
            return true;
        }
        return false;
    }
    /*
     * 判断Integer对象是否相等
     * */
    public static boolean equals(Integer n1, Integer n2){
        if(n1 != null && n2 != null){
            if(n1.intValue() == n2.intValue()){
                return true;
            }
        }
        return false;
    }
}
