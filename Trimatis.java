public class Trimatis {
    public static void main(String Trimatis[]){

        // Declare a 2D array
        int[][] twoDArray;

// Create a 2D array with 3 rows and 4 columns
        twoDArray = new int[3][4];
        System.out.println("-------2D masyvas: ----------");
// Initialize the elements in the 2D array
        twoDArray[0][0] = 1;
        twoDArray[0][1] = 2;
        twoDArray[0][2] = 3;
        twoDArray[0][3] = 4;
        twoDArray[1][0] = 5;
        twoDArray[1][1] = 6;
        twoDArray[1][2] = 7;
        twoDArray[1][3] = 8;
        twoDArray[2][0] = 9;
        twoDArray[2][1] = 10;
        twoDArray[2][2] = 11;
        twoDArray[2][3] = 12;

        int element = twoDArray[1][2]; // Accesses the element in the second row and third column (7)
        System.out.println(element);

// Loop through and print all elements in the 2D array
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(twoDArray[row][col] + " ");
            }
            System.out.println(); // Move to the next row
        }
        System.out.println("-------3D masyvas: ----------");
        // Declare a 3D array

        int[][][] threeDArray = {
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12}
                },
                {
                        {13, 14, 15, 16},
                        {17, 18, 19, 20},
                        {21, 22, 23, 24}
                }
        };


// Loop through and print all elements in the 3D array
        for (int layer = 0; layer < 2; layer++) {
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 4; col++) {
                    System.out.print(threeDArray[layer][row][col] + " ");
                }
                System.out.println(); // Move to the next row
            }
            System.out.println(); // Add a newline between layers
        }


    }
}
