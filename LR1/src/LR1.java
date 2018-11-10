import java.util.List;

public class LR1 {
    public static void main(String[] args) {

        Lexer lexer = new Lexer();

        List<Token> tokens = lexer.parse("value=189+15/4-1546*92-129");

        System.out.println('\n');
        for (Token token : tokens) {
            System.out.println(token);
        }
    }
}