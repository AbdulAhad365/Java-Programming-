class Scratch {
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            System.out.print("*");
            if(i>0){
                if (i==3){
                    for(int j=0;j!=i;j++) {
                        System.out.print("*");}
                }
                else{
                    for(int j=0;j!=i;j++) {
                        System.out.print(" ");}
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
