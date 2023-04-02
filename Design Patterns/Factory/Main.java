
public class Main {
    public static void main(String[] args) {
        BurgerFactory burgerFactory = new BurgerFactory();
        System.out.println(burgerFactory.createCheeseBurger());
        System.out.println(burgerFactory.createVeganBurger());
        System.out.println(burgerFactory.createDeluxeBurger());
    }

}

public class Burger {
    private String ingredients;

    public Burger(String ingredients) {
        this.ingredients = ingredients;
    }

}

public class BurgerFactory {
    public String[] createCheeseBurger() {
        String[] ingredients = { "bun", "cheese", "beef" };
        return ingredients;
    }

    public String[] createDeluxeBurger() {
        String[] ingredients = { "Tomato", "cheese", "beef" };
        return ingredients;
    }

    public String[] createVeganBurger() {
        String[] ingredients = { "bun", "sauce", "beef" };
        return ingredients;
    }

}

    

    
        



    
              
    
              
    

    

        
                
        
                
        

            
            
         

                
            
                  
        

            
            
              
        

        
            
