public class Tv {
    protected boolean power;
    protected int channel;
    protected int volume;

    public void power() {power =! power;}
    public void channelUp() {channel++;}
    public void channelDown()   {channel--;}
    public void volumeUp()  {volume++;}
    public void volumeDown()    {volume--;}
}
class VCR {
    protected int counter;

    public void play()  {

    }
    public void stop()  {

    }
    public void reset() {
        counter = 0;
    }
    public int getCounter() {
        return counter;
    }
    public void setCounter(int c)   {
        counter = c;
    }
}
/*자바에선 다중상속이 불가능하다.
* 하지만 필요하다면 interface을 통해 코드를 재작성을 한다면 다중상속의 특징을 살릴 수 있다.*/


interface IVCR {
    public void play();
    public void stop();
    public void reset();
    public int getCounter();
    public void setCounter(int c);

}
class TVCR extends Tv implements IVCR {
    VCR vcr = new VCR();
    public void play()  {
        vcr.play();
    }
    public void stop()  {
        vcr.stop();
    }
    public void reset()  {
        vcr.reset();
    }
    public int getCounter(){
        return vcr.getCounter();
    }
    public void setCounter(int c){
        vcr.setCounter(c);
    }
}

