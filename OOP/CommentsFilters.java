package java_basics.OOP;


import java.util.Arrays;

enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

interface TextAnalyzer {
    Label processText(String text); // to filter to long and negative comments
}

abstract class KeywordAnalyser implements TextAnalyzer {
    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
        return Arrays.stream(this.getKeywords()).anyMatch(text::contains) ? this.getLabel() : Label.OK;
    }

}

public class CommentsFilters {
    Label checkLabels(TextAnalyzer[] filters, String comment) {
        for (TextAnalyzer ta : filters) {
            Label filterRes = ta.processText(comment);
            if (filterRes != Label.OK) {
                return filterRes;
            }
        }
        return Label.OK;
    }
}

class SpamAnalyzer extends KeywordAnalyser {
    private final String[] keywords;


    public SpamAnalyzer(String[] stopKeywords) {
        keywords = stopKeywords;
    }

    @Override
    protected String[] getKeywords() {
        return this.keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}

class NegativeTextAnalyzer extends KeywordAnalyser {

    @Override
    protected String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}

class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength;

    @Override
    public Label processText(String text) {
        return text.length() > this.maxLength ? Label.TOO_LONG : Label.OK;
    }

    public TooLongTextAnalyzer(int maxCommentLen) {
        maxLength = maxCommentLen;
    }

}


class TestComments {

    // тесты
    public static void main(String[] args) {
        // инициализация анализаторов для проверки в порядке данного набора анализаторов
        String[] spamKeywords = {"spam", "bad"};
        int commentMaxLength = 40;
        TextAnalyzer[] textAnalyzers1 = {new SpamAnalyzer(spamKeywords), new NegativeTextAnalyzer(), new TooLongTextAnalyzer(commentMaxLength)};
        TextAnalyzer[] textAnalyzers2 = {new SpamAnalyzer(spamKeywords), new TooLongTextAnalyzer(commentMaxLength), new NegativeTextAnalyzer()};
        TextAnalyzer[] textAnalyzers3 = {new TooLongTextAnalyzer(commentMaxLength), new SpamAnalyzer(spamKeywords), new NegativeTextAnalyzer()};
        TextAnalyzer[] textAnalyzers4 = {new TooLongTextAnalyzer(commentMaxLength), new NegativeTextAnalyzer(), new SpamAnalyzer(spamKeywords)};
        TextAnalyzer[] textAnalyzers5 = {new NegativeTextAnalyzer(), new SpamAnalyzer(spamKeywords), new TooLongTextAnalyzer(commentMaxLength)};
        TextAnalyzer[] textAnalyzers6 = {new NegativeTextAnalyzer(), new TooLongTextAnalyzer(commentMaxLength), new SpamAnalyzer(spamKeywords)};
        // тестовые комментарии
        String[] tests = new String[8];
        tests[0] = "This comment is so good.";                            // OK
        tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
        tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";    // NEGATIVE_TEXT or TOO_LONG
        tests[4] = "This comment is so bad....";                          // SPAM
        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
        tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
        tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG
        TextAnalyzer[][] textAnalyzers = {textAnalyzers1, textAnalyzers2, textAnalyzers3, textAnalyzers4, textAnalyzers5, textAnalyzers6};
        CommentsFilters testObject = new CommentsFilters();
        int numberOfAnalyzer; // номер анализатора, указанный в идентификаторе textAnalyzers{№}
        int numberOfTest = 0; // номер теста, который соответствует индексу тестовых комментариев
        for (String test : tests) {
            numberOfAnalyzer = 1;
            System.out.print("test #" + numberOfTest + ": ");
            System.out.println(test);
            for (TextAnalyzer[] analyzers : textAnalyzers) {
                System.out.print(numberOfAnalyzer + ": ");
                System.out.println(testObject.checkLabels(analyzers, test));
                numberOfAnalyzer++;
            }
            numberOfTest++;
        }
    }
}
