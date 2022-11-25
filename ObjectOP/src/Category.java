public class Category {
    protected String name;
    protected String[] product_arr;
    protected static int counter = 0;

    public Category(String name, String[] product_arr) {
        this.name = name;
        this.product_arr  = product_arr;
        System.out.println("Category object " + counter + " created");
        counter += 1;
    }

}
