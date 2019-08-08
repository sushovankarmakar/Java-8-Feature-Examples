package Optional;

import java.util.Optional;

public class StudyWeeklySchedule {
    public static void main(String[] args) {
        StudyWeeklySchedule schedule = new StudyWeeklySchedule();
        Optional<String> subject1  = schedule.getSubjectOfDay("Sunday");
        Optional<String> subject2  = schedule.getSubjectOfDay("Friday");

        subject1.ifPresent(System.out::println);
        subject2.ifPresent(System.out::println);
    }

    public Optional<String> getSubjectOfDay(String day){

        switch (day){
            case "Monday" : return Optional.of("DAA");
            case "Tuesday" : return Optional.of("COA");
            case "Wednesday" : return Optional.of("DBMS");
            case "Thursday" : return Optional.of("Math");
            case "Friday" : return Optional.of("DS");
            default : return Optional.empty();
        }
    }
}
