package guimy;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
/**
 *
 * @author 1
 */
public class GuiMy{
    
    
    private  int[][] playfild = new int[10][10];// поле морского боя ;
    private String name;
    private int paluba;
    private JLabel lab;
    private JLabel lab1;
    
    int one = 4;
    int two = 6;
    int three = 6;
    int four = 4;
   
    JButton start;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button10;
    JButton button11;
    JButton button12;
    JButton button13;
    JButton button14;
    JButton button15;
    JButton button16;
    JButton button17;
    JButton button18;
    JButton button19;
    JButton button20;
    JButton button21;
    JButton button22;
    JButton button23;
    JButton button24;
    JButton button25;
    JButton button26;
    JButton button27;
    JButton button28;
    JButton button29;
    JButton button30;
    JButton button31;
    JButton button32;
    JButton button33;
    JButton button34;
    JButton button35;
    JButton button36;
    JButton button37;
    JButton button38;
    JButton button39;
    JButton button40;
    JButton button41;
    JButton button42;
    JButton button43;
    JButton button44;
    JButton button45;
    JButton button46;
    JButton button47;
    JButton button48;
    JButton button49;
    JButton button50;
    JButton button51;
    JButton button52;
    JButton button53;
    JButton button54;
    JButton button55; 
    JButton button56;
    JButton button57;
    JButton button58;
    JButton button59;
    JButton button60;
    JButton button61;
    JButton button62;
    JButton button63;
    JButton button64;
    JButton button65;
    JButton button66;
    JButton button67;
    JButton button68;
    JButton button69;
    JButton button70;
    JButton button71;
    JButton button72;
    JButton button73;
    JButton button74;
    JButton button75;
    JButton button76;
    JButton button77;
    JButton button78;
    JButton button79;
    JButton button80;
    JButton button81;
    JButton button82;
    JButton button83;
    JButton button84;
    JButton button85;
    JButton button86;
    JButton button87;
    JButton button88;
    JButton button89;
    JButton button90;
    JButton button91;
    JButton button92;
    JButton button93;
    JButton button94;
    JButton button95;
    JButton button96;
    JButton button97;
    JButton button98;
    JButton button99;
    
    
    
    
     
      
    
            
      
    
    
   
    public void setPlayfild(int[][] playfild)
    {
        this.playfild = playfild;
    }
    
     public void setName(String name)
    {
        this.name = name;
    }
     
     public void setName(int paluba)
    {
        this.paluba = paluba;
    }  
    

 GuiMy(){
 
 GuiMy.Ship shipfour = new Ship("Four", playfild);//создаем и размещаем четырёхпалубный корабль
 GuiMy.Ship ship30 = new Ship(33, playfild);// создаем и размещаем  трёхпалубный корабль
 GuiMy.Ship ship31 = new Ship(33, playfild);// создаем и размещаем  трёхпалубный корабль
 GuiMy.Ship ship20 = new Ship("Two", 22, playfild);// создаем и размещаем  двухпалубный корабль
 GuiMy.Ship ship21 = new Ship("Two1", 22, playfild);//создаем и размещаем  двухпалубный корабль
 GuiMy.Ship ship22 = new Ship("Two2", 22, playfild);//создаем и размещаем  двухпалубный корабль
 GuiMy.Ship ship1 = new Ship(playfild);// создаем и размещаем однохпалубный корабль
 GuiMy.Ship ship2 = new Ship(playfild);
 GuiMy.Ship ship3 = new Ship(playfild);
 GuiMy.Ship ship4 = new Ship(playfild);
 for (int i = 0; i < playfild.length; i++)
 {
   for (int j = 0; j < playfild[i].length; j++)
   {
     if(playfild[j][i] == 0)
        playfild[j][i] = -1; 
   }
 }
 go();
 }
   

class Ship {   
public Ship(int[][] playfild)
 {
     // создаем и размещаем четырехпалубный корабль
   for (int i = 0; ; i++)
    {
     int yonepaluba = (int)(Math.random()*10);
     int xonepaluba = (int)(Math.random()*10);
      if (yonepaluba == 0 && xonepaluba == 0)
       {
         if (playfild[yonepaluba][xonepaluba] == 0)
         {
             playfild[yonepaluba][xonepaluba] = 12;
             playfild[yonepaluba + 1][xonepaluba] = -1;
             playfild[yonepaluba + 1][xonepaluba + 1] = -1;
             playfild[yonepaluba][xonepaluba + 1] = -1;
             break;
           }       
       }
    if (yonepaluba == 0 && xonepaluba == 9)
       {
         if (playfild[yonepaluba][xonepaluba] == 0)
         { 
             playfild[yonepaluba][xonepaluba] = 12;
             playfild[yonepaluba + 1][xonepaluba] = -1;
             playfild[yonepaluba + 1][xonepaluba - 1] = -1;
             playfild[yonepaluba][xonepaluba - 1] = -1;            
             break;
           }         
       }
    if (yonepaluba == 9 && xonepaluba == 9)
       {
         if (playfild[yonepaluba][xonepaluba] == 0)
         { 
             playfild[yonepaluba][xonepaluba] = 12;
             playfild[yonepaluba - 1][xonepaluba] = -1;
             playfild[yonepaluba - 1][xonepaluba - 1] = -1;
             playfild[yonepaluba][xonepaluba - 1] = -1;
             break;
           }         
       }
    
     if (yonepaluba == 9 && xonepaluba == 0)
       {
         if (playfild[yonepaluba][xonepaluba] == 0)
         { 
             playfild[yonepaluba][xonepaluba] = 12;
             playfild[yonepaluba - 1][xonepaluba] = -1;
             playfild[yonepaluba - 1][xonepaluba + 1] = -1;
             playfild[yonepaluba][xonepaluba + 1] = -1;
             break;
           }         
       }
    
     if (yonepaluba == 0 && xonepaluba < 9 && xonepaluba > 0)
       {
         if (playfild[yonepaluba][xonepaluba] == 0)
         { 
             playfild[yonepaluba][xonepaluba] = 12;
             playfild[yonepaluba + 1][xonepaluba] = -1;
             playfild[yonepaluba + 1][xonepaluba + 1] = -1;
             playfild[yonepaluba][xonepaluba + 1] = -1;
             playfild[yonepaluba + 1][xonepaluba - 1] = -1;
             playfild[yonepaluba][xonepaluba - 1] = -1;
             break;
           }         
       }

    
     if (yonepaluba > 0  && yonepaluba < 9 && xonepaluba == 9)
       {
         if (playfild[yonepaluba][xonepaluba] == 0)
         { 
             playfild[yonepaluba][xonepaluba] = 12;
             playfild[yonepaluba + 1][xonepaluba] = -1;
             playfild[yonepaluba + 1][xonepaluba - 1] = -1;
             playfild[yonepaluba - 1][xonepaluba] = -1;
             playfild[yonepaluba - 1][xonepaluba - 1] = -1;
             playfild[yonepaluba][xonepaluba - 1] = -1; 
           break;
           }         
       }

   
     if (yonepaluba == 9 && xonepaluba < 9 && xonepaluba > 0)
       {
         if (playfild[yonepaluba][xonepaluba] == 0)
         {
             playfild[yonepaluba][xonepaluba] = 12;
             playfild[yonepaluba][xonepaluba + 1] = -1;
             playfild[yonepaluba- 1][xonepaluba + 1] = -1;
             playfild[yonepaluba - 1][xonepaluba] = -1;
             playfild[yonepaluba - 1][xonepaluba - 1] = -1;
             playfild[yonepaluba][xonepaluba - 1] = -1;
             break; 
           }         
       }



     if (yonepaluba < 9 && yonepaluba > 0 && xonepaluba == 0 )
       {
         if (playfild[yonepaluba][xonepaluba] == 0)
         { 
             playfild[yonepaluba][xonepaluba] = 12;
             playfild[yonepaluba + 1][xonepaluba] = -1;
             playfild[yonepaluba- 1][xonepaluba + 1] = -1;
             playfild[yonepaluba - 1][xonepaluba] = -1;
             playfild[yonepaluba + 1][xonepaluba + 1] = -1;
             playfild[yonepaluba][xonepaluba + 1] = -1;
             break;
           }         
       }

    if (yonepaluba < 9 && yonepaluba > 0 && xonepaluba > 0 && xonepaluba < 9)
       {
         if (playfild[yonepaluba][xonepaluba] == 0)
         { 
             playfild[yonepaluba][xonepaluba] = 12;
             playfild[yonepaluba - 1][xonepaluba] = -1;
             playfild[yonepaluba + 1][xonepaluba] = -1; 
             playfild[yonepaluba - 1][xonepaluba - 1] = -1;
             playfild[yonepaluba + 1][xonepaluba - 1] = -1; 
             playfild[yonepaluba][xonepaluba - 1] = -1;
             playfild[yonepaluba - 1][xonepaluba + 1] = -1;
             playfild[yonepaluba + 1][xonepaluba + 1] = -1; 
             playfild[yonepaluba][xonepaluba + 1] = -1;             
             break;
           }        
       }
  }
  
}
    
