import java.util.Arrays;

public class TestClass {

    /*Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
    each statue having an non-negative integer size. Since he likes to make things perfect,
    he wants to arrange them from smallest to largest so that each statue will be
    bigger than the previous one exactly by 1. He may need some additional statues to be
    able to accomplish that. Help him figure out the minimum number of additional statues needed.*/

    public static void main(String[] args) {

        int[] arr = {6, 2, 3, 8,12};
//        System.out.println(makeArrayConsecutive2(arr));
        System.out.println(128%6);
    }

    public static int makeArrayConsecutive2(int[] statues) {

        Arrays.sort(statues);
        int counter = 0;
        int diff;
        for (int i = 0; i < statues.length - 1; i++) {
            //nie trzeba w pętli sprawdzać, czy już skończyliśmy iterować
            //wystarczy w pętli iterować, o jeden element krócej (i < statuses.length - 1)

            
            //jeżeli często używasz czegioś warto wyciągnąć to do zmiennej i nadać temu jakąś sensowną nazwę
            int actualStatus = statues[i];
            int nextStatus = statues[i + 1];
            if (actualStatus != nextStatus && nextStatus - actualStatus > 1) {

                diff = (nextStatus - actualStatus) - 1;
                counter += diff;
            }


        }

        return counter;
    }
}


