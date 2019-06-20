public class App
{
	public static void main(String[] args)
	{
		Player a = new Player("Samjhana");
		Player b = new Player("Kriptan");
		Ball b1 = new Ball("Football");
		Ball b2  = new Ball("Volleyball");
		
		a.kick(b1);
		b.kick(b1);
		b.kick(b2);
		a.kick(b2);

	}
}
class Ball
{
	private String label;
	public Ball(String label)
	{
		this.label=label;
	}

	public void roll()
	{
		System.out.println("Ball "+label+" is rolling");
	}
}
class Player
{
	private String name;
	public Player(String name)
	{
		this.name=name;
	}
	public void kick(Ball b)
	{
		System.out.println("Player: "+name+" has kicked the ball");
		b.roll();
	}
}



