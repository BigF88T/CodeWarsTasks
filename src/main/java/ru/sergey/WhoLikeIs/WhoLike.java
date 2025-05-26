package ru.sergey.WhoLikeIs;

/*
Вы, наверное, знаете систему "Like" из Facebook и других страниц.
Люди могут «любить» сообщения в блоге, картинки или другие предметы.
Мы хотим создать текст, который должен отображаться рядом с таким элементом.
Реализуйте функцию, которая принимает массив, содержащий имена людей, которые любят элемент.
Он должен вернуть текст отображения, как показано в примерах:

[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"

Примечание. Для 4 или более имен число в «и 2 других» просто увеличивается.

 */

public class WhoLike {
    public static String whoLikesIt(String... names) {
        //Do your magic here
        if(names.length == 0)
            return "no one likes this";

        StringBuilder sb = new StringBuilder();

        switch (names.length) {
            case 1 -> sb.append(names[0]).append(" likes this");
            case 2 -> sb.append(names[0]).append(" and ").append(names[1]).append(" like this");
            case 3 -> sb.append(names[0]).append(", ").append(names[1]).append(" and ").append(names[2]).append(" like this");
            default -> sb.append(names[0]).append(", ").append(names[1]).append(" and ").append(names.length-2).append(" others like this");
        }

        return sb.toString();
    }
}
