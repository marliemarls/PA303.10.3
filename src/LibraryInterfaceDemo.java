public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser newChildUser = new KidUser(11, "Kids");
        AdultUser newAdultUser = new AdultUser(28, "Fiction");
        newChildUser.requestBook();
        newAdultUser.requestBook();
    }
}
