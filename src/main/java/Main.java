public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        FormDate newDay = new FormDate();
        newDay.day = 3;
        newDay.month = 12;
        newDay.year = 2000;
        post.birthday = newDay;
        post.name = "Ivan";
        post.surname = "Ivanov";
        post.potronimic = "Ivanovich";
        post.passport = "44444 444444";
        post.phone = "+7 777 777 7777";
        post.subscription = true;
    }
}