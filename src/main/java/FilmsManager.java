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

    public void findAllFilms2(FilmsItem item) {
        repo.findAll();
    }

    public void removeAllFilms(FilmsItem item) {
        repo.removeAll();
    }
    public FilmsItem[] findAllFilmsReversed() {
        FilmsItem[] all = repo.findAll();
        FilmsItem[] reversed = new FilmsItem[all.length];
        for (int i = 0; i < all.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    public int getTotalBoxOffice () {
        int sum = 0;
        for (FilmsItem item : repo.findAll()) {
            sum = sum + item.getBoxOfficee();
        }
        return sum;

    }


}
