grammar csce322a01part01;


// rules

 //  tokens
SECTIONBEGINNING : '{' {
					System.out.println("Section Beginning: " + getText()); };
SECTIONENDING : '}' {
					 System.out.println("Section Ending: " + getText()); };
SECTIONTITLE : ('Moves' | 'Maze') {
					System.out.println("Section Title: "  + getText()); }; 
ASSIGNVALUE : '@' {
					System.out.println("Assign Value: "  + getText()); }; 
LISTBEGINNING : '[' {
					System.out.println("List Beginning: "  + getText()); }; 
MAZEBEGINNING : '(' {
					System.out.println("Maze Beginning: "  + getText() );} ; 
MOVESYMBOLS:  ('u' | 'd' | 'l' | 'r') {
					System.out.println("Move Symbol: "  + getText()); }; 
MAZESYMBOLS: ('g' | 'x' | '-' | '0'..'9')[$]? {
					String temp = getText();
					if(temp.length() < 2){
						System.out.println("Maze Symbol: "  + temp);
					}
					else{
						String[] characters = new String[2];
						characters = temp.split("");
						System.out.println("Maze Symbol: "  + characters[0]);
						System.out.println("Row Ending: "  + characters[1]);
					}					
					};
LISTENDING : ']' {System.out.println("List Ending: "  + getText());} ; 
MAZEENDING : ')' {System.out.println("Maze Ending: "  + getText());} ;
WHITESPACE : (' ' | '\t' | '\r' | '\n' | '_'){ skip(); };
ANYTHING : . {
			System.out.println("Something on Line " + getLine() + " is Unrecognized." );
			System.exit(1); 
			};

//  ----------------- Parser ----------------------------
mazeGame: contains {System.out.println("File Ending");} EOF;
contains : SECTIONBEGINNING section SECTIONENDING SECTIONBEGINNING section SECTIONENDING ;
section : SECTIONTITLE ASSIGNVALUE begin symbols;
begin : LISTBEGINNING | MAZEBEGINNING;
									
symbols : MOVESYMBOLS* end | MAZESYMBOLS* end;
end: LISTENDING | MAZEENDING;

