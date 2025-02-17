import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsRepositoryTest {

    FilmsItem item1 = new FilmsItem(1, "Film1", "Genre1", 2025);
    FilmsItem item2 = new FilmsItem(2, "Film2", "Genre2", 2025);
    FilmsItem item3 = new FilmsItem(3, "Film3", "Genre3", 2025);

    @Test
    public void testRemoveByID() {
        FilmsRepository repo = new FilmsRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.removeByID(item2.getId());
        FilmsItem[] expected = new FilmsItem[]{item1, item3};
        FilmsItem[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveAll() {
        FilmsRepository repo = new FilmsRepository();
        repo.removeAll();
        FilmsItem[] expected = new FilmsItem[]{};
        FilmsItem[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll() {
        FilmsRepository repo = new FilmsRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        FilmsItem[] expected = {item1, item2, item3};
        FilmsItem[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindByID() {
        FilmsRepository repo = new FilmsRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        FilmsItem[] expected = {item3};
        FilmsItem[] actual = repo.findByID(item3.getId());
        Assertions.assertArrayEquals(expected, actual);
    }
}
