package Human;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        Query query2 = new Query();
        query2.printToLog();

    }

    class Query {
        public void printToLog() {
            System.out.printf("User with password %s and login %s send query\n", password, login);
        }
    }

    public static void main(String[] args) {
        User user1 = new User("login1", "password1");
        User user2 = new User("login2", "password2");
        user2.createQuery();
        User.Query query1 = user1.new Query();
        query1.printToLog();
    }
}