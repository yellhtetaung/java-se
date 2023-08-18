public class Car {
    String type;
    String model;

    Car(String type, String model) {
        this.type = type;
        this.model = model;
    }

    Car(String str, boolean isType) {
        if (isType) {
            this.type = str;
        } else {
            this.model = str;
        }
    }

    Car() {
    }


    void showInfo() {
        System.out.println("Type : " + type);
        System.out.println("Model : " + model);
    }
}