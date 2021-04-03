public class Note {
    private String noteCreator;
    private String noteTitle;
    private String noteBody;
    protected Categories noteCategories = new Categories();

    Note(String noteCreator, String noteTitle, String noteBody, String... noteCategory){
        this.noteCreator = noteCreator;
        this.noteTitle = noteTitle;
        this.noteBody = noteBody;

        for (String category : noteCategory){
            this.noteCategories.addCategory(category);
        }
    }

    protected void printNote(){
        System.out.println();
        System.out.println("---- ---- ---- header ---- ---- ---- ---- ---- ---- ---- ----");
        System.out.println("I was created by: " + this.noteCreator);
        System.out.println("---- ---- ---- title ---- ---- ----  ---- ---- ---- ---- ----");
        System.out.println(this.noteTitle);
        System.out.println("---- ---- ---- body ---- ---- ----  ----  ---- ---- ---- ----");
        System.out.println(this.noteBody);
        System.out.println("---- ---- ---- categories ---- ---- ---- ---- ---- ---- ---- ");
        noteCategories.printCategories();
        System.out.println("---- ---- ---- ----  ---- ---- ---- ---- ----  ---- ---- ----");
    }
}
