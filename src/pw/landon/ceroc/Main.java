package pw.landon.ceroc;

public class Main {

    public static void main(String[] args) {

        int B = 89;
        StringBuilder pass = new StringBuilder();

        for (int step=1; step<5; step++) {

            if (B<90) {
                pass.append((char)B);
                B = B+5;
            } else if (B>=90) {
                B = B-15;
            }


        }
        System.out.println(pass);
    }
}
