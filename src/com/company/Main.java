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

        User users[] = new User[100];

        while (true){


            System.out.println("Выбор действия!\n\n1 - Добавить пользователя\n2 - Информация о пользователях\n3 - Изменить пользователя\n4 - Удалить пользователя\n5 - Выход");

            String act = reader.nextLine();


            int id;

            if(act.equals("1")){
                while (true){
                    int newUserId = User.getMaxId();
                    System.out.print("Имя: ");
                    String name = reader.nextLine();
                    System.out.print("Логин: ");
                    String login = reader.nextLine();
                    System.out.print("Пароль: ");
                    String password = reader.nextLine();

                    users[newUserId] = new User(name, login, password);

                    break;
                }
            }
            else if(act.equals("2")){
                System.out.println("Список пользователей\n");
                for (int i = 0; i < users.length; i++){
                    if(users[i] != null){
                        System.out.printf("Имя: %s, Логин: %s, Password: %s", users[i].getName(), users[i].getLogin(), users[i].getPassword());
                    }
                }
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
