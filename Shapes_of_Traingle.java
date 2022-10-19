class fredv{
    public static void main(String [] args){
        int n=5;
        // For revert star    *****
        //                    ****
           //                 ***
             //               **
               //             *
        for (int i=1; i<=n; i++){
            for (int j=5; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        // for thr pyramid reverse
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=1; i<=n; i++){
            for (int j=5; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
            for (int k=0; i>k;k++){
                System.out.print(" ");
            }
        }
        System.out.println();



// for the issosles traingle
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
            for (int k=0; i>k;k++){
                System.out.print(" ");
            }
        }
        // for the pyramid
        System.out.println();
        for (int i=0;i<n;i++){
            for (int j=0;i>j;j++){
                System.out.print("* ");
            }
            System.out.println();
            for (int k=5; k>=i;k--){
                System.out.print(" ");
            }
        }
    }
}
