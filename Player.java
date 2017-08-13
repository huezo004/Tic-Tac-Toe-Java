class Player{

    static final int _SIZE=3; 

    protected char [][] board;

    protected int rounds; 

    public Player(){
	board = new char[_SIZE][_SIZE];
	rounds=0; 
    }

    public int  returnRounds(){
	return rounds;	
    }
    
    public void increseRounds(){
	rounds++; 
    }

    public boolean isAvailable(int a ){
	boolean flag= false;
	
	if(a==1){
	    if(board[0][0]== '\u0000'){
	      flag= true;
	    }
	    else{
		flag= false;
	    }	    
	}
	else if(a==2){
	    if(board[0][1]== '\u0000'){
	      flag= true;
	    }
	    else{
		flag= false;
	    }
	}
	else if(a== 3){
	    if(board[0][2]=='\u0000'){
		flag= true;
	    }
	    else{
		flag= false;
	    }
	} 	
	else if(a== 4){
	    if(board[1][0]== '\u0000'){
	     flag= true;
	    }
	    else{
		flag= false;
	    }
	 }
        else if(a== 5){
	    if(board[1][1]=='\u0000'){
	       flag= true;
	    }
	    else{
		flag= false;
	    }
	}
       else if(a== 6){
	   if(board[1][2]== '\u0000'){
	    flag= true;
	   }
	   else {
	       flag= false;
	   }
	}
	else if(a== 7){
	    if(board[2][0]== '\u0000'){
	     flag= true;
	    }
	    else{
		flag= false;

	    }
	}
	else if(a== 8){
	    if(board[2][1]== '\u0000'){
            flag= true;
	    }
	    else{
		flag= false;
	    }
	}
	else if(a== 9){
	    if(board[2][2]== '\u0000'){
              flag= true;
	    }
	    else{
		flag= false;
	    }
	}
      	
	return flag; 
    }

    
    public boolean checkWinner(char c){
	boolean winner=false;
	//horizontal wins 
	if(board[0][0] == c && board[0][1]== c && board[0][2]==c)
	    winner= true; 
	if(board[1][0] == c && board[1][1]== c && board[1][2]==c)
	      winner= true;
	if(board[2][0] == c && board[2][1]== c  && board[2][2]==c)
	    winner= true;
	//vertical wins 
        if(board[0][0] == c && board[1][0]== c && board[2][0]==c)
	    winner= true; 
        if(board[0][1] == c && board[1][1]== c && board[2][1]==c)
	      winner= true;
	if(board[0][2] == c && board[1][2]== c  && board[2][2]==c)
	    winner= true;
	//diagonal wins
	if(board[0][0] == c && board[1][1]== c && board[2][2]==c)
	      winner= true;
	if(board[0][2] == c && board[1][1]== c  && board[2][0]==c)
	    winner= true;
	
	return winner; 
    }

   public boolean isaTie(){
     boolean tie= false;
     if(board[0][0]!= '\u0000' && board[0][1]!= '\u0000' && board[0][2]!= '\u0000' && board[1][0]!= '\u0000' && board[1][1]!= '\u0000' && board[1][2]!= '\u0000' && board[2][0]!= '\u0000' &&board[2][1]!= '\u0000' && board[2][2]!= '\u0000')
	tie=  true;
	return tie; 
    }
    public void changeBoard(int a, char c){      
 	if(a==1)
	   board[0][0]= c;
	else if (a== 2)
	    board[0][1]= c;
	else if (a== 3)
	    board[0][2]= c;
	else if (a== 4)
	    board[1][0]= c;
	else if (a== 5)
	    board[1][1]= c;
	else if (a== 6)
	    board[1][2]= c;
	else if (a== 7)
	    board[2][0]= c;
	else if (a== 8)
	    board[2][1]= c;
	else if (a== 9)
	    board[2][2]= c;		
    }

    public void printBoard(){

	System.out.println("FSU");
	System.out.println("------------");
	for(int i=0; i< _SIZE; i++){
	    System.out.print("| ");
	    for(int j=0; j<_SIZE; j++){
	        System.out.print(board[i][j] + " | ");
	  }
	System.out.println();
	System.out.println("------------");	
	
       
	}

	System.out.println("By: Denyse Huezo ");	
    }
public static void main(String [] args)
{
    /*   Player p1= new Player(); 

    boolean available =false;
    
    Player p2 = new Player();
    p2.changeBoard(1, 'O');
    p1.changeBoard(1, 'O');
    p2.changeBoard(2, 'O');
    p1.changeBoard(2, 'O');
    p1.blockMove('O', 'X');
    p1.middleMove('X');
    p1.printBoard();
    
    p1.changeBoard(4, 'X');
   
   
    boolean v= p1.winningMove('X');
    p1.printBoard();
    
    available = p1.isAvailable(9);
    boolean aavailable = p1.isAvailable(4);
	
    if(available){
    System.out.println("9 available");
    }
    else{
    System.out.println("9 not available");
    }

    if(aavailable){
    System.out.println("4 available");
    }
    else{
    System.out.println("4 not available");
    }
    if(p1.checkWinner('X'))
	System.out.println("WINNER"); 
    */ 
}

}//end of Player class 
