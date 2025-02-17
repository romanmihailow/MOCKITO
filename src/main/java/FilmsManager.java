public class FilmsManager { //Создание класса

    private FilmsRepository repo;

    public FilmsManager(FilmsRepository repo) {
        this.repo = repo;
    }

    public void add(FilmsItem item) {
        repo.save(item);
    }

    public void removeID(FilmsItem item) {
        repo.removeByID(item.getId());
    }

    public void findID(FilmsItem item) {
        repo.findByID(item.getId());
    }

    public void findAllFilms(FilmsItem item) {
        repo.findAll();
    }

    public void removeAllFilms(FilmsItem item) {
        repo.removeAll();
    }


    //    private String[] films = new String[0]; //Объявление массива
//    private int limit; //Создание переменной

//    public FilmsManager() {
//        this.limit = 10; //Установление лимита 10 фильмов по умолчанию
//    }
//
//    public FilmsManager(int limit) { //
//        this.limit = limit; //Создание метода для изменения лимита
//    }


}
