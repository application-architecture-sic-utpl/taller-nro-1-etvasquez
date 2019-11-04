package ec.edu.utpl.sic.arqapl;


import ec.edu.utpl.sic.arqapl.metrics.Cosine;
import ec.edu.utpl.sic.arqapl.metrics.Jaccard;
import ec.edu.utpl.sic.arqapl.metrics.JardWinkleDistance;
import ec.edu.utpl.sic.arqapl.metrics.Similaritable;

import java.util.ArrayList;

public class TweetSimilarity {
   // private Similaritable algorithm;
    private ArrayList<Similaritable> Algoritmo = new ArrayList<Similaritable>();

    public TweetSimilarity() {
        //algorithm = new Cosine();
        this.Algoritmo.add(new JardWinkleDistance());
        this.Algoritmo.add(new Jaccard());
        this.Algoritmo.add(new Cosine());
    }

    public double similarity(String tweet1, String tweet2, String tipoAlgoritmo) {
        double valor = 0;
        for(Similaritable algorith : Algoritmo){
            if(tipoAlgoritmo.equals("J")){
                if(algorith instanceof Jaccard){
                    valor = algorith.similarity(tweet1, tweet2);
                }
            }else if(tipoAlgoritmo.equals("C")){
                if(algorith instanceof Cosine){
                    valor = algorith.similarity(tweet1, tweet2);
                }
            }else if(tipoAlgoritmo.equals("W")){
                if(algorith instanceof JardWinkleDistance){
                    valor = algorith.similarity(tweet1, tweet2);
                }
            }
        }
        return valor;
    }
}
