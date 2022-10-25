class fredv {
    public static void main(String[] args) {
        int n = 5;
        // For revert star    *****
        //                    ****
        //                 ***
        //               **
        //             *
        int x = 3;

        // for the pyramid
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; i > j; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");

            }


        }
        for (int i=3; i<=n; i++){
            System.out.print("  ");
            for (int j=5; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
            for (int k=0; i>k;k++){
                System.out.print(" ");
            }
        }


        }

        }




