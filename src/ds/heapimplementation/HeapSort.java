package udemy.leetcode.heap;

import java.util.Arrays;

public class HeapSort {
// Sort aaray using Heap
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        int[] arr = {10,6,8,2,4};


        minHeap.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted array:");
        printArray(arr);
    }

    public void sort(int arr[]) {
        int n = arr.length;

        // Build a max heap (rearrange the array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i); // heapify makes sure that node is converted into heap
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move the current root to the end
            swap(arr, i, 0);
            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }



    void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than the largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If the largest is not the root
        if (largest != i) {
            swap(arr, i, largest);
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
