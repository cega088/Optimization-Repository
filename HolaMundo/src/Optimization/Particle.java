package Optimization;

public class Particle {
	private int J;                                             
    private double[] x;                                         
    private double[] v;                                         
    private double[] pbest;                                     
    private double[] gbest;                                     
    private double best_fitness, fitness;                               
    private double alpha_1,beta_1;
    
    public Particle(int J) {
    this.J=J;                                    
    x = new double [J];                          
    v = new double [J];
    pbest = new double[J];
    gbest = new double[J];
    for ( int j=0;j<J;j++)
     {x[j]=Math.random();                    
      v[j]=Math.random();}
    for (int j=0;j<J;j++)                  
    {pbest[j]=x[j];}
    }
    
    public double CalculateFitness(){
    alpha_1=10000;
    beta_1=10000;
    fitness= x[0]*x[0] + x[1]*x[1] + alpha_1*Math.pow(Math.min(6-x[0]-2*x[1],0.0),2) + beta_1*Math.pow(Math.max(3-x[0]+x[1],0.0),2) + beta_1*Math.pow(-Math.min((3-x[0]+x[1]),0.0),2);   	
    return fitness;  
    /*    
    return Math.pow(x[0]-2,2)+Math.pow(x[1]-1,2)
    +alpha_1*Math.pow( Math.min(  Math.pow(x[0],2)/4+Math.pow(x[1],2)-1 , 0 ) , 2)
    +beta_1*Math.pow(-(Math.min(2*x[1]-x[0]-1,0)),2)
    +beta_1*Math.pow((Math.max(2*x[1]-x[0]-1,0)),2);
    */
    }
    
    public void move(){
    for (int j = 0; j < J; ++j) 
    {x[j]+=v[j];}
    }
    
    public void RefreshVelocity() {
    for (int j = 0; j < J; ++j) 
    {v[j] = (v[j]+ 2.05*Math.random()*(pbest[j]-x[j]) + 2.05*Math.random()*(gbest[j]-x[j]))*0.72984; } 
    }
    
    public void SetPbest(double[] b)
    {this.pbest=b;} 
    public void SetGbest(double[] g)
    {this.gbest=g;}
    public void SetBestFitness(double f)
    {this.best_fitness=f;}
    public double GetBestFitness()
    {return this.best_fitness;}
    
    
    public double[] GetPosition() {
    	return x;
    }
    
    public void PrintParticle() {
    	System.out.print("x: ");
    	for (int j = 0; j < J; ++j) 
        {System.out.print(x[j]+"   ");}
        System.out.print("pbest: "); 
        for (int j = 0; j < J; ++j) 
        {System.out.print(pbest[j]+"   ");}
        System.out.print("gbest: "); 
        for (int j = 0; j < J; ++j) 
        {System.out.print(gbest[j]+"   ");}
        System.out.print("best_fitness: "+best_fitness);
        System.out.println("fitness: "+fitness);
        }
    	
    	
    
}
