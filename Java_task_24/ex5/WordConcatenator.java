package Java_task_24.ex5;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordConcatenator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        StringBuilder s = new StringBuilder();
        try(FileReader fr = new FileReader(path)){
            int c;
            while((c=fr.read())!=-1){
                s.append((char) c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(getLine(s.toString()));
    }

    private static String  getLine(String s) {
        Queue<String> toAdd = new ArrayDeque<>(Arrays.asList(s.split(" ")));
        Set<String> added = new HashSet<>();
        added.add(toAdd.peek());
        StringBuilder sb = new StringBuilder(toAdd.remove());
        boolean wasAdded = true;

        while(!toAdd.isEmpty() && wasAdded){
            wasAdded = false;
            int i = 0;
            for (; i < toAdd.size(); i++) {
                String cur = toAdd.remove();
                if(added.contains(cur)) continue;
                if(cur.startsWith(sb.substring(sb.length()-1).toLowerCase()) ||
                    cur.startsWith(sb.substring(sb.length()-1).toUpperCase())){
                    sb.append(" ").append(cur);
                    wasAdded = true;
                    added.add(cur);
                    break;
                }
                toAdd.add(cur);
            }
            for(; i< toAdd.size(); i++){
                String cur = toAdd.remove();
                if(added.contains(cur)) continue;
                toAdd.add(cur);
            }
        }
        return sb.toString();
    }
}
