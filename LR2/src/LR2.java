
import java.util.List;

public class LR2 {
    public static void main(String[] args) {

        Lexer lexer = new Lexer();
        Pars parser = new Pars();
        String input = "int a=0; int b=5; if(a<=b){a=(a+b);} else{b=b+a;}";
        List<Token> tokens = lexer.parse(input);

        System.out.println();
        for (Token token : tokens) {
            System.out.println(token);
        }
        System.out.println();
        System.out.println("[ " + input + " ]");
        System.out.println();
        System.out.println(parser.lang(tokens));
    }

}


