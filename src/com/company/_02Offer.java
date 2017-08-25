package com.company;

import org.junit.Test;

import javax.sound.midi.Soundbank;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class _02Offer {
    String str = "We Are Happy";

    public String replaceSpace(StringBuffer str) {
        while (str.indexOf(" ")!=-1){

                int index = str.indexOf(" ");
                str.replace(index,index+1,"%20");
        }
        return str.toString();
    }

    @Test
    public  void test(){
        String result = replaceSpace(new StringBuffer(str));
        System.out.println(result);


    }


}
