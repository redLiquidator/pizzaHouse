import java.util.Scanner;

public class PizzaHouse {
    
    
    public String address = "";
    public String phone = "";
    public int item = 0;
    public int topping = "";
    List bevSidedishList = new ArrayList();
   
    public int bevSidedishSumPrice =0;
    public int totalPrice =0;
    //price info
     HashMap<Integer,Integer> bevSidedishPrice=new HashMap<Integer,Integer>();//Creating HashMap
       bevSidedishPrice.put(1,1); // 1 $1  
       bevSidedishPrice.put(2,2);  // 2 $2  
       bevSidedishPrice.put(3,1); // 3 $1  
       bevSidedishPrice.put(4,5); // 4 $5 
       bevSidedishPrice.put(5,0); // 5 $0
       
      HashMap<Integer,Integer> itemPrice=new HashMap<Integer,Integer>();//Creating HashMap
       itemPrice.put(1,1); // 1 $10  
       itemPrice.put(2,2);  // 2 $12  
       itemPrice.put(3,1); // 3 $12  
       itemPrice.put(4,5); // 4 $15 
    
    HashMap<Integer,Integer> toppingPrice=new HashMap<Integer,Integer>();//Creating HashMap
       toppingPrice.put(1,2); // 1 $2  
       toppingPrice.put(2,5);  // 2 $5  
       toppingPrice.put(3,4); // 3 $4 
       toppingPrice.put(4,3); // 4 $3 
       toppingPrice.put(5,0); // 4 $0 

      Scanner sc = new Scanner(System.in);
    
    //constructor
    public MyClass(){
          System.out.println("Welcome to Pizza House");
          System.out.println("Enter the address to receive your pizza : ");
          this.address = sc.nextLine();
          
          System.out.println("Enter your phone number : "); 
          this.phone = sc.nextLine();
    }
        
   
    
    public void orderPizza(){
          System.out.println("step1: choose one item number");
          System.out.println("1. cheese pizza ($10)");
          System.out.println("2. bacon pizza ($12)");
          System.out.println("3. supreme pizza ($12)");
          System.out.println("4. shrimp pizza ($15)");
          this.item = sc.nextInt();
          
          System.out.println("step2: choose one extra topping number");
          System.out.println("1. cheddar cheese ($2)");
          System.out.println("2. beef barbeque ($5)");
          System.out.println("3. fork barbeque ($4)");
          System.out.println("4. grilled chicken ($3)");
          System.out.println("5. none");
          this.topping = sc.nextInt();
          
          while(true){
          System.out.println("step3: choose beverage or side dish");
          System.out.println("1. coke ($1)");
          System.out.println("2. sprite ($1)");
          System.out.println("3. orange juice ($1)");
          System.out.println("4. fried potato with meat sauce ($5)");
          System.out.println("5. none");
      
          bevSidedishList.add(sc.nextInt()); 
          
          System.out.println("Do you want to order more beverage or side dish? Yes/No");
          
          if(sc.nextLine() == "No"){
              break;
             }
         
          }
    
    public void checkBill(){
            System.out.println("-------check your bill -----");
            System.out.println("------------your info -------------");
            System.out.println("1. address: "+address);
            System.out.println("2. phone: "+phone);
            System.out.println("------------you ordered.. -----------");
            System.out.println("1. item: "+item+" "+itemPrice.get(this.item)+"$");
            System.out.println("2. topping: "+topping+" "+toppingPrice.get(this.topping)+"$");
            System.out.print("3. beverage or side dish: ");

        // Print the name from the list get its price from hashmap
        for(int i =0; i<bevSidedishList.length(); i++) {
            System.out.println(", "+list[i]+" "+bevSidedishPrice.get(list[i])+"$");
            bevSidedishSumPrice=bevSidedishSumPrice+bevSidedishPrice.get(list[i]);
        }
        
            totalPrice = itemPrice.get(this.item)+toppingPrice.get(this.topping)+bevSidedishSumPrice;
         System.out.println("------------total amount -----------");
          System.out.println(totalPrice+"$");
    }
    public static void main(String args[]) {
        

      System.out.println("Choose 1. order a pizza");
      System.out.println("Choose 2. check the bill");
      
      
      int num = sc1.nextInt();
      
      PizzaHouse pizzaHouse= new PizzaHouse(){};

      switch(num){
          case 1: pizzaHouse.orderPizza();
              break;
          case 2: pizzaHouse.checkBill();
              break;
      }
    }
}
