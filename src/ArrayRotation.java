public class ArrayRotation {

    // Create copy of array - Time (O(n)), Space (O(n))
    public static int[] rotateRight(int[] array, int times) {
        // if times > array.length, reduce it
        times = times % array.length;

        // Create new array to hold result
        int[] result = new int[array.length];
        // Loop through govem array and fill resulting array accordingly
        for (int i = 0; i < array.length; i++) {
            result[(i + times) % array.length] = array[i];
        }

        return result;
    }

    // Time (O(n)), Space (O(n))
    public static int[] rotateLeft(int[] array, int times) {
        // if times > array.length, reduce it
        times = times % array.length;

        // Create new array to hold result
        int[] result = new int[array.length];
        // Loop through govem array and fill resulting array accordingly
        for (int i = 0; i < array.length; i++) {
            result[((i - times + array.length) % array.length)] = array[i];
        }

        return result;
    }

    /* Swap in place - Time (O(n)), Space (O(1))
    i.e. Array = [1,2,3,4,5,6,7] Times = 3
    1. Reverse whole array -> [7,6,5,4,3,2,1]
    2. Reverse up to index of Times - 1 -> [5,6,7,4,3,2,1]
    3. Reverse from index of times to index till end -> [5,6,7,1,2,3,4]
    */
    public static int[] rotateInPlace(int[] array, int times) {
        times = times % array.length;

        // Reverse whole array
        reverse(array, 0, array.length - 1);

        // Reverse from 0 - times
        reverse(array, 0, times - 1);

        // Reverse from times - array length
        reverse(array, times, array.length - 1);

        return array;
    }

    private static void reverse(int[] array, int start, int end) {
        while(start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

}
