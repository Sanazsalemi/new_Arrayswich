
public class New_arrayN {
    public static void main(String[] args) {
        int[] myArray = {1, 4, 7, 9};
        String[] Str = {"One", "FOur", "Seven", "Nine"};
    }
    private void intToString(int[] inputArray) {
        int inputArrayLength = inputArray.length;
        String[] ouputeArray = new String[inputArrayLength];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 1) {
                System.out.println(ouputeArray[i]);
            } else if (inputArray[i] == 4) {
                System.out.println(ouputeArray[i]);
            } else if (inputArray[i] == 7) {
                System.out.println(ouputeArray[i]);
            } else if (inputArray[i] == 9) {
                System.out.println(ouputeArray[i]);
            } else {
                System.out.println("null");
            }

        }
        for (String String1 : ouputeArray) {
            System.out.println(String1 + "");}
            System.out.println(ouputeArray);
        }

    }








