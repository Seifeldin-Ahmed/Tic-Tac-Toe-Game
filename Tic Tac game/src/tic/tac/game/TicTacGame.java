package tic.tac.game;
/**
 * @author Seifeldin Ahmed Ismail 
 */
   
///////////////////////// What is MiniMax Algorithm and How it's Working !!! //////////////////////////
/* 
  1) AI want to choose the max score for him so he is Maximizer                    
  2) Human(x) want to choose the min score(whice means the score that will make AI to lose)
     example: if Human play in cell 1 the game state will be 2 (means AI WIN) and  if Human play in cell 2 the game state will be -2 (means AI lose and Human Win),
     so of course he will play in cell 2 to make AI lose which means he will win,
     so Human is the Minimizer.
         so this is the idea of MiniMax Algorithm, let's see how it's working... 
     
     First Human(x) play in cell[0][0] then AI play in cell[0][1], now the posibiltes for Human all the empty cells
        lets give each cell a number to help us in better understanding
          -------------          ------------- 
          | X | O |   |          | X | O | 3 |
          -------------          -------------
          |   |   |   |   ...->  | 4 | 5 | 6 | 
          -------------          -------------
          |   |   |   |          | 7 | 8 | 9 |
          -------------          ------------- 
         now Human may play in cell 3 or 4, 5,6,7,8,9
    
   the available places for AI coresponding to the Choice of Human 
( if human choose to play in cell[0][2] which is cell number 3,
  so the available places for AI is 4,5,6,7,8,9 )  
      we will caculate the probability for this seqeunce: Human play in cell 3, then AI play in cell 4, then Human play in cell 5 and so on..
     
           Stand at Line 1:
                 at first AI doesn't know where to play 
                 so he tried to play at cell [2] to see what will happen 
         Stand at Line 2 cell [2]: 
                 know it's human turn suppose he will choose to play in cell[3] 
         Stand at Line 3 cell [3]:
                 know it's AI turn he will choose cell[4] to see what will happen
         Stand at Line 4 cell[4]: 
                 know it's human turn suppose he will choose to play in cell[5] 
         Stand at Line 5 cell[5]:
                 know it's AI turn he will choose cell[6] to see what will happen
         Stand at Line 6 cell[6]: 
                 know it's human turn suppose he will choose to play in cell[7], OOps human won ! 
         what if 
                 we Stand again at Line 6 cell[6]: 
                      and human choose to play in cell [9] instead of [7], human won !
         what if 
               we Stand again at Line 6  cell[6]: 
                       and human choose to play in cell [8] instead of [9]
                  Stand at Line 7 cell[8]:
                        know it's AI turn he will choose cell[7] to see what will happen
                  Stand at Line 8 cell[7]:
                         know it's Human turn he will choose cell[9], HUMAN WON!  
                  what if 
                           we Stand again at Line 7 cell[8] : 
                                and AI choose to play in cell [9] instead of [7]
                           Stand at Line 8 cell [9]:
                               know it's Human turn he will choose cell[7], HUMAN WON!  
     
1)AI:                                                                                                                                [ ]
2)Human:                                                                                 [2]                                                                               [3][4][5][6][7][8][9]
3)AI:                                                            [3]                                             [4][5][6][7][8][9] 
4)Human:                                      [4]                                  [5][6][7][8][9]        
5)AI:                            [5]                          [6][7][8][9]  
6)Human:               (-2)[6]                 [7][8][9]
7)AI:    (-2)[7]       (-2)[8]        (-2)[9]
8)Human:           (-2)[7]  (-2)[9]    
9)AI:              (-2)[9]  (-2)[7]
           
       if human play on cell 7
       ------------         -------------                    -------------          -------------
       | X | O |   |        | X | O | X |                    | X | O | X |          | X | O | X |
       -------------        -------------  and so on until   -------------           -------------
       |   |   |   |  .->   |   |   |   | ............ ->    | O | X | O  |  ..>    | O | X | 0 |  NOW HUMAN WON!
       -------------        -------------                    -------------          -------------
       |   |   |   |        |   |   |   |                    |   |   |   |          | X |   |   |
       -------------        -------------                    -------------          ------------- 
     
       if human play on cell 8                                            If AI play on cell 7 and Human play in cell 9 (or) if AI play in cell 9 then Human play in cell 7 : both cases human win
       ------------         -------------                    -------------          -------------      -------------                       -------------
       | X | O |   |        | X | O | X |                    | X | O | X |          | X | O | X |      | X | O | X |                       | X | O | X |
       -------------        -------------  and so on until   -------------           -------------     -------------                       -------------
       |   |   |   |  .->   |   |   |   | ............ ->    | O | X | O  |  ..>    | O | X | 0 |  ..> | X | O | X |  NOW HUMAN WON!  OR   | X | O | X | NOW HUMAN WON!
       -------------        -------------                    -------------          -------------      -------------                       -------------
       |   |   |   |        |   |   |   |                    |   |   |   |          |   | X |   |      | O | X | X |                       | X | X | O |
       -------------        -------------                    -------------          -------------      -------------                       -------------
     
       if human play on cell 9
       ------------         -------------                    -------------          -------------
       | X | O |   |        | X | O | X |                    | X | O | X |          | X | O | X |
       -------------        -------------  and so on until   -------------           -------------
       |   |   |   |  .->   |   |   |   | ............ ->    | O | X | O  |  ..>    | O | X | 0 |  NOW HUMAN WON!
       -------------        -------------                    -------------          -------------
       |   |   |   |        |   |   |   |                    |   |   |   |          |   |   | X |
       -------------        -------------                    -------------          ------------- 
     
     Look at Line 5  
     stand at line 5 , cell [5] now it's the AI Turn so AI can play in cell 6 or 7 or 8 or 9 
     if AI go to cell 6 he will lose, what about cell [7] , [8] , [9]
     so we will calculate the probabilty of AI if he played in cell [7],or [8], or [9], and we will choose the best score for him
     suppose the probabilites for line 6: 
                             for cell[7] is (0) which means  draw
     and         probabilite for cell[8] is (2) which means  win
     and         probabilite for cell[9] is (-2) which means lose 
     so know AI in line 5  cell[5] will be (2),it mean AI will choose to go to cell[8], because AI choose the best for him
     
     I will assume the following probabilites, just to let us understand why we doing this
     
1)AI:                                                                                                                                              [ ]
2)Human:                                                                              (-2)[2]                                                                                                         [3][4][5][6][7][8][9]
3)AI:                                                          (2)[3]                                                                      (0)[4] (0)[5] (-2)[6] (0)[7]  (0)[8]  (-2)[9] 
4)Human:                                      (-2)[4]                                                 (-2)[5] (0)[6] (0)[7] (2)[8] (2)[9]        
5)AI:                            (2)[5]                               (-2)[6] (0)[7] (2)[8] (0)[9]  
6)Human:               (-2)[6]                   (0)[7] (2)[8] (-2)[9]
7)AI:    (-2)[7]       (-2)[8]        (-2)[9]
8)Human:           (-2)[7]  (-2)[9]    
9)AI:              (-2)[9]  (-2)[7]
     so the game state if AI played in cell [0][1] is lose , so that what MiniMax() method does, it returns the game state
     but like we mentioned if AI played in cell[0][1] he will lose , so we have to try another cell , that what FindBestMove() method does.
      */

