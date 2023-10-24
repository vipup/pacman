package pacman;

import java.io.File;

import java.io.IOException;


import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sounds {
 
   private String introMusic="sounds/pacman_beginning.wav";
    private String backgroundMusic =  "sounds/Backgroundmusic.wav";
    private String gameOver = "sounds/gameover.wav";
    private String eatGhost = "sounds/pacman_eatghost.wav";
    

    private Clip bgmSound,gameOverSound,introSound,eatghostSound;
    
    public Sounds(){


    
    try {
		bgmSound=AudioSystem.getClip();
	} catch (LineUnavailableException e) {
		
		e.printStackTrace();
	}
    try {
		gameOverSound= AudioSystem.getClip();
	} catch (LineUnavailableException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    try {
		introSound= AudioSystem.getClip();
	} catch (LineUnavailableException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    try {
  		eatghostSound= AudioSystem.getClip();
  	} catch (LineUnavailableException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}


    try {
		bgmSound.open(AudioSystem.getAudioInputStream(this.getClass().getClassLoader().getResourceAsStream(backgroundMusic)) );
	} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
		
		e.printStackTrace();
	}
    try {
		gameOverSound.open(AudioSystem.getAudioInputStream(this.getClass().getClassLoader().getResourceAsStream(gameOver) ) );
	} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
	
		e.printStackTrace();
	}
    try {
		introSound.open(AudioSystem.getAudioInputStream(this.getClass().getClassLoader().getResourceAsStream(introMusic) ) );
	} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
	
		e.printStackTrace();
	}
    
    try {
		eatghostSound.open(AudioSystem.getAudioInputStream(this.getClass().getClassLoader().getResourceAsStream(eatGhost) ) );
	} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
	
		e.printStackTrace();
	}
    
    
    
    
    }
    public void playbgmSound()
    {
    	
        bgmSound.start();
        bgmSound.loop(Clip.LOOP_CONTINUOUSLY);
      
    }
public void stopbgmSound() {
	bgmSound.stop();
}
    public void playgameoverSound()
    {
    	gameOverSound.setFramePosition(0);
        gameOverSound.start();
       
       
    }
    
    public void playintroSound()
    {
    	
        introSound.start();
        
        
    }
    
    public void playeatGhost()
    {
    	eatghostSound.setFramePosition(0);
       eatghostSound.start();
    }
}

