package ru.mirea.task3;

public class Head {
   private String hair;
   private String eyes;

   public Head(String hair , String eyes )
   {
       this.hair = hair;
       this.eyes = eyes;
   }

   public Head()
   {
       hair = " Brown";
       eyes = " Blue";
   }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }
    public String getHair(String hair)
    {
      return hair;
    }
    public String getEyes(String eyes)
    {
        return eyes;
    }
    public String toString(){
       return "Head: "+ hair + " hair, " + eyes + " eyes ";
    }
}
