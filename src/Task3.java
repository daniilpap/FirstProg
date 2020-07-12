import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.*;

public class Task3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double  y = 0,
                x = 0;

        try {
            System.out.print("введите x ");
            x =Double.valueOf(reader.readLine());
            System.out.print("введите y ");
            y =Double.valueOf(reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
        double result = (sin(x)+cos(y)/(cos(x)-sin(y)))+tan(x*y);
        System.out.println(result);

    }
}
