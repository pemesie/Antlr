grammar csce322a01part02;

@header{
	import java.util.ArrayList;
}

@members{
	boolean bool = true;
	int countMoves = 0;
	int countRows = 0 ;
	int countCharacters = 0;
	int countMaze = 0;
	int countValidMove = 0; 
	int nberOfColumns, countPlayers, countG, countX, countU, countD, countL,countR;
	String[] mazeSymbols;
	ArrayList<String> tempList ;
	ArrayList<String> listMoveSymbols  = new ArrayList<>();;
	ArrayList<ArrayList<String>> listMazeSymbols = new ArrayList<>(); 

	public void checkFirstAndLastRows(ArrayList<ArrayList<String>> list){
		int size = list.size();
		ArrayList<String> firstRow = list.get(0);
		ArrayList<String> lastRow = list.get(size - 1);

		firstRow.forEach( (n) -> { if(!n.equals("x")) 
									System.out.print("The first row of the maze contains symbol(s) other than x. Such as " + n);
								 });
		lastRow.forEach( (n) -> { if(!n.equals("x")) 
									System.out.print("The last row of the maze contains symbol(s) other than x. Such as " + n);
								 });
	}

	public void checkFirstAndLastColumns(ArrayList<ArrayList<String>> list){
		int size = list.get(0).size();
		for(ArrayList<String> e: list){
			if(!e.get(0).equals("x") | !e.get(size - 1).equals("x") )
				System.out.print("The first column or last column of the maze contains symbol(s) other than x. Such as " );
		}
	}

	public void checkMoveAppearances(ArrayList<String> list){
		list.forEach( (n) -> {
							// counting 'u','d','l', and 'r' in the maze
							if(n.equals("u")) countU++;
							if(n.equals("d")) countD++;
							if(n.equals("l")) countL++;
							if(n.equals("r")) countR++;
							}
							);
	}
	public void checkSemanticRules(ArrayList<ArrayList<String>> list){
		int size = list.get(0).size();
		for(ArrayList<String> e: list){
			e.forEach( (n) -> {
							  // counting players
							  try{
							  		int integ = Integer.parseInt(n);
							  		countPlayers++;	
							     }catch(NumberFormatException | NullPointerException nfe){}
							  // counting 'g' in the maze
							  if(n.equals("g")) countG++;
							  // counting 'x' in the maze
							  if(n.equals("x")) countX++;
							  }
			);
		}
	}

	//Every player must have at least one (1) valid move available to them
	public boolean checkPlayerMove(ArrayList<ArrayList<String>> list){
		int i, j;
		boolean bool = true;
		String left, right, up, down;
		int length1 = list.size();
		int length2 = list.get(0).size();
		for(i = 0; i < length1; i++){
			for(j = 0; j < length2; j++){
				if(list.get(i).get(j).equals("1") | list.get(i).get(j).equals("2") | list.get(i).get(j).equals("3") | list.get(i).get(j).equals("4") ){
					left = list.get(i).get(j-1);
					right = list.get(i).get(j+1);
					up = list.get(i-1).get(j);			
					down = list.get(i+1).get(j);

					if(left.equals("x") & right.equals("x") & up.equals("x") & down.equals("x")  ){
						bool = bool & false;
					}
				}
			}
		}

		return bool;			
	}
}

 //  ---------------- tokens ---------------------
SECTIONBEGINNING : '{' ; 
SECTIONENDING : '}' ;  
SECTIONTITLE : 'Moves' | 'Maze' {
					if(getText().equals("Moves")) countMoves++;
					else countMaze++;
					}; 
ASSIGNVALUE : '@' ; 
LISTBEGINNING : '[' ;  
MAZEBEGINNING : '(' ;  
MOVESYMBOLS:  ('u' '_' | 'd' '_' | 'l' '_' | 'r' '_') | ('u' | 'd' | 'l' | 'r');  
MAZESYMBOLS: ('g' | 'x' | '-' | '0'..'9') ;
ROWENDING : '$' ;  
LISTENDING : ']' ;  
MAZEENDING : ')' ; 
WHITESPACE : (' ' | '\t' | '\r' | '\n' | '_'){ skip(); };
ANYTHING : . {
			System.out.println("Something on Line " + getLine() + " is Problematic." );
			System.exit(1);  // ????????????????????? should I exit
			};

// -------------- Parser -------------------

mazeGame: SECTIONBEGINNING section SECTIONENDING SECTIONBEGINNING section SECTIONENDING EOF{

		//check:more than six (6) rows in a valid Maze and more than six (6) columns in a valid Maze 
		if(countRows < 7) {System.out.println("The maze has less than 6 rows. It is " + String.valueOf(countRows)); bool = bool & false; }; 
	    int nbrOfColumns = countCharacters/countRows; 
	    if( nbrOfColumns < 7) {System.out.println("The maze has less than 6 columns. It is " +  nbrOfColumns); bool = bool & false; };
	    if(countValidMove < 4) {System.out.println("The maze has less than 4 moves. It is " + countValidMove); bool = bool & false; };

	    checkFirstAndLastRows(listMazeSymbols);
	    checkFirstAndLastColumns(listMazeSymbols);
	    
	    //Check semantic rules
	    checkSemanticRules(listMazeSymbols);
	    if(countPlayers < 1 | countPlayers > 4) {System.out.println("Semantic Violation: Rule 1"); bool = bool & false; };
	    if(countG != 1) {System.out.println("Semantic Violation: Rule 2"); bool = bool & false; };
	    if(countX > countCharacters/2) {System.out.println("Semantic Violation: Rule 3"); bool = bool & false; };

	    checkMoveAppearances(listMoveSymbols);
	    if(countU == 0 | countD == 0 | countL == 0 | countR == 0) {System.out.println("Semantic Violation: Rule 4"); bool = bool & false; };

	    if(!checkPlayerMove(listMazeSymbols)) {System.out.println("Semantic Violation: Rule 5");  bool = bool & false; };

	    if(bool) System.out.println("There are " +  countPlayers + " players.");
    };
section: SECTIONTITLE ASSIGNVALUE begin symbols end;
begin : LISTBEGINNING | MAZEBEGINNING;								
symbols : validMove | ((row  ROWENDING symbols) | row);
validMove : (b = MOVESYMBOLS { countValidMove++; String temp = $b.text;
							   if(temp.length() < 2){ listMoveSymbols.add(temp);} 
							   else {String[] characters = new String[2]; characters = temp.split(""); listMoveSymbols.add(characters[0]);} })* ;

row @after{ listMazeSymbols.add(tempList); }:
											 { tempList  = new ArrayList<>();} ( a = MAZESYMBOLS {countCharacters++; tempList.add(String.valueOf($a.text)); })* {countRows++;  };
end: LISTENDING | MAZEENDING;



// 

