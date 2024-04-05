public class break_class {
   // public static void main (String[] args){
        //for(int i = 0; i<=10; i++){
           // System.out.println(i);
           // if(i==6){
          //      break;
          //  }
      //  }
     //  a:
     //  for(int i = 0; i<=10;i++){

      //     b:
       //    for(int j=0; j<=15; j++){

       //     c:
        //    for(int k=0; k<=20; k++){
         //       System.out.println(k);
          //      if(k==5){
           //         break a;
          //      }
          //  }
         //  }
     //  }

       // for(int i=0; i<=2; i++){

        //    for(int j=0; j<=5; j++){

          //      if (j==4){
          //          continue;
          //      }
         //       System.out.println(j);
        //    }
      //  }
   // }

    public static void main(String[] args) {
        int marks=45;

        if(marks<50){
            System.out.println("fail");
        }
        else if(marks>=50 && marks<60){
            System.out.println("D grade");
        }
        else if(marks>=60 && marks<70){
            System.out.println("C grade");
        }
        else if(marks>=70 && marks<80){
            System.out.println("B grade");
        }
        else if(marks>=80 && marks<90){
            System.out.println("A grade");
        }else if(marks>=90 && marks<100){
            System.out.println("A+ grade");
        }else{
            System.out.println("Invalid!");
        }
    }
}
