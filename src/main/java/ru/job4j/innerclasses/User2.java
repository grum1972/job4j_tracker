package ru.job4j.innerclasses;

public class User2 {
    private String login;
    private String password;

    public User2(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.println("User " + User2.this.login + " and password " + User2.this.password + " made request");
            }
        }

        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User2 user = new User2("1111", "22222");
        user.createQuery();
    }

}
