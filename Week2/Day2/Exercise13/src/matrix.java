// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output



public class matrix {
    public static void main(String[] args) {
        int[][] a = new int[4][4];
        printmatrix(a);
    }
    public static void printmatrix(int [][]a){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (i == j){
                    a [i][j] = 1;
                }
                else {
                    a [i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
