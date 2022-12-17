package task25;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task25 {
    public boolean proverka(String s) {
        String ip = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)(\\.(?!$)|$)){4}$";
        return Pattern.matches(ip, s);
    }

    public String proverka2(String s) {
        //String str = "^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$";
        String reg = "\\(";
        String obreg = "\\)";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern .matcher(s);
        Pattern pattern2 = Pattern.compile(obreg);
        Matcher matcher2 = pattern2.matcher(s);

        int g = 0;
        int g2 = 0;
        while (matcher.find()){
            g = g + 1;
        }
        while (matcher2.find()){
            g2 = g2 + 1;
        }
        if (g2 == g) {
            return "Одинаково, значит правильный формат";
        }
        else {
            return "Неправильный формат";
        }
    }


    public static void main(String[] args) {
        task25 task = new task25();
        String s1 = "555.23.123.22";
        String s2 = "192.168.8.1";
        String s3 = "5.123.123.342";
        String s4 = "5.123.123.42";
        System.out.println(task.proverka(s1));
        System.out.println(task.proverka(s2));
        System.out.println(task.proverka(s3));
        System.out.println(task.proverka(s4));

        String slap = "Hello, (test, * 3 and n)o";
        String slap2 = "((((Hello, ()test, * 3 a)))nd n)o";
        String slap3 = "Hello, (tes(t, * 3 and n)o";

        System.out.println(task.proverka2(slap) + " " + slap);
        System.out.println(task.proverka2(slap2) + " " + slap2);
        System.out.println(task.proverka2(slap3) + " " + slap3);

    }
}