    public Ship(String name, int[][] playfild)
    {
        int yfourpaluba = (int)(Math.random()*10);
        int xfourpaluba = (int)(Math.random()*10);
    
   if ((yfourpaluba > 0 && yfourpaluba < 6) && (xfourpaluba > 0 && xfourpaluba < 6))
    {
     playfild[yfourpaluba][xfourpaluba] = 4;
     int x1 = (int)(Math.random()*12);
    if (x1 % 2 == 0)
     {
      playfild[yfourpaluba][xfourpaluba + 1] = 4;
      playfild[yfourpaluba][xfourpaluba + 2] = 4;
      playfild[yfourpaluba][xfourpaluba + 3] = 4;
      playfild[yfourpaluba][xfourpaluba + 4] = -1;
      playfild[yfourpaluba][xfourpaluba - 1] = -1;
       for (int i = 0; i < 6; i ++)
        {
         playfild[yfourpaluba - 1][xfourpaluba - 1 + i] = -1;
        }
       for (int i = 0; i < 6; i ++)
        {
         playfild[yfourpaluba + 1][xfourpaluba - 1 + i] = -1;
        }
      }
    if (x1 % 2 != 0)
     {
      playfild[yfourpaluba + 1][xfourpaluba] = 4;
      playfild[yfourpaluba + 2][xfourpaluba] = 4;
      playfild[yfourpaluba + 3][xfourpaluba] = 4;
      playfild[yfourpaluba + 4][xfourpaluba] = -1;
      playfild[yfourpaluba - 1][xfourpaluba] = -1;
       for (int i = 0; i < 6; i ++)
        {
         playfild[yfourpaluba - 1 + i][xfourpaluba - 1] = -1;
        }
       for (int i = 0; i < 6; i ++)
        {
         playfild[yfourpaluba - 1 + i][xfourpaluba + 1] = -1;
        }
      }
    }
     
   if ((yfourpaluba > 0 && yfourpaluba < 6) && (xfourpaluba > 5 && xfourpaluba < 9))
    {
     playfild[yfourpaluba][xfourpaluba] = 4;
     int x1 = (int)(Math.random()*12);
    if (x1 % 2 == 0)
     {
      playfild[yfourpaluba][xfourpaluba - 1] = 4;
      playfild[yfourpaluba][xfourpaluba - 2] = 4;
      playfild[yfourpaluba][xfourpaluba - 3] = 4;
      playfild[yfourpaluba][xfourpaluba - 4] = -1;
      playfild[yfourpaluba][xfourpaluba + 1] = -1;
       for (int i = 0; i < 6; i ++)
        {
         playfild[yfourpaluba + 1][xfourpaluba + 1  - i] = -1;
        }
       for (int i = 0; i < 6; i ++)
        {
         playfild[yfourpaluba - 1][xfourpaluba + 1 - i] = -1;
        }
      }
    if (x1 % 2 != 0)
     {
      playfild[yfourpaluba + 1][xfourpaluba] = 4;
      playfild[yfourpaluba + 2][xfourpaluba] = 4;
      playfild[yfourpaluba + 3][xfourpaluba] = 4;
      playfild[yfourpaluba + 4][xfourpaluba] = -1;
      playfild[yfourpaluba - 1][xfourpaluba] = -1;
       for (int i = 0; i < 6; i ++)
        {
         playfild[yfourpaluba - 1 + i][xfourpaluba - 1] = -1;
        }
       for (int i = 0; i < 6; i ++)
        {
         playfild[yfourpaluba - 1 + i][xfourpaluba + 1] = -1;
        }
      }
    } 
   
   if ((yfourpaluba > 5 && yfourpaluba < 9) && (xfourpaluba > 0 && xfourpaluba < 6))
    {
     playfild[yfourpaluba][xfourpaluba] = 4;
     int x1 = (int)(Math.random()*12);
    if (x1 % 2 == 0)
     {
      playfild[yfourpaluba][xfourpaluba + 1] = 4;
      playfild[yfourpaluba][xfourpaluba + 2] = 4;
      playfild[yfourpaluba][xfourpaluba + 3] = 4;
      playfild[yfourpaluba][xfourpaluba + 4] = -1;
      playfild[yfourpaluba][xfourpaluba - 1] = -1;
       for (int i = 0; i < 6; i ++)
        {
         playfild[yfourpaluba - 1][xfourpaluba - 1 + i] = -1;
        }
       for (int i = 0; i < 6; i ++)
        {
         playfild[yfourpaluba + 1][xfourpaluba - 1 + i] = -1;
        }
      }
    if (x1 % 2 != 0)
     {
      playfild[yfourpaluba - 1][xfourpaluba] = 4;
      playfild[yfourpaluba - 2][xfourpaluba] = 4;
      playfild[yfourpaluba - 3][xfourpaluba] = 4;
      playfild[yfourpaluba - 4][xfourpaluba] = -1;
      playfild[yfourpaluba + 1][xfourpaluba] = -1;
       for (int i = 0; i < 6; i ++)
        {
         playfild[yfourpaluba + 1 - i][xfourpaluba - 1] = -1;
        }
       for (int i = 0; i < 6; i ++)
        {
         playfild[yfourpaluba + 1 - i][xfourpaluba + 1] = -1;
        }
      }
    } 
    
    if ((yfourpaluba > 5 && yfourpaluba < 9) && (xfourpaluba > 5 && xfourpaluba < 9))
    {
     playfild[yfourpaluba][xfourpaluba] = 4;
     int x1 = (int)(Math.random()*12);
   if (x1 % 2 == 0)
    {
     playfild[yfourpaluba][xfourpaluba - 1] = 4;
     playfild[yfourpaluba][xfourpaluba - 2] = 4;
     playfild[yfourpaluba][xfourpaluba - 3] = 4;
     playfild[yfourpaluba][xfourpaluba - 4] = -1;
     playfild[yfourpaluba][xfourpaluba + 1] = -1;
     for (int i = 0; i < 6; i ++)
     {
         playfild[yfourpaluba - 1][xfourpaluba + 1 - i] = -1;
     }
      for (int i = 0; i < 6; i ++)
     {
         playfild[yfourpaluba + 1][xfourpaluba + 1 - i] = -1;
     }
    }
   if (x1 % 2 != 0)
    {
     playfild[yfourpaluba - 1][xfourpaluba] = 4;
     playfild[yfourpaluba - 2][xfourpaluba] = 4;
     playfild[yfourpaluba - 3][xfourpaluba] = 4;
     playfild[yfourpaluba - 4][xfourpaluba] = -1;
     playfild[yfourpaluba + 1][xfourpaluba] = -1;
       for (int i = 0; i < 6; i ++)
        {
         playfild[yfourpaluba + 1 - i][xfourpaluba - 1] = -1;
        }
      for (int i = 0; i < 6; i ++)
        {
         playfild[yfourpaluba + 1 - i][xfourpaluba + 1] = -1;
        }     
     }
    }
    
    if (yfourpaluba == 0 && xfourpaluba == 0)
      { 
       playfild[yfourpaluba][xfourpaluba] = 4;
       int x1 = (int)(Math.random()*12);
        if (x1 % 2 == 0)
         { 
          playfild[yfourpaluba + 1][xfourpaluba] = 4;
          playfild[yfourpaluba + 2][xfourpaluba] = 4;
          playfild[yfourpaluba + 3][xfourpaluba] = 4;
          playfild[yfourpaluba + 4][xfourpaluba] = -1;
             for (int i = 0; i < 5; i++)
               {
                 playfild[yfourpaluba + i][xfourpaluba + 1] = -1;
               }
           }
         if (x1 % 2 != 0)
          { 
           playfild[yfourpaluba][xfourpaluba + 1] = 4;
           playfild[yfourpaluba][xfourpaluba + 2] = 4;
           playfild[yfourpaluba][xfourpaluba + 3] = 4;
           playfild[yfourpaluba][xfourpaluba + 4] = -1;
             for (int i = 0; i < 5; i++)
               {
                 playfild[yfourpaluba + 1][xfourpaluba + i] = -1;
               }
           }
        }
  
    if (yfourpaluba == 0 && xfourpaluba == 9)
      { 
       playfild[yfourpaluba][xfourpaluba] = 4;
       int x1 = (int)(Math.random()*12);
        if (x1 % 2 == 0)
         { 
          playfild[yfourpaluba + 1][xfourpaluba] = 4;
          playfild[yfourpaluba + 2][xfourpaluba] = 4;
          playfild[yfourpaluba + 3][xfourpaluba] = 4;
          playfild[yfourpaluba + 4][xfourpaluba] = -1;
             for (int i = 0; i < 5; i++)
               {
                 playfild[yfourpaluba + i][xfourpaluba - 1] = -1;
               }
           }
         if (x1 % 2 != 0)
         { 
          playfild[yfourpaluba][xfourpaluba - 1] = 4;
          playfild[yfourpaluba][xfourpaluba - 2] = 4;
          playfild[yfourpaluba][xfourpaluba - 3] = 4;
          playfild[yfourpaluba][xfourpaluba - 4] = -1;
             for (int i = 0; i < 5; i++)
               {
                 playfild[yfourpaluba + 1][xfourpaluba - i] = -1;
               }
           }
        }
     
    if (yfourpaluba == 9 && xfourpaluba == 0)
      { 
       playfild[yfourpaluba][xfourpaluba] = 4;
       int x1 = (int)(Math.random()*12);
        if (x1 % 2 == 0)
         { 
          playfild[yfourpaluba - 1][xfourpaluba] = 4;
          playfild[yfourpaluba - 2][xfourpaluba] = 4;
          playfild[yfourpaluba - 3][xfourpaluba] = 4;
          playfild[yfourpaluba - 4][xfourpaluba] = -1;
             for (int i = 0; i < 5; i++)
               {
                 playfild[yfourpaluba - i][xfourpaluba + 1] = -1;
               }
           }
         if (x1 % 2 != 0)
         { 
          playfild[yfourpaluba][xfourpaluba + 1] = 4;
          playfild[yfourpaluba][xfourpaluba + 2] = 4;
          playfild[yfourpaluba][xfourpaluba + 3] = 4;
          playfild[yfourpaluba][xfourpaluba + 4] = -1;
             for (int i = 0; i < 5; i++)
               {
                 playfild[yfourpaluba - 1][xfourpaluba + i] = -1;
               }
           }
        }
       
     if (yfourpaluba == 9 && xfourpaluba == 9)
      { 
       playfild[yfourpaluba][xfourpaluba] = 4;
       int x1 = (int)(Math.random()*12);
        if (x1 % 2 == 0)
         { 
          playfild[yfourpaluba - 1][xfourpaluba] = 4;
          playfild[yfourpaluba - 2][xfourpaluba] = 4;
          playfild[yfourpaluba - 3][xfourpaluba] = 4;
          playfild[yfourpaluba - 4][xfourpaluba] = -1;
             for (int i = 0; i < 5; i++)
               {
                 playfild[yfourpaluba - i][xfourpaluba - 1] = -1;
               }
           }
         if (x1 % 2 != 0)
         { 
          playfild[yfourpaluba][xfourpaluba - 1] = 4;
          playfild[yfourpaluba][xfourpaluba - 2] = 4;
          playfild[yfourpaluba][xfourpaluba - 3] = 4;
          playfild[yfourpaluba][xfourpaluba - 4] = -1;
             for (int i = 0; i < 5; i++)
               {
                 playfild[yfourpaluba - 1][xfourpaluba - i] = -1;
               }
           }
        }
         
     if (yfourpaluba == 9 && xfourpaluba > 0 && xfourpaluba < 6)
      { 
          playfild[yfourpaluba][xfourpaluba] = 4;    
          playfild[yfourpaluba][xfourpaluba + 1] = 4;
          playfild[yfourpaluba][xfourpaluba + 2] = 4;
          playfild[yfourpaluba][xfourpaluba + 3] = 4;
          playfild[yfourpaluba][xfourpaluba + 4] = -1;
          playfild[yfourpaluba][xfourpaluba - 1] = -1;
             for (int i = 0; i < 6; i++)
               {
                 playfild[yfourpaluba - 1][xfourpaluba - 1 + i] = -1;
               }           
        }
    
      if (yfourpaluba == 9 && xfourpaluba > 5 && xfourpaluba < 9)
      { 
          playfild[yfourpaluba][xfourpaluba] = 4;   
          playfild[yfourpaluba][xfourpaluba - 1] = 4;
          playfild[yfourpaluba][xfourpaluba - 2] = 4;
          playfild[yfourpaluba][xfourpaluba - 3] = 4;
          playfild[yfourpaluba][xfourpaluba - 4] = -1;
          playfild[yfourpaluba][xfourpaluba + 1] = -1;
             for (int i = 0; i < 6; i++)
               {
                 playfild[yfourpaluba - 1][xfourpaluba + 1 - i] = -1;
               }           
      } 
      
       if (yfourpaluba == 0 && xfourpaluba > 0 && xfourpaluba < 6)
      { 
          playfild[yfourpaluba][xfourpaluba] = 4;    
          playfild[yfourpaluba][xfourpaluba + 1] = 4;
          playfild[yfourpaluba][xfourpaluba + 2] = 4;
          playfild[yfourpaluba][xfourpaluba + 3] = 4;
          playfild[yfourpaluba][xfourpaluba + 4] = -1;
          playfild[yfourpaluba][xfourpaluba - 1] = -1;
             for (int i = 0; i < 5; i++)
               {
                 playfild[yfourpaluba + 1][xfourpaluba - 1 + i] = -1;
               }           
        }
    
      if (yfourpaluba == 0 && xfourpaluba > 5 && xfourpaluba < 9)
      { 
          playfild[yfourpaluba][xfourpaluba] = 4;   
          playfild[yfourpaluba][xfourpaluba - 1] = 4;
          playfild[yfourpaluba][xfourpaluba - 2] = 4;
          playfild[yfourpaluba][xfourpaluba - 3] = 4;
          playfild[yfourpaluba][xfourpaluba - 4] = -1;
          playfild[yfourpaluba][xfourpaluba + 1] = -1;
             for (int i = 0; i < 5; i++)
               {
                 playfild[yfourpaluba + 1][xfourpaluba + 1 - i] = -1;
               }           
        }
        
      if (yfourpaluba > 0 && yfourpaluba < 6 && xfourpaluba == 0)
      {   
          playfild[yfourpaluba][xfourpaluba] = 4;
          playfild[yfourpaluba + 1][xfourpaluba] = 4;   
          playfild[yfourpaluba + 2][xfourpaluba] = 4;
          playfild[yfourpaluba + 3][xfourpaluba] = 4;
          playfild[yfourpaluba + 4][xfourpaluba] = -1;          
          playfild[yfourpaluba - 1][xfourpaluba] = -1;
             for (int i = 0; i < 6; i++)
               {
                 playfild[yfourpaluba - 1 + i][xfourpaluba + 1] = -1;
               }           
        }  
      
     if (yfourpaluba > 5 && yfourpaluba < 9 && xfourpaluba == 0)
      {   
          playfild[yfourpaluba][xfourpaluba] = 4;
          playfild[yfourpaluba - 1][xfourpaluba] = 4;   
          playfild[yfourpaluba - 2][xfourpaluba] = 4;
          playfild[yfourpaluba - 3][xfourpaluba] = 4;
          playfild[yfourpaluba - 4][xfourpaluba] = -1;          
          playfild[yfourpaluba + 1][xfourpaluba] = -1;
             for (int i = 0; i < 6; i++)
               {
                 playfild[yfourpaluba + 1 - i][xfourpaluba + 1] = -1;
               }           
        }
     
    if (yfourpaluba > 0 && yfourpaluba < 6 && xfourpaluba == 9)
      {   
          playfild[yfourpaluba][xfourpaluba] = 4;
          playfild[yfourpaluba + 1][xfourpaluba] = 4;   
          playfild[yfourpaluba + 2][xfourpaluba] = 4;
          playfild[yfourpaluba + 3][xfourpaluba] = 4;
          playfild[yfourpaluba + 4][xfourpaluba] = -1;          
          playfild[yfourpaluba - 1][xfourpaluba] = -1;
             for (int i = 0; i < 6; i++)
               {
                 playfild[yfourpaluba - 1 + i][xfourpaluba - 1] = -1;
               }           
        }  
      
     if (yfourpaluba > 5 && yfourpaluba < 9 && xfourpaluba == 9)
      {   
          playfild[yfourpaluba][xfourpaluba] = 4;
          playfild[yfourpaluba - 1][xfourpaluba] = 4;   
          playfild[yfourpaluba - 2][xfourpaluba] = 4;
          playfild[yfourpaluba - 3][xfourpaluba] = 4;
          playfild[yfourpaluba - 4][xfourpaluba] = -1;          
          playfild[yfourpaluba + 1][xfourpaluba] = -1;
             for (int i = 0; i < 6; i++)
               {
                 playfild[yfourpaluba + 1 - i][xfourpaluba - 1] = -1;
               }           
        }
    }

    
    
public Ship(int paluba, int[][] playfild)
{
 



// создаем и размещаем трехпалубные корабли
for (int i = 0; ; i++)
 {
   int ythreepaluba = (int)(Math.random()*10);
   int xthreepaluba = (int)(Math.random()*10);

if (playfild[ythreepaluba][xthreepaluba] == 0) 
 {

 
// ythreepaluba = 0, xthreepaluba = 0
 if (ythreepaluba == 0 && xthreepaluba == 0)
  {
  if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba + 1] == 0) && (playfild[ythreepaluba][xthreepaluba + 2] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba + 1] = 35;
         playfild[ythreepaluba][xthreepaluba + 2] = 35;
         playfild[ythreepaluba][xthreepaluba + 3] = -1;
           for ( i = 0; i < 4; i++)
           {
               playfild[ythreepaluba + 1][xthreepaluba + i] = -1;
           }
          break;
       }
   

       if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba + 1][xthreepaluba] == 0) && (playfild [ythreepaluba + 2][xthreepaluba] == 0))
       {        
           playfild[ythreepaluba][xthreepaluba] = 35;
           playfild[ythreepaluba + 1][xthreepaluba] = 35;
           playfild[ythreepaluba + 2][xthreepaluba] = 35;
           playfild[ythreepaluba + 3][xthreepaluba] = -1;
            for (i = 0; i < 4; i++)
             {
              playfild[ythreepaluba + i][xthreepaluba + 1] = -1;
             }
           break;  
       }
   }

//ythreepaluba = 0, xthreepaluba = 9
if (ythreepaluba == 0 && xthreepaluba == 9)
 {
  if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba - 1] == 0) && (playfild[ythreepaluba]     [xthreepaluba - 2] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba - 1] = 35;
         playfild[ythreepaluba][xthreepaluba - 2] = 35;
         playfild[ythreepaluba][xthreepaluba - 3] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ythreepaluba + 1][xthreepaluba - i] = -1;
            }
          break;
       }
       
       if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba + 1][xthreepaluba] == 0) && (playfild[ythreepaluba + 2][xthreepaluba] == 0))
       {        
           playfild[ythreepaluba][xthreepaluba] = 35;
           playfild[ythreepaluba + 1][xthreepaluba] = 35;
           playfild[ythreepaluba + 2][xthreepaluba] = 35;
           playfild[ythreepaluba + 3][xthreepaluba] = -1;
            for (i = 0; i < 4; i++)
             {
              playfild[ythreepaluba + i][xthreepaluba - 1] = -1;
             }
          break;   
       }    
  }
