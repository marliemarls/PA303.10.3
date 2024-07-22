class KidUser implements LibraryUser{
    public int age;
    public String bookType;

    public KidUser(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    }



    public void registerAccount(){
        if(this.age <= 11){
            System.out.println("You have successfully registered as a kid!");
        } else if (this.age > 11) {
            System.out.println("Sorry! You must be less than 12 years old to register as a child!");
        }
    }

    @Override
    public void requestBook() {
        if(this.bookType == "Kids"){
            System.out.println("Book issued successfully, please return the book within 10 days.");
        } else{
            System.out.println("Oops! You are allowed to take only kids books!");
        }
    }

}
