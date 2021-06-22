public class NumberOfIsland {

    public int numIslands(char[][] grid) {
        int height = grid.length;
        if (height == 0) {
            return 0;
        }
        int width = grid[0].length;

        int islandCount = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == '1') {
                    visitNearby(grid, i, j);
                    islandCount++;
                }
            }
        }

        return islandCount;
    }

    private void visitNearby(char[][] grid, int i, int j) {
        // Exceed Boundary
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length) {
            return;
        }
        // Ocean
        if (grid[i][j] != '1') {
            return;
        }

        // Mark as visited
        grid[i][j] = '0';

        // Up, Down, Left, Right
        visitNearby(grid, i, j + 1);
        visitNearby(grid, i + 1, j);
        visitNearby(grid, i, j - 1);
        visitNearby(grid, i - 1, j);
    }

}
