import java.util.Random;
import java.util.Scanner;

public class MCarp {
    static public double[][] mtopla(double[][] matris1, double[][] matris2 ){
        double[][] result=new double[matris1.length][matris2[0].length];
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris2[i].length; j++) {
                result[i][j]=matris1[i][j]+matris2[i][j];
            }
        }

        return result;
    }
    static public double[][] mcikar(double[][] matris1, double[][] matris2 ){
        double[][] result=new double[matris1.length][matris2[0].length];
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris2[i].length; j++) {
                result[i][j]=matris1[i][j]-matris2[i][j];
            }
        }

        return result;
    }

    static public void mYaz(double[][] matris){
        for (int i = 0; i < matris.length; i++) {
            System.out.println("");
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
        }
    }
    static public double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {
        // firstMatrix.length ile ilk matrisin satır sayısını buluyoruz. örneğimizde 3 olarak gelecektir.
        // secondMatrix[0].length ile ikinci matrisin sütun sayısını buluyoruz. örneğimizde 4 olarak gelecektir.
        // C matrisi olacak olan matrisi tanımlıyoruz.
        double[][] result = new double[firstMatrix.length][secondMatrix[0].length];
        // matrislerde çarpma, toplama gibi işlemleri yapabilmek için iç içe 3 tane döngüye ihtiyaç duyarız.
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = multiplyMatricesCell(firstMatrix, secondMatrix, row, col);
            }
        }
        return result;
    }
    static double multiplyMatricesCell(double[][] firstMatrix, double[][] secondMatrix, int row, int col) {
        // A matrisinin satırı ile B matrisinin sütunu çarpma işlemi.

        //*row = 3, col = 4 olarak gelecektir.
        //*i = 0 ise
        //            * firstMatrix[3][0] * secondMatrix[0][4]
        //            * i = 1 ise
        //            * firstMatrix[3][1] * secondMatrix[1][4]
        //            * i = 2 ise
        //            * firstMatrix[3][2] * secondMatrix[2][4]
        //            * şeklinde i değişerek satır ve sütun çarpılır.
        double cell = 0;
        for (int i = 0; i < secondMatrix.length; i++) {
            cell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return cell;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dimention = input.nextInt();
        Random rst = new Random();
        double[][] matris1 = new double[dimention][dimention];
        double[][] matris2 = new double[dimention][dimention];
        double[][] matris3 = new double[dimention][dimention];

        for (int i = 0; i < dimention; i++) {
            for (int j = 0; j < dimention; j++) {
                matris1[i][j] = rst.nextInt(1, 10);
                matris2[i][j] = rst.nextInt(1, 10);
            }
        }

        matris3=multiplyMatrices(matris1,matris2);
        System.out.println("matris çarpımı");
        mYaz(matris3);
        System.out.println("");
        matris3=mtopla(matris1,matris2);
        System.out.println("Matris toplamı");
        mYaz(matris3);
        System.out.println("");
        matris3=mcikar(matris1,matris2);
        System.out.println("Matris çıkartma");
        mYaz(matris3);

    }
}