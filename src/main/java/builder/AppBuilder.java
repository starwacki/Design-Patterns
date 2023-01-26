package builder;

public class AppBuilder {
    public static void main(String[] args) {

        FlightLeg flightLeg1 = FlightLeg.builder()
                .from("Gdańsk")
                .to("Warszawa")
                .price(300)
                .build();

        FlightLeg flightLeg2 = FlightLeg.builder()
                .from("Iława")
                .to("Moskwa")
                .price(350)
                .build();

        System.out.println(flightLeg1);
        System.out.println();
        System.out.println(flightLeg2);

        flightLeg1.setDelayed(true);

        System.out.println(flightLeg1);

    }



}
