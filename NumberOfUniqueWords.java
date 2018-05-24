import static java.util.Arrays.stream;

/**
 * Number of unique words.
 * @author Dr. Jody Paul and Taylor Woehrle
 * @version 11182016
 */

public class NumberOfUniqueWords extends TextMetric<Long> {
    /**
     * Create an NumberOfUniqueWords.
    */
    public NumberOfUniqueWords() {
        super("Number of Unique Words", Long.class);
    }

     /**
     * Determines the number of unique words in the corpus.
     * @param corp the corpus to analyze
     * @return the number of unique words
     */
    @Override
    public Long apply(final Corpus corp) {
        // Implement using lambda/stream processing.
        return (Long) corp.texts().stream()
                .map(blob -> blob.text())
                .flatMap(string -> stream(string.split("\\W+")))
                .distinct()
                .count();
    }
}
