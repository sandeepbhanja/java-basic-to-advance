public class jaggedArray{
    public static void main(String args[]){
        int jagArray[][] = new int[3][];

        jagArray[0]= new int[3];
        jagArray[1]= new int[5];
        jagArray[2]= new int[1];

        for(int i=0;i<jagArray.length;i++){
            for(int j=0;j<jagArray[i].length;j++){
                jagArray[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i[]:jagArray){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}