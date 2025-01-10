public class StudentGrades {

    // TODO: define the 'getGreetings()' method
	 public static String getGreetings(){
        return "Welcome To Java Training";
    }

    // TODO: define the 'determineGrade()' method
	   public static String determineGrade(double testMarks){
        String grade = " ";
        if(testMarks<40){
            grade = " F";

        }
        else if (testMarks >= 40 && testMarks <= 49){
            grade = "D-";
        } else if (testMarks>= 50 && testMarks <= 59) {
            grade = "D";
        } else if(testMarks >= 60 && testMarks <= 69){
            grade = "C";
        }else if (testMarks >=70 && testMarks<=79) {
            grade = "B";
        }  else if (testMarks >=80 && testMarks<=89) {
            grade = "A";
        } else if (testMarks >= 90 && testMarks <= 100) {
            grade = "A+";
        } else {
            grade = "Invalid";
        }
        return  grade;
    }

    // TODO: define the 'determineAge()' method
	  public static int determineAge(int birthYear){
        int age = 0;
        final int CURRENT_YEAR = 2025;

        age = CURRENT_YEAR - birthYear;
        return age;
    }

}
