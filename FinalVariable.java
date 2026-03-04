public class FinalVariable{
    final int ID;

    FinalVariable(int idValue) {
        this.ID = idValue;
    }

    void tryToChange() {
        // ID = 2;
    }

    public static void main(String[] args) {
        FinalVariable demo = new FinalVariable(101);
        System.out.println("1st ID: " + demo.ID);
    }
}
