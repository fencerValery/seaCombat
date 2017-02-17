package com.SeaCombat;




public class Ship {   
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