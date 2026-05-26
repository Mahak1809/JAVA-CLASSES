class table {
    int x = 2;
    void tablefortwo(){
        for(int i = 1; i <=10;i++){
            System.out.println(x+" * "+i+" = " +(x*i));
        }
    }
}

class Main{
    public static void main(String args[]){
    table t = new table();
    t.tablefortwo();
    }
}