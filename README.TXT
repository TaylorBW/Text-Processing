Demonstrations of stream-based text processing in Java 8.
Includes partially-implemented classes for student assignment.
Update the following classes that implement TextMetric in the provided Text-Processing Source Code (w/lambdas) so that their apply methods work as intended:
NumberOfWords
NumberOfUniqueWords
AverageNumberOfWordsPerSentence
The source code you write
must use stream and lambda constructs;
must not include any of the following explicit control structures: if, for, while, switch;
must not include use of the division or modulo operators: /, %
may use the Sentences TextMetric to acquire the list of sentences from a corpus;
must return a Double with value 0 if the parameter is null or the corpus is empty.
(When testing, recall that "\W+" is the pattern used for splitting a string into words. For example, the string "wasn't" is comprised of the two words "wasn" and "t".)
For this assignment:
Submit three files, named NumberOfWords.java, NumberOfUniqueWords.java and AverageNumberOfWordsPerSentence.java 
Use Online text for your reflection and to answer the question: "What changes would be required to your source code to return the maximum or minimum instead of the average number of words per sentence?"