import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.services.FilmsManager;

public class FilmManagerTest {

    @Test
    public void test() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Film1");
        manager.addFilms("Film2");
        manager.addFilms("Film3");
        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void test2() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Film1");
        manager.addFilms("Film2");
        manager.addFilms("Film3");
        String[] expected = {"Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
