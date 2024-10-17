package DegreePlanner;

public class DegreePlanner_OOP_AJArce {
    static class Semester {
        private final String[] userCourses;

        public Semester(String[] userCourses){
            this.userCourses = userCourses;
        }
        public String getUserCourses(){
            StringBuilder displayCourseList = new StringBuilder();
            for (int i = 0; i < userCourses.length; i++) {
                if (i > 0) {
                    displayCourseList.append(", ");
                }
                displayCourseList.append(userCourses[i]);
            }
            return displayCourseList.toString();
        }
    }
    public static void main(String[] args) {
        System.out.println("Printing Data... form one 1D Semester[] array containing 4 items: ");

        Semester[] arrayOfSemester = getSemesterArray();

        getAllSemesters(arrayOfSemester);

    }
    public static String [] getCourses(int semesterNumber) {
        String[] userCourses = new String[6];
        int getCourseNumber = (semesterNumber * 100) + 1;

        for (int i = 0; i< userCourses.length; i++)  {
            userCourses[i] = "csc" + (getCourseNumber + i);

        }
        return userCourses;
    }

    public static Semester getSemester(int semesterNumber) {
        String[] userCourses = getCourses(semesterNumber);
        return new Semester(userCourses);
    }

    public static Semester[] getSemesterArray() {
        Semester[] semesters = new Semester[4];

        for (int i = 0; i< semesters.length; i++) {
            semesters[i] = getSemester(i + 1);
        }
        return semesters;
    }

    public static void getSemester(Semester semester, int semesterNumber) {
        System.out.println("- Semester #" + semesterNumber + ": " + semester.getUserCourses());
    }
    public static void getAllSemesters(Semester[] semesters){
        for (int i = 0; i < semesters.length; i++) {
            getSemester(semesters[i], i + 1);
        }
    }

}
