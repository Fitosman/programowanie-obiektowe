public interface Converter {
    abstract double convertToEuro(double amount);
    abstract double convertToUSD(double amount);
    abstract double getConversionRate(String currency);
     class CurrencyConverter implements Converter {
        public String currency = "EUR";
        @Override
        public double convertToEuro(double amount) {
            if(currency.equals("USD")) {
                currency = "EUR";
                return amount * 2;
            }
            if(currency.equals("EUR")) {
                return amount;
            }
            return 0;
        }
        @Override
        public double convertToUSD(double amount) {
            if(currency.equals("EUR")) {
                currency = "USD";
                return amount / 2;
            }
            if(currency.equals("USD")) {
                return amount;
            }
            return 0;
        }
        @Override
        public double getConversionRate(String currency) {
            if(currency.equals("EUR")) {
                //System.out.println("1 EURO is 0.5 USD");
                return 0.5;
            }
            if(currency.equals("USD")) {
                //System.out.println("1 USD is 2 EUR");
                return 2;
            }
            return 0;
        }
    }
     class UnitConverter implements Converter {
        public String currency = "EUR";

        @Override
        public double convertToEuro(double amount) {
            if (currency.equals("USD")) {
                currency = "EUR";
                return amount * 2;
            }
            if (currency.equals("EUR")) {
                return amount;
            }
            return 0;
        }

        @Override
        public double convertToUSD(double amount) {
            if (currency.equals("EUR")) {
                currency = "USD";
                return amount / 2;
            }
            if (currency.equals("USD")) {
                return amount;
            }
            return 0;
        }

        @Override
        public double getConversionRate(String currency) {
            if (currency.equals("EUR")) {
                //System.out.println("1 EURO is 0.5 USD");
                return 0.5;
            }
            if (currency.equals("USD")) {
                //System.out.println("1 USD is 2 EUR");
                return 2;
            }
            return 0;
        }
    }
}
