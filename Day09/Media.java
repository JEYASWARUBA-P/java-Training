package Day09;

class Media {

    void play() {
        System.out.println("Playing Media");
    }
}

class Audio extends Media {

    @Override
    void play() {
        System.out.println("Playing Audio");
    }
}

class Video extends Media {

    @Override
    void play() {
        System.out.println("Playing Video");
    }

    public static void main(String[] args) {

        Media media;

        media = new Audio();
        media.play();

        media = new Video();
        media.play();
    }
}
