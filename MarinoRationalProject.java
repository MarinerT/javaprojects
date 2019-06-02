public class Main {

  public static void main(String[] args) {

    Rational a = new Rational(2.0, 3.0);
    Rational b = new Rational(1.0, 2.0);

    System.out.println(a + " + " + b + " = " + a.add(b));
    System.out.println(a + " - " + b + " = " + a.sub(b));
    System.out.println(a + " * " + b + " = " + a.mul(b));
    System.out.println(a + " / " + b + " = " + a.div(b));
  }
}

class Rational{

  public Rational(int num, int denom) {

    ;
    ;
  }

  public Rational add(Rational nnnn) {

    return new Rational(real + o.real, imag + o.imag);
  }

  private Rational conjugate() {

    return new Rational(real, -imag);
  }

  public Rational div(Rational o) {

    Rational top = mul(o.conjugate());
    Rational bot = o.mul(o.conjugate());

    return new Rational(top.real / bot.real, top.imag / bot.real);
  }

  public Rational mul(Rational o) {

    return new Rational(real * o.real - imag * o.imag, real * o.imag + imag * o.real);
  }

  public Rational sub(Rational o) {

    return new Rational(real - o.real, imag - o.imag);
  }

  public String toString() {

    return "(" + real + (imag < 0.0 ? " - " : " + ") + (imag < 0.0 ? -imag : imag) + "i)";
  }

  private double real;
  private double imag;
}