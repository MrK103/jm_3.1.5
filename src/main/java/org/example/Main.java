package org.example;

public class Main {

    public static void main(String[] args) {
        var util = new Util();
        util.createUser();
        util.updateUser();
        util.deleteUser(3L);
        if(util.getResult().length() != 18) {
            System.out.println("Ошибка");
        } else {
            System.out.println("Final result - " + util.getResult());
        }
    }


}