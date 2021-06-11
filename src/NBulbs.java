import java.util.Arrays;

public class NBulbs {

    public int solution(int[] A) {
        boolean[] visited = new boolean[A.length + 1];
        Arrays.fill(visited, false);
        int count = 0;

        // Loop through order of light bulb switched on
        for (int i = 0; i < A.length; i++) {
            // Mark it as 'visited'
            visited[A[i]] = true;

            boolean lightUp = true;
            // if it's visited sequentially, lightUp will still be = true at end of loop
            for (int j = 1; j <= i; j++) {
                // There's bulb that has not been switched on in between
                if (!visited[j]) {
                    lightUp = false;
                    break;
                }
            }
            // if lightUp is still true, increase count
            if (lightUp) {
                count++;
            }
        }

        return count;
    }

}
