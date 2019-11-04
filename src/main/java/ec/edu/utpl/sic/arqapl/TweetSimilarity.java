package ec.edu.utpl.sic.arqapl;


import ec.edu.utpl.sic.arqapl.metrics.Cosine;
import ec.edu.utpl.sic.arqapl.metrics.Jaccard;
import ec.edu.utpl.sic.arqapl.metrics.JardWinkleDistance;
import ec.edu.utpl.sic.arqapl.metrics.Similaritable;

import java.util.ArrayList;

public class TweetSimilarity {
    private Similaritable algorithm;
    private ArrayList<Similaritable> Algorith;

    public TweetSimilarity() {
        Algorith.add(new Jaccard());
        Algorith.add(new Cosine());
        Algorith.add(new JardWinkleDistance());
    }


    public TweetSimilarity(Similaritable algorithm) {

        this.algorithm = algorithm;
    }

    public double similarity(String tweet1, String tweet2) {

        return algorithm.similarity(tweet1, tweet2);
    }
}
