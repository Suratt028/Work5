public class TestCategory {
    public static void main(String[] args) {
        Category obj1 = new Category();
        obj1.setName("unknown");
        System.out.println(obj1.getName());

        Category obj2 = new Category();
        obj2.setId(99);
        System.out.println(obj2.getId());

        Category obj3 = new Category();
        obj3.setItems(990);
        System.out.println(obj3.getItems());


    }
}
