import java.util.Arrays;

public class ArrayMatrisTranspose {
    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10,11,12}};

        int[][] matrisTranspose = new int[matris[0].length][matris.length];

        for(int i = 0 ; i < matris.length ; i++){
            for (int j = 0; j < matris[i].length ; j++){
                matrisTranspose[j][i] = matris[i][j] ;
            }
        }



        for (int i = 0 ; i < matrisTranspose.length ; i++ ){
            for(int j = 0 ; j < matrisTranspose[i].length ; j++){
                System.out.print(matrisTranspose[i][j] + " ");
            }
            System.out.println();
            }

    }
}