/////////////////////////////////////////////        CODE        ///////////////////////////////////////////////////////////////////////////

class Move {
    public int row;
    public int column;
}

public class TicTacGame {
  
     public static char[][] board ={{' ',' ',' '},
                                    {' ',' ',' '},
                                    {' ',' ',' '}};
     public static char HUMAN = 'X';
     public static char AI = 'O';
     public static final int WIN_STATE= 2;
     public static final int LOSE_STATE= -2;
     public static final int DRAW_STATE= 1;
     public static final int NOT_FINISHED_STATE= 0;
     public static int depth=10;     
     
     private  static Move FindBestMove()
    {
        int best_value= Integer.MIN_VALUE ; // very large negative number 
        Move bestMove = new Move();
        bestMove.row= -1;  // intialize row and column
        bestMove.column=-1;
        /*  Explantion: 
         suppose that human(x) play in this place,
         the goal is: finding the best place for AI(O) to play. so we will try to play cell [0][1]
         and see the result of game state, then will try to play in cell [0][2] and see the result 
         and so on we will try to play in all cells to see the best result for AI
          -------------     -------------     -------------    -------------
          | X |   |   |     | X | O |   |     | X |   | O |    | X |   |   |
          -------------     -------------     -------------    -------------
          |   |   |   |     |   |   |   |     |   |   |   |    | O |   |   | ..... and so on
          -------------     -------------     -------------    -------------
          |   |   |   |     |   |   |   |     |   |   |   |    |   |   |   |
          -------------     -------------     -------------    -------------
         so we will loop on all the cells , to find first the empty cell,
         when we hit an empty cell we will play in it , and see the best score which means the result of game(win,draw,lose)
         and we will choose the bestScore, this where AI has to play
        */
        for(int i=0 ; i<3 ; i++)
        {
            for(int j=0 ; j<3 ; j++)
            {
                  if(board[i][j]== ' ')
                   {
                      board[i][j]= AI;
                      int move_value = MiniMax(depth,false); // we pass false because AI has been played, so it's humen turn now
                      board[i][j]= ' ';
                      if(move_value > best_value)
                        {
                         // if the last move value is better from our previous best score(best_value) 
                        //  then it's better for AI to play in this cell 
                          bestMove.row= i;    
                          bestMove.column=j;
                          best_value = move_value;
                        }
                    }
            }
        }
        return bestMove;
    }
  
// depth means how many times we will go deeper into the tree which at most 8 depth or 9
     private static int MiniMax(int depth, boolean isAI)
     {
         int game_state = CheckGameState();
         if(game_state != NOT_FINISHED_STATE  || depth==0) // if the game over or we tried 100 iteration so we will stop
             return game_state; 
          if(isAI) //means is that the turn for AI ? 
          {
              int best_score = Integer.MIN_VALUE; //large negative number
              for(int i=0 ; i<3 ; i++)
                {
                    for(int j=0 ; j<3 ; j++)
                      {
                           if(board[i][j]== ' ')
                           {
                               board[i][j]=AI;
                               int score = MiniMax(depth-1,false);// becasue know it's human turn
                                board[i][j]=' '; // becasue we don't want to change our array, we just imagine what will happed if we played in this cell
                                best_score = Integer.max(score, best_score); //back to line 120 in code,  stand at line 5 cell[5] , AI can play in cell [6],[7],[8],[9] , so he will choose the cell that give him the max score
                           }
                      }
                
                }
              return best_score;
          }
          else //means it's the human turn ?
          {
              int best_score = Integer.MAX_VALUE; // large postive number
              for(int i=0 ; i<3 ; i++)
                {
                    for(int j=0 ; j<3 ; j++)
                      {
                           if(board[i][j]== ' ')
                           {
                               board[i][j]=HUMAN;
                               int score = MiniMax(depth-1,true);// becasue know it's AI turn
                                board[i][j]=' '; // becasue we don't want to change our array, we just imagine what will happed if we played in this cell
                                best_score = Integer.min(score, best_score); //back to line 119 in code,  stand at line 4 cell[4] , Human can play in cell [5],[6],[7],[8],[9] , so he will choose the cell that give the AI the min score
                           }
                      }
                    
                }
              return best_score;
          }
     }
     
