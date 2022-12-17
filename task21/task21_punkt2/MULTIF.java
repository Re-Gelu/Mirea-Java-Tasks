package task21.task21_punkt2;

public class MULTIF implements Chair{
    @Override
    public void sit(Chair chair) {
        System.out.println("Это MULTIF");
    }

    @Override
    public String GetType() {
        return "miltif";
    }
}
