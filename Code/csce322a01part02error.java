import java.io.IOException;
import org.antlr.v4.runtime.*;

class csce322a01part02error extends BaseErrorListener{
    @Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
				int position, String msg, RecognitionException e) {
	// replace with code to process syntax errors
	System.out.println( "Something on Line " + line + " is Problematic.");
	System.err.println( msg );
	System.exit(1);
    }	
}
//mutual of omaha
//dmsi
//linkedin
//jaya Company