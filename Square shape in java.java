class Scratch {
    public static void main(String[] args) {
        for(int i=0;i<=2;i++){
            if (i==0){
                System.out.print("");
                for (int k=0;k<=4;k++){
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.print("*");
            for (int j=0;j<=2;j++){
                System.out.print(" ");
            }
            System.out.println("*");
            if (i==2){
                System.out.print("");
                for(int o=0;o<=4;o++){
                    System.out.print("*");
                }
            }
        }

    }
}
