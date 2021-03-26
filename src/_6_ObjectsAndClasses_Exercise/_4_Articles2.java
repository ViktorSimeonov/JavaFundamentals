package _6_ObjectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _4_Articles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        List<Articles> listOfArticles = new ArrayList<>();
        List<Articles> sortArticles = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            String[] data = line.split(", ");
            Articles articles = new Articles(data[0], data[1], data[2]);
            listOfArticles.add(articles);



        }

  String input = scanner.nextLine();

        switch (input.toLowerCase()) {
            case "title":
                sortArticles = listOfArticles.stream().
                        sorted(Comparator.comparing(Articles::getTitle)).collect(Collectors.toList());
                break;
            case "content":
                sortArticles = listOfArticles.stream().
                        sorted(Comparator.comparing(Articles::getContent)).collect(Collectors.toList());

                break;
            case "author":
                sortArticles = listOfArticles.stream().
                        sorted(Comparator.comparing(Articles::getAuthor)).collect(Collectors.toList());

                break;
            default:
                System.out.println("Fail");
                break;
        }
        for (Articles sortArticle : sortArticles) {
            System.out.println(sortArticle.toString());
        }
    }


    static class Articles {
        String title;
        String content;
        String author;

        Articles(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }


        public String getContent() {
            return content;
        }


        public String getAuthor() {
            return author;
        }


        @Override
        public String toString() {
            return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
        }
    }


}
