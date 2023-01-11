package hw071222;

public class Сheck {
    public static void main(String[] args) {

        /*for (int i = 1; i <= n; i++) {                      //O(n)
            for (int j = 1; j <= n; j = j + i) {            //O(n)
                System.out.println("I am expert!");
            }
        }*/

        /*if (n==1)                           // O(1)
            return;
        for (int i=1; i<=n; i++)   {          // О(n)
            for (int j=1; j<=n; j++)
                System.out.println("*");
        break;}*/
       /* int n = 4;
        int a = 0;
        int i, j;
        for (i = 0; i < n; i++);
        //System.out.println(a);

        for (j = n; j > i; j--);
           // System.out.println(a);

        a = a + i + j;
        System.out.println("a = " + a);*/

 /*           int n =4;
            int a = 0, i = n;
            while (i > 0) {
                System.out.print(" n = " + n);
                System.out.println();
                a += i;
                System.out.print(" a = " + a);
                System.out.println();
                i /= 2;
                System.out.print(" i = " + i);
                System.out.println();
             *//* System.out.print("n = " + n);
                System.out.println("___________");
              System.out.print("a =" + a);
                System.out.println("___________");
                System.out.print("i = " + i);*//*
        }*/
       /* int n = 4;
        int i, j, a = 0;
        for (i = n/2; i <=n; i++)

            for (j = 2; j <=n; j=j*2)

                a=a+n/2;
        System.out.println(a);*/

       /* int n = 4;
        int a = 0;
        int i, j;
        for (i = 0; i < n; i++)
            for (j = n; j > i; j--)
                a = a + i + j;
        System.out.println(a);*/


        int[] arr = {2, 4, 7, 8};
        System.out.println(lineaArray(arr));
    }
    public static int  lineaArray(int[] arr) {
        int desired =2;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == desired) {
                return(i);
            }
        }
        return(-1);
    }
}



}
