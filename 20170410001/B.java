class B extends A {
  public int x;
  public int sum;
  public B(int p){
    super(p);
    y = temp + p ;
    sum = p + temp + 1;
    temp-=1;
  }  
  public B(B b){
     super(b.sum);
     sum = b.sum;
     x = b.x;
  }
  public void methodB(int m, int n){    
    int  y =0;
    y = y + this.y; 
    x = this.y + 2 + temp;
    super.methodB(x, y);
    sum = x + y + super.sum;
    System.out.println(x + " " + y+ " " + sum);
  }
}