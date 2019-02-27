package academy.mate.builder;

public class BuildingApp {
    public static void main(String[] args) {
        InfoCar infoCar = new InfoCar.InfoCarBuilder()
                .brand("Mercedes")
                .model("GLS")
                .color("White")
                .year(2018)
                .hp(340)
                .build();
    }
}
