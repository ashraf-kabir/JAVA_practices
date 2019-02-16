public class QuadEqn{
  public double root(int a,int b,int c){
    
    double root=(-b+(Math.pow((b*b-4*a*c),0.5)))/2*a; 
    return root;
  }
}
