import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        while (true){
            Scanner k = new Scanner(System.in);
            System.out.println("Выберите действие которое хотите ввыполнить:\n"+
            "1...10 - соответствие домашнему заданию. 11 - выход");//мне было лень их всех расписывать
            int n = k.nextInt();
            if(n==1){
                System.out.println("Введите делимое и делитель");
                double a = k.nextDouble();
                double b = k.nextDouble();
                if(b==0){
                    System.out.println("Ошибка: происходит деление на ноль");
                    break;
                }
                else {
                    System.out.println("a/b="+dil(a,b));
                }
            }
            else if (n==2){
                System.out.println("В каком году была основана Одесса?");
                int year = k.nextInt();
                if (year==1794){
                    System.out.println("Верно!");
                }
                else {
                    System.out.println("Вы ошиблись, Одесса была основана в 1794 году.");
                }
            }
            else if (n==3){
                System.out.println("Пожалуйста, введите сумму покупки.");
                double sum = k.nextDouble();
                if(sum>=0 && sum<500){
                    System.out.println("На данную сумму скидка не распростроняется и будет равна: "+sum+"грн.");
                }
                else if (sum>=500 && sum<1000){
                    double sum1 = sum*0.97;
                    System.out.println("Вам предоставляется скидка в 3%");
                    System.out.println("Сумма с учётом скидки: "+sum1+"грн.");
                }
                else  if (sum>=1000){
                    double sum2 = sum*0.95;
                    System.out.println("Вам предоставляется скидка в 5%");
                    System.out.println("Сумма с учётом скидки: "+sum2+"грн.");
                }
            }
            else if (n==4){
                System.out.println("Введите целое число и нажмите Enter");
                int number = k.nextInt();
                int prow = number%2;
                if (prow==1){
                    System.out.println("Число "+number+" нечётное");
                }
                else if (prow==0){
                    System.out.println("Число "+number+" чётное");
                }
            }
            else if (n==5){
                System.out.println("Введите целое число и нажмите Enter");
                int number = k.nextInt();
                int prow = number%3;
                if (prow==0){
                    System.out.println("Число "+number+" делитс нацело на 3");
                }
                else {
                    System.out.println("Число "+number+" нацело на 3 не делится");
                }
            }
            else if (n==6){
                System.out.println("Вычиление стоимости разговора по телефону.");
                System.out.println("Введите исходные данные:");
                System.out.println("Длительность разговора(целое количество минут):");
                int min = k.nextInt();
                System.out.println("Введите день недели(1-Понедельник, ..., 7-Воскресенье)");
                int day = k.nextInt();
                if (day==6 || day==7){
                    System.out.println("Предоставляется скидка в размере 20%");
                    System.out.println("Стоимость разгоора с учётом скидки составляет:"+(min*2*0.8));
                }
                else {
                    System.out.println("Скидка не предоставляется.");
                    System.out.println("Стоимость разгоора с учётом скидки составляет:"+(min*2));
                }
            }
            else if(n==7){
                System.out.println("Введите целое трёхзначное число");
                int x = k.nextInt();
                int a = (x/100);
                int b = (x/10)%10;
                int c = (x%10);
                System.out.println("Ниже приведены сравнения цифры числа:");
                System.out.println("Первое и третье, первое и второе, второе и третье соответственно:");
                rawn(a,c);
                rawn(a,b);
                rawn(b,c);
            }
            else if (n==8){
                System.out.println("Введите целое трёхзначное число");
                int x = k.nextInt();
                int a = (x/100);
                int b = (x/10)%10;
                int c = (x%10);
                int aa = (int) Math.pow(x,2);
                int bb = (int) (kub(a)+kub(b)+kub(c));
                System.out.println("квадрат числа равен="+aa+" сумма кубов цифр равен="+bb);
                if (aa==bb){
                    System.out.println("Квадрат данного числа равен сумме кубов его цифр");
                }//писать вывод данных было довольно утомительно, поэтому я просто написал ответ.
                else {
                    System.out.println("Квадрат данного числа не равен сумме кубов его цифр");
                }
            }
            else if(n==9){
                System.out.println("Далее будет производится замена чисел по установленному алгоритму.");
                System.out.println("Пожалуйста введите два разных числа Х и Y");
                System.out.println("X=");
                double x = k.nextDouble();
                System.out.println("Y=");
                double y = k.nextDouble();
                System.out.println("Далее будет произведена замена этих двух чисел где меньшее из этих\n" +
                        "двух чисел заменяем половиной их суммы, а большее — их удвоенным произведением:");
                if (x>y){
                    System.out.println("Х="+((x*y)*2));
                    System.out.println("Y="+((x+y)/2));
                }
                else {
                    System.out.println("Y="+((x*y)*2));
                    System.out.println("X="+((x+y)/2));
                }
            }
            else if (n==10){
                System.out.println("Далее будет производится решение уравнения формата:ax^3 + bх = 0\n"+
                        "Пожалуйста, введите коєфициенты a и b:");
                // я воспользовался упрощённой схемой решения данного уравнения. Я не знаю как надо было.
                System.out.println("a=");
                double a = k.nextDouble();
                System.out.println("b=");
                double b = k.nextDouble();
                int x1 = 0;
                double x2 = Math.sqrt(b/a);
                double x3 = -x2;
                System.out.println("Корни х1, х2 и х3 будут соответственно равн: "+x1+" "+x2+" "+x3);
            }
            else if (n==11){break;}
        }
    }
    public static double dil(double a, double b){return a/b;}

    public static void rawn(int a, int b){
        if (a>b){
            System.out.println("Число "+a+" больше чем число "+b);
            return;
        }
        else if (a<b){
            System.out.println("Число "+a+" меньше чем число "+b);
            return;
        }
        else if(a==b){
            System.out.println("Число "+a+" Равно числу "+b);
            return;
        }
    }
    public static double kub(int a) {return Math.pow(a,3);}
}