package LeetCode;

public class WordSearch
{

    public static void main(String[] args) 
    {
        char board [][] = {{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'}};
        String word = "bcgkl";

        System.out.println(exist(board, word));
        
    }

    public static Boolean exist(char board[][],String word)
    {
        int row = board.length;
        int col = board[0].length;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(WS(board,word,i,j,0))
                {
                    return true;
                }
            }
           
        }
        return false;

        
    }

    public static Boolean WS(char board[][],String word,int row,int col,int index)
    {
        if(index == word.length())
        {
            return true;
        }

        if(row<0 || col<0 || row>= board.length || col>= board[0].length || board[row][col] != word.charAt(index))
        {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#';

        Boolean found = 
             WS(board, word, row-1, col, index+1) ||
              WS(board, word, row+1, col, index+1) ||
               WS(board, word, row, col-1, index+1)||
                WS(board, word, row, col+1, index+1);

        board[row][col] = temp;

        return found;

    }


}