public class Main {
    public static void main(String[] args) {
        try{
            Masina masina = new Masina("Audi", "negru");
            Student student = new Student("Popescu", "Ion", masina);
            Student student2 = (Student) student.clone();
            Student student3 = student.deepClone();
            System.out.println(student);
            System.out.println(student2);
            System.out.println(student3);
            masina.setCuloare("alb");
            System.out.println(student);
            System.out.println(student2);
            System.out.println(student3);
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}