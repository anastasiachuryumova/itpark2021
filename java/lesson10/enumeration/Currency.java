package lesson10.enumeration;

public enum Currency {
    US_DOLLAR (1), EURO (2), ROUBLE (3);

    private int index;

    Currency (int index) {
        this.index = index;
    }

    public static Currency as(int index) {
        for (Currency currency : values()) {
            if (currency.index == index) {
                return currency;
            }
        }
        return Currency.US_DOLLAR;
    }

    public String asString () {
        return name().toLowerCase();
    }
}
