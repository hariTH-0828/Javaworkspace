package workSpace.src.designPattern.creational.factory.os;

public class MainWrapper {
    public OS getInstance(Source source){
        if(source.equals(getOpen())){
            return new Android();
        }

        if(source.equals(getClose())){
            return new IOS();
        }

        return null;
    }

    public Source getOpen() {
        return Source.OPEN;
    }

    public Source getClose() {
        return Source.CLOSE;
    }
}
