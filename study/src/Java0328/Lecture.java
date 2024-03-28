package Java0328;

public class Lecture {
    private int lectureId;
    private String subject;
    private int duration;
    private String category;
    private String difficulty;

    public Lecture() {
    }

    public Lecture(int lectureId, String subject, int duration, String category, String difficulty) {
        this.lectureId = lectureId;
        this.subject = subject;
        this.duration = duration;
        this.category = category;
        this.difficulty = difficulty;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String getSubject() {
        return subject;
    }

    public void setTitle(String title) {
        this.subject = subject;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return lectureId + " / " + subject + " / " + category
                + " / " + difficulty + " / " + duration + "분";
    }
}