// ythreepaluba = 9, xthreepaluba = 9
if (ythreepaluba == 9 && xthreepaluba == 9)
  { 
if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba - 1] == 0) && (playfild[ythreepaluba][xthreepaluba - 2] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba - 1] = 35;
         playfild[ythreepaluba][xthreepaluba - 2] = 35;
         playfild[ythreepaluba][xthreepaluba - 3] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ythreepaluba - 1][xthreepaluba - i] = -1;
            }
          break;
       }
       
     if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba - 1][xthreepaluba] == 0) && (playfild[ythreepaluba - 2][xthreepaluba] == 0))
       {        
           playfild[ythreepaluba][xthreepaluba] = 35;
           playfild[ythreepaluba - 1][xthreepaluba] = 35;
           playfild[ythreepaluba - 2][xthreepaluba] = 35;
           playfild[ythreepaluba - 3][xthreepaluba] = -1;
            for (i = 0; i < 4; i++)
             {
              playfild[ythreepaluba - i][xthreepaluba - 1] = -1;
             }
           break; 
       }      
  }
// ythreepaluba = 9, xthreepaluba = 0
if (ythreepaluba == 9 && xthreepaluba == 0)
  {
 if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba + 1] == 0) && (playfild[ythreepaluba][xthreepaluba + 2] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba + 1] = 35;
         playfild[ythreepaluba][xthreepaluba + 2] = 35;
         playfild[ythreepaluba][xthreepaluba + 3] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ythreepaluba - 1][xthreepaluba + i] = -1;
            }
          break;
       }
       
       if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba - 1][xthreepaluba] == 0) && (playfild[ythreepaluba - 2][xthreepaluba] == 0))
       {        
           playfild[ythreepaluba][xthreepaluba] = 35;
           playfild[ythreepaluba - 1][xthreepaluba] = 35;
           playfild[ythreepaluba - 2][xthreepaluba] = 35;
           playfild[ythreepaluba - 3][xthreepaluba] = -1;
            for (i = 0; i < 4; i++)
             {
              playfild[ythreepaluba - i][xthreepaluba + 1] = -1;
             }
            break; 
       }    
   }

//ythreepaluba = 0, xthreepaluba > 1 && xthreepaluba < 9
 if (ythreepaluba == 0 && xthreepaluba > 0 && xthreepaluba < 4)
   {
       if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba + 1] == 0) && (playfild[ythreepaluba][xthreepaluba + 2] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba + 1] = 35;
         playfild[ythreepaluba][xthreepaluba + 2] = 35;
         playfild[ythreepaluba][xthreepaluba + 3] = -1;
         playfild[ythreepaluba][xthreepaluba - 1] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1][xthreepaluba - 1 + i] = -1;
            }
          break;
       }
      
     if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba + 1][xthreepaluba] == 0) && (playfild[ythreepaluba + 2][xthreepaluba] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba + 1][xthreepaluba] = 35;
         playfild[ythreepaluba + 2][xthreepaluba] = 35;
         playfild[ythreepaluba + 3][xthreepaluba] = -1;

          for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba  + i][xthreepaluba - 1] = -1;
            }
          for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + i][xthreepaluba + 1] = -1;
            }

          break;
       }
   }
       
     if (ythreepaluba == 0 && xthreepaluba > 3 && xthreepaluba < 7)
      {

       if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba + 1] == 0) && (playfild[ythreepaluba][xthreepaluba + 2] == 0))
         {           
          playfild[ythreepaluba][xthreepaluba] = 35;
          playfild[ythreepaluba][xthreepaluba + 1] = 35;
          playfild[ythreepaluba][xthreepaluba + 2] = 35;
          playfild[ythreepaluba][xthreepaluba + 3] = -1;
          playfild[ythreepaluba][xthreepaluba - 1] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1][xthreepaluba - 1 + i] = -1;
            }
           break;
          }
        
      
      if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba - 1] == 0) && (playfild[ythreepaluba][xthreepaluba - 2] == 0))
        {           
          playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba - 1] = 35;
         playfild[ythreepaluba][xthreepaluba - 2] = 35;
         playfild[ythreepaluba][xthreepaluba - 3] = -1;
         playfild[ythreepaluba][xthreepaluba + 1] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1][xthreepaluba + 1 - i] = -1;
            }
           break;
        }       
      }
      
    if (ythreepaluba == 0 && xthreepaluba > 6 && xthreepaluba < 9)
      {
             
       if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba - 1] == 0) && (playfild[ythreepaluba][xthreepaluba - 2] == 0))
        {                    
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba - 1] = 35;
         playfild[ythreepaluba][xthreepaluba - 2] = 35;
         playfild[ythreepaluba][xthreepaluba - 3] = -1;
         playfild[ythreepaluba][xthreepaluba + 1] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1][xthreepaluba + 1 - i] = -1;
            }
          break;
        }
      if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba + 1][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba + 2] == 0))
        {                    
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba + 1][xthreepaluba] = 35;
         playfild[ythreepaluba + 2][xthreepaluba] = 35;
         playfild[ythreepaluba + 3][xthreepaluba] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + i][xthreepaluba + 1] = -1;
            }
          for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + i][xthreepaluba - 1] = -1;
            }

          break;
        }
      }
   

// ythreepaluba > 0 && ythreepaluba < 9 && xthreepaluba = 9

 if (ythreepaluba > 0 && ythreepaluba < 4 && xthreepaluba == 9)
      {
       if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba + 1][xthreepaluba] == 0) && (playfild[ythreepaluba + 2][xthreepaluba] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba + 1][xthreepaluba] = 35;
         playfild[ythreepaluba + 2][xthreepaluba] = 35;
         playfild[ythreepaluba + 3][xthreepaluba] = -1;
         playfild[ythreepaluba - 1][xthreepaluba] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1 + i][xthreepaluba - 1] = -1;
            }
          break;
       }

     if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba - 1] == 0) && (playfild[ythreepaluba][xthreepaluba - 2] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba - 1] = 35;
         playfild[ythreepaluba][xthreepaluba - 2] = 35;
         playfild[ythreepaluba][xthreepaluba - 3] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1][xthreepaluba - i] = -1;
            }
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1][xthreepaluba - 1] = -1;
            }

          break;
       }
      }

      
       
      if (ythreepaluba > 3 && ythreepaluba < 7 && xthreepaluba == 9)
      {        
         if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba + 1][xthreepaluba] == 0) && (playfild[ythreepaluba + 2][xthreepaluba] == 0))
         {           
          playfild[ythreepaluba][xthreepaluba] = 35;
          playfild[ythreepaluba + 1][xthreepaluba] = 35;
          playfild[ythreepaluba + 2][xthreepaluba] = 35;
          playfild[ythreepaluba + 3][xthreepaluba] = -1;
          playfild[ythreepaluba - 1][xthreepaluba] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1 + i][xthreepaluba - 1] = -1;
            }
         break;
        }

     if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba - 1][xthreepaluba] == 0) && (playfild[ythreepaluba - 2][xthreepaluba] == 0)) 
     {           
          playfild[ythreepaluba][xthreepaluba] = 35;
          playfild[ythreepaluba - 1][xthreepaluba] = 35;
          playfild[ythreepaluba - 2][xthreepaluba] = 35;
          playfild[ythreepaluba - 3][xthreepaluba] = -1;
          playfild[ythreepaluba + 1][xthreepaluba] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1 - i][xthreepaluba - 1] = -1;
            }
            break;
        }       
      }
    
 
        
      if (ythreepaluba > 6 && ythreepaluba < 9 && xthreepaluba == 9)
      {
             
        if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba - 1][xthreepaluba] == 0) && (playfild[ythreepaluba - 2][xthreepaluba] == 0))
        {           
          playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba - 1][xthreepaluba] = 35;
         playfild[ythreepaluba - 2][xthreepaluba] = 35;
         playfild[ythreepaluba - 3][xthreepaluba] = -1;
         playfild[ythreepaluba + 1][xthreepaluba] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1 - i][xthreepaluba - 1] = -1;
            }
          break;
        }
     if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba - 1] == 0) && (playfild[ythreepaluba][xthreepaluba - 2] == 0))
        {           
          playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba - 1] = 35;
         playfild[ythreepaluba][xthreepaluba - 2] = 35;
         playfild[ythreepaluba][xthreepaluba - 3] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1][xthreepaluba - i] = -1;
            }
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1][xthreepaluba - i] = -1;
            }
          break;
        }
      }
// ythreepaluba = 9, xthreepaluba > 0 && xthreepaluba < 9


if (ythreepaluba == 9 && xthreepaluba > 0 && xthreepaluba < 4)
    {
       if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba + 1] == 0) && (playfild[ythreepaluba][xthreepaluba + 2] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba + 1] = 35;
         playfild[ythreepaluba][xthreepaluba + 2] = 35;
         playfild[ythreepaluba][xthreepaluba + 3] = -1;
         playfild[ythreepaluba][xthreepaluba - 1] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1][xthreepaluba - 1 + i] = -1;
            }
         break;
       }
     if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba - 1][xthreepaluba] == 0) && (playfild[ythreepaluba - 2][xthreepaluba] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba - 1][xthreepaluba] = 35;
         playfild[ythreepaluba - 2][xthreepaluba] = 35;
         playfild[ythreepaluba - 3][xthreepaluba] = -1;
          for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - i][xthreepaluba - 1] = -1;
            }
          for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - i][xthreepaluba + 1] = -1;
            }

         break;
       }
    }
       
      if (ythreepaluba == 9 && xthreepaluba > 3 && xthreepaluba < 7)
      {
       if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba + 1] == 0) && (playfild[ythreepaluba][xthreepaluba + 2] == 0))
         {           
          playfild[ythreepaluba][xthreepaluba] = 35;
          playfild[ythreepaluba][xthreepaluba + 1] = 35;
          playfild[ythreepaluba][xthreepaluba + 2] = 35;
          playfild[ythreepaluba][xthreepaluba + 3] = -1;
          playfild[ythreepaluba][xthreepaluba - 1] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1][xthreepaluba - 1 + i] = -1;
            }
         break;
        }
      
      if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba - 1] == 0) && (playfild[ythreepaluba][xthreepaluba - 2] == 0))
        {           
          playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba - 1] = 35;
         playfild[ythreepaluba][xthreepaluba - 2] = 35;
         playfild[ythreepaluba][xthreepaluba -3] = -1;
         playfild[ythreepaluba][xthreepaluba + 1] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1][xthreepaluba + 1 - i] = -1;
            }
          break; 
        }       
      }

   if (ythreepaluba == 9 && xthreepaluba > 6 && xthreepaluba < 9)
      {
             
     if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba - 1] == 0) && (playfild[ythreepaluba][xthreepaluba - 2] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba - 1] = 35;
         playfild[ythreepaluba][xthreepaluba - 2] = 35;
         playfild[ythreepaluba][xthreepaluba -3] = -1;
         playfild[ythreepaluba][xthreepaluba + 1] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1][xthreepaluba + 1 - i] = -1;
            }
          break;
        }
     if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba - 1][xthreepaluba] == 0) && (playfild[ythreepaluba - 2][xthreepaluba] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba - 1][xthreepaluba] = 35;
         playfild[ythreepaluba - 2][xthreepaluba] = 35;
         playfild[ythreepaluba - 3][xthreepaluba] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - i][xthreepaluba + 1] = -1;
            }
          for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - i][xthreepaluba - 1] = -1;
            }

          break;
        }
      }

// ythreepaluba > 0 && ythreepaluba < 9 && xthreepaluba = 0


 if (ythreepaluba > 0 && ythreepaluba < 4 && xthreepaluba == 0)
      {
       if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba + 1][xthreepaluba] == 0) && (playfild[ythreepaluba + 2][xthreepaluba] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba + 1][xthreepaluba] = 35;
         playfild[ythreepaluba + 2][xthreepaluba] = 35;
         playfild[ythreepaluba + 3][xthreepaluba] = -1;
         playfild[ythreepaluba - 1][xthreepaluba] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1 + i][xthreepaluba + 1] = -1;
            }
          break;
       }
    if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba + 1] == 0) && (playfild[ythreepaluba][xthreepaluba + 2] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba + 1] = 35;
         playfild[ythreepaluba][xthreepaluba + 2] = 35;
         playfild[ythreepaluba][xthreepaluba + 3] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1][xthreepaluba + i] = -1;
            }
          for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1][xthreepaluba + i] = -1;
            }
          break;
      }
   }   
    if (ythreepaluba > 3 && ythreepaluba < 7 && xthreepaluba == 0)
      {
       if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba + 1][xthreepaluba] == 0) && (playfild[ythreepaluba + 2][xthreepaluba] == 0))
        {           
          playfild[ythreepaluba][xthreepaluba] = 35;
          playfild[ythreepaluba + 1][xthreepaluba] = 35;
          playfild[ythreepaluba + 2][xthreepaluba] = 35;
          playfild[ythreepaluba + 3][xthreepaluba] = -1;
          playfild[ythreepaluba - 1][xthreepaluba] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1 + i][xthreepaluba + 1] = -1;
            }
          break;
        }
      
     if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba - 1][xthreepaluba] == 0) && (playfild[ythreepaluba - 2][xthreepaluba] == 0))
        {           
          playfild[ythreepaluba][xthreepaluba] = 35;
          playfild[ythreepaluba - 1][xthreepaluba] = 35;
          playfild[ythreepaluba - 2][xthreepaluba] = 35;
          playfild[ythreepaluba - 3][xthreepaluba] = -1;
          playfild[ythreepaluba + 1][xthreepaluba] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1 - i][xthreepaluba + 1] = -1;
            }
          break; 
        }      
    }
 
        
      if (ythreepaluba > 6 && ythreepaluba < 9 && xthreepaluba == 0)
      {
             
        if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba - 1][xthreepaluba] == 0) && (playfild[ythreepaluba - 2][xthreepaluba] == 0))
        {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba - 1][xthreepaluba] = 35;
         playfild[ythreepaluba - 2][xthreepaluba] = 35;
         playfild[ythreepaluba - 3][xthreepaluba] = -1;
         playfild[ythreepaluba + 1][xthreepaluba] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1 - i][xthreepaluba + 1] = -1;
            }
          break;
        }
      if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba + 1] == 0) && (playfild[ythreepaluba][xthreepaluba + 2] == 0))
        {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba + 1] = 35;
         playfild[ythreepaluba][xthreepaluba + 2] = 35;
         playfild[ythreepaluba][xthreepaluba + 3] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1][xthreepaluba + i] = -1;
            }
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1][xthreepaluba + i] = -1;
            }
          break;
      }
     }
