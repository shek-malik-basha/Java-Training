public class Studentt {
    private int rollno;
    private String name;

    public static void main(String[] args) {
        Studentt s1 = new Studentt();
        s1.name = "Malik";
        s1.rollno = 101;
    

        Studentt s2 = new Studentt();
        s2.name = "Ahsan";
        s2.rollno = 102;

        Studentt s3 = new Studentt();
        s3.name = "Asif";
        s3.rollno = 103;    

        Studentt students[] = new Studentt[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Studentt stud:students){
            System.out.println(stud.name+","+stud.rollno);
        }
    }
}
