package ex3;

public class Spaceship {
    private String name;
    private int speed;
    private String status;

    public Spaceship(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void initShip() {
        this.status = "Готовий до зльоту";
        System.out.println("--- [Init-метод] Корабель " + name + " успішно ініціалізовано ---");
    }

    public void showInfo() {
        System.out.println("Корабель: " + name + ", Швидкість: " + speed + " км/год, Статус: " + status);
    }
}