import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaHouse {
    
    
    public String address = "";
    public String phone = "";
    public int item = 10;  //10 means pizza is not ordered at all. default val.
    public int topping = 0;
    List<Integer> bevSidedishList = new ArrayList<Integer>();
   
    public int bevSidedishSumPrice =0;
    public int totalPrice =0;

    //price info array
    int itemPrice[] = new int[] {10,12,12,15};
    int toppingPrice[] = new int[] {2,5,4,3,0};
    int bevSidedishPrice[] = new int[] {1,1,1,5,0};
 
    //menu info array
    String itemName[] = new String[] {"cheese pizza","bacon pizza","supreme pizza","shrimp pizza"};
    String toppingName[] = new String[] {"cheddar cheese","beef barbeque","fork barbeque","grilled chicken","none"};
    String bevSidedishName[] = new String[] {"coke","sprite","orange juice","fried potato with meat sauce","none"};
  
    
    //constructor
    public PizzaHouse(){  
    	 System.err.println("◆◇◆◇◆◇◆◇Welcome to Pizza House◆◇◆◇◆◇◆◇");
         System.out.println("Choose 1. order a pizza");
         System.out.println("Choose 2. check the bill");
    }
  
    public void orderPizza(){
        System.out.println("Enter the address to receive your pizza : ");
        Scanner sc = new Scanner(System.in);
        this.address = sc.nextLine();
        
        System.out.println("Enter your phone number : "); 
        this.phone = sc.nextLine();
          System.out.println("step1: choose one item number");
          System.out.println("1. cheese pizza ($10)");
          System.out.println("2. bacon pizza ($12)");
          System.out.println("3. supreme pizza ($12)");
          System.out.println("4. shrimp pizza ($15)");
          Scanner sc1 = new Scanner(System.in);
          this.item = sc1.nextInt()-1;
          
          System.out.println("step2: choose one extra topping number");
          System.out.println("1. cheddar cheese ($2)");
          System.out.println("2. beef barbeque ($5)");
          System.out.println("3. fork barbeque ($4)");
          System.out.println("4. grilled chicken ($3)");
          System.out.println("5. none");
          this.topping = sc1.nextInt()-1;
          
          boolean continued = true;
          while(continued){   
          System.out.println("step3: choose beverage or side dish");
          System.out.println("1. coke ($1)");
          System.out.println("2. sprite ($1)");
          System.out.println("3. orange juice ($1)");
          System.out.println("4. fried potato with meat sauce ($5)");
          System.out.println("5. none");
      
          bevSidedishList.add(sc.nextInt()-1); 
          
          System.out.println("Do you want to order more beverage or side dish? Yes/No");
          Scanner sc2 = new Scanner(System.in);
          String answer = sc2.nextLine();
          if(answer.equals("Yes")){
        	  //System.out.println("y");
              continued = true;
             }else {
              //System.out.println("n");
              continued = false; 	 
             }
          }
    }
    
    public void checkBill(){ 
    	//System.out.println(item);
    	if(item == 10) {
    		System.out.println("------------your order list is empty -------------");	
    	}else {
            System.err.println("ㅁㅁㅁㅁㅁㅁㅁㅁyour billㅁㅁㅁㅁㅁㅁㅁㅁ");
            System.out.println("------------your info -------------");
            System.out.println("1. address: "+address);
            System.out.println("2. phone: "+phone);
            System.out.println("------------you ordered-----------");
            System.out.println("1. item: "+itemName[item]+" "+itemPrice[item]+"$");
            System.out.println("2. topping: "+toppingName[topping]+" "+toppingPrice[topping]+"$");
            System.out.println("3. beverage or side dish: ");

        
        for(int i =0; i<bevSidedishList.size(); i++) {
            System.out.println("   "+bevSidedishName[i]+" "+bevSidedishPrice[i]+"$");
            bevSidedishSumPrice=bevSidedishSumPrice+bevSidedishPrice[i];
        }
        
            totalPrice = itemPrice[item]+toppingPrice[item]+bevSidedishSumPrice;
          System.out.println("------------total amount -----------");
          System.out.println(totalPrice+"$");
          System.err.println("ㅁㅁㅁㅁㅁㅁㅁㅁThank you for your order!!ㅁㅁㅁㅁㅁㅁㅁㅁ");

    	}
    }
    
    public static void main(String args[]) {

      PizzaHouse pizzaHouse= new PizzaHouse(){};
      Scanner sc1 = new Scanner(System.in); 
      int num = sc1.nextInt();
      //System.out.println("num1"+num);
      switch(num){
          case 1: pizzaHouse.orderPizza();
          //System.out.println("num2"+num);
          case 2: pizzaHouse.checkBill();
              break;
      }
      
    }
}
