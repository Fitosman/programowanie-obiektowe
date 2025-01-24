public abstract class WorkTool {
    public String name;
    public int productionYear;
    abstract public void use();
    public static class Hammer extends WorkTool {
        @Override
        public void use() {}
    }
    public static class Screwdriver extends WorkTool {
        @Override
        public void use() {}
    }
    public static class Saw extends WorkTool {
        @Override
        public void use() {}
    }
}
