package ec.edu.utpl.sic.arqapl.tests;

import ec.edu.utpl.sic.arqapl.TweetSimilarity;
import static org.junit.Assert.*;

import ec.edu.utpl.sic.arqapl.metrics.Cosine;
import ec.edu.utpl.sic.arqapl.metrics.JardWinkleDistance;
import ec.edu.utpl.sic.arqapl.metrics.Similaritable;
import org.junit.Test;

public class TweetSimilarityTest {
    public TweetSimilarityTest(){
    }

    @Test
    public void similar() {
        var tweet1 = "Hola mundo";
        var tweet2 = "Hola mundo";
        String tipoAlgoritmo = "W";
        TweetSimilarity ts = new TweetSimilarity();
            assertEquals(1.0,
                ts.similarity(tweet1, tweet2,tipoAlgoritmo), 0.1);

    }
}
