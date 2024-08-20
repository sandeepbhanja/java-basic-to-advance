public class mutliArray{
    public static void main(String args[]){
        int multArray[][] = new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                multArray[i][j] = (int)(Math.random()*10);
            }
        }
        for(int i[]:multArray){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}