import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        boolean cont = true;
        Scanner scanner = new Scanner(System.in);
        while (cont){
            System.out.println("Please enter a number into the LinkedList (-1 to quit). ");
            int input = scanner.nextInt();
            if (input == -1){
                break;
            }
            list.beginning(input);
        }
        // error
        list.display();
        while (cont){
            System.out.println("Please enter a number to search for it in the LinkedList (-1 to quit). ");
            int input = scanner.nextInt();
            int position = list.searchList(input);
            if (input == -1){
                break;
            }
            if (position == 0){
                System.out.println("The number you are looking for doesn't exist. Try again. ");
            }
            else{
                System.out.println("The number you are looking for is at position " + position);
            }
        }

        while (cont){
            System.out.println("Please enter a number to delete it from the LinkedList (-1 to quit). ");
            int input = scanner.nextInt();
            if (input == -1){
                break;
            }
            else{
                int success = list.deleteByValue(input);
                if (success == 0){
                    System.out.println("The number you are looking for doesn't exist. Try again. ");
                }
                else{
                    System.out.println("Deleted successfully!");
                    list.display();
                }
            }
        }
    }
}