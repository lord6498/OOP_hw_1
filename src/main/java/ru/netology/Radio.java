package ru.netology;

import lombok.*;

@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class Radio {

    @NonNull int channelAmount;
    int channel;
    int volume;


    public void setChannelRemote(int channel) {

        if (channel > channelAmount) {
            this.channel = channelAmount;
        } else {
            this.channel = channel;
        }
        if (channel < 0) {
            this.channel = 0;
        }

    } //Управление переключением каналов

    public void setVolume(int volume) { //Управление переключением громкости
        if (volume > 100 || volume < 0) {
            return;
        } else this.volume = volume;
    }

    public void next(int channel) {
        int channelValue = (channel + 1);
        if (channelValue>channelAmount){
            setChannel(0);
        }
        else {
            setChannel(channelValue);
        }
    }

    public void prev(int channel) {
        int channelValue = (channel - 1);
        if (channelValue<0){
            setChannel(channelAmount);
        }
        else {
            setChannel(channelValue);
        }
    }

    public void volumeUp(int volume) { //Прибавка громкости
        setVolume(volume + 1);
    }

    public void volumeDown(int volume) { //Отбавка громкости
        setVolume(volume - 1);
    }

}


