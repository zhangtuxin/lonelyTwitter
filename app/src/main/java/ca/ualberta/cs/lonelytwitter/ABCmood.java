package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class ABCmood
{
	protected Date date ;
	protected String mood;
	public abstract Boolean Isgood();
	public Mood(Date date, String mood)
	{
		this.date = date;
		this.mood = mood;
	}

	public Mood(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}
}