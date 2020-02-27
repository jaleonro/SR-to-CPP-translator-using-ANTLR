import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Translate {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from the input
        SRLexer lexer;
        if (args.length>0)
            lexer = new SRLexer(CharStreams.fromFileName(args[0]));
        else
            lexer = new SRLexer(CharStreams.fromStream(System.in));
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        SRParser parser = new SRParser(tokens);
        ParseTree tree = parser.inicio(); // begin parsing at init rule

        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();
        // Walk the tree created during the parse, trigger callbacks
        walker.walk(new ListenerTranslator(), tree);
        System.out.println(); // print a \n after translation
    }
}