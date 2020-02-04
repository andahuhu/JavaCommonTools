package com.zeroten.common.util;

public class ArrayUtils {
    /*
     * 数组排序(冒泡排序)
     * */
    public static int[] sort(int[] arr){
        if(arr == null || arr.length == 0){
            return arr;
        }
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j+1]<arr[j]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}
