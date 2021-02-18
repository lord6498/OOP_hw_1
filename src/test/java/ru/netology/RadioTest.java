package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @ParameterizedTest //Нажатие кнопки вперед для переключения каналов
    @CsvSource({"0,22", "11,10", "1,0"})
    public void nextRadioChannel(int expected, int inUse) {
        Radio radio = new Radio(22);
        radio.setChannel(inUse);
        radio.next(radio.getChannel());
        assertEquals(expected, radio.getChannel());

    }

    @ParameterizedTest //Нажатие кнопки назад для переключения каналов
    @CsvSource({"14,15", "9,10", "15,0"})
    public void prevRadioChannel(int expected, int inUse) {
        Radio radio = new Radio(15);
        radio.setChannel(inUse);
        radio.prev(radio.getChannel());
        assertEquals(expected, radio.getChannel());

    }

    @ParameterizedTest //Установка нужного канала с пульта
    @CsvSource ({"2,2","0,-5","10,20"})
    public void setNewChannel(int expected, int inUse) {
        Radio radio = new Radio(10);
        radio.setChannel(inUse);
        assertEquals(expected, radio.getChannel());

    }

    @ParameterizedTest //Нажатие кнопки + громкости
    @CsvSource({"100,100", "1,0", "1,0"})
    public void addVolume(int expected, int inUse) {
        Radio radio = new Radio();
        radio.setVolume(inUse);
        radio.volumeUp(radio.getVolume());
        assertEquals(expected, radio.getVolume());

    }

    @ParameterizedTest //Нажатие кнопки - громкости
    @CsvSource({"99,100", "0,0", "24,25"})
    public void subtractVolume(int expected, int inUse) {
        Radio radio = new Radio();
        radio.setVolume(inUse);
        radio.volumeDown(radio.getVolume());
        assertEquals(expected, radio.getVolume());

    }

}