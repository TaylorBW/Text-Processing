import static java.util.Arrays.stream;
/**
 * Text metric that determines the number of words.
 *
 * @author Dr. Jody Paul and Taylor Woehrle
 * @version 11182016
 */
public class NumberOfWords extends TextMetric<Long> {
    /**
     * Create an NumberOfWords.
    */
    public NumberOfWords() {
        super("Number of Words", Long.class);
    }

    /**
     * Determines the number of words in the corpus.
     * @param corp the corpus to analyze
     * @return the number of words
     */
    @Override
    public Long apply(final Corpus corp) {
            return corp.texts().stream()
                .map(blob -> blob.text())
                .flatMap(string -> stream(string.split("\\W+")))
                .count();
    }
}
