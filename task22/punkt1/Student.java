package task22.punkt1;

import java.util.ArrayList;

public class Student {
    private String name;
    private String data;
    private String form;

    Type type;

    public Student(String name, String data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String Format(String data, String format) {
        String str = null;
        switch (format) {
            case "short":
                for (int i = 0; i < data.length(); i++) {
                    //System.out.println(data.substring(0, 2));
                    str = data.substring(0, 5);

                }
                break;

            case "default":
                for (int i = 0; i < data.length(); i++) {
                    //System.out.println(data.substring(0, 2));
                    str = data;

                }
                break;
            case "full" :
                Type[] types = Type.values();

                int kill = Integer.parseInt(String.valueOf(data.charAt(4)));

                str = data.substring(0, 2) + " " + types[kill-1].toString() + " " + data.substring(6, 10);
                break;
        }
        return str;
    }

    @Override
    public String toString() {
        return Format(data, form);
    }

    public static void main(String[] args) {
        Student student = new Student("Grac", "22:01:2009");
        student.setForm("full");
        System.out.println(student);




    }
}
