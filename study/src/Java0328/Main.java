package Java0328;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Garam", "Garam01", "q1w2e3r4!"
                , LocalDate.of(2000, 1, 1), "garam@email.com");
        User user2 = new User("Babara", "Babara02", "babara13579"
                , LocalDate.of(2005, 3, 10), "babara13579@email.com");
        User user3 = new User("Daram", "Daram03", "hahaha369"
                , LocalDate.of(2010, 5, 15), "daram@email.com");
        User user4 = new User("Rora", "Rora04", "0987654321"
                , LocalDate.of(2015, 9, 21), "rora@email.com");
        User user5 = new User("Aram", "aram05", "dnflskfk"
                , LocalDate.of(2020, 12, 23), "aram@email.com");


        Lecture lecture1 = new Lecture(1, "Java", 500
                , "Programming", "A");
        Lecture lecture2 = new Lecture(2, "Css", 300
                , "Programming", "B");
        Lecture lecture3 = new Lecture(3, "Database", 95
                , "Programming", "C");

        ArrayList<LectureRegistration> lectureRegistrations = new ArrayList<>();
        LectureRegistration lectureRegistration1 = new LectureRegistration("Garam01", 1);
        lectureRegistrations.add(lectureRegistration1);
        LectureRegistration lectureRegistration2 = new LectureRegistration("Babara02", 2);
        lectureRegistrations.add(lectureRegistration2);
        LectureRegistration lectureRegistration3 = new LectureRegistration("Daram03", 1);
        lectureRegistrations.add(lectureRegistration3);
        LectureRegistration lectureRegistration4 = new LectureRegistration("Rora04", 3);
        lectureRegistrations.add(lectureRegistration4);
        LectureRegistration lectureRegistration5 = new LectureRegistration("Aaram05", 1);
        lectureRegistrations.add(lectureRegistration5);

        // 문제2
        for (int i = 0; i < lectureRegistrations.size(); i++) {
            if (lectureRegistrations.get(i).getLectureId() == 1) {
                System.out.println(lectureRegistrations.get(i).getUserId());

            }
        }

        System.out.println();

        // 문제3
        // ArrayList 추가

        ArrayList<Lecture> subjectName = new ArrayList<>();
        subjectName.add(new Lecture(1, "Java", 500, "Programming", "A"));
        subjectName.add(new Lecture(2, "Css", 300, "Programming", "B"));
        subjectName.add(new Lecture(3, "Database", 95, "Programming", "C"));


        // 유저의 loginId를 입력
        String lectureLoginId = "Rora04";


        for (LectureRegistration registration : lectureRegistrations) {   // 입력한 loginId와 일치하는지 확인
            if (registration.getUserId().equals(lectureLoginId)) {
                int lectureId = registration.getLectureId();

                for (Lecture lecture : subjectName) {
                    if (lecture.getLectureId() == lectureId) {
                        System.out.println("강의명: " + lecture.getSubject());

                    }
                }
            }
        }
        System.out.println();

        // 문제4번
        // ArrayList 추가
        ArrayList<User> userEmail = new ArrayList<>();
        userEmail.add(user1);
        userEmail.add(user2);
        userEmail.add(user3);
        userEmail.add(user4);
        userEmail.add(user5);

        // 강의명을 입력
        String lectureSubject = "Java";


        for (Lecture lecture : subjectName) {
            if (lecture.getSubject().equals(lectureSubject)) {
                // lecture 강의명이 입력한 강의명과 일치하는지 확인
                for (LectureRegistration registration : lectureRegistrations) {
                    if (registration.getLectureId() == lecture.getLectureId()) {  // 현재 강의 등록 객체의 lectureId가 입력한 강의의 lectureId와 일치하는지 확인
                        String lecturesUserId = registration.getUserId();   // 일치하는 경우 해당 유저 loginId를 get

                        // 해당 유저의 이메일 찾기
                        for (User user : userEmail) {
                            // 해당 유저의 loginId가 찾는 loginId와 일치하는지 확인
                            if (user.getLoginId().equals(lecturesUserId)) {
                                System.out.println("이메일: " + user.getEmail());
                                break;  // 사용자를 찾았으므로 탈출
                            }
                        }
                    }
                }
                break;  // 강의를 찾았으므로 탈출
            }
        }
    }
}