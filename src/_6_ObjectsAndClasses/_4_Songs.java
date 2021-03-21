package _6_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _4_Songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        List<Songs> songsInfoList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            Songs song = Songs.parseSongs(line);
            songsInfoList.add(song);
        }
        String typeList = scanner.nextLine();
        if (typeList.equals("all")) {
            for (Songs songs : songsInfoList) {
                System.out.println(songs.getNameOfSong());
            }

        } else {
            for (Songs songs : songsInfoList) {
                if (songs.getTypePlayList().equals(typeList)) {
                    System.out.println(songs.getNameOfSong());
                }
            }
        }

    }

    static class Songs {

        String typePlayList;
        String nameOfSong;
        String timeOfSong;

        Songs(String typePlayList, String nameOfSong, String timeOfSong) {
            this.typePlayList = typePlayList;
            this.nameOfSong = nameOfSong;
            this.timeOfSong = timeOfSong;
        }

        public static Songs parseSongs(String line) {
            String[] songsParameter = line.split("_");
            return new Songs(songsParameter[0], songsParameter[1], songsParameter[2]);
        }

        public String getTypePlayList() {
            return typePlayList;
        }

        public String getNameOfSong() {
            return nameOfSong;
        }

    }
}
