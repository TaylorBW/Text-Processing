import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import static java.util.Arrays.stream;
import java.util.ArrayList;

/**
 * Average number of words per sentence.
 * @author Dr. Jody Paul and Taylor Woehrle
 * @version 11182016
 */
public class AverageNumberOfWordsPerSentence extends TextMetric<Double> {
    /**
     * Create an AverageNumberOfWordsPerSentence.
    */
    public AverageNumberOfWordsPerSentence() {
        super("Average Number of Words Per Sentence", Double.class);
    }

    /**
     * Determines the average number of words per sentence in the corpus.
     * @param corp the corpus to analyze
     * @return the number of average words per sentence
     */
  @Override
  public Double apply(final Corpus corp) {

      Sentences sentenceObj = new Sentences();
      List<String> sentenceList = sentenceObj.apply(corp);

      ArrayList<Integer> wordsPerSent = new ArrayList<Integer>();
      OptionalDouble average =  sentenceList.stream()
              .mapToLong(string -> stream(string.split("\\W+")).count())
              .average();
      try {
          final double returnAverage = average.getAsDouble();
          return returnAverage;
      } catch (NoSuchElementException e) {
          return 0.0;
      }
  }
}
