import java.util.Random;

public class Computer extends Player{

    public int  makeMove(char c , char a){
	
	int number=0; 

	if(winningMove(a) > 0 ){
	    number= winningMove(a);
	}
	else if(blockMove(c,a) >0 ){
	    number= blockMove(c,a); 
	}
	else if(middleMove(a)){
	    number= 5; 
	}
	else{
	    number=randomMove(a);
	 }
	return number; 
    }

    public boolean middleMove(char c){
	boolean flag = false;
	if(board[1][1]=='\u0000'){
	    board[1][1]= c;
	    flag= true;
	}
	else{
	    flag= false;
	}
	return flag;
    }
    
    public int randomMove(char c ){

	Random random= new Random();                                                                          
	int counter=0;

	if(board[0][0]=='\u0000')
	    counter++;
	if(board[0][1]=='\u0000')
	    counter++;
	if(board[0][2]=='\u0000')
	    counter++;
	if(board[1][0]=='\u0000')
	    counter++;
	if(board[1][1]=='\u0000')
	    counter++;
	if(board[1][2]=='\u0000')                                                                           	        counter++;
	if(board[2][0]=='\u0000')
	    counter++;
	if(board[2][1]=='\u0000')                                                                           	        counter++;
	if(board[2][2]=='\u0000')
	    counter++;

	int number= random.nextInt(counter + 1);
	
	while(number==0 || !isAvailable(number))									  number=random.nextInt(counter+1); 													
	return number; 
    }

public int winningMove(char c ){
    int number=0; 
	//horizontal possible wins
	//row1  
	if(board[0][0] == c && board[0][1]== c && isAvailable(3) ){
	    //changeBoard(3,c);
	    number=3; 
	}	
	else if(board[0][0] == c && board[0][2]== c && isAvailable(2)){
	    //changeBoard(2,c);
	    number=2;  
	}
	else if(board[0][2] == c && board[0][1]== c && isAvailable(1) ){
	    //changeBoard(1,c);
	    number=1; 
	}
	//row2
	else if(board[1][0] == c && board[1][1]== c && isAvailable(6) ){
	    //changeBoard(6,c);
	    number=6; 
	}
	else if(board[1][1] == c && board[1][2]== c && isAvailable(4) ){
	    //changeBoard(4,c);
	    number=4; 
	}
	else if(board[1][0] == c && board[1][2]== c && isAvailable(5) ){
	    //changeBoard(5,c);
	    number=5; 
	}
	//row3
 	else if(board[2][0] == c && board[2][1]== c && isAvailable(9) ){
	    //changeBoard(9,c);
	    number=9; 
	}
	else if(board[2][1] == c && board[2][2]== c  && isAvailable(7) ){
	    //changeBoard(7,c);
	    number=7; 
	}
	else if(board[2][0] == c && board[2][2]== c  && isAvailable(8) ){
	    //changeBoard(8,c);
	    number=8; 
	}
	//vertical possible wins 
	else if(board[0][0] == c && board[1][0]== c && isAvailable(7) ){
	    //changeBoard(7,c);
	    number=7; 
	}
	else if(board[0][0] == c && board[2][0]== c  && isAvailable(4) ){
	    //changeBoard(4,c);
	     number=4; 
	}
	else if(board[1][0] == c && board[2][0]== c  && isAvailable(1)){
	    //changeBoard(1,c);
	    number=1; 
	}
	//line 2
	else if(board[0][1] == c && board[1][1]== c  && isAvailable(8) ){
	    //changeBoard(8,c);
	    number=8; 
	}
	else if(board[1][1] == c && board[2][1]== c  && isAvailable(2) ){
	    //changeBoard(2,c);
	    number=2;  
	}
	else if(board[0][1] == c && board[2][1]== c  && isAvailable(5) ){
	    //changeBoard(5,c);
	    number=5;  
	}
	//line 3
	else if(board[0][2] == c && board[1][2]== c  && isAvailable(9) ){
	    //changeBoard(9,c);
	    number=9;  
	 }
	else if(board[0][2] == c && board[2][2]== c  && isAvailable(6) ){
	    //changeBoard(6,c);
	    number=6;  
	}
	else if(board[1][2] == c && board[2][2]== c  && isAvailable(3) ){
	    //changeBoard(3,c);
	    number=3;  
	}
	//diagonal possible wins
	//right line 
	else if(board[0][0] == c && board[1][1]== c && isAvailable(9) ){
	    //changeBoard(9,c);
	   number=9; 
	}
	else if(board[0][0] == c && board[2][2]== c && isAvailable(5) ){
	    //changeBoard(5,c);
	    number=5; 
	}
	else if(board[2][2] == c && board[1][1]== c && isAvailable(1) ){
	    //changeBoard(1,c);
	    number=1; 
	}
	//left line 
	else if(board[0][2] == c && board[1][1]== c && isAvailable(7) ){
	    //changeBoard(7,c);
	    number=7; 
	}
	else if(board[0][2] == c && board[2][0]== c && isAvailable(5) ){
	    //changeBoard(5,c);
	    number=5; 
	}
	else if(board[1][1] == c && board[2][2]== c && isAvailable(1) ){
	    //changeBoard(1,c);
	    number=1; 
	}

	return number; 
    }

