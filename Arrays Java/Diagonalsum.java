public class Diagonalsum {


    public static int ma(int matrix[][]){

    int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            sum+=matrix[i][i];
                if(i != matrix.length-1-i){
            sum+=matrix[i][matrix.length-i-1];
                }
        }
        return sum;

    }

 



    public static int mat(int matrix[][])//bruteforce approach
    {
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
               if(i == j)
               {
                 sum=sum+ matrix[i][j];
               }
               else if(i+j == matrix.length-1)
               {
                sum=sum+ matrix[i][j];
               }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] ={{0,1,2},
        {3,4,5},
        {6,7,8},
        };

        System.out.print(ma(matrix));
    }
    
}
