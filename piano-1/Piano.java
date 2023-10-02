import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kolling
 * @version: 0.1
 */
public class Piano extends World
{
     String [] whiteKeys = {"a","s","d","f","g","h","j","k","l",";","["};
     //keyNames[0]
     String[] whiteKeySound = {"2a","2b","2c","2d","2e","2f","2g","3b","3c","3d","3e"};
     //soundFiles[0]
     String [] blackKeys = {"w","e","r","t","y","u","i","o","p"};
     String [] blackKeySounds = {"3a#","3c#","3d#","","3f#","3g#","4c#","4d#","4f#"};
    public Piano() 
    {
        super(800, 340, 1);
        prepare();
    }
    private void prepare()
    {
        for(int i =0; i < whiteKeys.length; i++)
        {
           Key key = new Key(whiteKeys[i], whiteKeySound[i] +".wav","white-key.png","white-key-down.png"); 
           addObject(key,54 + i * 63,130);
        }
        for(int i = 0; i < blackKeys.length;i++)
        {
            if(blackKeySounds[i] != "" )
            {
            Key bkey = new Key(blackKeys[i],blackKeySounds[i] +".wav","black-key.png","black-key-down.png");
            addObject(bkey,54 + i * 63 ,86);
        }
        }
    }
    
}