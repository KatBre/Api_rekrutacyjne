package kb.apirekrutacyjne;

import java.util.Optional;

public enum NPBCurrency {
    AMERICAN_DOLLAR("USD"),
    RUSSIAN_RUBEL("RUB"),
    EURO("EUR");
    private String shortName;

    NPBCurrency(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public static Optional<NPBCurrency> parse(String input) {
        if (input.toUpperCase().contains("DOLAR")) {
            return Optional.of(NPBCurrency.AMERICAN_DOLLAR);
        } else if (input.toUpperCase().contains("RUBEL")) {
            return Optional.of(NPBCurrency.RUSSIAN_RUBEL);
        } else if (input.toUpperCase().contains("EURO")) {
            return Optional.of(NPBCurrency.EURO);
        }
        return Optional.empty();
    }
}
