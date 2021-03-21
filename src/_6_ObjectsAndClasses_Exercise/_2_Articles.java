package _6_ObjectsAndClasses_Exercise;

import java.util.Scanner;

public class _2_Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(", ");
        /*
        String title = data[0];
        String content = data[1];
        String author = data[2];*/
        Articles articles = new Articles(data[0], data[1], data[2]);
        int N = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(": ");
            String command = input[0];
            switch (command) {
                case "Edit":
                    articles.editContent(input[1]);
                    break;
                case "ChangeAuthor":
                    articles.changeAutor(input[1]);
                    break;
                case "Rename":
                    articles.ranameTitle(input[1]);
                    break;

            }
        }
        System.out.println(articles.toString());
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

        public void ranameTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void editContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void changeAutor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
        }
    }


}
