package mockito;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RemoteFXRateService {

    public String getRate(String source, String target) {
        target = BigDecimal.valueOf(Long.parseLong(source)).toString();
        return target;
    }
}
