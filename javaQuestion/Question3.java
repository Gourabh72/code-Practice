package javaQuestion;

public class Question3 {


        // Quick Select algorithm
        public static int findKthLargest(int[] array, int k) {
            return quickSelect(array, 0, array.length - 1, array.length - k);
            // arr, 0, 10-1, 10-5
        }

        // Helper method for Quick Select
        private static int quickSelect(int[] array, int left, int right, int k) {
            //arr,0,9,5 | arr,0,8,5 | arr,0,6,5 | arr,0,5,5 | arr,4,5,5
            if (left == right) {//0!=9 | 0!=8 | 0!=6 | 0!=5
                return array[left];
            }
            //find bigger number swap it and return the index
            int pivotIndex = partition(array, left, right);
            //arr,0,9 | arr,0,8 | arr,0,6 | arr,0,5 | arr,4,5
            // pivotIndex=9|7

            //returned index according to it which side swap decided
            //k=5,pivotIndex=9|7|6|3
            if (k == pivotIndex) {
                //Called when given lenth reached
                return array[k];
            } else if (k < pivotIndex) {
                //go  to left side to swap bigger number
                return quickSelect(array, left, pivotIndex - 1, k);//arr,0,8,5|arr,0,6,5|arr,0,5,5
            } else {
                //go to rigth side to swap bigger number
                return quickSelect(array, pivotIndex + 1, right, k);//arr,4,5,5
            }
        }


        // Partition method for Quick Select
        private static int partition(int[] array, int left, int right) {
            int pivot = array[right];//20 | 8 | 7 | 4 | 5
            int i = left;//0 | 0 | 0 | 0 | 4
            for (int j = left; j < right; j++) {//0 to 9 | 0 to 8 | 0 to 6 | 0 to 5
                if (array[j] <= pivot) {
                    //3<=20 | 2<=20 | 1<=20 |5<=20 |6<=20 |4<=20 |7<=20 |9<=20 |8<=20 | 20<=20
                    //3<=8 | 2<=8 | 1<=8 |5<=8 |6<=8 |4<=8 |7<=8 |9<=8
                    //3<=7 | 2<=7 | 1<=7 |5<=7 |6<=7 |4<=7
                    //3<=4 | 2<=4 | 1<=4 |5<=4
                    swap(array, i, j);
                    //arr,0,0 | arr,1,1 | arr,2,2 | arr,3,3 | arr,4,4 | arr,5,5 | arr,6,6 | arr,7,7 | arr,8,8 | arr,9,9

                    i++;
                }
            }
            swap(array, i, right);//arr,9,9 | arr,7,8 | arr,6,6 | arr,3,5
            return i;
        }


        // Swap method

        private static void swap(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }


        public static void main(String[] args) {

            int[] numbers = {3, 2, 1, 5, 6, 4, 7, 9, 8, 20};
//            int[] numbers = {3, 2, 1, 7, 6, 5, 4};
            int position = 3;
            int kthLargest = findKthLargest(numbers, position);
            System.out.println("The " + position + "th largest element is " + kthLargest);

        }


}
