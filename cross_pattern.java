class Scratch {
    public static void main(String[] args) {
        int z=2;
        for(int i=1;i<=3;i++){

            for(int l=1;l<=i;l++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k=1;2*z+1>=k;k++){
                System.out.print(" ");
            }
            System.out.print("*");
            z--;

            System.out.println();
        }
        int g=4;
        int o=4;
        for(int i=1;i<=4;i++){
            for(int h=1;h<=o;h++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1;2*(i-1)+1>j;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            g++;
            o--;
        }
    }
}
