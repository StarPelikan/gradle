public class main {
    public static void main(String[] args) {
        MyService myService = new MyService();
        System.out.println(myService.getMyEntity());
        System.out.println(myService.setMyEntity(new MyEntity("ДЖон Траволтра")));
        System.out.println(myService.getMyEntity());
}
}
