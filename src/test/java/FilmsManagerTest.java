import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class FilmsManagerTest {

    FilmsRepository repo = Mockito.mock(FilmsRepository.class); ///MOCKITO

//    FilmsRepository repo = new FilmsRepository();
    FilmsManager manager = new FilmsManager(repo);
    FilmsItem item1 = new FilmsItem(1, "Film1", "Genre1", 2025, 1000);
    FilmsItem item2 = new FilmsItem(2, "Film2", "Genre2", 2025, 2000);
    FilmsItem item3 = new FilmsItem(3, "Film3", "Genre3", 2025, 3000);

    @BeforeEach
    public void setup() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
    }


    @Test
    public void shouldReverseAllItems() {
        FilmsItem[] items = {item1, item2, item3}; ///MOCKITO
        doReturn(items).when(repo).findAll(); ///MOCKITO

        FilmsItem[] expected = new FilmsItem[] {item3, item2, item1};
        FilmsItem[] actual = manager.findAllFilmsReversed();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAllBoxOffice() {
        FilmsItem[] items = {item1, item2, item3}; ///MOCKITO
        doReturn(items).when(repo).findAll(); ///MOCKITO
        int expected = 6000;
        int actual = manager.getTotalBoxOffice();
        Assertions.assertEquals(expected, actual);
    }
}
