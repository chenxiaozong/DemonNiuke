package com.company;


import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * 剑指offer 测试题
 */
public class _01Offer {
//    题目描述
//    在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，
//    输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。


    /**
     * 思路:从右上角开始判断:
     * > 如果目标值大于当前值,row++ 移动到下一行比较
     * > 如果目标值小于当前值,col-- 比较当前行的前一列
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int [][] array) {
        int row =0;
        int col = array[0].length-1;

        while (row<array.length&&col>=0){
            if (target ==array[row][col]){
                return true;
            }else if (target>array[row][col]){
                row++;
            }else {
                col--;
            }
        }
        return false;
    }



    public int[][] generateArray(int n) {


        int[][] array = new int[2][n];

        Random random = new Random();

        int[] array1 = new int[n*2];

        for (int i = 0; i < n * 2; i++) {
            array1[i] = random.nextInt(100);
        }


        Arrays.sort(array1);

        for (int i=0;i<n*2;i++){
            if (i<n) {
                array[0][i] = array1[i];
            }else {
                array[1][i-n]= array1[i];
            }
        }


        return array;

    }


    @Test
    public void test(){
        int [][] array = generateArray(20);
        boolean result = Find2(40,array);
        System.out.println("结果:"+result);
    }






    public boolean Find2(int target, int [][] array) {
        int row = array.length-1;//获取做大行号
        int col = 0;
        while (row>=0&&col<=array[0].length){
            if (target==array[row][col]){
                return true;
            }else if (target>array[row][col]){
                col++;
            }else {
                row--;
            }

        }
        return false;
    }


}