// ythreepaluba > 0 && ythreepaluba < 5 && xthreepaluba > 0 && xthreepaluba < 5

if (ythreepaluba > 0 && ythreepaluba < 5 && xthreepaluba > 0 && xthreepaluba < 5)
 {
   if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba + 1][xthreepaluba] == 0) && (playfild[ythreepaluba + 2][xthreepaluba] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba + 1][xthreepaluba] = 35;
         playfild[ythreepaluba + 2][xthreepaluba] = 35;
         playfild[ythreepaluba + 3][xthreepaluba] = -1;
         playfild[ythreepaluba - 1][xthreepaluba] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1 + i][xthreepaluba + 1] = -1;
            }
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1 + i][xthreepaluba - 1] = -1;
            }
         break;
       }
   if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba + 1] == 0) && (playfild[ythreepaluba][xthreepaluba + 2] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba + 1] = 35;
         playfild[ythreepaluba][xthreepaluba + 2] = 35;
         playfild[ythreepaluba][xthreepaluba + 3] = -1;
         playfild[ythreepaluba][xthreepaluba - 1] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1][xthreepaluba - 1 + i] = -1;
            }
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1][xthreepaluba - 1 + i] = -1;
            }
         break;
       }       
   }

//ythreepaluba > 4 && ythreepaluba < 9 && xthreepaluba > 0 && xthreepaluba < 5

 
  if (ythreepaluba > 4 && ythreepaluba < 9 && xthreepaluba > 0 && xthreepaluba < 5)
    {
       if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba - 1][xthreepaluba] == 0) && (playfild[ythreepaluba - 2][xthreepaluba] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba - 1][xthreepaluba] = 35;
         playfild[ythreepaluba - 2][xthreepaluba] = 35;
         playfild[ythreepaluba - 3][xthreepaluba] = -1;
         playfild[ythreepaluba + 1][xthreepaluba] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1 - i][xthreepaluba + 1] = -1;
            }
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1 - i][xthreepaluba - 1] = -1;
            }
           break;
       }
       
    if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba + 1] == 0) && (playfild[ythreepaluba][xthreepaluba + 2] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba + 1] = 35;
         playfild[ythreepaluba][xthreepaluba + 2] = 35;
         playfild[ythreepaluba][xthreepaluba + 3] = -1;
         playfild[ythreepaluba][xthreepaluba - 1] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1][xthreepaluba - 1 + i] = -1;
            }
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1][xthreepaluba - 1 + i] = -1;
            }
         break;
       }       
    }

//ythreepaluba > 4 && ythreepaluba < 9 && xthreepaluba > 4 && xthreepaluba < 9

if (ythreepaluba > 4 && ythreepaluba < 9 && xthreepaluba > 4 && xthreepaluba < 9)
{
   if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba - 1][xthreepaluba] == 0) && (playfild[ythreepaluba - 2][xthreepaluba] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba - 1][xthreepaluba] = 35;
         playfild[ythreepaluba - 2][xthreepaluba] = 35;
         playfild[ythreepaluba - 3][xthreepaluba] = -1;
         playfild[ythreepaluba + 1][xthreepaluba] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1 - i][xthreepaluba + 1] = -1;
            }
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1 - i][xthreepaluba - 1] = -1;
            }
         break;
       }
       
     if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba - 1] == 0) && (playfild[ythreepaluba][xthreepaluba - 2] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba - 1] = 35;
         playfild[ythreepaluba][xthreepaluba - 2] = 35;
         playfild[ythreepaluba][xthreepaluba - 3] = -1;
         playfild[ythreepaluba][xthreepaluba + 1] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1][xthreepaluba + 1 - i] = -1;
            }
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1][xthreepaluba + 1 - i] = -1;
            }
         break;
       }       
    }

//ythreepaluba > 0 && ythreepaluba < 5 && xthreepaluba > 4 && xthreepaluba < 9


if (ythreepaluba > 0 && ythreepaluba < 5 && xthreepaluba > 4 && xthreepaluba < 9)
 {
    if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba + 1][xthreepaluba] == 0) && (playfild[ythreepaluba + 2][xthreepaluba] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba + 1][xthreepaluba] = 35;
         playfild[ythreepaluba + 2][xthreepaluba] = 35;
         playfild[ythreepaluba + 3][xthreepaluba] = -1;
         playfild[ythreepaluba - 1][xthreepaluba] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1 + i][xthreepaluba + 1] = -1;
            }
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1 + i][xthreepaluba - 1] = -1;
            }
         break;
       }
    if ((playfild[ythreepaluba][xthreepaluba] == 0) && (playfild[ythreepaluba][xthreepaluba - 1] == 0) && (playfild[ythreepaluba][xthreepaluba - 2] == 0))
       {           
         playfild[ythreepaluba][xthreepaluba] = 35;
         playfild[ythreepaluba][xthreepaluba - 1] = 35;
         playfild[ythreepaluba][xthreepaluba - 2] = 35;
         playfild[ythreepaluba][xthreepaluba - 3] = -1;
         playfild[ythreepaluba][xthreepaluba + 1] = -1;
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba - 1][xthreepaluba + 1 - i] = -1;
            }
           for (i = 0; i < 5; i++)
            {
              playfild[ythreepaluba + 1][xthreepaluba + 1 - i] = -1;
            }
           
        break;
       }       
     }
  }
}
}       


public Ship(String name, int paluba, int[][] playfild)
{
    

 // создаем и размещаем двухпалубные корабли
 

for (int i = 0; ; i++)
 {
   int ytwopaluba = (int)(Math.random()*10);
   int xtwopaluba = (int)(Math.random()*10);
 
// ytwopaluba = 0, xtwopaluba = 0
 if (ytwopaluba == 0 && xtwopaluba == 0)
  {
  if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba + 1] == 0))
       {           
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba][xtwopaluba + 1] = 26;
         playfild[ytwopaluba][xtwopaluba + 2] = -1;
          for ( i = 0; i < 3; i++)
           {
               playfild[ytwopaluba + 1][xtwopaluba + i] = -1;
           }
          break;
       }
   

       if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba + 1][xtwopaluba] == 0))
       {        
           playfild[ytwopaluba][xtwopaluba] = 26;
           playfild[ytwopaluba + 1][xtwopaluba] = 26;
           playfild[ytwopaluba + 2][xtwopaluba] = -1;
                      for (i = 0; i < 3; i++)
             {
              playfild[ytwopaluba + i][xtwopaluba + 1] = -1;
             }
           break;
       }
    }



//ytwopaluba = 0, xtwopaluba = 9
if (ytwopaluba == 0 && xtwopaluba == 9)
 {
  if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba - 1] == 0))
       {           
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba][xtwopaluba - 1] = 26;
         playfild[ytwopaluba][xtwopaluba - 2] = -1;
           for (i = 0; i < 3; i++)
            {
              playfild[ytwopaluba + 1][xtwopaluba - i] = -1;
            }
          break;
       }
       
       if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba + 1][xtwopaluba] == 0))
       {        
           playfild[ytwopaluba][xtwopaluba] = 26;
           playfild[ytwopaluba + 1][xtwopaluba] = 26;
           playfild[ytwopaluba + 2][xtwopaluba] = -1;
            for (i = 0; i < 3; i++)
             {
              playfild[ytwopaluba + i][xtwopaluba - 1] = -1;
             }
          break;
       }
     }


// ytwopaluba = 9, xtwopaluba = 9
if (ytwopaluba == 9 && xtwopaluba == 9)
  { 
if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba - 1] == 0))
       {           
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba][xtwopaluba - 1] = 26;
         playfild[ytwopaluba][xtwopaluba - 2] = -1;
                    for (i = 0; i < 3; i++)
            {
              playfild[ytwopaluba - 1][xtwopaluba - i] = -1;
            }
          break;
       }
       
       if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba - 1][xtwopaluba] == 0))
       {        
           playfild[ytwopaluba][xtwopaluba] = 26;
           playfild[ytwopaluba - 1][xtwopaluba] = 26;
           playfild[ytwopaluba - 2][xtwopaluba] = -1;
            for (i = 0; i < 3; i++)
             {
              playfild[ytwopaluba - i][xtwopaluba - 1] = -1;
             }
             break;

       }
     }



// ytwopaluba = 9, xtwopaluba = 0
if (ytwopaluba == 9 && xtwopaluba == 0)
  {
 if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba + 1] == 0))
       {           
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba][xtwopaluba + 1] = 26;
         playfild[ytwopaluba][xtwopaluba + 2] = -1;
           for (i = 0; i < 3; i++)
            {
              playfild[ytwopaluba - 1][xtwopaluba + i] = -1;
            }
          break;
       }
       
       if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba - 1][xtwopaluba] == 0))
       {        
           playfild[ytwopaluba][xtwopaluba] = 26;
           playfild[ytwopaluba - 1][xtwopaluba] = 26;
           playfild[ytwopaluba - 2][xtwopaluba] = -1;
            for (i = 0; i < 3; i++)
             {
              playfild[ytwopaluba - i][xtwopaluba + 1] = -1;
             }
             break;
       }
    }



//ytwopaluba = 0, xtwopaluba > 1 && xtwopaluba < 9
 if (ytwopaluba == 0 && xtwopaluba > 0 && xtwopaluba < 3)
   {
       if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba + 1] == 0))
       {           
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba][xtwopaluba + 1] = 26;
         playfild[ytwopaluba][xtwopaluba + 2] = -1;
         playfild[ytwopaluba][xtwopaluba - 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1][xtwopaluba - 1 + i] = -1;
            }
          break;
       }
      
     if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba + 1][xtwopaluba] == 0))
       {           
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba + 1][xtwopaluba] = 26;
         playfild[ytwopaluba + 2][xtwopaluba] = -1;
         
          for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba  + i][xtwopaluba - 1] = -1;
            }
          for (i = 0; i < 5; i++)
            {
              playfild[ytwopaluba + i][xtwopaluba + 1] = -1;
            }

          break;
       }
   }

       
      if (ytwopaluba == 0 && xtwopaluba > 2 && xtwopaluba < 8)
      {

       if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba + 1] == 0))
         {           
          playfild[ytwopaluba][xtwopaluba] = 26;
          playfild[ytwopaluba][xtwopaluba + 1] = 26;
          playfild[ytwopaluba][xtwopaluba + 2] = -1;
          playfild[ytwopaluba][xtwopaluba - 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1][xtwopaluba - 1 + i] = -1;
            }
           break;
          }
        
      
      if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba - 1] == 0))
        {           
          playfild[ytwopaluba][xtwopaluba] = 26;
          playfild[ytwopaluba][xtwopaluba - 1] = 26;
          playfild[ytwopaluba][xtwopaluba - 2] = -1;
          playfild[ytwopaluba][xtwopaluba + 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1][xtwopaluba + 1 - i] = -1;
            }
            break;

        }
     }
      
      if (ytwopaluba == 0 && xtwopaluba > 7 && xtwopaluba < 9)
      {
             
       if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba - 1] == 0))
        {                    
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba][xtwopaluba - 1] = 26;
         playfild[ytwopaluba][xtwopaluba - 2] = -1;
         playfild[ytwopaluba][xtwopaluba + 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1][xtwopaluba + 1 - i] = -1;
            }
          break;
        }
      if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba + 1][xtwopaluba] == 0))
        {                    
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba + 1][xtwopaluba] = 26;
         playfild[ytwopaluba + 2][xtwopaluba] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + i][xtwopaluba + 1] = -1;
            }
          for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + i][xtwopaluba - 1] = -1;
            }

          break;
        }

      }
   




// ytwopaluba > 0 && ytwopaluba < 9 && xtwopaluba = 9

 if (ytwopaluba > 0 && ytwopaluba < 3 && xtwopaluba == 9)
      {
       if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba + 1][xtwopaluba] == 0))
       {           
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba + 1][xtwopaluba] = 26;
         playfild[ytwopaluba + 2][xtwopaluba] = -1;
         playfild[ytwopaluba - 1][xtwopaluba] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1 + i][xtwopaluba - 1] = -1;
            }
          break;
       }

     if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba - 1] == 0))
       {           
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba][xtwopaluba - 1] = 26;
         playfild[ytwopaluba][xtwopaluba - 2] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1][xtwopaluba - i] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1][xtwopaluba - 1] = -1;
            }

          break;
       }
      }

      
       
      if (ytwopaluba > 2 && ytwopaluba < 8 && xtwopaluba == 9)
      {        
         if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba + 1][xtwopaluba] == 0))
         {           
          playfild[ytwopaluba][xtwopaluba] = 26;
          playfild[ytwopaluba + 1][xtwopaluba] = 26;
          playfild[ytwopaluba + 2][xtwopaluba] = -1;
          playfild[ytwopaluba - 1][xtwopaluba] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1 + i][xtwopaluba - 1] = -1;
            }
         break;
        }

     if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba - 1][xtwopaluba] == 0)) 
     {           
          playfild[ytwopaluba][xtwopaluba] = 26;
          playfild[ytwopaluba - 1][xtwopaluba] = 26;
          playfild[ytwopaluba - 2][xtwopaluba] = -1;
          playfild[ytwopaluba + 1][xtwopaluba] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1 - i][xtwopaluba - 1] = -1;
            }
          break;
        }
    }
    
 
        
      if (ytwopaluba > 7 && ytwopaluba < 9 && xtwopaluba == 9)
      {
             
        if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba - 1][xtwopaluba] == 0))
        {           
          playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba - 1][xtwopaluba] = 26;
         playfild[ytwopaluba - 2][xtwopaluba] = -1;
         playfild[ytwopaluba + 1][xtwopaluba] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1 - i][xtwopaluba - 1] = -1;
            }
          break;
        }
        if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba - 1] == 0))
        {           
          playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba][xtwopaluba - 1] = 26;
         playfild[ytwopaluba][xtwopaluba - 2] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1][xtwopaluba - i] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1][xtwopaluba - i] = -1;
            }
          break;
        }

      }



