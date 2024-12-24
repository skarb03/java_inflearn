package oop1;

import java.util.Scanner;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        data.isOn = false;


        Scanner sc = new Scanner(System.in);
        on(data);
        volumeUp(data);
        off(data);
    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨: "+data.volume);
    }

    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨: "+data.volume);
    }

    static void showStatus(MusicPlayerData data){
        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨" + data.volume);
        } else {
            System.out.println("음악플레이어 off");
        }
    }
}