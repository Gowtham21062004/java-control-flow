import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        if(a>=1){
            System.out.println("positive");
        }
        else if(a<=-1){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    switch(a){
        case 1:
            System.out.println("sunday");break;
            case 2:
            System.out.println("Monday");break;
            case 3:
            System.out.println("Tuesday");break;
            case 4:
            System.out.println("Wednesday");break;
            case 5:
            System.out.println("Thursday");break;
            case 6:
            System.out.println("Friday");break;
            case 7:
            System.out.println("Saturday");break;
            default :
            System.out.println("invalid number");
    }
    for(int i=1;i<=a;i++){
        System.out.println(i);
    }
    int i=a;
    while(i>0){
        System.out.print(i--+ " ");
    }
    int j=1;
    do{
        System.out.print(j++ + "");
    }
    while(j<=3);
    
        System.out.println("Try programiz.pro");
    }
}
