package ru.mirea.lab1;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        /*3*/

        int[] mas = {10, 2, 2, 4};
        int sum = 0;
        int n = mas.length;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        double average = (sum / mas.length);
        System.out.println(sum);
        System.out.println(average);
    }
}
        /*4*/
/*
        Scanner in = new Scanner(System.in);

        int mas[] = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            mas[i] = in.nextInt();
        }

        int i = 0;

        while (i < 10) {
            sum += mas[i];
            i++;
        }

        i = 0;
        int max = 0;
        int min = 99999;

        do {
            if (mas[i] < min) {
                min = mas[i];
            }

            if (mas[i] > max) {
                max = mas[i];
            }

            i++;
        } while (i < 10);
        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);
    }
}*/
        /*5*/
/*
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}*/

        /*6*/
/*
        for (float i = 1; i < 11; i++) {
            System.out.printf("%.2f ", 1 / i);
        }
    }
}*/
        /*7*/
/*
        public static int fact ( int a)
        {
            int f = 1;

            for (int i = 1; i <= a; i++) {
                f *= i;
            }

            return f;
        }

        public static void main (String[]args)
        {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            System.out.println(fact(n));
        }
    }*/


