package ro.ase.cts.g1088;

public class ExceptionAllower extends Exception{
    @Override
    public String getMessage()
    {
        return "Toate literele sunt mici";
    }
}
 class ExceptionUpper extends Exception{
     @Override
     public String getMessage()
     {
         return "Toate literele sunt mari";
     }
 }
