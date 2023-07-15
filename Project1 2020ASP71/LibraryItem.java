public abstract class LibraryItem {
    private String title;
    private String itemID;
    private boolean isCheckedOut;

    public LibraryItem(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
        this.isCheckedOut = false;
    }

    public void checkOut() {
        isCheckedOut = true;
    }

    public void checkIn() {
        isCheckedOut = false;
    }

    public void displayItemDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemID);
    }
}
