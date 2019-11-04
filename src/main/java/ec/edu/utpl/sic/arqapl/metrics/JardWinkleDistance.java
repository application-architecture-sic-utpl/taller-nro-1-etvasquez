package ec.edu.utpl.sic.arqapl.metrics;
import org.apache.commons.text.similarity.JaroWinklerDistance;

public class JardWinkleDistance implements Similaritable {

    @Override
    public double similarity(String text1, String text2) {
        var jaro = new JaroWinklerDistance();
        var similarity = 1.0 - jaro.apply(text1, text2);
        return similarity;
    }
}
