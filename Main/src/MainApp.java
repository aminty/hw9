import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
       // Scanner sc = new Scanner(System.in);
//todo infinity loop
        while (true) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Enter your number: ");
                int input = sc.nextInt();
                if (input != -1)
                    inputList.add(input);
                else break;
            } catch (Exception e) {
                System.out.println("Bad entry !");                //break;
            }
        }
        System.out.println("Size of input list is: " + inputList.size());
        System.out.println(inputList);
        checkList(inputList);
        System.out.println(inputList);
    }

    private static void checkList(List<Integer> inputList) {
        ArrayList<Pair> normalPair = new ArrayList<>();
        if (inputList.size() % 2 != 0)
            inputList.remove(inputList.size() - 1);
        for (int i = 0; i < inputList.size() - 1; i++) {
            normalPair.add(new Pair(inputList.get(i), inputList.get(i + 1)));
            i++;
        }
        normalPair.removeIf(pair -> pair.getX() > pair.getY());
        inputList.clear();
        for (Pair pair : normalPair) {
            inputList.add(pair.getX());
            inputList.add(pair.getY());

        }

    }


}
