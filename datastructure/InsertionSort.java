/* @Purpose : Reads in strings and prints them in sorted order using insertion sort.
 * @File : Insertion Sort the Elements from Word List
 * @Author : Shubham Raj
 */

package datastructure;

public class InsertionSort {
    /*
     * @Purpose: Sorting Of Elements Using Insertion Sort
     *
     * @Param: String Array and Length of Array
     *
     * @Return: Sorted Array Named Array
     */
    public static String[] sort(String array[], int length) {
        String temp = " ";
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    /*
     * @Purpose: Sorting Of Elements Using Insertion Sort
     *
     * @Param: Elements Of Array 1 To 8
     */
    public static void main(String[] args) {
        String[] arr = { "one", "two", "three", "four", "five", "six", "seven", "eight" };
        String sortedArray[] = sort(arr, arr.length);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }
}
