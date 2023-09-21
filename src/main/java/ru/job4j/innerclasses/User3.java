package ru.job4j.innerclasses;

public class User3 {
    private String login;
    private String password;

    {
        class B {
            public void info() {
                System.out.println("local class in block init");
            }
        }

        B b = new B();
        b.info();
    }

    public User3(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public static class Query {
        public void printToLog() {
            System.out.println("User  made request");
        }
    }

    public static void main(String[] args) {

        User3 user = new User3("222", "333");
    }

}
