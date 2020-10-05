import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingListModules
{
        private static Scanner scan = new Scanner (System.in);
        private ArrayList<String> shoppingList=new ArrayList<String>();

        public void addShoppingItem(String item){
            shoppingList.add(item);
        }

        public void printShoppingList(){
            System.out.println("there are "+shoppingList.size()+" items");
            for (int i=0;i<shoppingList.size();i++)
                System.out.println((i+1)+" "+shoppingList.get(i));
        }

        public void modifyList(String newitem){
            int position=shoppingList.indexOf(newitem);
            System.out.println(position);
            System.out.println("please specify the item to be replaced with");
            String item = scan.nextLine();
            shoppingList.set(position, item);
            System.out.println("Item "+(position+1)+" has been modified");
        }

        public void removeItem(int position){
            String theItem = shoppingList.get(position);
            shoppingList.remove(position);
        }

        public String findItem(String searchitem){
            boolean exist = shoppingList.contains(searchitem);
            int position = shoppingList.indexOf(searchitem);
            if (exist) {
                System.out.println("the item: " + searchitem + " can be found on position " + position);
                return shoppingList.get(position);
            }
            else {
                System.out.println("the item " + searchitem + " does not exists in the current list");
                return "null";
            }
        }

}


