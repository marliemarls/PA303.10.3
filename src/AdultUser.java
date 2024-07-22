class AdultUser implements LibraryUser{
    public int age;
    public String bookType;

    public AdultUser(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    }


    public void registerAccount(){
        if(this.age >= 11){
            System.out.println("You have successfully registered under an Adult Account!");
        } else if (this.age <= 11) {
            System.out.println("Sorry! Age must be greater than 11 to register as an Adult!");
        }
    }

    @Override
    public void requestBook() {
        if(this.bookType == "Fiction"){
            System.out.println("Book issued successfully, please return the book within 7 days");
        } else{
            System.out.println("Oops! You are only allowed to take Adult fiction books!");
        }
    }

}
