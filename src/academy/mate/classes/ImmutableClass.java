package academy.mate.classes;

public final class ImmutableClass {
    private String brandCar;
    private int yearOfIssue;

    ImmutableClass(String brandCar, int yearOfIssue) {
        this.brandCar = brandCar;
        this.yearOfIssue = yearOfIssue;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }
}
