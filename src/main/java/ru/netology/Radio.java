package ru.netology;

public class Radio {

    private int channelAmount = 10;
    private int channel;
    private int volume;

    public Radio(int channelAmount) { //конструктор для установки количества каналов
        this.channelAmount = channelAmount;
    }

    public Radio () { //обычный конструктор
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {

        if (channel > channelAmount) {
            this.channel = 0;
        } else {
            this.channel = channel;
        }
        if (channel < 0) {
            this.channel = channelAmount;
        }

    } //Управление переключением каналов

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) { //Управление переключением громкости
        if (volume > 100 || volume < 0) {
            return;
        } else this.volume = volume;
    }

    public void next(int channel) {
        setChannel(channel + 1);
    }

    public void prev(int channel) {
        setChannel(channel - 1);
    }

    public void volumeUp(int volume) { //Прибавка громкости
        setVolume(volume + 1);
    }

    public void volumeDown(int volume) { //Отбавка громкости
        setVolume(volume - 1);
    }

}


