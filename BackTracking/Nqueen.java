public class Nqueen {


    public static boolean issafe(char board[][],int row,int col)
    {
        //vertically up

        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }
        //diagonally left up
        for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
 
        }

       // diagonally right up

       for(int i= row-1,j=col+1;i>=0 && j<board.length;i--,j++)
       {
        if(board[i][j] == 'Q')
        {
            return false;
        }

       }
       return true;

    }


        public static void nqueen(char board[][],int row)
        {
            if(row == board.length)
            {
                printboard(board);
                return;
            }

            for(int col=0;col<board.length;col++)
            {
            //if(issafe(board,row,col) == true){
                board[row][col] =  'Q';
                nqueen(board, row+1);
                board[row][col]='x';
                
            // }
                 
            }
        }

        public static void printboard(char board[][]) {

            
            System.out.println("------------chess  board--------------"+" ");
            for(int i=0;i<board.length;i++)
            {
                for(int j=0;j<board.length;j++)
                {
                    System.out.print(" "+   board[i][j]  +  " ");
                }
               System.out.println();
            }
            
        }


    public static void main(String[] args) {

        int n=4;
        char board[][] =new char[n][n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]=       'x';
            }
        }

        nqueen(board,0);
        
    }
    
}
