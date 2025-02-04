class Main {
    public static void main(String[] args) {
        String[][] grid = {
                {"O", "X", "X"},
                {"O", "X", "O"},
                {"X", "O", "X"}
        };

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                System.out.print(grid[i][j] + (j < grid[i].length - 1 ? " " : ""));
            }

            System.out.println();
        }
    }
}