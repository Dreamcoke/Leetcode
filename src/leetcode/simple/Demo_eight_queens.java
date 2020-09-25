package leetcode.simple;

import java.util.Scanner;

public class Demo_eight_queens {
    //static int[] result = new int[4];//全局或成员变量,下标表示行,值表示queen存储在哪一列
    public static void cal8queens(int row,int[] result,int a) { // 调用方式：cal8queens(0,result,a);
        if (row == a) { // a个棋子都放置好了，打印结果
            printQueens(result,a);
            return; // a行棋子都放好了，已经没法再往下递归了，所以就return
        }
        for (int column = 0; column < a; ++column) { // 每一行都有a中放法
            if (isOk(row, column,result,a)) { // 有些放法不满足要求
                result[row] = column; // 第row行的棋子放到了column列
                cal8queens(row+1,result,a); // 考察下一行
            }
        }
    }

    private static boolean isOk(int row, int column,int[] result,int a) {//判断row行column列放置是否合适
        int leftup = column - 1, rightup = column + 1;
        for (int i = row-1; i >= 0; --i) { // 逐行往上考察每一行
            if (result[i] == column) return false; // 第i行的column列有棋子吗？
            if (leftup >= 0) { // 考察左上对角线：第i行leftup列有棋子吗？
                if (result[i] == leftup) return false;
            }
            if (rightup < a) { // 考察右上对角线：第i行rightup列有棋子吗？
                if (result[i] == rightup) return false;
            }
            --leftup; ++rightup;
        }
        return true;
    }

    private static void printQueens(int[] result,int a) { // 打印出一个二维矩阵
        for (int row = 0; row < a; ++row) {
            for (int column = 0; column <a; ++column) {
                if (result[row] == column) System.out.print("X ");
                else System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("输入棋盘的行列数");
        int a=n.nextInt();
        int[] result = new int[a];
        cal8queens(0,result,a);

    }
}
