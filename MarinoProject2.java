public class MarinoProject2 {
  public static void main(String[] args) 
  {
    Rational a = new Rational(1,2);
    Rational b = new Rational(2,3); 
    
    System.out.println(a + " * " + b + " = " + a.mul(b));
    System.out.println(a + " / " + b + " = " + a.div(b));
    System.out.println(a + " + " + b + " = " + a.add(b));
    System.out.println(a + " - " + b + " = " + a.sub(b));
  }
}

class Rational {
    
  public Rational(int x, int y) {
    
        this.x = x;
      	this.y = y;
  }
     
  public Rational add(Rational o) {
    
    Rational result = new Rational(x*o.y + o.x*y, y*o.y);
    
    return result;
  }
  
  private Rational conjugate() {
    return new Rational(x, y);
  }
  
  public Rational mul(Rational o)
    {
      Rational result = new Rational(x*o.x,
                                      y*o.y);
      return result;
    }
    
  public Rational div(Rational o)
    {
        Rational result = new Rational(x*o.y,
                                      y*o.x);
      return result;
    }
      
   public Rational sub(Rational o)
    {
      Rational result = new Rational(x*o.y - o.x*y,
                                      y*o.y);
      return result;
    }
             
	public String toString() {
      return "" + x + "/" + y;
    }
              
    private int x;
    private int y;
  }