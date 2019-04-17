package exercise.exercise_0417;

import java.util.Arrays;
import java.util.Comparator;

/*
关于数组
 */
/*
数组中重复的数字
题目描述
在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 数组中某些数字是重复的，但不知道有几个数字是重复的。
 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
  例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */

/*
public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        for(int i =0; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(numbers[j] == numbers[i]){
                    duplication[0] = numbers[j];
                    return true;
                }
            }
        }
        return false;
    }
}*/

/*
构建乘积数组
给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */

/*
import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int len = A.length;
        if(len == 0 || A == null){
            return A;
        }
        //1 2 3 4 5
        //前半部分
        int[] B = new int[len];
        B[0] = 1;
        for(int i=1; i<len; i++){
            B[i] = B[i-1] * A[i-1];
        }
        //后半部分
        int[] tmp = new int[len];
        tmp[len-1] = 1;
        for(int i=len-2; i>=0; i--){
            tmp[i] = tmp[i+1] * A[i+1];
            B[i] *= tmp[i];
        }
        return B;
    }
}*/

/*
二维数组中的查找
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
判断数组中是否含有该整数。
 */

public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array.length == 0 || array == null){
            return false;
        }
        int len = array.length;
        int i=0;
        int j=array[0].length-1;
        while(i<len && j>=0){
            if(target == array[i][j]){
                return true;
            }else if(target < array[i][j]){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}