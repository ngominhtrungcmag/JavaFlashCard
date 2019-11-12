/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashcard.Controller;

import flashcrad.ConnectDB.KetNoi;

/**
 *
 * @author ngomi
 */
public class FlashCard {
    private String word;
    private String mean;
    private String type;
    private String user;
    private KetNoi connect;
    public void setType(String type)
    {
        this.type = type;
    }
    public void setWord(String word)
    {
        this.word = word;
    }
    public void setMean(String mean)
    {
        this.mean = mean;
    }
    public void setUser(String user)
    {
        this.user = user;
    }
    
    
    public String getWord()
    {
        return this.word;
    }
    public String getMean()
    {
        return this.mean;
    }
    public String getType()
    {
        return this.type;
    }
    public String getUser()
    {
        return this.user;
    }

}
