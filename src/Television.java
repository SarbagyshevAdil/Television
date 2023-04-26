public class Television {
    private Channel currentChannel;
    private Channel[]maxChannels;

    public Television(Channel currentChannel, Channel[] maxChannels) {
        this.currentChannel = currentChannel;
        this.maxChannels = maxChannels;
    }

    public Television() {
    }
    public void nextChannel() {
        for (Channel s : maxChannels) {
            if (s.getNumber() == currentChannel.getNumber() + 1) {
                System.out.println(s);
            }
        }
    }
   public void beforeChannel(){
       for (Channel ss:maxChannels){
          if (ss.getNumber()==currentChannel.getNumber()-1) {
              System.out.println(ss);
          }
       }
    }
    public void numberChannel(int number){
        for (Channel a:maxChannels) {
        if (a.getNumber()==number)   {
            System.out.println(a);
        }
        }
    }
    public void currentChannelShow(){
        System.out.println(currentChannel);
    }
    public void showNameofChannel(int number){
        for (Channel f:maxChannels) {
            if(f.getNumber()==number){
                System.out.println(f.getName());
            }

        }
    }



    public Channel getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(Channel currentChannel) {
        this.currentChannel = currentChannel;
    }

    public Channel[] getMaxChannels() {
        return maxChannels;
    }

    public void setMaxChannels(Channel[] maxChannels) {
        this.maxChannels = maxChannels;
    }

}
