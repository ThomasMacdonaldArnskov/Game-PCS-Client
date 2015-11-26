package example;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 * Created by Marianne on 25-11-2015.
 */
public class ActionMenu extends BasicGame {

    private Button move;
    private Button researchSt;
    private Button removeCube;
    private Button share;
    private Button eventCard;
    private Button cure;
    private boolean isMoveActive;
    private boolean isResearchSActive;
    private boolean isRemoveCubeActive;
    private boolean isShareActive;
    private boolean isEventCardActive;
    private boolean isCureActive;

    public ActionMenu (String gametitle){

        super(gametitle);
        isMoveActive = false;
        isResearchSActive = false;
        isRemoveCubeActive = false;
        isShareActive = false;
        isEventCardActive = false;
        isCureActive = false;
    }




    @Override
    public void init(GameContainer  gc) throws SlickException {
    move = new Button("move", 950, 20, 6);
    researchSt =  new Button("researchSt", 1025, 15, 7);
    removeCube = new Button("removeCube", 1100, 15, 8);
    share = new Button("share", 1160, 10, 9);
    eventCard = new Button("eventCard", 1225, 15, 10);
    cure = new Button("cure", 1275, 15, 11);


    move.init(gc);
    researchSt.init(gc);
    removeCube.init(gc);
    share.init(gc);
    eventCard.init(gc);
    cure.init(gc);
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {

        if (move.clickWithin(gc)) {
            isMoveActive =! isMoveActive;
            isResearchSActive = false;
            isRemoveCubeActive = false;
            isCureActive = false;
            if (isMoveActive) {
                move.setPicIndexNo(23);
            } else {
                move.setPicIndexNo(6);
            }
        }

        if (researchSt.clickWithin(gc)){
            isResearchSActive =! isResearchSActive;
        }

        if (removeCube.clickWithin(gc)){
            isRemoveCubeActive =! isRemoveCubeActive;
        }

        if (share.clickWithin(gc)){
            isShareActive =! isShareActive;
        }

        if (eventCard.clickWithin(gc)){
            isEventCardActive =! isEventCardActive;
        }

        if (cure.clickWithin(gc)){
            isCureActive =! isCureActive;
        }
    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {

        move.render(gc, g);
     researchSt.render(gc, g);
     removeCube.render(gc, g);
        share.render(gc, g);
     eventCard.render(gc, g);
        cure.render(gc, g);

    }

    public boolean getIsMoveActive() {
        return isMoveActive;
    }
}