    public int blockMove(char c, char a ){
	int number=0; 
	//horizontal possible wins of oppnoent 
	//row1  
	if(board[0][0] == c && board[0][1]== c && isAvailable(3) ){
	    //changeBoard(3,a);
	    number=3; 
	}	
	else if(board[0][0] == c && board[0][2]== c && isAvailable(2)){
	    //changeBoard(2,a);
	    number=2; 
	}
	else if(board[0][2] == c && board[0][1]== c && isAvailable(1) ){
	    //changeBoard(1,a);
	    number=1;
	}
	//row2
	else if(board[1][0] == c && board[1][1]== c && isAvailable(6) ){
	    //changeBoard(6,a);
	    number=6;
	}
	else if(board[1][1] == c && board[1][2]== c && isAvailable(4) ){
	    //changeBoard(4,a);
	    number=4; 
	}
	else if(board[1][0] == c && board[1][2]== c && isAvailable(5) ){
	    //changeBoard(5,a);
	    number=5;
	}
	//row3
 	else if(board[2][0] == c && board[2][1]== c && isAvailable(9) ){
	    //changeBoard(9,a);
	    number=9; 
	}
	else if(board[2][1] == c && board[2][2]== c  && isAvailable(7) ){
	    //changeBoard(7,a);
	    number=7;
	}
	else if(board[2][0] == c && board[2][2]== c  && isAvailable(8) ){
	    //changeBoard(8,a);
	    number=8; 
	}
	//vertical possible wins 
	else if(board[0][0] == c && board[1][0]== c && isAvailable(7) ){
	    //changeBoard(7,a);
	    number=7; 
	}
	else if(board[0][0] == c && board[2][0]== c  && isAvailable(4) ){
	    //changeBoard(4,a);
	     number=4;
	}
	else if(board[1][0] == c && board[2][0]== c  && isAvailable(1)){
	    //changeBoard(1,a);
	    number=1; 
	}
	//line 2
	else if(board[0][1] == c && board[1][1]== c  && isAvailable(8) ){
	    //changeBoard(8,a);
	    number=8; 
	}
	else if(board[1][1] == c && board[2][1]== c  && isAvailable(2) ){
	    //changeBoard(2,a);
	    number=2;
	}
	else if(board[0][1] == c && board[2][1]== c  && isAvailable(5) ){
	    //changeBoard(5,a);
	    number=5; 
	}
	//line 3
	else if(board[0][2] == c && board[1][2]== c  && isAvailable(9) ){
	    //changeBoard(9,a);
	    number=9; 
	 }
	else if(board[0][2] == c && board[2][2]== c  && isAvailable(6) ){
	    //changeBoard(6,a);
	    number=6; 
	}
	else if(board[1][2] == c && board[2][2]== c  && isAvailable(3) ){
	    //changeBoard(3,a);
	    number=3; 
	}

	//diagonal possible wins of oppnonent 
	//right line 
	else if(board[0][0] == c && board[1][1]== c && isAvailable(9) ){
	    //changeBoard(9,a);
	   number=9; 
	}
	else if(board[0][0] == c && board[2][2]== c && isAvailable(5) ){
	    //changeBoard(5,a);
	    number=5; 
	}
	else if(board[2][2] == c && board[1][1]== c && isAvailable(1) ){
	    //changeBoard(1,a);
	    number=1; 
	}
	//left line 
	else if(board[0][2] == c && board[1][1]== c && isAvailable(7) ){
	    //changeBoard(7,a);
	    number=7;
	}
	else if(board[0][2] == c && board[2][0]== c && isAvailable(5) ){
	    //changeBoard(5,a);
	    number=5; 
	}
	else if(board[1][1] == c && board[2][2]== c && isAvailable(1) ){
	    //changeBoard(1,a);
	    number=1; 
	}

	return number; 
    }
    
}
