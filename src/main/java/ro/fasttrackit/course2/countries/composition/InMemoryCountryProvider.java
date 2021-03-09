package ro.fasttrackit.course2.countries.composition;

import ro.fasttrackit.course2.countries.Country;

import java.util.List;

import static ro.fasttrackit.course2.countries.Continent.EUROPE;

public class InMemoryCountryProvider implements CountryProvider {
    @Override
    public List<Country> readCountries() {
        return List.of(
                new Country("Moldova", "Chisinau", EUROPE, 123124, 6_000_000, List.of("ROU"))
        );
    }
}
