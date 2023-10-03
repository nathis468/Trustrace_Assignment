class CopyConstructor2 {
    public static void main(String args[]){
        CopyConstructor1 cc3=new CopyConstructor1();
        CopyConstructor1 cc1=new CopyConstructor1("202ct119","Nathis");
        CopyConstructor1 cc2=new CopyConstructor1(cc1);
    }
}
