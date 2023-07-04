package az.ingress.msscheduler.service.card;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author caci
 */

@Service
@RequiredArgsConstructor
public class CardValidationImpl {

    public static boolean validateCard(String pan) {

        int length = pan.length();

        int nSum = 0;
        boolean isSecond = false;
        for (int i = length - 1; i >= 0; i--)
        {
            int d = pan.charAt(i) - '0';

            if (isSecond)
                d = d * 2;

            nSum += d / 10;
            nSum += d % 10;

            isSecond = !isSecond;
        }
        return (nSum % 10 == 0);
    }

}
