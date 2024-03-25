package Volume1.chapter07;

public class HeightManager {
    int[][] gradeHeights;

    public static void main(String[] args) {
        HeightManager manager = new HeightManager();
        manager.setData();
        for (int classNo = 1; classNo < 6; classNo++) {
            System.out.println("Class No.:" + classNo);
            manager.printHeight(classNo);
        }

        // int classNo = 1;
        // while (classNo < 6) {
        //     System.out.println("Class No.:" + classNo);
        //     manager.printAverage(classNo);
        //     classNo++;
        // }
    }

    public void setData() {
        gradeHeights = new int[5][];
        gradeHeights[0] = new int[] {170, 180, 173, 175, 177};
        gradeHeights[1] = new int[] {160, 165, 167, 186};
        gradeHeights[2] = new int[] {158, 177, 187, 176};
        gradeHeights[3] = new int[] {173, 182, 181};
        gradeHeights[4] = new int[] {170, 180, 165, 177, 172};
    }

    public void printHeight(int classNo) {
        for (int height : gradeHeights[classNo - 1]) {
            System.out.println(height);
        }
    }

    public void printAverage(int classNo) {
        double avg = 0;
        for (int height : gradeHeights[classNo - 1]) {
            avg += height;
        }
        avg /= gradeHeights[classNo - 1].length;
        System.out.println("Height average = " + avg);
    }
}
