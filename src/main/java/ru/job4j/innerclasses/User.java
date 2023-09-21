package ru.job4j.innerclasses;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public class Query {
        public void printToLog() {
            System.out.println("User " + User.this.login + " and password " + User.this.password + " made request");
        }
    }

    public static void main(String[] args) {
        User user = new User("1111", "22222");
        user.createQuery();
        User.Query query1 = user.new Query();
        query1.printToLog();
        User.Query query2 = new User("3333", "4444").new Query();
        query2.printToLog();
    }

}
