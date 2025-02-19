public class FilmsRepository {
    private FilmsItem[] items = new FilmsItem[0]; //


    public void removeAll() {
        items = new FilmsItem[0];
    }


    /// removeById
    public void removeByID(int id) { /// Удаление фильма по ID
        FilmsItem[] tmp = new FilmsItem[items.length - 1];
        int copyToIndex = 0;
        for (FilmsItem item : items) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }

    /// save
    public void save(FilmsItem item) { /// Метод добавления в текущий массив нового фильма
        FilmsItem[] tmp = new FilmsItem[items.length + 1]; //
        for (int i = 0; i < items.length; i++) { //
            tmp[i] = items[i]; //
        }
        tmp[items.length] = item; //Записываем в последнюю ячейку новый фильм
        items = tmp; //
    }

    /// findAll
    public FilmsItem[] findAll() { /// Метод вывода всех фильмов
        return items;
    }


    /// findById
    public FilmsItem[] findByID(int id) { /// Поиск фильма по ID
        FilmsItem[] tmp = new FilmsItem[1];
        int copyToIndex = 0;
        for (FilmsItem item : items) {
            if (item.getId() == id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        return tmp;
       //return Arrays.copyOf(tmp, copyToIndex)  ;

    }


}
