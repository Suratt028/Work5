public class TestItem {
    public static void main(String[] args) {
        
        Item obj1 = new Item();
        obj1.Setname("unknown");
        System.out.println(obj1.Getname());

        Item obj2 = new Item();
        obj2.Setid("99");
        System.out.println(obj2.Getid());

        Item obj3 = new Item();
        obj3.Setdescription("Can you give me A sir?");
        System.out.println(obj3.Getdescription());
    }
}