     private static boolean eqauls(char x, char y, char z)
     {
         return x==y && x==z && x!=' ';
     }
     
     private static int  CheckGameState()
     {
         //check rows
         for(int i=0;i<3;i++)
           { 
              if(eqauls(board[i][0],board[i][1],board[i][2]))
               {
                   if(board[i][0] == AI )
                       return WIN_STATE;
                   else
                       return LOSE_STATE;
               }
           }
         
           //check columns
            for(int i=0;i<3;i++)
             { 
               if(eqauls(board[0][i],board[1][i],board[2][i]))
                 {
                    if(board[0][i] == AI )
                        return WIN_STATE;
                    else
                       return LOSE_STATE;
                }
             }
            // Diagonal 1 
               if(eqauls(board[0][0],board[1][1],board[2][2]))
                  {
                    if(board[0][0] == AI )
                        return WIN_STATE;
                    else
                       return LOSE_STATE;
                 }
               
            // Diagonal 1 
              if(eqauls(board[2][0],board[1][1],board[0][2]))
                 {
                   if(board[2][0] == AI )
                        return WIN_STATE;
                   else
                       return LOSE_STATE;
                }  
              
             // empty cells 
             boolean full = true;
             for(int i=0 ; i<3 ; i++)
             {
                 for(int j=0 ; j<3 ; j++)
                 {
                     if(board[i][j]==' ')
                     {
                         full = false;
                     }
                 }
             }
             
             if(full)
                 return DRAW_STATE;
             
             return NOT_FINISHED_STATE;
     }
        
     public static void tic_tac(int row, int col)
     { int x,y;
        if(CheckGameState()== NOT_FINISHED_STATE) // if game is not finished yet
        {
            x=row;
            y=col; 
            if(board[x][y]==' ')// if the cell empty
            {
                board [x][y]= HUMAN; // human play 
               if(CheckGameState()==NOT_FINISHED_STATE) // after human play we have to make sure that game is not over yet
               {
                    Move best = FindBestMove();  // finding best move for AI to play
                    board[best.row][best.column]= AI; // AI play 
                    player.AI_Move(best.row,best.column); // pass the movement of AI 
               }
          
            }
        }
        if(CheckGameState() !=NOT_FINISHED_STATE) //game is over
        {
              int game_state= CheckGameState();
              if(game_state==WIN_STATE)
               {
                   player.status("Lost");
               }
               else if(game_state == LOSE_STATE)
               {
                  player.status("Win");
               }
               else 
               {
                   player.status("Draw");
               }
               
        }
    
     }
         
    public static void main(String[] args) {
        new Home().setVisible(true);       
    }
                    
}
