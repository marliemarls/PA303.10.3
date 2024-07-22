public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser newChildUser = new KidUser(10, "Kids");
        KidUser newChild2 = new KidUser(18, "Fiction");
        AdultUser newAdultUser = new AdultUser(5, "Kids");
        AdultUser newAdult2 = new AdultUser(23, "Fiction");

        newChildUser.requestBook();
        newAdultUser.requestBook();
        newChild2.requestBook();
        newAdult2.requestBook();
    }
}
