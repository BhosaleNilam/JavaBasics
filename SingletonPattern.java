//EagerInitializedSingleton
public class EagerInitializedSingleton{
    
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    private EagerInitializedSingleton(){
        
    }
    
    private static EagerInitializedSingleton getInstance(){
        return instance;
    }
    
}


//Static block initialization
public class StaticSingleton{
    
    private static StaticSingleton instance;
    
    private StaticSingleton(){}
    
    static {
        try{
            instance = new StaticSingleton();
        }catch(Exception e){
         throw new RuntimeException("Exception occurred in creating singleton instance");
  
        }
    }
    
    private static StaticSingleton getInstance(){
        return instance;
    }
}


//Lazy Initialization 

public class LazyInitializedSingleton{
    private static LazyInitializedSingleton instance;
    
    private LazyInitializedSingleton(){}
    
    private static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}

//Thread Safe Singleton
public class LazyInitializedSingleton{
    private static LazyInitializedSingleton instance;
    
    private LazyInitializedSingleton(){}
    
    private static synchronized LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}


//static block 

 private static LazyInitializedSingleton getInstance(){
     
     synchronized (LazyInitializedSingleton.class){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }  
     }
        return instance;
    }
