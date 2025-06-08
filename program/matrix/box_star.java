public class box_star {
    public static void main(String[] args) {
        int size = 7; // Size of the letter
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Conditions to print the letter 'A'
                if (i == 0 && j > 0 && j < size - 1 || // Top line
                    j == 0 && i != 0 || // Left diagonal
                    j == size - 1 && i != 0 || // Right diagonal
                    i == size / 2) { // Middle horizontal bar
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
