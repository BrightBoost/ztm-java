package controlflow;

public class ExamplesBreakAndContinue {
    public static void main(String[] args) {
        int[] nrs = {0, 1, 2, 3, 4};
        for(int nr: nrs) {
            if(nr % 2 != 0) {
                System.out.println(nr);
            }
        }




//        int[] nrs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 10};
//        int search = 7;
//        int index = -1;
//
//        for (int i = 0; i < nrs.length; i++) {
//            if (nrs[i] == search) {
//                index = i;
//                break;
//            }
//        }
//
//        System.out.println(index);
    }
}
