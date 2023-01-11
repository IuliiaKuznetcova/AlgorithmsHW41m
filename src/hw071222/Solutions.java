package hw071222;

public class Solutions {

        public static void main(String[] args) {
            System.out.println("Hello world!");
        }

/*First level:  1) Вычислить сложность следующих алгоритмов

    Если n==1, то выполнится 1 операция, сложность в лучшем случае будет О(1)
    Цикл с i выполнится n раз, то есть О(n)
    На каждое выполнение цикла i цикл j выполнится n раз
    Итого O(n)*O(n)=O(1+n)*log(n)*/

        // time complexity O(n^2)
        void test1(int n)
        {
            if (n==1)
                return;
            for (int i=1; i<=n; i++) {// О(n)
                for (int j=1; j<=n; j++) // О(n)
                    System.out.println("*");
                break;
            }

/*4*1=4 O(n*1)=O(n) КАК ОТСЮДА ПОЛУЧАЕТСЯ O(n^2)??????? По аналогии из лекции,
где было 3 по 3 цикла и звучало как 9 - это 3 в квадрате*/

            // n=4
            // i = 1                    ****
            //      j = 1   sout *
            //      j = 2   sout *
            //      j = 3   sout *
            //      j = 4   sout *
            //      j = 5  false (5 > 4), break

//_________________________________________________________________________________

/* Если n==1, то выполнится 1 операция, сложность в лучшем случае будет О(1)
    Цикл с i выполнится n раз, то есть О(n)
    На каждое выполнение цикла i цикл j выполнится n раз, то есть O(n)
    Итого сложность в худщем случае будет O(n)*O(n)=O(n^2)*/

            // time complexity O(n^2)
            void test2(int n)
            {
                if (n==1)                           // O(1)
                    return;
                for (int i=1; i<=n; i++)            // О(n)
                    for (int j=1; j<=n; j++)
                        System.out.println("*");    // О(n)
            }

            // n=4                      4*4=4^2=O(n^2)
            // i = 1                    ****
            //      j = 1   sout *
            //      j = 2   sout *
            //      j = 3   sout *
            //      j = 4   sout *
            //      j = 5  false (5 > 4)
            // i = 2                    ****
            //      j = 1   sout *
            //      j = 2   sout *
            //      j = 3   sout *
            //      j = 4   sout *
            //      j = 5  false (5 > 4)
            // i = 3                    ****
            //      j = 1   sout *
            //      j = 2   sout *
            //      j = 3   sout *
            //      j = 4   sout *
            //      j = 5  false (5 > 4)
            // i = 4                    ****
            //      j = 1   sout *
            //      j = 2   sout *
            //      j = 3   sout *
            //      j = 4   sout *
            //      j = 5  false (5 > 4)
            // i = 5 false  (5 > 4)

//_________________________________________________________________________________
            // time complexity O(n^2)
            void test3(int n)
            {
                int a = 0;
                int i, j;
                for (i = 0; i < n; i++)         O(n)
                for (j = n; j > i; j--)     O(n)
                a = a + i + j;          O(n)
            }
// Тут мне непонятно, то, что происходит с а на каждом ветке цикла j является ли отдельным циклом
//соответственно, я не могу определить, это будет O(n^2) или O(n^3)
            // n =4
            // i = o
            //      j = 4
            //              a = 4
            //      j = 3
            //              a = 7
            //      j = 2
            //              a = 9
            //      j = 1
            //              a = 10
            //      j = 0   false  (0 !> 0)
            // i = 1
            //      j = 4
            //              a = 15              (10 + 1 + 4)
            //      j = 3
            //              a = 19
            //      j = 2
            //              a = 22
            //      j = 1   false  (1 !> 1)
            // i = 2
            //      j = 4
            //              a = 28              (22 + 2 + 4)
            //      j = 3
            //              a = 33
            //      j = 2   false  (2 !> 2)
            // i = 3
            //      j = 4
            //              a = 40              (33 + 3 + 4)
            //      j = 3   false  (3 !> 3)
            // i = 4
            //      j = 4   false  (4 !> 4)
            // a = 0 + 4 + 4 = 8

//_________________________________________________________________________________________
//честно говоря, мне непонятно, почему дебагер здесь а считает в каждом витке цикла j, а

            //  time complexity O(n^2)
            void test4(int n)
            {
                int i, j, a = 0;
                for (i = n/2; i <=n; i++)         //  n/2   O(n)
                    for (j = 2; j <=n; j=j*2)     //  j*2   O(n)
                        a=a+n/2;                  //        O(n)???

            }

            // n = 4
            // i = 4/2 = 2
            //          j = 2
            // a = 0 + 4 / 2 = 2;                   1
            //          j = 4
            // a = 2 + 4 / 2 = 4;                   2
            //          j = 8    false (8 > 4)
            // i = 3
            //          j = 2
            //  a = 4 + 4 / 2 = 6;                  3
            //          j = 4
            //  a = 6 + 4 / 2 = 8;                  4
            //          j = 8    false (8 > 4)
            // i = 4
            //          j = 2
            // a = 8 + 4 / 2 = 10;                  5
            //          j = 4
            // a = 10 + 4 / 2 = 12                  6
            //          j = 8    false (8 > 4)
            // i = 5  false (5 > 4)
            // a = 12

/*Изначально я вообще а складывала только после полного цикла с j, переделала только после дебагера
И я не могу понять, как тут посчитать итерации. Судя по тому, как считает IDEA, тут три вложенных цикла
Хотя записано все это очень странно*/


/*2) Find the element that appears once in a sorted array
    Given a sorted array in which all elements occur twice (one after the other) and one element appears only once.


    Простое решение состоит в обходе массива слева направо. Поскольку массив отсортирован, мы легко можем найти нужный элемент.
    Задачки со звёздочкой - вычислить сложность в лучшем и худшем случае.*/

            // time complexity O(n) будет и в лучшем, и в худшем случае

            public static int  lineaArray(int[] arr, int desired) {
            desired = 5;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == desired) {
                    return(i);
                }
            }
            return(-1);
        }

            // desired = 5           arr =[2, 4, 7]  //id 0, 1, 2,
            //----1-----
            //i = 0      0 < 3       arr [i] = 2     2!=5    false
            //----2-----
            //i = 1      1 < 3       arr [i] = 4     4!=5    false
            //----3-----
            //i = 2      2 < 3       arr [i] = 7     7!=5    false
            // return -1


            // desired = 4           arr =[2, 4, 7]  //id 0, 1, 2,
            //----1-----
            //i = 0      0 < 3       arr [i] = 2     2!=5    false
            //----2-----
            //i = 1      1 < 3       arr [i] = 4     4==4    true
            // return 2