// ytwopaluba = 9, xtwopaluba > 0 && xtwopaluba < 9


if (ytwopaluba == 9 && xtwopaluba > 0 && xtwopaluba < 3)
      {
       if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba + 1] == 0))
       {           
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba][xtwopaluba + 1] = 26;
         playfild[ytwopaluba][xtwopaluba + 2] = -1;
         playfild[ytwopaluba][xtwopaluba - 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1][xtwopaluba - 1 + i] = -1;
            }
         break;
       }
     if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba - 1][xtwopaluba] == 0))
       {           
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba - 1][xtwopaluba] = 26;
         playfild[ytwopaluba - 2][xtwopaluba] = -1;
          for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - i][xtwopaluba - 1] = -1;
            }
          for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - i][xtwopaluba + 1] = -1;
            }

         break;
       }
   }
       
      if (ytwopaluba == 9 && xtwopaluba > 2 && xtwopaluba < 8)
      {
       if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba + 1] == 0))
         {           
          playfild[ytwopaluba][xtwopaluba] = 26;
          playfild[ytwopaluba][xtwopaluba + 1] = 26;
          playfild[ytwopaluba][xtwopaluba + 2] = -1;
          playfild[ytwopaluba][xtwopaluba - 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1][xtwopaluba - 1 + i] = -1;
            }
         break;
        }
      
      if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba - 1] == 0))
        {           
          playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba][xtwopaluba - 1] = 26;
         playfild[ytwopaluba][xtwopaluba - 2] = -1;
         playfild[ytwopaluba][xtwopaluba + 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1][xtwopaluba + 1 - i] = -1;
            }
           break;

        }
     }

   if (ytwopaluba == 9 && xtwopaluba > 7 && xtwopaluba < 9)
      {
             
     if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba - 1] == 0))
       {           
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba][xtwopaluba - 1] = 26;
         playfild[ytwopaluba][xtwopaluba - 2] = -1;
         playfild[ytwopaluba][xtwopaluba + 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1][xtwopaluba + 1 - i] = -1;
            }
          break;
        }
     if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba - 1][xtwopaluba] == 0))
       {           
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba - 1][xtwopaluba] = 26;
         playfild[ytwopaluba - 2][xtwopaluba] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - i][xtwopaluba + 1] = -1;
            }
          for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - i][xtwopaluba - 1] = -1;
            }

          break;
        }

      }


// ytwopaluba > 0 && ytwopaluba < 9 && xtwopaluba = 0


 if (ytwopaluba > 0 && ytwopaluba < 3 && xtwopaluba == 0)
      {
       if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba + 1][xtwopaluba] == 0))
       {           
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba + 1][xtwopaluba] = 26;
         playfild[ytwopaluba + 2][xtwopaluba] = -1;
         playfild[ytwopaluba - 1][xtwopaluba] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1 + i][xtwopaluba + 1] = -1;
            }
          break;
       }
    if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba + 1] == 0))
       {           
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba][xtwopaluba + 1] = 26;
         playfild[ytwopaluba][xtwopaluba + 2] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1][xtwopaluba + i] = -1;
            }
          for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1][xtwopaluba + i] = -1;
            }
          break;
      }
   }   
      if (ytwopaluba > 2 && ytwopaluba < 8 && xtwopaluba == 0)
      {
       if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba + 1][xtwopaluba] == 0))
        {           
          playfild[ytwopaluba][xtwopaluba] = 26;
          playfild[ytwopaluba + 1][xtwopaluba] = 26;
          playfild[ytwopaluba + 2][xtwopaluba] = -1;
          playfild[ytwopaluba - 1][xtwopaluba] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1 + i][xtwopaluba + 1] = -1;
            }
          break;
        }
      
     if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba - 1][xtwopaluba] == 0))
        {           
          playfild[ytwopaluba][xtwopaluba] = 26;
          playfild[ytwopaluba - 1][xtwopaluba] = 26;
          playfild[ytwopaluba - 2][xtwopaluba] = -1;
          playfild[ytwopaluba + 1][xtwopaluba] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1 - i][xtwopaluba + 1] = -1;
            }
            break;
        }
    }
 
        
      if (ytwopaluba > 7 && ytwopaluba < 9 && xtwopaluba == 0)
      {
             
        if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba - 1][xtwopaluba] == 0))
        {           
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba - 1][xtwopaluba] = 26;
         playfild[ytwopaluba - 2][xtwopaluba] = -1;
         playfild[ytwopaluba + 1][xtwopaluba] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1 - i][xtwopaluba + 1] = -1;
            }
          break;
        }
      if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba + 1] == 0))
        {           
         playfild[ytwopaluba][xtwopaluba] = 26;
         playfild[ytwopaluba][xtwopaluba + 1] = 26;
         playfild[ytwopaluba][xtwopaluba + 2] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1][xtwopaluba + i] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1][xtwopaluba + i] = -1;
            }

          break;
        }
      }

// ytwopaluba > 0 && ytwopaluba < 9 && xtwopaluba > 0 && xtwopaluba < 9
//ytwopaluba > 0 && ytwopaluba < 5 && xtwopaluba > 0 && xtwopaluba < 5

if (ytwopaluba > 0 && ytwopaluba < 5 && xtwopaluba > 0 && xtwopaluba < 5)
  {
   if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba + 1][xtwopaluba] == 0))
     {
        playfild[ytwopaluba][xtwopaluba] = 26;
        playfild[ytwopaluba + 1][xtwopaluba] = 26;
        playfild[ytwopaluba + 2][xtwopaluba] = -1;
        playfild[ytwopaluba - 1][xtwopaluba] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1 + i][xtwopaluba + 1] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1 + i][xtwopaluba - 1] = -1;
            }

          break;
        }

    if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba + 1] == 0))
     {
        playfild[ytwopaluba][xtwopaluba] = 26;
        playfild[ytwopaluba][xtwopaluba + 1] = 26;
        playfild[ytwopaluba][xtwopaluba + 2] = -1;
        playfild[ytwopaluba][xtwopaluba - 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1][xtwopaluba - 1 + i] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1][xtwopaluba - 1 + i] = -1;
            }

          break;
        }

 
  if ((playfild[ytwopaluba][xtwopaluba + 1] == 0) && (playfild[ytwopaluba + 1][xtwopaluba + 1] == 0))
     {
        playfild[ytwopaluba][xtwopaluba + 1] = 26;
        playfild[ytwopaluba + 1][xtwopaluba + 1] = 26;
        playfild[ytwopaluba + 2][xtwopaluba + 1] = -1;
        playfild[ytwopaluba - 1][xtwopaluba + 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1 + i][xtwopaluba + 2] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1 + i][xtwopaluba] = -1;
            }

          break;
        }
         if ((playfild[ytwopaluba + 1][xtwopaluba] == 0) && (playfild[ytwopaluba + 1][xtwopaluba + 1] == 0))
     {
        playfild[ytwopaluba + 1][xtwopaluba] = 26;
        playfild[ytwopaluba + 1][xtwopaluba + 1] = 26;
        playfild[ytwopaluba + 1][xtwopaluba + 2] = -1;
        playfild[ytwopaluba + 1][xtwopaluba - 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba][xtwopaluba - 1 + i] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 2][xtwopaluba - 1 + i] = -1;
            }

          break;
        }

      }

//ytwopaluba > 0 && ytwopaluba < 5 && xtwopaluba > 4 && xtwopaluba < 9

if (ytwopaluba > 0 && ytwopaluba < 5 && xtwopaluba > 4 && xtwopaluba < 9)
  {
   if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba + 1][xtwopaluba] == 0))
     {
        playfild[ytwopaluba][xtwopaluba] = 26;
        playfild[ytwopaluba + 1][xtwopaluba] = 26;
        playfild[ytwopaluba + 2][xtwopaluba] = -1;
        playfild[ytwopaluba - 1][xtwopaluba] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1 + i][xtwopaluba + 1] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1 + i][xtwopaluba - 1] = -1;
            }

          break;
        }

    if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba - 1] == 0))
     {
        playfild[ytwopaluba][xtwopaluba] = 26;
        playfild[ytwopaluba][xtwopaluba - 1] = 26;
        playfild[ytwopaluba][xtwopaluba - 2] = -1;
        playfild[ytwopaluba][xtwopaluba + 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1][xtwopaluba + 1 - i] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1][xtwopaluba + 1 - i] = -1;
            }

          break;
        }

 
  if ((playfild[ytwopaluba][xtwopaluba - 1] == 0) && (playfild[ytwopaluba + 1][xtwopaluba - 1] == 0))
     {
        playfild[ytwopaluba][xtwopaluba - 1] = 26;
        playfild[ytwopaluba + 1][xtwopaluba - 1] = 26;
        playfild[ytwopaluba + 2][xtwopaluba - 1] = -1;
        playfild[ytwopaluba - 1][xtwopaluba - 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1 + i][xtwopaluba - 2] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1 + i][xtwopaluba] = -1;
            }

          break;
        }

  if ((playfild[ytwopaluba + 1][xtwopaluba - 1] == 0) && (playfild[ytwopaluba + 1][xtwopaluba] == 0))
     {
        playfild[ytwopaluba + 1][xtwopaluba] = 26;
        playfild[ytwopaluba + 1][xtwopaluba - 1] = 26;
        playfild[ytwopaluba + 1][xtwopaluba - 2] = -1;
        playfild[ytwopaluba + 1][xtwopaluba + 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 2][xtwopaluba + 1 - i] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba][xtwopaluba + 1 - i] = -1;
            }

          break;
        }

      }

//ytwopaluba > 4 && ytwopaluba < 9 && xtwopaluba > 4 && xtwopaluba < 9

if (ytwopaluba > 4 && ytwopaluba < 9 && xtwopaluba > 4 && xtwopaluba < 9)
  {
   if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba - 1][xtwopaluba] == 0))
     {
        playfild[ytwopaluba][xtwopaluba] = 26;
        playfild[ytwopaluba - 1][xtwopaluba] = 26;
        playfild[ytwopaluba - 2][xtwopaluba] = -1;
        playfild[ytwopaluba + 1][xtwopaluba] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1 - i][xtwopaluba + 1] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1 - i][xtwopaluba - 1] = -1;
            }

          break;
        }

    if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba - 1] == 0))
     {
        playfild[ytwopaluba][xtwopaluba] = 26;
        playfild[ytwopaluba][xtwopaluba - 1] = 26;
        playfild[ytwopaluba][xtwopaluba - 2] = -1;
        playfild[ytwopaluba][xtwopaluba + 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1][xtwopaluba + 1 - i] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1][xtwopaluba + 1 - i] = -1;
            }

          break;
        }

 
  if ((playfild[ytwopaluba][xtwopaluba - 1] == 0) && (playfild[ytwopaluba - 1][xtwopaluba - 1] == 0))
     {
        playfild[ytwopaluba][xtwopaluba - 1] = 26;
        playfild[ytwopaluba - 1][xtwopaluba - 1] = 26;
        playfild[ytwopaluba - 2][xtwopaluba - 1] = -1;
        playfild[ytwopaluba + 1][xtwopaluba - 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1 - i][xtwopaluba - 2] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1 - i][xtwopaluba] = -1;
            }

          break;
        }
       
  if ((playfild[ytwopaluba - 1][xtwopaluba] == 0) && (playfild[ytwopaluba - 1][xtwopaluba - 1] == 0))
     {
        playfild[ytwopaluba - 1][xtwopaluba] = 26;
        playfild[ytwopaluba - 1][xtwopaluba - 1] = 26;
        playfild[ytwopaluba - 1][xtwopaluba - 2] = -1;
        playfild[ytwopaluba - 1][xtwopaluba + 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 2][xtwopaluba + 1 - i] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba][xtwopaluba + 1 - i] = -1;
            }

          break;
        }

      }

//ytwopaluba > 4 && ytwopaluba < 9 && xtwopaluba > 0 && xtwopaluba < 5

