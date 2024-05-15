public class Main {
    public static void main(String[] args) {
        //задание 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен" + " " + age + " " + ",он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен" + " " + age + " " + ",он не достиг совершеннолетия, нужно немного подождать");
        }


//задание 2
int temperature = 6;
        if (temperature <=5) {
            System.out.println("На улице" + " "+ temperature + " "+"градусов, нужно надеть шапку.");
        }
        if (temperature >5) {
            System.out.println("На улице" + " "+ temperature + " "+"градусов, можно идти без шапки.");
        }
        //задание 3
        int speed =60 ;
        if (speed <=60 ){
            System.out.println("Если скорость" +" "+ speed + ",то можно ездить спокойно" );

        }
        if (speed>60){
            System.out.println("Если скорость" +" "+ speed + ",то нужно заплатить штраф.");
        }


        //задание 4
        int age1 = 24;
        if (age1<=6)
            if (age1>=2){
                System.out.println("Если возраст человека равен"+" "+ age1+", то ему нужно ходить в детский сад.");
            }
        if (age1 >=7)
            if (age1 <=17){
                System.out.println("Если возраст человека равен"+" "+ age1+", то ему нужно ходить в школу.");
            }
        if (age1 >=18)
            if (age1 <=24){
                System.out.println("Если возраст человека равен"+" "+ age1+", то ему нужно ходить в университет.");
            }
        //задание 5

        int age2 = 12;
        if (age2<=5){

                System.out.println("Если возраст ребенка равен" + " " +age2+ ",ему нельзя кататься на атракционе. ");
            }
        if(age2 >5)
            if (age2<=14){
                System.out.println("Если возраст ребенка равен" + " " +age2+ ",ему можно кататься в сопровождение взрослого на атракционе. ");
            }
        if (age2 >14) {
            System.out.println("Если возраст ребенка равен" + " " + age2 + ",ему можно кататься в без сопровождение взрослого на атракционе. ");
        }
        //задание 6
        int capacityPeople = 100;

        if (capacityPeople<61) {
            System.out.println("Человек будет сидеть.");
        }
        if (capacityPeople>60 && capacityPeople<103) {
            System.out.println("Человек будет стоять.");
        }


            if (capacityPeople<102){
            System.out.println("Места есть.");
        } else {
            System.out.println("Мест нет");
        }
            //задание7
int  one = 1;
int  two = 2;
int three =3;
if (one>two && one>three ){
    System.out.println(one);
}
if(two>one && two>three && ){
    System.out.println(two);
} else {
    System.out.println(three);
}














    }
    }
