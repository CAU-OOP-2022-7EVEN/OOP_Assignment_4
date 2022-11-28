package Model;

public class Accident{
    String date;
    String content;

    public Accident(String date, String content){
        this.date = date;
        this.content = content;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setContent(String content){
        this.content = content;
    }
}