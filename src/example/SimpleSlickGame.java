package example;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Image;


public class SimpleSlickGame extends BasicGame //My first comment
{

    Image bg;
    //City city = new City("test");

	public SimpleSlickGame(String gamename)
	{
		super(gamename);
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
        bg = new Image("assets/bg.png");
    }//Comment 2

	@Override
	public void update(GameContainer gc, int i) throws SlickException {
        //city.update(gc,i);
    }

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException
	{
		//g.drawString("Pandemic!",300 , 200);
        g.drawImage(bg,0,0);
	}

	public static void main(String[] args)
	{
		try
		{
			AppGameContainer appgc;
			appgc = new AppGameContainer(new SimpleSlickGame("Simple Slick Game"));
			appgc.setDisplayMode(1100, 778, false);
			appgc.start();
		}
		catch (SlickException ex)
		{
			Logger.getLogger(SimpleSlickGame.class.getName()).log(Level.SEVERE, null, ex);
		}
	}


}