if (ytwopaluba > 4 && ytwopaluba < 9 && xtwopaluba > 0 && xtwopaluba < 5)
  {
   if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba - 1][xtwopaluba] == 0))
     {
        playfild[ytwopaluba][xtwopaluba] = 26;
        playfild[ytwopaluba - 1][xtwopaluba] = 26;
        playfild[ytwopaluba - 2][xtwopaluba] = -1;
        playfild[ytwopaluba + 1][xtwopaluba] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1 - i][xtwopaluba + 1] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1 - i][xtwopaluba - 1] = -1;
            }

          break;
        }

    if ((playfild[ytwopaluba][xtwopaluba] == 0) && (playfild[ytwopaluba][xtwopaluba + 1] == 0))
     {
        playfild[ytwopaluba][xtwopaluba] = 26;
        playfild[ytwopaluba][xtwopaluba + 1] = 26;
        playfild[ytwopaluba][xtwopaluba + 2] = -1;
        playfild[ytwopaluba][xtwopaluba - 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1][xtwopaluba - 1 + i] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 1][xtwopaluba - 1 + i] = -1;
            }

          break;
        }

 
  if ((playfild[ytwopaluba][xtwopaluba + 1] == 0) && (playfild[ytwopaluba - 1][xtwopaluba + 1] == 0))
     {
        playfild[ytwopaluba][xtwopaluba + 1] = 26;
        playfild[ytwopaluba - 1][xtwopaluba + 1] = 26;
        playfild[ytwopaluba - 2][xtwopaluba + 1] = -1;
        playfild[ytwopaluba + 1][xtwopaluba + 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1 - i][xtwopaluba + 2] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba + 1 - i][xtwopaluba] = -1;
            }

          break;
        }


 if ((playfild[ytwopaluba - 1][xtwopaluba] == 0) && (playfild[ytwopaluba - 1][xtwopaluba + 1] == 0))
     {
        playfild[ytwopaluba - 1][xtwopaluba] = 26;
        playfild[ytwopaluba - 1][xtwopaluba + 1] = 26;
        playfild[ytwopaluba - 1][xtwopaluba + 2] = -1;
        playfild[ytwopaluba - 1][xtwopaluba - 1] = -1;
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba][xtwopaluba - 1 + i] = -1;
            }
           for (i = 0; i < 4; i++)
            {
              playfild[ytwopaluba - 2][xtwopaluba - 1 + i] = -1;
            }

          break;
       }

     }
  }
 }
}


public  void SeaCombat(int[][] playfild) 
{
try{  
for (int i = 0; i < playfild.length; i++)
 {
   for (int j = 0; j < playfild[i].length; j++)
   {
     if(playfild[j][i] == 0)
        playfild[j][i] = -1; 
   }
 }    
  
for (int i = 0; i < playfild.length; i++)
 {
   for (int j = 0; j < playfild[i].length; j++)
   {
     System.out.print(playfild[j][i]);
   }
     System.out.println("");
 }   

 int ypush = 0;
 int xpush = 0;
 int one = 4;
 int two = 6;
 int three = 6;
 int four = 4;
 
 System.out.println("make the course"); 
 lab1.setText("make the course");
 
 
 for (int i = 0; ; i++)
  { 
   xpush = Integer.parseInt(JOptionPane.showInputDialog("Enter X, from 0 to 9"));
   ypush = Integer.parseInt(JOptionPane.showInputDialog("Enter Y, from 0 to 9"));    
    
   
    
     System.out.println(ypush);
     System.out.println(xpush);
    if (playfild[xpush][ypush] == 999)
      {
       lab.setText("the course was to repeat");
       lab1.setText("make the course");
       System.out.println("the course was to repeat");
       System.out.println("make the course");
      }

    
     if (playfild[xpush][ypush] == -1)
      {
        System.out.println("mimo");
        lab.setText("mimo");
        playfild[xpush][ypush] = 999;
        System.out.println("make the course");
        lab1.setText("make the course");
      }
     
    if (playfild[xpush][ypush] == 12)
      {
       lab.setText("it was destroyed");  
       System.out.println("it was destroyed");
       playfild[xpush][ypush] = 999;
       one = one - 1;       
      }
     
    if (playfild[xpush][ypush] == 26)
      {
       two = two - 1;
         if (two % 2!= 0)
           {
             lab.setText("it was wounded");     
            System.out.println("it was wounded");
            playfild[xpush][ypush] = 999;
           }
        if (two % 2 == 0)
           {
             lab.setText("it was destroyed");  
             System.out.println("it was destroyed");
             playfild[xpush][ypush] = 999;    
           }
       }
   
    if (playfild[xpush][ypush] == 35)
      {
       three = three - 1;
         if (three % 3 != 0)
           {
               lab.setText("it was wounded");     
            System.out.println("it was wounded");
            playfild[xpush][ypush] = 999;
           }
        if (three % 3 == 0)
           {
                lab.setText("it was destroyed");  
             System.out.println("it was destroyed");
             playfild[xpush][ypush] = 999;    
           }
      }

   if (playfild[xpush][ypush] == 4)
      {
       four = four - 1;
         if (four > 0)
           {
               lab.setText("it was wounded");   
            System.out.println("it was wounded");
            playfild[xpush][ypush] = 999;
           }
        if (four == 0)
           {
               lab.setText("it was destroyed");  
             System.out.println("it was destroyed");
             playfild[xpush][ypush] = 999;    
           }
       }
        
    if (one + two  + three +  four == 0)
      {
           lab1.setText("END");
        System.out.println("END");
        break;
      }
    
   for ( i = 0; i < playfild.length; i++)
 {
   for (int j = 0; j < playfild[i].length; j++)
   {
     System.out.print(playfild[j][i]);
   }
     System.out.println("");
 }    
    
  }
}catch(Exception e){}
 
 }


public   void seaCombatGui(int[][] playfild, int xpush, int ypush) 
{
  
 
  


 
 
 
 System.out.println("make the course"); 
 lab1.setText("make the course");
 
 
    
    
   
    
     System.out.println(ypush);
     System.out.println(xpush);
    if (playfild[xpush][ypush] == 999)
      {
       lab.setText("the course was to repeat");
       lab1.setText("make the course");
       System.out.println("the course was to repeat");
       System.out.println("make the course");
      }

    
     if (playfild[xpush][ypush] == -1)
      {
        System.out.println("mimo");
        lab.setText("mimo");
        playfild[xpush][ypush] = 999;
        System.out.println("make the course");
        lab1.setText("make the course");
      }
     
    if (playfild[xpush][ypush] == 12)
      {
       lab.setText("it was destroyed");  
       System.out.println("it was destroyed");
       playfild[xpush][ypush] = 999;
       one = one - 1;       
      }
     
    if (playfild[xpush][ypush] == 26)
      {
       two = two - 1;
         if (two % 2!= 0)
           {
             lab.setText("it was wounded");     
            System.out.println("it was wounded");
            playfild[xpush][ypush] = 999;
           }
        if (two % 2 == 0)
           {
             lab.setText("it was destroyed");  
             System.out.println("it was destroyed");
             playfild[xpush][ypush] = 999;    
           }
       }
   
    if (playfild[xpush][ypush] == 35)
      {
       three = three - 1;
         if (three % 3 != 0)
           {
               lab.setText("it was wounded");     
            System.out.println("it was wounded");
            playfild[xpush][ypush] = 999;
           }
        if (three % 3 == 0)
           {
                lab.setText("it was destroyed");  
             System.out.println("it was destroyed");
             playfild[xpush][ypush] = 999;    
           }
      }

   if (playfild[xpush][ypush] == 4)
      {
       four = four - 1;
         if (four > 0)
           {
               lab.setText("it was wounded");   
            System.out.println("it was wounded");
            playfild[xpush][ypush] = 999;
           }
        if (four == 0)
           {
               lab.setText("it was destroyed");  
             System.out.println("it was destroyed");
             playfild[xpush][ypush] = 999;    
           }
       }
        
    if (one + two  + three +  four == 0)
      {
           lab1.setText("END");
           lab1.setBorder(BorderFactory.createLineBorder(Color.RED, 10));
        System.out.println("END");
        start.setEnabled(true);
        button0.setEnabled(false);
   button1.setEnabled(false);
   button2.setEnabled(false);
   button3.setEnabled(false);
   button4.setEnabled(false);
   button5.setEnabled(false);
   button6.setEnabled(false);
   button7.setEnabled(false);
   button8.setEnabled(false);
   button9.setEnabled(false);
   button10.setEnabled(false);
   button11.setEnabled(false);
   button12.setEnabled(false);
   button13.setEnabled(false);
   button14.setEnabled(false);
   button15.setEnabled(false);
   button16.setEnabled(false);
   button17.setEnabled(false);
   button18.setEnabled(false);
   button19.setEnabled(false);
   button20.setEnabled(false);
   button21.setEnabled(false);
   button22.setEnabled(false);
   button23.setEnabled(false);
   button24.setEnabled(false);
   button25.setEnabled(false);
   button26.setEnabled(false);
   button27.setEnabled(false);
   button28.setEnabled(false);
   button29.setEnabled(false);
   button30.setEnabled(false);
   button31.setEnabled(false);
   button32.setEnabled(false);
   button33.setEnabled(false);
   button34.setEnabled(false);
   button35.setEnabled(false);
   button36.setEnabled(false);
   button37.setEnabled(false);
   button38.setEnabled(false);
   button39.setEnabled(false);
   button40.setEnabled(false);
   button41.setEnabled(false);
   button42.setEnabled(false);
   button43.setEnabled(false);
   button44.setEnabled(false);
   button45.setEnabled(false);
   button46.setEnabled(false);
   button47.setEnabled(false);
   button48.setEnabled(false);
   button49.setEnabled(false);
   button50.setEnabled(false);
   button51.setEnabled(false);
   button52.setEnabled(false);
   button53.setEnabled(false);
   button54.setEnabled(false);
   button55.setEnabled(false); 
   button56.setEnabled(false);
   button57.setEnabled(false);
   button58.setEnabled(false);
   button59.setEnabled(false);
   button60.setEnabled(false);
   button61.setEnabled(false);
   button62.setEnabled(false);
   button63.setEnabled(false);
   button64.setEnabled(false);
   button65.setEnabled(false);
   button66.setEnabled(false);
   button67.setEnabled(false);
   button68.setEnabled(false);
   button69.setEnabled(false);
   button70.setEnabled(false);
   button71.setEnabled(false);
   button72.setEnabled(false);
   button73.setEnabled(false);
   button74.setEnabled(false);
   button75.setEnabled(false);
   button76.setEnabled(false);
   button77.setEnabled(false);
   button78.setEnabled(false);
   button79.setEnabled(false);
   button80.setEnabled(false);
   button81.setEnabled(false);
   button82.setEnabled(false);
   button83.setEnabled(false);
   button84.setEnabled(false);
   button85.setEnabled(false);
   button86.setEnabled(false);
   button87.setEnabled(false);
   button88.setEnabled(false);
   button89.setEnabled(false);
   button90.setEnabled(false);
   button91.setEnabled(false);
   button92.setEnabled(false);
   button93.setEnabled(false);
   button94.setEnabled(false);
   button95.setEnabled(false);
   button96.setEnabled(false);
   button97.setEnabled(false);
   button98.setEnabled(false);
   button99.setEnabled(false);
       
      }
    
   for (int i = 0; i < playfild.length; i++)
 {
   for (int j = 0; j < playfild[i].length; j++)
   {
     System.out.print(playfild[j][i]);
   }
     System.out.println("");
 }   
 
    
  }

  








public static void main(String[] args)throws IOException
{
 
 SwingUtilities.invokeLater(new Runnable(){
     public void run(){
       new GuiMy();
     }
 });
  
  
 
 
 
 
 }

