package OOPs;
class Pen{
    String color;
    String type;

    public void write (){
        System.out.println("write Something");
    }
    public String print(String pro){
        if(pro == "c"){
//            System.out.println(this.color);
            return this.color;
        }else if(pro == "t"){
//            System.out.println(this.type);
            return this.type;
        }else{
//            System.out.println("Invalid parameter");
            return ("Invalid parameter");
        }
    }
}

