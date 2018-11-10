/*
import java.util.*;

public class tr {
        Map<String, Integer> tableOfVariables = new HashMap<>();


        private List<Token> tokens = new ArrayList<>();
        private int position = 0;
        boolean lang(List<Token> tokens) {
            boolean lang = false;
            for (Token token : tokens) {
                if (token.getLexeme() != Lexeme.WS) {
                    this.tokens.add(token);
                }
            }
            while (this.tokens.size() != position) {
                if (!expression()) {
                    System.err.println("Error: ErrorSyntax in position: " + position);
                    System.exit(4);
                } else {
                    lang = true;
                }
            }



            return lang;
        }

        private boolean expression() {
            boolean expression = false;

            if (init() || assign() || forLoop()) {
                expression = true;
            }
            return expression;
        }

        private boolean init() {
            boolean init = false;
            int zip = position;

            if (getCurrentTokenLexemeInc() == Lexeme.TYPE) {
                if (assignOp()) {
                    if (getCurrentTokenLexemeInc() == Lexeme.SEMICOLON) {
                        init = true;
                    }
                }
            }
            position = init ? position : zip;
            return init;
        }


        private boolean assign() {
            boolean assign = false;
            int zip = position;

            if (assignOp()) {
                if (getCurrentTokenLexemeInc() == Lexeme.SEMICOLON) {
                    assign = true;
                }
            }
            position = assign ? position : zip;
            return assign;
        }

        private boolean assignOp() {
            boolean assignOp = false;
            int zip = position;
            boolean add = false;
            String var = null;

            if (getCurrentTokenLexemeInc() == Lexeme.VAR) {
                var = getLastTokenValue();
                if (getCurrentTokenLexemeInc() == Lexeme.ASSIGN_OP) {
                    if (value()) {
                        assignOp = true;
                        tableOfVariables.put(var, 0);
                    }
                }
            }
            position = assignOp ? position : zip;
            return assignOp;
        }

        private boolean value() {
            boolean value = false;

            if (val()) {
                while (OPval()) {
                }
                value = true;
            }
            return value;
        }

        private boolean OPval() {
            boolean OPval = false;
            int zip = position;

            if (getCurrentTokenLexemeInc() == Lexeme.ARITHMETIC_OP) {
                //
                String arthOp = getLastTokenValue();

                if (val()) {
                    OPval = true;
                }
            }
            position = OPval ? position : zip;
            return OPval;
        }

        private boolean val() {
            boolean val = false;

            if (getCurrentTokenLexemeInc() == Lexeme.VAR) {
                tokensRPN.add(getLastTokenValue());
                if (!tableOfVariables.containsKey(getLastTokenValue())) {
                    System.err.println("Error: Variety " + getLastTokenValue() + " not initialize");
                    System.exit(6);
                }
                return true;
            } else {
                position--;
            }
            if (getCurrentTokenLexemeInc() == Lexeme.DIGIT) {
                tokensRPN.add(getLastTokenValue());
                return true;
            } else {
                position--;
            }
            if (breakValue()) {
                return true;
            }
            return val;
        }

        private boolean breakValue() {
            boolean breakValue = false;
            int zip = position;

            if (getCurrentTokenLexemeInc() == Lexeme.PARENTHESIS_LEFT) {
                if (value()) {
                    if (getCurrentTokenLexemeInc() == Lexeme.PARENTHESIS_RIGHT) {
                        breakValue = true;
                    }
                }
            }
            position = breakValue ? position : zip;
            return breakValue;
        }

        private boolean forLoop() {
            boolean forLoop = false;
            int zip = position;

            if (getCurrentTokenLexemeInc() == Lexeme.FOR) {
                if (forExprs()) {
                    if (forBody()) {
                        forLoop = true;
                    }
                }
            }
            position = forLoop ? position : zip;
            return forLoop;
        }

        private boolean forBody() {
            boolean forBody = false;
            int zip = position;

            if (getCurrentTokenLexemeInc() == Lexeme.BRACE_LEFT) {
                while (forBodyBrace()) {
                }
                if (getCurrentTokenLexemeInc() == Lexeme.BRACE_RIGHT) {
                    forBody = true;
                }
            }
            position = forBody ? position : zip;
            return forBody;
        }

        private boolean forBodyBrace() {
            boolean forBodyBrace = false;

            if (init() || assign()) {
                forBodyBrace = true;
            }
            return forBodyBrace;
        }

        private boolean forExprs() {
            boolean forExprs = false;
            int zip = position;

            if (getCurrentTokenLexemeInc() == Lexeme.PARENTHESIS_LEFT) {
                if (startExpr()) {
                    if (logExpr()) {
                        if (assignOp()) {
                            if (getCurrentTokenLexemeInc() == Lexeme.PARENTHESIS_RIGHT) {
                                forExprs = true;
                            }
                        }
                    }
                }
            }
            position = forExprs ? position : zip;
            return forExprs;
        }

        private boolean logExpr() {
            boolean logExpr = false;
            int zip = position;
            if (assignOp() || value()) {
                if (getCurrentTokenLexemeInc() == Lexeme.LOGIC_OP) {
                    String LogicOp = getLastTokenValue();
                    if (assignOp() || value()) {
                        if (getCurrentTokenLexemeInc() == Lexeme.SEMICOLON) {
                            logExpr = true;
                        }
                    }
                }
            }
            position = logExpr ? position : zip;
            return logExpr;
        }

        private boolean startExpr() {
            boolean startExpr = false;

            if (init() || assign()) {
                startExpr = true;
            }
            return startExpr;
        }

        private Lexeme getCurrentTokenLexemeInc() {
            try {
                return tokens.get(position++).getLexeme();
            } catch (IndexOutOfBoundsException ex) {
                System.err.println("Error: Lexeme \"" + Lexeme.TYPE + "\" expected");
                System.exit(3);
            }
            return null;
        }
    }
}
*/
