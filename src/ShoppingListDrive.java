import java.util.Scanner;

public class ShoppingListDrive {

    private static Scanner scanner = new Scanner(System.in);
    private static ShoppingListModules shoppingList = new ShoppingListModules();

    public static void main(String[] args) {
        boolean stop = false;
        int choice=0;
        printInstructions();
        while (!stop) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    shoppingList.printShoppingList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    stop = true;
                    break;
                default:
                    System.out.println("please select a number between 0 and 6");
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        shoppingList.addShoppingItem(scanner.nextLine());
    }

    public static void modifyItem() {
        /*System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();*/
        System.out.print("Enter the item to be replaced: ");
        String newItem = scanner.nextLine();
        shoppingList.modifyList(newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        shoppingList.removeItem(itemNo - 1);

    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        shoppingList.findItem(searchItem);
    }
}

