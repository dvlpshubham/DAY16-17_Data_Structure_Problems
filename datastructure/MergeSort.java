/*@Purpose:Write a program to do Merge Sort of list of Strings.
 * @File: Merge Sort the Elements from Words Array Elements.
 * @Author: Shubham Raj
 */

package datastructure;

public class MergeSort {
    /*
     * @Purpose: Sorting Of Elements Using Merge Sort
     *
     * @Param: Elements Of Arrays
     */
    public static void main(String[] args) {
        String[] array = { "Delhi", "Mumbai", "Pune", "Tripura", "Agartalla", "Kolkata", "Assam" };

        String[] sortedArray = mergeSort(array);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i] + " ");
        }
    }

    /*
     * @Purpose: Sorting Of Elements Using Merge Sort
     *
     * @Param: Elements Of String Array Named List
     *
     * @Return : Sorted Array
     */
    public static String[] mergeSort(String[] list) {
        String[] sorted = new String[list.length];
        if (list.length == 1) {
            sorted = list;
        } else {
            int mid = list.length / 2;
            String[] left = null;
            String[] right = null;
            if ((list.length % 2) == 0) {
                left = new String[list.length / 2];
                right = new String[list.length / 2];
            } else {
                left = new String[list.length / 2];
                right = new String[(list.length / 2) + 1];
            }
            int x = 0;
            int y = 0;
            for (; x < mid; x++) {
                left[x] = list[x];
            }
            for (; x < list.length; x++) {
                right[y++] = list[x];
            }
            left = mergeSort(left);
            right = mergeSort(right);
            sorted = mergeArray(left, right);
        }

        return sorted;
    }
    /*
     * @Purpose: Sorting Of Elements Using Merge Sort
     *
     * @Param: Elements Of String Array in left or Right
     *
     * @Return : Merged Array
     */

    private static String[] mergeArray(String[] left, String[] right) {
        String[] merged = new String[left.length + right.length];
        int lIndex = 0;
        int rIndex = 0;
        int mIndex = 0;
        int comp = 0;
        while (lIndex < left.length || rIndex < right.length) {
            if (lIndex == left.length) {
                merged[mIndex++] = right[rIndex++];
            } else if (rIndex == right.length) {
                merged[mIndex++] = left[lIndex++];
            } else {
                comp = left[lIndex].compareTo(right[rIndex]);
                if (comp > 0) {
                    merged[mIndex++] = right[rIndex++];
                } else if (comp < 0) {
                    merged[mIndex++] = left[lIndex++];
                } else {
                    merged[mIndex++] = left[lIndex++];
                }
            }
        }
        return merged;
    }
}
