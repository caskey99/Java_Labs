package com.max.idea;

public class Main {
    public static void main(String[] args){
        System.out.println("\texercise 1");
        System.out.println("Starting project");
        System.out.println("");

        System.out.println("\texercise 2");
        byte v_byte = 120;
        short v_short = 129;
        char v_char = 'a';
        int v_int = 65999;
        long v_long = 4294967296l;
        float v_float = 0.33333334f;
        double v_double = 0.3333333333333333;
        boolean v_bool = true;
        System.out.println("This is a byte: " + v_byte);
        System.out.println("This is a short: " + v_short);
        System.out.println("This is a char: " + v_char);
        System.out.println("This is a int: " + v_int);
        System.out.println("This is a long: " + v_long);
        System.out.println("This is a float: " + v_float);
        System.out.println("This is a double: " + v_double);
        System.out.println("This is a bool: " + v_bool);
        System.out.println("");


        System.out.println("\texercise 3");
        for(char i = '\u0061'; i <= '\u007A'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        long begin = new java.util.Date().getTime();
        for(int i = 0; i <= 100000000; i++){ //when changing the type given from int to long, the program runs longer by 35 milliseconds
        }
        long end = new java.util.Date().getTime();
        System.out.println("Performance measurement " + (end-begin));
        System.out.println();


        System.out.println("\texercise 5-1");
        int[] mas = {12,43,12,-65,778,123,32,76};
        int v_max = mas[0];
        for (int i = 0; i <= mas.length - 1; i++)
        {
            if(mas[i] > v_max)
                v_max = mas[i];
        }
        System.out.println("The maximum value is " + v_max);
        System.out.println();


        System.out.println("\texercise 5-2");
        int[][] matrix = new int[3][3];
        for (int i = 0; i <= matrix.length - 1; i++)
            for (int j = 0; j <= matrix.length - 1; j++)
                matrix[i][j]=(int)Math.round(Math.random()*10);

        System.out.println("Matrix :");
        System.out.println(matrix[0][0] + " " + matrix[1][0] + " " + matrix[2][0]);
        System.out.println(matrix[0][1] + " " + matrix[1][1] + " " + matrix[2][1]);
        System.out.println(matrix[0][2] + " " + matrix[1][2] + " " + matrix[2][2]);
        int[][] transportMatrix = new int[3][3];
        for (int i = 0; i <= matrix.length - 1; i++)
            for (int j = 0; j <= matrix.length - 1; j++)
                transportMatrix[i][j] = matrix[j][i];

        System.out.println("Transposed matrix :");
        System.out.println(transportMatrix[0][0] + " " + transportMatrix[1][0] + " " + transportMatrix[2][0]);
        System.out.println(transportMatrix[0][1] + " " + transportMatrix[1][1] + " " + transportMatrix[2][1]);
        System.out.println(transportMatrix[0][2] + " " + transportMatrix[1][2] + " " + transportMatrix[2][2]);

        System.out.println();
    }
}
