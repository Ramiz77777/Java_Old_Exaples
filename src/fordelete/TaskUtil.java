package fordelete;

public class TaskUtil {
    void reverseWithoutAddArray(String[] workingArray) {
        String temp = "";
        for (int i = 0; i < workingArray.length / 2; i++) {
            temp = workingArray[i];
            workingArray[i] = workingArray[workingArray.length - 1 - i];
            workingArray[workingArray.length - 1 - i] = temp;
        }


    }
}