import java.util.Scanner;

public class ProgressionFinder {
    //Arithmetic Progression
    static int ArithmeticProgression(int nums[], int nth){
        if(nums.length < 2) {
            System.out.println("Insufficient numbers to determine AP");
            return 0;
        }
    
        int difference = nums[1] - nums[0];
    
        // Validate AP 2, 4, 6, 8, . . . 
        for(int i = 2; i < nums.length; i++){
            if(nums[i] != nums[i-1] + difference){
                System.out.println("Not a Arithmetic Progression");
                return 0;
            }
        }
    
        System.out.println("Differnece d = " + difference);
    
        int AP = nums[0] + (nth - 1) *difference;
        System.out.println("The AP is " + AP);
        return AP;
    }
    //Sum of Arithmetic Progression
    static int calculateArithmeticProgressionSum(int nums[], int nth){
        // Sn = n/2(2a + (n-1)d)
        if(nums.length < 2) {
            System.out.println("Insufficient numbers to determine AP");
            return 0;
        }
    
        int difference = nums[1] - nums[0];
    
        // Validate AP
        for(int i = 2; i < nums.length; i++){
            if(nums[i] != nums[i-1] + difference){
                System.out.println("Not an Arithmetic Progression");
                return 0;
            }
        }
    
        int firstTerm = nums[0];
        int lastTerm = firstTerm + (nth - 1) * difference;
        int sumAP = nth * (firstTerm + lastTerm) / 2;
        System.out.println("The Sum of AP is "+(int)sumAP);
        return (int)sumAP;
    } 
    //GeometricProgression
    static int GeometricProgression(int nums[], int nth){
        if(nums.length < 2) {
            System.out.println("Insufficient numbers to determine GP");
            return 0;
        }
    
        int commonRatio = nums[1] / nums[0];
    
        // Validate GP
        for(int i = 2; i < nums.length; i++){
            if(nums[i] != nums[i-1] * commonRatio){
                System.out.println("Not a Geometric Progression");
                return 0;
            }
        }
    
        System.out.println("Common Ratio r = " + commonRatio);
    
        int GP = nums[0] * (int)Math.pow(commonRatio, (nth - 1));
        System.out.println("The GP is " + GP);
        return GP;
    }
    static int calculateGeometricProgressionSum(int nums[], int nth){
        //Sn= a(1-r^n)/(1-r)
        if(nums.length < 2) {
            System.out.println("Insufficient numbers to determine GP");
            return 0;
        }

        int commonRatio = nums[1]/nums[0];

        // Validate GP
        for(int i = 2; i < nums.length; i++){
            if(nums[i] != nums[i-1] * commonRatio){
                System.out.println("Not a Geometric Progression");
                return 0;
            }
        }

        int sumGP = (nums[0] * (1 - (int)Math.pow(commonRatio, nth))/(1 - commonRatio));
        System.out.println("The Sum of GP is "+sumGP);
        return sumGP;
    }    
    
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

        System.out.println("---**Geometric Preogression Finder**---");

        System.out.println("Enter nth term to find GP ");
        int nth = sc.nextInt();

        //Array for taking numbers
        System.out.println("How many numbers you want enter ");
        int arr_size = sc.nextInt();
        int nums[] = new int[arr_size];
        
        System.out.println("Enter the numbers for GP");
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        //UsereChoiceInput
        char choice;

        do {
            System.out.println("Enter an option ");
            System.out.println("Enter 1 for AP ");
            System.out.println("Enter 2 for AP Sum ");
            System.out.println("Enter 3 for GP ");
            System.out.println("Enter 4 for GP Sum ");
            System.out.println("Enter 5 for restart calculations ");
            int selection = sc.nextInt();
        
            switch(selection){
                case 1:
                    ArithmeticProgression(nums, nth);
                    break;
                case 2:
                    calculateArithmeticProgressionSum(nums, nth);
                    break;
                case 3:
                    GeometricProgression(nums, nth);
                    break;
                case 4:
                    calculateGeometricProgressionSum(nums, nth);
                    break;
                case 5:
                    main(args);
                    break;
                default:
                    System.out.println("Enter valid option ");
            }
        
            System.out.println("Want to continue? Y/y ");
            choice = sc.next().charAt(0);
        } while(choice == 'Y' || choice == 'y');
        
        

        sc.close();
    }
}
