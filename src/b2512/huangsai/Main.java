package b2512.huangsai;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = 10;
        int a=5;
        age = age+(a-1)*2;
        System.out.println(age);
        int[] sum = new int[]{2,3,4,5,6,7,8,9};
        int[] sum1 = new int[sum.length];
        for (int i=0; i<sum.length;i++){
            sum1[i] += sum[i];
        }
        for (int j=0;j<8;j++){
            System.out.print(sum[j]+",");
        }
//        Scanner sca = new Scanner(System.in);
//        int[] name = new int[10];
//        int max = 0;
//        for (int i=0; i<name.length;i++){
//            System.out.print("输入第"+(i+1)+"个同学的成绩:");
//            name[i] = sca.nextInt();
//            if (name[i]<1 || name[i]>100){
//                System.out.println("请输入正确的成绩!");
//                i--;
//                continue;
//            }
//            if (max<name[i]){
//                max=name[i];
//            }
//        }
//        System.out.println(Arrays.toString(name));
//        System.out.println("最大值:"+max);
    }
}
