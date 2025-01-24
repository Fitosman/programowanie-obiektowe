public interface Sensor {
     abstract double readValue();
     abstract String getStatus();
     abstract void reset();
     class PressureSensor implements Sensor {
        @Override
        public double readValue() {
            return 0;
        }
        @Override
        public String getStatus() {
            return "";
        }
        @Override
        public void reset() {}
    }
     class TemperatureSensor implements Sensor {
        @Override
        public double readValue() {
            return 0;
        }
        @Override
        public String getStatus() {
            return "";
        }
        @Override
        public void reset() {}
    }
}
