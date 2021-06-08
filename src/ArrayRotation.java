public class ArrayRotation {

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

}
