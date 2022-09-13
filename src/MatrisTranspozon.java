import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrisTranspozon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Matrisin satır sayısı ne olsun");
        int dimentionS = input.nextInt();
        System.out.println("Matrisin satır sayısı ne olsun");
        int dimentionK = input.nextInt();
        Random rst = new Random();
        int[][] matris1 = new int[dimentionS][dimentionK];
        int[][] matris2 = new int[dimentionS][dimentionK];
        int[][] matris3 = new int [dimentionS][dimentionK];

        for (int i = 0; i < dimentionS; i++) {
            for (int j = 0; j < dimentionK; j++) {
                matris1[i][j] = rst.nextInt(1, 10);
                matris2[i][j] = rst.nextInt(1, 10);
            }
        }

        matrisYaz(matris1);
        System.out.println("--------------------");
        matrisYaz(matrisTransP(matris1));
    }


    static public int[][] matrisTransP(int[][] matris){
        int[][] result =new int[matris[0].length][matris.length];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                result[j][i]=matris[i][j];

            }

        }

        return result;
    }

    public static void matrisYaz(int[][] matris){
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j]+" ");
            }
            System.out.println("");
        }

    }

}
