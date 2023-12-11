class Class1 {
    String name;
    String model;
    int year;
    String color;

    Class1(String name, String model, int year, String color) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void start_engine() {
        System.out.println("Engine is started");
    }

    public static void main(String[] args) {
        Class1 c = new Class1("BMW", "Q7", 2022, "Red");
        System.out.println(c.name + " " + c.model);
        c.start_engine();
    }
}