package Java0328;

import java.time.LocalDate;

public class Teacher {
    private String teacherId;
    private String name;
    // 기타 필요한 필드 추가

    public Teacher() {
    }

    public Teacher(String teacherId, String name) {
        this.teacherId = teacherId;
        this.name = name;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}