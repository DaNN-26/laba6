import java.lang.String;

class Main {
    public static void main(String[] args) {
        Reader[] readers = {
                new Reader("Даниил", "Лапицкий", "Владимирович", 2203, "Здоровье и спорт", "26/11/2006", "+79042691369"),
                new Reader("Алексей", "Уханов", "Александрович", 1789, "Обществознание", "25/08/2006", "+79532516939"),
                new Reader("Илья", "Дугин", "Алексеевич", 4376, "Программирование", "08/06/2006", "+79042317211"),
                new Reader("Дмитрий", "Ермохин", "Евгеньевич", 5123, "История", "11/12/2005", "+79534376512"),
                new Reader("Нуриллохон", "Зимбабвех", "Архумицович", 1121, "История", "20/01/1992", "+79047771122")
        };

        readers[0].takeBook(6);
        readers[0].returnBook(2);

        readers[2].takeBook("История успеха создателя Ferrari - Лапицкого Даниила", "Ермошкины войны", "ПКИПТ: Руководство по выживанию");
        readers[2].returnBook("ПКИПТ: Руководство по выживанию", "Ермошкины войны");

        readers[1].takeBook("Искусство войны в Roblox", "Ермошкины войны", "Дугин: аферист или честный бизнесмен?");
        readers[1].returnBook("Дугин: аферист или честный бизнесмен?", "Ермошкины войны");
    }
}
class Reader {
    public String name;
    public String surname;
    public String dadname;
    public int num_ticket;
    public String facultet;
    public String date_birth;
    public String num_phone;

    Reader(String name, String surname, String dadname, int num_ticket, String facultet, String date_birth, String num_phone){
        this.name = name;
        this.surname = surname;
        this.dadname = dadname;
        this.num_ticket = num_ticket;
        this.facultet = facultet;
        this.date_birth = date_birth;
        this.num_phone = num_phone;
    }

    public void takeBook(int amountOfTakenBooks){
        if (amountOfTakenBooks > 0 ) {
            System.out.printf("%s %s %s взял %d книг(-и)", surname, name, dadname, amountOfTakenBooks);
            System.out.println();
        }
        else {
            System.out.println("Ошибка: Введено недопустимое число книг!");
            System.out.println();
        }
    }

    public void takeBook(String... namesOfTakenBooks){
        System.out.printf("%s %s %s взял книги:\n", surname, name, dadname);
        for(String takenbook : namesOfTakenBooks)
            System.out.printf("%s\n", takenbook);
        System.out.println();
    }

    public void returnBook(int amountOfReturnBooks){
        if (amountOfReturnBooks > 0) {
            System.out.printf("%s %s %s вернул %d книг(-и)", surname, name, dadname, amountOfReturnBooks);
            System.out.println();
        }
        else {
            System.out.println("Ошибка: Введено недопустимое число книг!");
            System.out.println();
        }
    }

    public void returnBook(String... namesOfReturnBooks){
        System.out.printf("%s %s %s вернул книги:\n", surname, name, dadname);
        for(String returnbook : namesOfReturnBooks)
            System.out.printf("%s\n", returnbook);
        System.out.println();
    }
}