package memento;

public class AppMemento {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem();
        operatingSystem.createBackup();
        OperatingSystemCaretaker operatingSystemCaretaker = new OperatingSystemCaretaker();
        operatingSystemCaretaker.addMemento(operatingSystem.save());
    }
}
