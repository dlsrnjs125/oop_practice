package org.example;

import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();

//        double multipliedCreditAndCourseGrade = 0;
//        for (Course course : courses) {
//            // 이 방식은 효율성이 떨어진다. -> 고치게 된다면 바꿔야 할 부분이 너무 많아진다.
//            // multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
//            // 객체에게 작업을 위임하여 처리
//            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
//        }
//        return multipliedCreditAndCourseGrade;
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
