import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Channel channel1 =new Channel (1,"ktrk");
        Channel channel2 =new Channel (2,"piramida");
        Channel channel3 =new Channel (3,"balastan");
        Channel channel4 =new Channel (4,"tumar tv");
        Channel channel5 =new Channel (5,"Элтр");
        Channel channel6 =new Channel (6,"ktrk sport");
        Channel channel7 =new Channel (7,"rtr");
        Channel channel8 =new Channel (8,"ilim bilim");
        Channel channel9 =new Channel (9,"ussuk-kol");
        Channel channel10=new Channel (10,"kino 312");
        Channel[]channels={ channel1, channel2, channel3, channel4,channel5, channel6, channel7, channel8, channel9, channel10};
        Television television=new Television(channel1,channels);
        television.currentChannelShow();
        television.beforeChannel();
        television.nextChannel();
        Scanner d=new Scanner(System.in);
        System.out.println("нажмите на номер канала ,и я выведу  имя канала");
        television.showNameofChannel(d.nextInt());
        System.out.println("нажмите на номер канала ,и я выведу   канал 6");
        television.numberChannel(d.nextInt());
    }
}
