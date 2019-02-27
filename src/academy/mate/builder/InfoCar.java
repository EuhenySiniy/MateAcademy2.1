package academy.mate.builder;

public class InfoCar {
    private final String brand;
    private final String model;
    private final String color;
    private final Integer year;
    private final Integer hp;

    private InfoCar(String brand, String model, String color, int year, int hp) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.hp = hp;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getHp() {
        return hp;
    }

    public static class InfoCarBuilder {
        private String brand;
        private String model;
        private String color;
        private int year;
        private int hp;

        public InfoCarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public InfoCarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public InfoCarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public InfoCarBuilder year(int year) {
            this.year = year;
            return this;
        }

        public InfoCarBuilder hp(int hp) {
            this.hp = hp;
            return this;
        }

        public InfoCar build() {
            return new InfoCar(brand, model, color, year, hp);
        }
    }
}
