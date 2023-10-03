// Nested Interface

interface Shape{
    interface Rectangle{
        void RectanglePrint();
        interface Circle{
            void CirclePrint();
        }
    }
}

class Implementation implements Shape.Rectangle{
    public void RectanglePrint(){
        System.out.println("In Rectangle it requires length and breadth");
    }
}

class Implementation2 implements Shape.Rectangle.Circle{
    public void CirclePrint(){
        System.out.println("In Circle it requires radius");
    }
}

public class NestedInterface {
    public static void main(String args[]){
        Implementation imp=new Implementation();
        imp.RectanglePrint();
        Implementation2 imp2=new Implementation2();
        imp2.CirclePrint();
    }
}





// Interface inside the class

// class ParentClass{
//     interface Sports{
//         void Cricket();
//     }
//     interface InDoorGames{
//         void TableTennis();
//     }
// }

// class Implementation implements ParentClass.Sports,ParentClass.InDoorGames{
//     public void Cricket(){
//         System.out.println("Cicket method");
//     }
//     public void TableTennis(){
//         System.out.println("TableTennis method");
//     }
// }

// class NestedInterface{
//     public static void main(String args[]){
//         ParentClass.Sports pcs=new Implementation();
//         pcs.Cricket();
//         ParentClass.InDoorGames pci=new Implementation();
//         pci.TableTennis();
//     }
// }



// class inside the interface

// interface ParentInterface{
//     void InDoorGames();
//     class Sports{
//         void Cricket(){
//             System.out.println("Inside Cricket method");
//         }
//     }
// }

// class Implementation implements ParentInterface{
//     public void InDoorGames(){
//         System.out.println("Inside InDoorGames method");
//     }
// }

// class NestedInterface{
//     public static void main(String args[]){
//         ParentInterface pi=new Implementation();
//         pi.InDoorGames();
//         ParentInterface.Sports pis=new ParentInterface.Sports();
//         pis.Cricket();
//     }
// }