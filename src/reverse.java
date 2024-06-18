public class reverse{
    public static void main(String[]args){
        for(int i=1;i<=4;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");

            }
            for(int j=i;j<=4;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}