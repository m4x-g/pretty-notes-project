public class Main {
    public static void main(String[] args) {
        User firstUserEver = new User("Astartes");
        User secondUserEver = new User("Batman");

        Note noteOne = firstUserEver.newUserNote("40k", "https://www.youtube.com/watch?v=O7hgjuFfn3A", "40k", "Warhammer");
        noteOne.noteCategories.addCategory("Space Marine");
        noteOne.printNote();

        Note noteTwo = secondUserEver.newUserNote("I am Batman", "Because I'm Batman", "Batman", "Dark Knight");
        noteTwo.printNote();
    }
}
