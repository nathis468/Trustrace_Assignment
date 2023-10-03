class CopyConstructor1{
    String name="Vikash";
    String rollno;
    int id;
    String dpt;
    
    // parameterized constructor
    CopyConstructor1(String rollno,String name){
        this.rollno=rollno;
        this.name=name;
        System.out.println(this.name+" "+this.rollno);
    }

    // copy constructor
    CopyConstructor1(CopyConstructor1 cc1){
        this.name=cc1.name;
        this.dpt="ct";
        System.out.println(this.name+" "+this.dpt);
    }

    CopyConstructor1(){
        System.out.println("Simple constructor");
    }
}