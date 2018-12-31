package org.example;

import com.jogamp.newt.event.KeyEvent;
import io.github.n3roo.engine.GameLoop;
import io.github.n3roo.graphics.Animation;
import io.github.n3roo.input.KeyInput;
import io.github.n3roo.resources.ImageResource;
import io.github.n3roo.world.GameObject;

public class TestPlayer extends GameObject {

    public TestPlayer(){
        animations = new Animation[1];
        animations[0] = new Animation();
        animations[0].frames = new ImageResource[2];
        animations[0].frames[0] = new ImageResource("testsprite_1.png");
        animations[0].frames[1] = new ImageResource("testsprite_2.png");
    }

    @Override
    public void update(){
        float xInput= 0;
        float yInput = 0;

        if(KeyInput.getKey(KeyEvent.VK_LEFT)){
            xInput --;
        }

        if(KeyInput.getKey(KeyEvent.VK_RIGHT)){
            xInput ++;
        }

        if(KeyInput.getKey(KeyEvent.VK_UP)){
            yInput ++;
        }

        if(KeyInput.getKey(KeyEvent.VK_DOWN)){
            yInput --;
        }

        x += xInput * GameLoop.updateDelta();
        y += yInput * GameLoop.updateDelta();
    }

}