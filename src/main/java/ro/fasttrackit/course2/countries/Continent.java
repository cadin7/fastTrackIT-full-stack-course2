package ro.fasttrackit.course2.countries;

import java.util.Optional;
import java.util.stream.Stream;

public enum Continent {
    EUROPE(true, 387632845),
    ASIA(true, 48957),
    AFRICA(false, 493867386),
    AMERICAS(true, 12746),
    OCEANIA(false, 287472);

    private final boolean isNorthernHemisphere;
    private final long area;

    Continent(boolean isNorthernHemisphere, long area) {
        this.isNorthernHemisphere = isNorthernHemisphere;
        this.area = area;
    }

    public static Optional<Continent> of(String continentName) {
        return Stream.of(values())
                .filter(val -> val.name().equalsIgnoreCase(continentName))
                .findFirst();
    }

    public boolean isNorthernHemisphere() {
        return isNorthernHemisphere;
    }

    public long getArea() {
        return area;
    }
}
