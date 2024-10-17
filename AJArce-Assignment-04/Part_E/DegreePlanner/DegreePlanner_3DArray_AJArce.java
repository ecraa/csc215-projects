package DegreePlanner;

public class DegreePlanner_3DArray_AJArce {
    static String[] semester01 = {"csc101", "csc102", "csc103", "csc104", "csc105", "csc106"};
    static String[] semester02 = {"csc201", "csc202", "csc203", "csc204", "csc205", "csc206"};
    static String[] semester03 = {"csc301", "csc402", "csc303", "csc304", "csc305", "csc306"};
    static String[] semester04 = {"csc401", "csc402", "csc403", "csc404", "csc405", "csc406"};

    public static String[][][] turnInto3DArray (String[] semester01, String[] semester02, String[] semester03, String[] semester04) {
        String[][][] degreePlanner = new String[4][3][2];

        degreePlanner[0][0] = new String[] {semester01[0], semester01[1]};
        degreePlanner[0][1] = new String[] {semester01[2], semester01[3]};
        degreePlanner[0][2] = new String[] {semester01[4], semester01[5]};

        degreePlanner[1][0] = new String[] {semester02[0], semester02[1]};
        degreePlanner[1][1] = new String[] {semester02[2], semester02[3]};
        degreePlanner[1][2] = new String[] {semester02[4], semester02[5]};

        degreePlanner[2][0] = new String[] {semester03[0], semester03[1]};
        degreePlanner[2][1] = new String[] {semester03[2], semester03[3]};
        degreePlanner[2][2] = new String[] {semester03[4], semester03[5]};

        degreePlanner[3][0] = new String[] {semester04[0], semester04[1]};
        degreePlanner[3][1] = new String[] {semester04[2], semester04[3]};
        degreePlanner[3][2] = new String[] {semester04[4], semester04[5]};

        return degreePlanner;
    }

    public static void main(String[] args) {
        String[][][] degreePlanner = turnInto3DArray(semester01, semester02, semester03, semester04);
        System.out.println("Printing data... from one 3D String[4][3][2] array containing 24 items:");

        for(int i = 0; i < degreePlanner.length; i++) {
            System.out.print("- Semester #" + (i + 1) + ": ");
            for (int j = 0; j < degreePlanner[i].length; j++) {
                for (int k = 0; k < degreePlanner[i][j].length; k++) {
                    System.out.print(degreePlanner[i][j][k]);
                    if (!(i == degreePlanner.length - 1 && j == degreePlanner[i].length - 1 && k == degreePlanner[i][j].length - 1)) {
                        if (!(j == degreePlanner[i].length - 1 && k == degreePlanner[i][j].length - 1)) {
                            System.out.print(", ");
                        }
                    }

                }
            }
            System.out.println();
        }
    }

}

