// import java.util.InputMismatchException;
// import java.util.Scanner;

// abstract class Exception1{
//     abstract void Sports();
// }

// class Exception2 extends Exception1{
//     public void Sports() throws InputMismatchException{
//         Scanner sc=new Scanner(System.in);
//         try {
//             int str=sc.nextInt();
//         }
//         catch(Exception e){
//             throw new InputMismatchException("Input Mismatch Exception");
//         }
//     }
// }

// class ExceptionHandling{
//     public static void main(String args[]){
//         try{
//             Exception2 exp2=new Exception2();
//             exp2.Sports();
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         finally{
//             System.out.println("Program completed");    
//         }
//     }
// }



// import java.util.InputMismatchException;
// import java.util.Scanner;

// class Exception3 extends InputMismatchException{
//     public Exception3(String message) {
//         super(message);
//         System.out.println("This is Input mismatch exception");
//     }
// }

// abstract class Exception1{
//     abstract void Sports() throws Exception;
// }

// class Exception2 extends Exception1{
//     public void Sports() throws Exception{
//         Scanner sc=new Scanner(System.in);
//         try {
//             int str=sc.nextInt();
//         }
//         catch(Exception e){
//             try{
//                 throw new Exception3("Input Mismatch");
//             }
//             catch(Exception e1){

//             }
//             // throw new InputMismatchException("Input Mismatch Exception");
//         }
//         System.out.println("Exception2 completed");
//     }
// }

// class ExceptionHandling{
//     public static void main(String args[]){
//         try{
//             Exception2 exp2=new Exception2();
//             exp2.Sports();
//         }
//         catch(Exception e){
//             System.out.println("Mksd");
//         }
//         finally{
//             System.out.println("Program completed");    
//         }

//     }
// }




import java.util.Scanner;

class Exception3 extends ArrayIndexOutOfBoundsException{
    public Exception3(int index) {
        super(index);
    }
}

abstract class Exception1{
    abstract void Sports() throws Exception;
}

class Exception2 extends Exception1{
    public void Sports() throws Exception{
        Scanner sc=new Scanner(System.in);
        int arr[]={34,46,76,23,56};
        try {   
            System.out.println(arr[6]);
        }
        catch(Exception e){
            try{
                throw new Exception3(6);
            }
            catch(Exception e1){
                System.out.println(e1);
            }
            System.out.println("Exception2 completed");
        }
    }
}

class ExceptionHandling{
    public static void main(String args[]){
        try{
            Exception2 exp2=new Exception2();
            exp2.Sports();
        }
        catch(Exception e){
            System.out.println("Exception is not handled");
        }
        finally{
            System.out.println("Program completed");    
        }
    }
}




