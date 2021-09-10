package com.company;

import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    //Создать класс пользователей(имя, почта, пароль)
        //Сделать меню: Добавить пользоваеля, просмотр инфы о каждом, массив пользователей(100 пользвателей)
        //Удалени(заменить на null в массиве) и изменение данных
        //Выход

        Scanner reader = new Scanner(System.in);

        while (true){


            System.out.println("Выбор действия!\n\n1 - Добавить пользователя\n2 - Информация о пользователях\n3 - Изменить пользователя\n4 - Удалить пользователя\n5 - Выход");

            String act = reader.nextLine();
            User user = new User();

            if(act.equals("1")){
                while (true){
                    System.out.println("Новый пользователь!\n");

                    System.out.print("Имя: ");
                    String name = reader.nextLine();
                    user.setName(name);

                    System.out.print("Email: ");
                    String login = reader.nextLine();
                    user.setLogin(login);

                    System.out.print("Пароль: ");
                    String password = reader.nextLine();
                    user.setPassword(password);
                    user.addUser(name, login, password);
                    break;
                }
            }
            else if(act.equals("2")){
                user.showUsers();
            }
            else if(act.equals("3")){

            }
            else if(act.equals("4")){

            }
            else if(act.equals("5")){
                System.out.println("Программа завершена!");
                break;
            }
            else{
                System.out.println("Дейсвие указано неверно!");
            }

        }
        reader.close();
    }
}
