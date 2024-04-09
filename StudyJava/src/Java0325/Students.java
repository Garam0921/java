package Java0325;

 public class Students {
     private String name;
     private String department;
     private int StudentId;

     public Students() {
     }

     public Students(String name, String department, int studentId) {
         this.name = name;
         this.department = department;
         this.StudentId = studentId;
     }

    public void setName(String name) {  // 세터(Setter) 메서드
        this.name = name;
    }

    public void setDepartment(String department) {  // 세터(Setter) 메서드
        this.department = department;
    }

    public void setStudentId(int studentId) {  // 세터(Setter) 메서드
        this.StudentId = studentId;
    }

    @Override
    public String toString() {  //오버라이딩
        return this.name + ", " + this.department + ", " + this.StudentId;
    }
}