/*@Purpose : takes a command-line argument N, asks you to think of a number
 *           between 0 and N-1, where N = 2^n, and always guesses the
             with n questions.
 *@File : Find Your Number
 *@Author : Shubham Raj
 */

package datastructure;;

import java.util.Scanner;

public class FindYourNumber {
    static Scanner sc = new Scanner(System.in);

    /*
     * @Purpose: Getting The Elements Of Array As Input For Finding Number
     *
     * @Param: Elements Of String Array That We Enter
     *
     * @Return: True Or False
     */
    public static void main(String args[]) {

        System.out.println("Enter The number greater than your number ");
        int len = sc.nextInt();
        System.out.println("Choose your Number in your mind ");
        int num[] = new int[len];

        for (int i = 0; i < len; i++) {
            int j = i + 1;
            num[i] = j;
        }
        int n = num.length - 1;
        FindYourNumber.repeat(num, 0, n);

    }

    /*
     * @Purpose: Getting Of Repeat Elements Of Array As Input For Finding Number
     *
     * @Param: Elements Of Int Array arr, start and end
     *
     * @Return: Value Or Again The Cases
     */
    public static int repeat(int arr[], int start, int end) {

        for (int i = 0; i < end; i++) {
            System.out.print(arr[i] + " ");
        }
        int mid = start + (end - start) / 2;
        System.out.println();
        System.out.println("Middle Is " + arr[mid]);
        System.out.println(arr[mid] + " is this your number ?");
        System.out.println("yes 1 or No 0");
        int choice2 = sc.nextInt();

        switch (choice2) {
            case 1:
                System.out.println(arr[mid]);

                break;

            case 0:
                System.out.println("Is your number is greater then " + arr[mid]);
                System.out.println("yes 1 or No 0");
                int choice3 = sc.nextInt();

                switch (choice3) {
                    case 1:

                        return FindYourNumber.repeat(arr, mid + 1, end);

                    case 0:
                        return FindYourNumber.repeat(arr, start, mid - 1);
                }

                break;

        }

        return -1;
    }
}