package com.example.perlovina.seasonalwearing;

class Closes {
    private String title;
    private int image ;

    /**
     * Constructor for initialisation with images.
     * @param title closes category
     * @param image seasonal closes
     */

    public Closes(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "Closes"+ title + '\'' +
                ", image=" + image +
                '}';
    }
}
