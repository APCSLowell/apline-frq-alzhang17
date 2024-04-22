public class APLine
{
  private int a, b, c;
  public APLine(int a1, b1, c1){
    a = a1;
    b = b1;
    c = c1;
  }
  
  public double getSlope(){
    return (double)(-1*a)/b;
  }
  
  public boolean isOnLine(int x, int y){
    if((a*x) + (b*y) + c == 0){
      return true;
    }
    return false;
  }
}
