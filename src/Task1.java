import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
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
        double result = ( ( a - 3 ) * b / 2) + c;
        System.out.println(result);

    }


}
