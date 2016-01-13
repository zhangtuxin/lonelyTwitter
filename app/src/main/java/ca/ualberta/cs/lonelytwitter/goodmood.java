package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
public class goodmood extends ABCmood{
    public Boolean Isgood(){
        return Boolean.TRUE;
    }
    public goodmood(Date date,String mood)
    {
        super (date,mood);
    }
    public goodmood(date)
    {
        super(date);
    }
    public Date getDate()
    {
        return this.date;
    }
    public String getMood()
    {
        return "Good!" + this.message;
    }


}