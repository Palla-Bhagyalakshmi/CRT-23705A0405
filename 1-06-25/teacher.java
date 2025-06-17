class Teacher {
    String name;
    String id;
    String dept;
    String[] subjects;
    String qualification;
    Teacher(String name, String id, String dept, String qualification, String[] subjects) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.qualification = qualification;
        this.subjects = subjects;
    }
    void details() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher ID: " + id);
        System.out.println("Department: " + dept);
        System.out.println("Qualification: " + qualification);
        System.out.print("Subjects: ");
        for (String subject : subjects) {
            System.out.print(subject + ", ");
        }
        System.out.println(); 
    }
}
   public class Main{
        public static void main(String[] args){
             String[] subjects={"C","Java","Python"};
            Teacher t1=new Teacher("P.Geetha","23705A0403","CSE","B.Tech",subjects);
            t1.details();
            
        }
    }
    
   
    