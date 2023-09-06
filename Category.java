package Biudzetas.Category;

public enum Category {
    PAJAMOS("P"),
    ISLAIDOS("I");

    private String category;
    Category(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
}
