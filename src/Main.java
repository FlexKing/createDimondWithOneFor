import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту");
        int height = scanner.nextInt();
        if (height<1||height>80){
            System.out.println("Вы ввели значение не в диопозоне от 1 до 80");
            return;
        }
        System.out.println("Введите ширину");
        int weight = scanner.nextInt();
        if (weight<1||weight>80){
            System.out.println("Вы ввели значение не в диопозоне от 1 до 80");
            return;
        }
        Main.printDiamond(height,weight);
    }
    public static void printDiamond(int height,int weight){
        char[] points=new char[weight];
        //ЗАПОЛНЕНИЕ МАССИВА ЧАРА ПРОБЕЛАМИ, НЕ РИСОВАНИЕ,МОЖНО БЫЛО СДЕЛАТЬ ЧЕРЕЗ СТРИНГБИЛДЕР БЕЗ ЦИКЛА,НАДЕЮСЬ ТАК МОЖНО)
        for (int j=0;j<weight;j++){
            points[j]=' ';
        }
        int backStep=weight/2;
        for(int i=0; i<height;i++){
                if(i==0){
                    points[weight/2]='#';
                    System.out.println(points);
                    points[weight/2]=' ';
                }
                else if (i<=weight/2){
                    points[weight/2-i]='#';
                    points[weight/2+i]='#';
                    System.out.println(points);
                    points[weight/2-i]=' ';
                    points[weight/2+i]=' ';
                }
                else if (i+1==weight){
                    points[weight/2]='#';
                    System.out.println(points);
                    points[weight/2]=' ';
                }
                else {
                    backStep--;
                    points[weight/2-backStep]='#';
                    points[weight/2+backStep]='#';
                    System.out.println(points);
                    points[weight/2-backStep]=' ';
                    points[weight/2+backStep]=' ';
                }
        }
    }

}