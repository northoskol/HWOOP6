package task01;
//Принцип единственной ответственности (Single Responsibility Principle - SRP):
// Каждый класс имеет одну основную задачу. Например, классы Cat, Dog и VetClinic отвечают соответственно за
// описание кошек, собак и ветеринарной клиники.
//Принцип открытости/закрытости (Open/Closed Principle - OCP):
// Классы Animal, Cat и Dog открыты для расширения (можно создавать новые подклассы) и закрыты для изменений
// (их поведение изменить нельзя без нарушения структуры кода).
//Принцип подстановки Барбары Лисков (Liskov Substitution Principle - LSP):
// Этот принцип уже соблюдается в коде. Подклассы Cat и Dog могут использоваться вместо их
// суперкласса Animal без изменения корректности программы.
//Принцип разделения интерфейса (Interface Segregation Principle - ISP):
// Этот принцип говорит о том, что интерфейсы не должны быть слишком "толстыми".
// В нашем случае мы не используем интерфейсы, поэтому этот принцип не применим.
//Принцип инверсии зависимостей (Dependency Inversion Principle - DIP):
// Этот принцип гласит о том, что модули верхних уровней не должны зависеть от модулей нижних уровней,
// оба типа модулей должны зависеть от абстракций. В нашем коде VetClinic зависит от абстракции Animal,
// что является хорошим примером соблюдения этого принципа.

public class Main {
    public static void main(String[] args) {
        VetClinic<Animal> vetClinic = new VetClinic<>();
        Cat cat1 = new Cat("Tom");
        Cat cat2 = new Cat("Bazilio");
        Cat cat3 = new Cat("Ozzi");

        Dog dog1 = new Dog("Bob");
        Dog dog2 = new Dog("Puppy");

        vetClinic.add(cat1);
        vetClinic.add(cat2);
        vetClinic.add(dog1);
        vetClinic.add(dog2);
        System.out.println(vetClinic);
        vetClinic.help(cat2);
        vetClinic.help(dog1);
        vetClinic.setClient(cat3);
        vetClinic.add(cat3);
        System.out.println(vetClinic);
        System.out.println(vetClinic.getClient());
    }
}
