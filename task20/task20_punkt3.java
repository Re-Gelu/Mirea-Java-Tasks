import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class task20_punkt3 {
    public static void main(String[] args) {
        File dir = new File("D:\\ideaJAVA"); //path указывает на директорию
        File[] arrFiles = dir.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        for (int i = 0; i < 5; i++) {
            System.out.println(lst.get(i));
        }
    }
}
