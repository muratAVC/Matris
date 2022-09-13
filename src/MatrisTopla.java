public class MatrisTopla {
    String adı;
    public MatrisTopla(){
       this.adı="murat";
   }
   public static double[][] mtopla(double[][] matris1, double[][] matris2 ){
        double[][] result=new double[matris1.length][matris2[0].length];
        for (int i = 0; i < matris1.length; i++) {
           for (int j = 0; j < matris2[i].length; j++) {
               result[i][j]=matris1[i][j]+matris2[i][j];
           }
        }

       return result;
   }
}
