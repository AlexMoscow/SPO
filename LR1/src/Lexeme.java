import java.util.regex.Pattern;

public enum Lexeme {
    VAR(Pattern.compile("^[a-z]+$")),
    ASSIGN_OP(Pattern.compile("^=$")),
    DIGIT(Pattern.compile("^0|[1-9][0-9]*")),
    OP(Pattern.compile("^\\+|\\-|\\*|\\/$")),
    WS(Pattern.compile("^\\s+"));

    private Pattern pattern;

    Lexeme(Pattern pattern) {
        this.pattern = pattern;
    }

    public Pattern getPattern() {
        return pattern;
    }
}