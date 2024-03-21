package task01;

import java.util.ArrayList;


public class VetClinic<T> {
    private T client;
    private final ArrayList<T> clients = new ArrayList<>();


    public void add(T client) {
        clients.add(client);
    }

    public T getClient() {
        return client;
    }

    public void setClient(T client) {
        this.client = client;
    }

    void help(T client) {
        if (clients.contains(client)) {
            System.out.printf("Клиент %s принят, вылечен и выписан!\n", client);
        } else {
            System.out.printf("Клиент %s отсутствует!", client);
        }
    }

    @Override
    public String toString() {
        return "VetClinic{" +
                "clients=" + clients +
                '}';
    }
}
