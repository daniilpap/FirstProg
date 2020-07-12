import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double  a = 0,
                b = 0,
                c = 0;
        try {
            System.out.print("введите a ");
            a =Double.valueOf(reader.readLine());
            System.out.print("введите b ");
            b =Double.valueOf(reader.readLine());
            System.out.print("введите c ");
            c =Double.valueOf(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        double result = (b + Math.sqrt(b * b + 4 * a * c))/(2 * a) - Math.pow(a,-3) * c + Math.pow(b,-2);
        System.out.println(result);

    }
}
