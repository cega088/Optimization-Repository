package Optimization;

import java.util.Arrays;

public class Swarm {

	public static void main(String[] args) {
		
		int S=50;//Number of particles
	    int J=2;//Number of variables in fitness function
	    int T=100;//Number of iterations
	    Particle[] Swarm = new Particle[S];//Create swarm as an array of S particles
	    double[] gbest = new double[J];//Create best global as an array of J numbers
	    double BestGlobalFitness = (double)Integer.MAX_VALUE;//Create best global fitness as a double and initialize it as the greater number possible
	    
	    //First Iteration
	    for(int s=0;s<S;s++) {
	    	Swarm[s]= new Particle(J);//applying constructor to every particle passing as parameter J
	    	Swarm[s].SetBestFitness(Swarm[s].CalculateFitness());//Setting s first best fitness as the one computed with the s first position (which is randomized in constructor)
	    	if(Swarm[s].CalculateFitness() < BestGlobalFitness) {//if fitness of s particle is better than actual best global fitness
	    		BestGlobalFitness = Swarm[s].CalculateFitness();//refresh best global fitness
	    		gbest = Arrays.copyOf(Swarm[s].GetPosition(),Swarm[s].GetPosition().length);//refresh best global 
	    	}
	    }
	    for(int s=0;s<S;s++) 
	    	{Swarm[s].SetGbest(gbest);}//refresh best global of each particle
	    System.out.println("iteración: 0");//print
        for( int s=0;s<S;s++)//print                                         
          {Swarm[s].PrintParticle();}//print
        System.out.print("swarm gbest: ");//print
        for(int j=0;j<J;j++)//print
        {System.out.print(gbest[j]+"   ");}//print
        System.out.println("swarm best global fitness: "+BestGlobalFitness);//print
        
	    //Other iterations
	    for(int t=1;t<T;t++)//in all iterations                                                 
        {for(int s=0;s<S;s++)//for all particles                                                    
           {Swarm[s].RefreshVelocity();//refresh velocity                                    
            Swarm[s].move();//refresh position                                                  
            if(Swarm[s].CalculateFitness()<Swarm[s].GetBestFitness())//if fitness of s particle is better than last best fitness s particle remember
              {Swarm[s].SetBestFitness(Swarm[s].CalculateFitness());//refresh s particle best fitness
               Swarm[s].SetPbest(Swarm[s].GetPosition());}//refresh s particle best position
            
            if(Swarm[s].CalculateFitness() < BestGlobalFitness){//if fitness of s particle is better than actual best global fitness        
            	BestGlobalFitness = Swarm[s].CalculateFitness();//refresh best global fitness          
            	gbest = Arrays.copyOf( Swarm[s].GetPosition(), Swarm[s].GetPosition().length);//refresh best global 
            	}
                      
           } 
            for( int s=0;s<S;s++)                                          
              {Swarm[s].SetGbest(gbest);}//refresh best global of each particle 
            System.out.println("iteración: "+t);//print
            for( int s=0;s<S;s++)//print                          
              {Swarm[s].PrintParticle();}//print
            System.out.print("swarm gbest: ");//print
            for(int j=0;j<J;j++)//print
            {System.out.print(gbest[j]+"   ");}//print
            System.out.println("swarm best global fitness: "+BestGlobalFitness);//print
        }                                  
	 
	}
}
