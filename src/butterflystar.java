public class butterflystar {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(4-i);k++){
                System.out.print(" ");
            }

            for(int l=i;l>=1;l--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(4-i);k++){
                System.out.print(" ");
            }
            for(int l=i;l>=1;l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
