public class Main {
    public static void main(String[] args) {
        User firstUserEver = new User("Astartes");
        Note noteOne = firstUserEver.newUserNote("40k", "https://www.youtube.com/watch?v=O7hgjuFfn3A", "40k", "Warhammer");
        noteOne.printNote();
        noteOne.noteCategories.addCategory("Space Marine");
        noteOne.printNote();
    }
}
