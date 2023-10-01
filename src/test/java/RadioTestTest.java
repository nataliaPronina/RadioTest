import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTestTest {
    @Test
    public void shouldSetStation() {
        Radio station = new Radio();

        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation0() {
        Radio station = new Radio();

        station.setCurrentStation(0);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNull() {
        Radio station = new Radio();

        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationIfTen() {
        Radio station = new Radio();

        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationIfNine() {
        Radio station = new Radio();

        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(50);

        int expected = 50;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIfNull() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeIfMinus() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-5);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIf1() {
        Radio volume = new Radio();

        volume.setCurrentVolume(1);

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIf100() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIf101() {
        Radio volume = new Radio();

        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNext() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        station.next();

        int expected = 6;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNextIf9() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.next();
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNextIf0() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.next();
        int expected = 1;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationPrev() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.prev();
        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationPrevIfNine() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.prev();
        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeInc() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        volume.increaseVolume();
        int expected = 51;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIncIf100() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIncIfNull() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.increaseVolume();
        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeRed() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        volume.reduceVolume();
        int expected = 49;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeRedIfNull() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.reduceVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeRedIf100() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.reduceVolume();
        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}