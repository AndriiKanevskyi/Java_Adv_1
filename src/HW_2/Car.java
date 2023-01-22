package HW_2;

public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int temp = this.speed - ((Car) o).speed;   // int temp = this.speed - o.speed;
        if (temp == 0) {
            temp = this.price - ((Car) o).price;
        } else return temp;
        if (temp == 0) {
            temp = this.model.compareTo(((Car) o).model);
        } else return temp;
        if (temp == 0) {
            temp = this.color.compareTo(((Car) o).color);
        } else return temp;
        return temp;
    }
}
        /**
         * Сравнение по совокупности факторов - алтернативный способ сравнения
         */
//        int temp1,temp2;
//        temp1=this.speed - ((Car)o).speed;
//        temp2=((Car) o).speed-this.speed;
//        temp1+=this.price - ((Car)o).price;
//        temp2+=((Car) o).price-this.price;
//        temp1+=this.model.compareTo(((Car) o).model);
//        temp2+=((Car) o).model.compareTo(((Car) o).model);
//        temp1+=this.color.compareTo(((Car) o).color);
//        temp2+=((Car) o).color.compareTo(((Car) o).color);
//        return temp1-temp2;


    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
