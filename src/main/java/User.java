public class User {
    private String userName;

    User(String name){
        this.userName = name;
    }

    protected Note newUserNote(String noteTitle, String noteBody, String... noteCategory){
        return new Note(this.userName, noteTitle, noteBody, noteCategory);
    }
}