public void go(){
  JFrame jframe = new JFrame("SeaCombat");
  jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  JPanel panel = new JPanel();
  panel.setBackground(Color.WHITE);
  panel.setLayout(new GridLayout(10, 9));
  jframe.add(panel, BorderLayout.CENTER);
  start = new JButton("Start");
  jframe.add(start, BorderLayout.NORTH);
  
  
  
  
  
  start.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
         button0.setEnabled(true);
   button1.setEnabled(true);
   button2.setEnabled(true);
   button3.setEnabled(true);
   button4.setEnabled(true);
   button5.setEnabled(true);
   button6.setEnabled(true);
   button7.setEnabled(true);
   button8.setEnabled(true);
   button9.setEnabled(true);
   button10.setEnabled(true);
   button11.setEnabled(true);
   button12.setEnabled(true);
   button13.setEnabled(true);
   button14.setEnabled(true);
   button15.setEnabled(true);
   button16.setEnabled(true);
   button17.setEnabled(true);
   button18.setEnabled(true);
   button19.setEnabled(true);
   button20.setEnabled(true);
   button21.setEnabled(true);
   button22.setEnabled(true);
   button23.setEnabled(true);
   button24.setEnabled(true);
   button25.setEnabled(true);
   button26.setEnabled(true);
   button27.setEnabled(true);
   button28.setEnabled(true);
   button29.setEnabled(true);
   button30.setEnabled(true);
   button31.setEnabled(true);
   button32.setEnabled(true);
   button33.setEnabled(true);
   button34.setEnabled(true);
   button35.setEnabled(true);
   button36.setEnabled(true);
   button37.setEnabled(true);
   button38.setEnabled(true);
   button39.setEnabled(true);
   button40.setEnabled(true);
   button41.setEnabled(true);
   button42.setEnabled(true);
   button43.setEnabled(true);
   button44.setEnabled(true);
   button45.setEnabled(true);
   button46.setEnabled(true);
   button47.setEnabled(true);
   button48.setEnabled(true);
   button49.setEnabled(true);
   button50.setEnabled(true);
   button51.setEnabled(true);
   button52.setEnabled(true);
   button53.setEnabled(true);
   button54.setEnabled(true);
   button55.setEnabled(true); 
   button56.setEnabled(true);
   button57.setEnabled(true);
   button58.setEnabled(true);
   button59.setEnabled(true);
   button60.setEnabled(true);
   button61.setEnabled(true);
   button62.setEnabled(true);
   button63.setEnabled(true);
   button64.setEnabled(true);
   button65.setEnabled(true);
   button66.setEnabled(true);
   button67.setEnabled(true);
   button68.setEnabled(true);
   button69.setEnabled(true);
   button70.setEnabled(true);
   button71.setEnabled(true);
   button72.setEnabled(true);
   button73.setEnabled(true);
   button74.setEnabled(true);
   button75.setEnabled(true);
   button76.setEnabled(true);
   button77.setEnabled(true);
   button78.setEnabled(true);
   button79.setEnabled(true);
   button80.setEnabled(true);
   button81.setEnabled(true);
   button82.setEnabled(true);
   button83.setEnabled(true);
   button84.setEnabled(true);
   button85.setEnabled(true);
   button86.setEnabled(true);
   button87.setEnabled(true);
   button88.setEnabled(true);
   button89.setEnabled(true);
   button90.setEnabled(true);
   button91.setEnabled(true);
   button92.setEnabled(true);
   button93.setEnabled(true);
   button94.setEnabled(true);
   button95.setEnabled(true);
   button96.setEnabled(true);
   button97.setEnabled(true);
   button98.setEnabled(true);
   button99.setEnabled(true);
   start.setEnabled(false);
   lab1.setText("MAKE COURSE");
      }
      
  });
  
  
  button0 = new JButton("00");
  panel.add(button0);
  button0.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button0.getText().substring(0, 1);
        String s1 = button0.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button0.setBackground(Color.RED);
        }
        button0.setEnabled(false);         
      }
  });
  
  button1 = new JButton("10 ");
  panel.add(button1);
  button1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button1.getText().substring(0, 1);
        String s1 = button1.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button1.setBackground(Color.RED);
        }
        button1.setEnabled(false);         
      }
  });
  
  button2 = new JButton("20 ");
  panel.add(button2);
  button2.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button2.getText().substring(0, 1);
        String s1 = button2.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button2.setBackground(Color.RED);
        }
        button2.setEnabled(false);         
      }
  });
  
  button3 = new JButton("30 ");
  panel.add(button3);
  button3.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button3.getText().substring(0, 1);
        String s1 = button3.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button3.setBackground(Color.RED);
        }
        button3.setEnabled(false);         
      }
  });
  
  button4 = new JButton("40 ");
  panel.add(button4);
  button4.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button4.getText().substring(0, 1);
        String s1 = button4.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button4.setBackground(Color.RED);
        }
        button4.setEnabled(false);         
      }
  });
  
  button5 = new JButton("50 ");
  panel.add(button5);
  button5.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button5.getText().substring(0, 1);
        String s1 = button5.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button5.setBackground(Color.RED);
        }
        button5.setEnabled(false);         
      }
  });
  
  button6 = new JButton("60 ");
  panel.add(button6);
  button6.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button6.getText().substring(0, 1);
        String s1 = button6.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button6.setBackground(Color.RED);
        }
        button6.setEnabled(false);         
      }
  });
  
  button7 = new JButton("70 ");
  panel.add(button7);
  button7.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button7.getText().substring(0, 1);
        String s1 = button7.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button7.setBackground(Color.RED);
        }
        button7.setEnabled(false);         
      }
  });
  
  button8 = new JButton("80 ");
  panel.add(button8);
  button8.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button8.getText().substring(0, 1);
        String s1 = button8.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button8.setBackground(Color.RED);
        }
        button8.setEnabled(false);         
      }
  });
  
  button9 = new JButton("90 ");
  panel.add(button9);
  button9.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button9.getText().substring(0, 1);
        String s1 = button9.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button9.setBackground(Color.RED);
        }
        button9.setEnabled(false);         
      }
  });
  
  
  button10 = new JButton("01 ");
  panel.add(button10);
  button10.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button10.getText().substring(0, 1);
        String s1 = button10.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button10.setBackground(Color.RED);
        }
        button10.setEnabled(false);         
      }
  });
  
  button11 = new JButton("11 ");
  panel.add(button11);
  button11.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button11.getText().substring(0, 1);
        String s1 = button11.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button11.setBackground(Color.RED);
        }
        button11.setEnabled(false);         
      }
  });
  
  button12 = new JButton("21 ");
  panel.add(button12);
  button12.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button12.getText().substring(0, 1);
        String s1 = button12.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button12.setBackground(Color.RED);
        }
        button12.setEnabled(false);         
      }
  });
  
  button13 = new JButton("31 ");
  panel.add(button13);
  button13.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button13.getText().substring(0, 1);
        String s1 = button13.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button13.setBackground(Color.RED);
        }
        button13.setEnabled(false);         
      }
  });
  
  button14 = new JButton("41 ");
  panel.add(button14);
  button14.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button14.getText().substring(0, 1);
        String s1 = button14.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button14.setBackground(Color.RED);
        }
        button14.setEnabled(false);         
      }
  });
  
  button15 = new JButton("51 ");
  panel.add(button15);
  button15.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button15.getText().substring(0, 1);
        String s1 = button15.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button15.setBackground(Color.RED);
        }
        button15.setEnabled(false);         
      }
  });
  
  button16 = new JButton("61 ");
  panel.add(button16);
  button16.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button16.getText().substring(0, 1);
        String s1 = button16.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button16.setBackground(Color.RED);
        }
        button16.setEnabled(false);         
      }
  });
  
  button17 = new JButton("71 ");
  panel.add(button17);
  button17.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button17.getText().substring(0, 1);
        String s1 = button17.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button17.setBackground(Color.RED);
        }
        button17.setEnabled(false);         
      }
  });
  
  button18 = new JButton("81 ");
  panel.add(button18);
  button18.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button18.getText().substring(0, 1);
        String s1 = button18.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button18.setBackground(Color.RED);
        }
        button18.setEnabled(false);         
      }
  });
  
   button19 = new JButton("91 ");
   panel.add(button19);
   button19.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button19.getText().substring(0, 1);
        String s1 = button19.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button19.setBackground(Color.RED);
        }
        button19.setEnabled(false);         
      }
  });
   
   
  button20 = new JButton("02 ");
  panel.add(button20);
  button20.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button20.getText().substring(0, 1);
        String s1 = button20.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button20.setBackground(Color.RED);
        }
        button20.setEnabled(false);         
      }
  });
  
  button21 = new JButton("12 ");
  panel.add(button21);
  button21.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button21.getText().substring(0, 1);
        String s1 = button21.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button21.setBackground(Color.RED);
        }
        button21.setEnabled(false);         
      }
  });
  
  button22 = new JButton("22 ");
  panel.add(button22);
  button22.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button22.getText().substring(0, 1);
        String s1 = button22.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button22.setBackground(Color.RED);
        }
        button22.setEnabled(false);         
      }
  });
  
  button23 = new JButton("32 ");
  panel.add(button23);
  button23.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button23.getText().substring(0, 1);
        String s1 = button23.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button23.setBackground(Color.RED);
        }
        button23.setEnabled(false);         
      }
  });
  
  button24 = new JButton("42 ");
  panel.add(button24);
  button24.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button24.getText().substring(0, 1);
        String s1 = button24.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button24.setBackground(Color.RED);
        }
        button24.setEnabled(false);         
      }
  });
  
  button25 = new JButton("52 ");
  panel.add(button25);
  button25.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button25.getText().substring(0, 1);
        String s1 = button25.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button25.setBackground(Color.RED);
        }
        button25.setEnabled(false);         
      }
  });
  
  button26 = new JButton("62 ");
  panel.add(button26);
  button26.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button26.getText().substring(0, 1);
        String s1 = button26.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button26.setBackground(Color.RED);
        }
        button26.setEnabled(false);         
      }
  });
  
  button27 = new JButton("72 ");
  panel.add(button27);
  button27.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button27.getText().substring(0, 1);
        String s1 = button27.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button27.setBackground(Color.RED);
        }
        button27.setEnabled(false);         
      }
  });
  
  button28 = new JButton("82 ");
  panel.add(button28);
  button28.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button28.getText().substring(0, 1);
        String s1 = button28.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button28.setBackground(Color.RED);
        }
        button28.setEnabled(false);         
      }
  });
  
  button29 = new JButton("92 ");
  panel.add(button29);
  button29.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button29.getText().substring(0, 1);
        String s1 = button29.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button29.setBackground(Color.RED);
        }
        button29.setEnabled(false);         
      }
  });
  
  
  button30 = new JButton("03 ");
  panel.add(button30);
  button30.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button30.getText().substring(0, 1);
        String s1 = button30.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button30.setBackground(Color.RED);
        }
        button30.setEnabled(false);         
      }
  });
  
  button31 = new JButton("13 ");
  panel.add(button31);
   button31.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button31.getText().substring(0, 1);
        String s1 = button31.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button31.setBackground(Color.RED);
        }
        button31.setEnabled(false);         
      }
  });
  
  button32 = new JButton("23 ");
  panel.add(button32);
   button32.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button32.getText().substring(0, 1);
        String s1 = button32.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button32.setBackground(Color.RED);
        }
        button32.setEnabled(false);         
      }
  });
  
  button33 = new JButton("33 ");
  panel.add(button33);
   button33.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button33.getText().substring(0, 1);
        String s1 = button33.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button33.setBackground(Color.RED);
        }
        button33.setEnabled(false);         
      }
  });
  
  button34 = new JButton("43 ");
  panel.add(button34);
   button34.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button34.getText().substring(0, 1);
        String s1 = button34.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button34.setBackground(Color.RED);
        }
        button34.setEnabled(false);         
      }
  });
  
  button35 = new JButton("53 ");
  panel.add(button35);
   button35.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button35.getText().substring(0, 1);
        String s1 = button35.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button35.setBackground(Color.RED);
        }
        button35.setEnabled(false);         
      }
  });
  
  button36 = new JButton("63 ");
  panel.add(button36);
   button36.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button36.getText().substring(0, 1);
        String s1 = button36.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button36.setBackground(Color.RED);
        }
        button36.setEnabled(false);         
      }
  });
  
  button37 = new JButton("73 ");
  panel.add(button37);
   button37.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button37.getText().substring(0, 1);
        String s1 = button37.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button37.setBackground(Color.RED);
        }
        button37.setEnabled(false);         
      }
  });
  
  button38 = new JButton("83 ");
  panel.add(button38);
   button38.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button38.getText().substring(0, 1);
        String s1 = button38.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button38.setBackground(Color.RED);
        }
        button38.setEnabled(false);         
      }
  });
  
  button39 = new JButton("93 ");
  panel.add(button39);
   button39.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button39.getText().substring(0, 1);
        String s1 = button39.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button39.setBackground(Color.RED);
        }
        button39.setEnabled(false);         
      }
  });
  
  
  button40 = new JButton("04 ");
  panel.add(button40);
   button40.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button40.getText().substring(0, 1);
        String s1 = button40.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button40.setBackground(Color.RED);
        }
        button40.setEnabled(false);         
      }
  });
  
  button41 = new JButton("14 ");
  panel.add(button41);
   button41.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button41.getText().substring(0, 1);
        String s1 = button41.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button41.setBackground(Color.RED);
        }
        button41.setEnabled(false);         
      }
  });
  
  button42 = new JButton("24 ");
  panel.add(button42);
   button42.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button42.getText().substring(0, 1);
        String s1 = button42.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button42.setBackground(Color.RED);
        }
        button42.setEnabled(false);         
      }
  });
  
  button43 = new JButton("34 ");
  panel.add(button43);
   button43.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button43.getText().substring(0, 1);
        String s1 = button43.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button43.setBackground(Color.RED);
        }
        button43.setEnabled(false);         
      }
  });
  
  button44 = new JButton("44 ");
  panel.add(button44);
   button44.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button44.getText().substring(0, 1);
        String s1 = button44.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button44.setBackground(Color.RED);
        }
        button44.setEnabled(false);         
      }
  });
  
  button45 = new JButton("54 ");
  panel.add(button45);
   button45.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button45.getText().substring(0, 1);
        String s1 = button45.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button45.setBackground(Color.RED);
        }
        button45.setEnabled(false);         
      }
  });
  
  button46 = new JButton("64 ");
  panel.add(button46);
   button46.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button46.getText().substring(0, 1);
        String s1 = button46.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button46.setBackground(Color.RED);
        }
        button46.setEnabled(false);         
      }
  });
  
  button47 = new JButton("74 ");
  panel.add(button47);
   button47.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button47.getText().substring(0, 1);
        String s1 = button47.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button47.setBackground(Color.RED);
        }
        button47.setEnabled(false);         
      }
  });
  
  button48 = new JButton("84 ");
  panel.add(button48);
   button48.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button48.getText().substring(0, 1);
        String s1 = button48.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button48.setBackground(Color.RED);
        }
        button48.setEnabled(false);         
      }
  });
  
  button49 = new JButton("94 ");
  panel.add(button49);
   button49.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button49.getText().substring(0, 1);
        String s1 = button49.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button49.setBackground(Color.RED);
        }
        button49.setEnabled(false);         
      }
  });
  
  
  button50 = new JButton("05 ");
  panel.add(button50);
   button50.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button50.getText().substring(0, 1);
        String s1 = button50.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button50.setBackground(Color.RED);
        }
        button50.setEnabled(false);         
      }
  });
  
  button51 = new JButton("15 ");
  panel.add(button51);
  button51.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button51.getText().substring(0, 1);
        String s1 = button51.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button51.setBackground(Color.RED);
        }
        button51.setEnabled(false);         
      }
  });
  
  button52 = new JButton("25 ");
  panel.add(button52);
  button52.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button52.getText().substring(0, 1);
        String s1 = button52.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button52.setBackground(Color.RED);
        }
        button52.setEnabled(false);         
      }
  });
  
  button53 = new JButton("35 ");
  panel.add(button53);
  button53.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button53.getText().substring(0, 1);
        String s1 = button53.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button53.setBackground(Color.RED);
        }
        button53.setEnabled(false);         
      }
  });
  
  button54 = new JButton("45 ");
  panel.add(button54);
  button54.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button54.getText().substring(0, 1);
        String s1 = button54.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button54.setBackground(Color.RED);
        }
        button54.setEnabled(false);         
      }
  });
  
  button55 = new JButton("55 ");
  panel.add(button55);
  button55.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button55.getText().substring(0, 1);
        String s1 = button55.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button55.setBackground(Color.RED);
        }
        button55.setEnabled(false);         
      }
  });
  
  button56 = new JButton("65 ");
  panel.add(button56);
  button56.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button56.getText().substring(0, 1);
        String s1 = button56.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button56.setBackground(Color.RED);
        }
        button56.setEnabled(false);         
      }
  });
  
  button57 = new JButton("75 ");
  panel.add(button57);
  button57.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button57.getText().substring(0, 1);
        String s1 = button57.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button57.setBackground(Color.RED);
        }
        button57.setEnabled(false);         
      }
  });
  
  button58 = new JButton("85 ");
  panel.add(button58);
  button58.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button58.getText().substring(0, 1);
        String s1 = button58.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button58.setBackground(Color.RED);
        }
        button58.setEnabled(false);         
      }
  });
  
  button59 = new JButton("95 ");
  panel.add(button59);
  button59.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button59.getText().substring(0, 1);
        String s1 = button59.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button59.setBackground(Color.RED);
        }
        button59.setEnabled(false);         
      }
  });
  
  
  button60 = new JButton("06 ");
  panel.add(button60);
  button60.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button60.getText().substring(0, 1);
        String s1 = button60.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button60.setBackground(Color.RED);
        }
        button60.setEnabled(false);         
      }
  });
  
  button61 = new JButton("16 ");
  panel.add(button61);
  button61.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button61.getText().substring(0, 1);
        String s1 = button61.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button61.setBackground(Color.RED);
        }
        button61.setEnabled(false);         
      }
  });
  
  button62 = new JButton("26 ");
  panel.add(button62);
  button62.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button62.getText().substring(0, 1);
        String s1 = button62.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button62.setBackground(Color.RED);
        }
        button62.setEnabled(false);         
      }
  });
  
  button63 = new JButton("36 ");
  panel.add(button63);
  button63.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button63.getText().substring(0, 1);
        String s1 = button63.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button63.setBackground(Color.RED);
        }
        button63.setEnabled(false);         
      }
  });
  
  button64 = new JButton("46 ");
  panel.add(button64);
  button64.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button64.getText().substring(0, 1);
        String s1 = button64.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button64.setBackground(Color.RED);
        }
        button64.setEnabled(false);         
      }
  });
  
  button65 = new JButton("56 ");
  panel.add(button65);
  button65.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button65.getText().substring(0, 1);
        String s1 = button65.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button65.setBackground(Color.RED);
        }
        button65.setEnabled(false);         
      }
  });
  
  button66 = new JButton("66 ");
  panel.add(button66);
  button66.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button66.getText().substring(0, 1);
        String s1 = button66.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button66.setBackground(Color.RED);
        }
        button66.setEnabled(false);         
      }
  });
  
  button67 = new JButton("76 ");
  panel.add(button67);
  button67.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button67.getText().substring(0, 1);
        String s1 = button67.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button67.setBackground(Color.RED);
        }
        button67.setEnabled(false);         
      }
  });
  
  button68 = new JButton("86 ");
  panel.add(button68);
  button68.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button68.getText().substring(0, 1);
        String s1 = button68.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button68.setBackground(Color.RED);
        }
        button68.setEnabled(false);         
      }
  });
  
  button69 = new JButton("96 ");
  panel.add(button69);
  button69.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button69.getText().substring(0, 1);
        String s1 = button69.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button69.setBackground(Color.RED);
        }
        button69.setEnabled(false);         
      }
  });
  
  
  button70 = new JButton("07 ");
  panel.add(button70);
  button70.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button70.getText().substring(0, 1);
        String s1 = button70.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button70.setBackground(Color.RED);
        }
        button70.setEnabled(false);         
      }
  });
  
  button71 = new JButton("17 ");
  panel.add(button71);
  button71.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button71.getText().substring(0, 1);
        String s1 = button71.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button71.setBackground(Color.RED);
        }
        button71.setEnabled(false);         
      }
  });
  
  button72 = new JButton("27 ");
  panel.add(button72);
  button72.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button72.getText().substring(0, 1);
        String s1 = button72.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button72.setBackground(Color.RED);
        }
        button72.setEnabled(false);         
      }
  });
  
  button73 = new JButton("37 ");
  panel.add(button73);
  button73.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button73.getText().substring(0, 1);
        String s1 = button73.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button73.setBackground(Color.RED);
        }
        button73.setEnabled(false);         
      }
  });
  
  button74 = new JButton("47 ");
  panel.add(button74);
  button74.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button74.getText().substring(0, 1);
        String s1 = button74.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button74.setBackground(Color.RED);
        }
        button74.setEnabled(false);         
      }
  });
  
  button75 = new JButton("57 ");
  panel.add(button75);
  button75.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button75.getText().substring(0, 1);
        String s1 = button75.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button75.setBackground(Color.RED);
        }
        button75.setEnabled(false);         
      }
  });
  
  button76 = new JButton("67 ");
  panel.add(button76);
  button76.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button76.getText().substring(0, 1);
        String s1 = button76.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button76.setBackground(Color.RED);
        }
        button76.setEnabled(false);         
      }
  });
  
  button77 = new JButton("77 ");
  panel.add(button77);
  button77.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button77.getText().substring(0, 1);
        String s1 = button77.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button77.setBackground(Color.RED);
        }
        button77.setEnabled(false);         
      }
  });
  
  button78= new JButton("87 ");
  panel.add(button78);
  button78.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button78.getText().substring(0, 1);
        String s1 = button78.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button78.setBackground(Color.RED);
        }
        button78.setEnabled(false);         
      }
  });
  
  button79 = new JButton("97 ");
  panel.add(button79);
  button79.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button79.getText().substring(0, 1);
        String s1 = button79.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button79.setBackground(Color.RED);
        }
        button79.setEnabled(false);         
      }
  });
  
  
  button80 = new JButton("08 ");
  panel.add(button80);
  button80.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button80.getText().substring(0, 1);
        String s1 = button80.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button80.setBackground(Color.RED);
        }
        button80.setEnabled(false);         
      }
  });
  
  button81 = new JButton("18 ");
  panel.add(button81);
  button81.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button81.getText().substring(0, 1);
        String s1 = button81.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button81.setBackground(Color.RED);
        }
        button81.setEnabled(false);         
      }
  });
  
  button82 = new JButton("28 ");
  panel.add(button82);
  button82.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button82.getText().substring(0, 1);
        String s1 = button82.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button82.setBackground(Color.RED);
        }
        button82.setEnabled(false);         
      }
  });
  
  button83 = new JButton("38 ");
  panel.add(button83);
  button83.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button83.getText().substring(0, 1);
        String s1 = button83.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button83.setBackground(Color.RED);
        }
        button83.setEnabled(false);         
      }
  });
  
  button84 = new JButton("48 ");
  panel.add(button84);
  button84.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button84.getText().substring(0, 1);
        String s1 = button84.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button84.setBackground(Color.RED);
        }
        button84.setEnabled(false);         
      }
  });
  
  button85 = new JButton("58 ");
  panel.add(button85);
  button85.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button85.getText().substring(0, 1);
        String s1 = button85.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button85.setBackground(Color.RED);
        }
        button85.setEnabled(false);         
      }
  });
  
  button86 = new JButton("68 ");
  panel.add(button86);
  button86.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button86.getText().substring(0, 1);
        String s1 = button86.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button86.setBackground(Color.RED);
        }
        button86.setEnabled(false);         
      }
  });
  
  button87 = new JButton("78 ");
  panel.add(button87);
  button87.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button87.getText().substring(0, 1);
        String s1 = button87.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button87.setBackground(Color.RED);
        }
        button87.setEnabled(false);         
      }
  });
  
  button88 = new JButton("88 ");
  panel.add(button88);
  button88.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button88.getText().substring(0, 1);
        String s1 = button88.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button88.setBackground(Color.RED);
        }
        button88.setEnabled(false);         
      }
  });
  
  button89 = new JButton("98 ");
  panel.add(button89);
  button89.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button89.getText().substring(0, 1);
        String s1 = button89.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button89.setBackground(Color.RED);
        }
        button89.setEnabled(false);         
      }
  });
  
  
  button90 = new JButton("09 ");
  panel.add(button90);
  button90.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button90.getText().substring(0, 1);
        String s1 = button90.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button90.setBackground(Color.RED);
        }
        button90.setEnabled(false);         
      }
  });
  
   button91 = new JButton("19 ");
  panel.add(button91);
  button91.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button91.getText().substring(0, 1);
        String s1 = button91.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button91.setBackground(Color.RED);
        }
        button91.setEnabled(false);         
      }
  });
  
  button92 = new JButton("29 ");
  panel.add(button92);
  button92.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button92.getText().substring(0, 1);
        String s1 = button92.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button92.setBackground(Color.RED);
        }
        button92.setEnabled(false);         
      }
  });
  
  button93 = new JButton("39 ");
  panel.add(button93);
  button93.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button93.getText().substring(0, 1);
        String s1 = button93.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button93.setBackground(Color.RED);
        }
        button93.setEnabled(false);         
      }
  });
  
  button94 = new JButton("49 ");
  panel.add(button94);
  button94.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button94.getText().substring(0, 1);
        String s1 = button94.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button94.setBackground(Color.RED);
        }
        button94.setEnabled(false);         
      }
  });
  
  button95 = new JButton("59 ");
  panel.add(button95);
  button95.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button95.getText().substring(0, 1);
        String s1 = button95.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button95.setBackground(Color.RED);
        }
        button95.setEnabled(false);         
      }
  });
  
  button96 = new JButton("69 ");
  panel.add(button96);
  button96.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button96.getText().substring(0, 1);
        String s1 = button96.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button96.setBackground(Color.RED);
        }
        button96.setEnabled(false);         
      }
  });
  
  button97 = new JButton("79 ");
  panel.add(button97);
  button97.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button97.getText().substring(0, 1);
        String s1 = button97.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button97.setBackground(Color.RED);
        }
        button97.setEnabled(false);         
      }
  });
  
  button98 = new JButton("89 ");
  panel.add(button98);
  button98.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button98.getText().substring(0, 1);
        String s1 = button98.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button98.setBackground(Color.RED);
        }
        button98.setEnabled(false);         
      }
  });
  
  button99 = new JButton("99 ");
  panel.add(button99);
  button99.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        String s = button99.getText().substring(0, 1);
        String s1 = button99.getText().substring(1, 2);
        int xpush = Integer.parseInt(s);
        int ypush = Integer.parseInt(s1);
        seaCombatGui(playfild, xpush, ypush); 
        if (lab.getText().equals("it was destroyed") || lab.getText().equals("it was wounded")){
        button99.setBackground(Color.RED);
        }
        button99.setEnabled(false);         
      }
  });
  
   
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  JPanel panel1 = new JPanel();
  panel1.setOpaque(true);// непрозрачная панель
  lab1 = new JLabel(" Course ");
  lab = new JLabel(" Result ");
  lab1.setBorder(BorderFactory.createLineBorder(Color.black));
  lab.setBorder(BorderFactory.createLineBorder(Color.black));
  panel1.setLayout(new FlowLayout());
  panel1.add(lab1);
  panel1.add(lab);
  jframe.add(panel1, BorderLayout.SOUTH);
  
  
 
 button0.setEnabled(false);
   button1.setEnabled(false);
   button2.setEnabled(false);
   button3.setEnabled(false);
   button4.setEnabled(false);
   button5.setEnabled(false);
   button6.setEnabled(false);
   button7.setEnabled(false);
   button8.setEnabled(false);
   button9.setEnabled(false);
   button10.setEnabled(false);
   button11.setEnabled(false);
   button12.setEnabled(false);
   button13.setEnabled(false);
   button14.setEnabled(false);
   button15.setEnabled(false);
   button16.setEnabled(false);
   button17.setEnabled(false);
   button18.setEnabled(false);
   button19.setEnabled(false);
   button20.setEnabled(false);
   button21.setEnabled(false);
   button22.setEnabled(false);
   button23.setEnabled(false);
   button24.setEnabled(false);
   button25.setEnabled(false);
   button26.setEnabled(false);
   button27.setEnabled(false);
   button28.setEnabled(false);
   button29.setEnabled(false);
   button30.setEnabled(false);
   button31.setEnabled(false);
   button32.setEnabled(false);
   button33.setEnabled(false);
   button34.setEnabled(false);
   button35.setEnabled(false);
   button36.setEnabled(false);
   button37.setEnabled(false);
   button38.setEnabled(false);
   button39.setEnabled(false);
   button40.setEnabled(false);
   button41.setEnabled(false);
   button42.setEnabled(false);
   button43.setEnabled(false);
   button44.setEnabled(false);
   button45.setEnabled(false);
   button46.setEnabled(false);
   button47.setEnabled(false);
   button48.setEnabled(false);
   button49.setEnabled(false);
   button50.setEnabled(false);
   button51.setEnabled(false);
   button52.setEnabled(false);
   button53.setEnabled(false);
   button54.setEnabled(false);
   button55.setEnabled(false); 
   button56.setEnabled(false);
   button57.setEnabled(false);
   button58.setEnabled(false);
   button59.setEnabled(false);
   button60.setEnabled(false);
   button61.setEnabled(false);
   button62.setEnabled(false);
   button63.setEnabled(false);
   button64.setEnabled(false);
   button65.setEnabled(false);
   button66.setEnabled(false);
   button67.setEnabled(false);
   button68.setEnabled(false);
   button69.setEnabled(false);
   button70.setEnabled(false);
   button71.setEnabled(false);
   button72.setEnabled(false);
   button73.setEnabled(false);
   button74.setEnabled(false);
   button75.setEnabled(false);
   button76.setEnabled(false);
   button77.setEnabled(false);
   button78.setEnabled(false);
   button79.setEnabled(false);
   button80.setEnabled(false);
   button81.setEnabled(false);
   button82.setEnabled(false);
   button83.setEnabled(false);
   button84.setEnabled(false);
   button85.setEnabled(false);
   button86.setEnabled(false);
   button87.setEnabled(false);
   button88.setEnabled(false);
   button89.setEnabled(false);
   button90.setEnabled(false);
   button91.setEnabled(false);
   button92.setEnabled(false);
   button93.setEnabled(false);
   button94.setEnabled(false);
   button95.setEnabled(false);
   button96.setEnabled(false);
   button97.setEnabled(false);
   button98.setEnabled(false);
   button99.setEnabled(false);
   
  
  
  
 jframe.setSize(400,400);
 jframe.setVisible(true);   
}

class StartButton implements ActionListener{
 public void actionPerformed(ActionEvent ev){
  
  SeaCombat(playfild); 
  
 } 
}



   
}


