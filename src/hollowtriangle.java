public class hollowtriangle {
    public static void main(String[]args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k==1) {
                    System.out.print("*");
                }
            }
            for(int l=1;l<=i-1;l++){
                System.out.print(" ");
            }
            for(int m=1;m<=5;i++){
                for(int n=2;n<=i;n++){
                    if(m==1 || n==5)
                    System.out.print("*");
                }
            }
            System.out.println();
            }

            }

            }



