package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class normalmood extends ABCmood
{
    public normalmood(Date date, String mood)
    {
        super(date,mood);
    }
    public normalmood(Date date)
    {
        super(date);
    }
    public Date getDate()
    {
        return this.date;
    }
    public String getMood()
    {
        return "Normal! "+ this.mood;
    }
    public Boolean Isgood()
    {
        return Boolean.FALSE;
    }


}