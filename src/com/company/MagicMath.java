package com.company;

public class MagicMath {

    // факториал
    public static int fact(int n){
        int factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }

    // модуль
    public static int abs(int n){
        if (n < 0){
            n*=-1;
        }
         return n;
    }

    // степень
    public static int pow(int n, int e){
        int res = n;
        for (int i = 0; i < e; i++){
            res*=res;
        }
        return res;
    }



}
