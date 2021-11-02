public class Main {
    public static void main(String[] args) {
        String name = "Sakshi ";
        short x = 5;
        float y = 5.66f;
        float f1 = 35e-3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(x + y);
        System.out.println("Hello " + name);
        String Alpha;
        Alpha="Sakshi Aherkar";
        String Beta=" VIIT";
        // int x=10;
        // int y=40;
        // int randomInt=int()(Math.random()*100);
        // System.out.println(randomInt);
        System.out.println(x*y);
        System.out.println("Upper: "+ Alpha.toUpperCase());
        System.out.println("Upper: "+ Alpha.toLowerCase());
        System.out.println("length of "+Alpha+" is "+Alpha.length());
        System.out.println(Alpha.indexOf("Aherkar"));
        System.out.println(Alpha.concat(Beta));
        String[] cars={"Volvo","Rolls royce","BMW"};
        cars[1]="Volkswagoan";
        System.out.println(cars[1]);
        System.out.println(cars.length);
        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
        int [][] arr={{1,2,3,4,5},{4,5,6,2,1}};
        for(int i=0; i<arr.length; ++i){
            for(int j=i; j<arr[i].length; ++j){
                System.out.println(j);
            }
        }
    }
}


