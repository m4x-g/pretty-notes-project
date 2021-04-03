import java.util.HashSet;

public class Categories {
    private HashSet<String> categories = new HashSet<>();

    protected void addCategory(String newCategory){
        if (newCategory.trim().length() != 0){
            this.categories.add(newCategory.trim());
        }
    }

    protected void printCategories(){
        for (String category : categories){
            System.out.print(" [" + category + "]");
        }
        System.out.println();
    }
}
