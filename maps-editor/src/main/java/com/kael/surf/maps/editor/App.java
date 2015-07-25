package com.kael.surf.maps.editor;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "example";
//		cfg.useGL20 = false;
		cfg.width = 1024;
		cfg.height = 768;
		
		new LwjglApplication(new MapEditor(), cfg);
    }
}
