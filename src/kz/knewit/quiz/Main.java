package kz.knewit.quiz;

public class Main {
    public static void main(String[] args) {
        DBService dbService = new DBService();
        User user  = new User();

        user.setName("Bla bla");
        user.setPassword("Bla bla bla");
        user.setLogin("bla");
        dbService.createUser(user);

        System.out.println("finish");
    }
}
