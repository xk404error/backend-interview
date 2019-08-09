package com.bybutter.interview.java;

import com.bybutter.interview.Case1;
import com.bybutter.interview.Easy;

import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

public class Case1Java implements Case1 {
    /**
     * 请实现十进制数字字符串的加法，
     * 每个值肯定为有效的十进制整数字符串，不包含符号。
     *
     * 例如:
     * "1" + "2" = "3"
     * "74" + "52" = "126"
     */
    @Easy
    @NotNull
    @Override
    public String add(@NotNull String value1, @NotNull String value2) {
        char[] chars1 = value1.toCharArray();
        char[] chars2 = value2.toCharArray();
        int resLen=Math.max(chars1.length,chars2.length)+1;
        int[] charsRes=new int[resLen];
        for (int i = resLen-1; i <= 0; i--) {
            int temp=0;
            if(){

            }
            temp=chars1[i]+chars2[i];
            if(temp>10){
                charsRes[i-1] =1;
                temp=temp-10;
            }
            charsRes[i]=temp;
        }
        return null;

        /*//1.把两个大整数用数组逆序存储
        char[] charsA = new StringBuffer(value1).reverse().toString().toCharArray();
        char[] charsB = new StringBuffer(value1).reverse().toString().toCharArray();

        //2.构建result数组，数组长度等于较大整数位数+1
        int maxLength = charsA.length > charsB.length ? charsA.length : charsB.length;
        int[] result = new int[maxLength + 1];
        //3.遍历数组，按位相加
        for (int i = 0; i < result.length; i++) {
            int temp = result[i];
            if (i < charsA.length) {
                temp += charsA[i] - '0';
            }
            if (i < charsB.length) {
                temp += charsB[i] - '0';
            }

            //判断是否进位
            if (temp >= 10) {
                temp = temp - 10;
                result[i + 1] = 1;
            }
            result[i] = temp;
        }

        //4.把result数组再次逆序并转成String
        StringBuilder sb = new StringBuilder();
        // 判断最后一位是否发生了进位
        int head=result.length-1;
        if (result[result.length-1] == 0 )
            head=result.length-2;
        for (int i = head; i >= 0; i--)
            sb.append(result[i]);
        return sb.toString();*/
    }

    public static void main(String[] args) {
        com.bybutter.interview.java.Case1Java case1Java = new Case1Java();
        String add = ((Case1Java) case1Java).add("657482357564317894673657834316574657812578231647236576457436571923468327489123657436578126349123078264574537648723841293846792159",
                "475783425676821634789213572134783267826147086192034672386578436534865783467019238748219748923167892136557436589213470893274892136572657486293187489213748923657436501872");
        System.out.println(add);
    }
}