//__________________________________________________


            //линейное, тут только один цикл
            //  time complexity O(n)
            void test5(int n)
            {
                int a = 0, i = n;
                while (i > 0) {             O(n)
                    a += i;
                    i /= 2;
                }
            }

            //записать можно так
            for (i = n; i > 0 i /= 2;)      O(n)
            a += i;

            //n=4
            //i = 4     4 > 0
            //a = 0 + 4 = 4
            //i = 4 / 2 = 2
            //i = 2     2 > 0
            //a = 4 + 2 = 6
            //i = 2 / 2 = 1
            //i = 3     2 > 0
            //a = 6 + 1 = 7
            //i = 1 / 2 = 0.5  //0


            time complexity O(n^2)
            void method(int a, int b) {
            while (a != b) {
                if (a > b) {                        O(n)
                    a = a - b;
                } else {                            O(n)
                    b = b - a;
                }
            }
        }

            //a = 4   b = 2     4 > 2     true
            //a = 4 - 2 = 2
            //a = 2 - b = 2     a = b     false

            //a = 2   b = 4    2 !> 4    false
            //b = 4 - 2 = 2
            //b = 2   a = 2    b = a     false



            // time complexity O(n^3)
            void method2(int n) {
            for (int i = 0; i < n / 2; i++) {                   //O(n/2) = O(n)
                for (int j = 1; j + n / 2 <= n; j++) {          //O(n/2) = O(n)
                    for (int k = 1; k <= n; k = k * 2) {        //O(n*2) = O(n)
                        System.out.println("I am expert!");
                    }
                }
            }
        }



            // time complexity O(n^2)
            void method3(int n) {
            for (int i = 1; i <= n; i++) {                      //O(n)
                for (int j = 1; j <= n; j = j + i) {            //O(n)
                    System.out.println("I am expert!");
                }
            }
        }

            // i = 1                    (4)
            //      j = 1            sout "I..."
            //      j = 1 + 1 = 2    sout "I..."
            //      j = 2 + 1 = 3    sout "I..."
            //      j = 3 + 1 = 4    sout "I..."
            //      j = 4 + 1 = 5                   false (5 > 4)
            // i = 2                    (2)
            //      j = 1            sout "I..."
            //      j = 1 + 2 = 3    sout "I..."
            //      j = 3 + 2 = 5                   false (5 > 4)
            // i = 3                    (2)
            //      j = 1            sout "I..."
            //      j = 1 + 3 = 4    sout "I..."
            //      j = 4 + 2 = 6                   false (5 > 4)
            // i = 4                    (1)
            //      j = 1            sout "I..."
            //      j = 1 + 4 = 5                   false (5 > 4)
            // i = 5 false  (5 > 4)

        }

}
