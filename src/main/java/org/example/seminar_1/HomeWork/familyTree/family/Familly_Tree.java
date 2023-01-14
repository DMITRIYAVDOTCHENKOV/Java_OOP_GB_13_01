package org.example.seminar_1.HomeWork.familyTree.family;



public class Familly_Tree {
    public static void main(String[] args) {
        Humans humansIvanov = new Humans(1,"Дмитрий","Иванов");
        Humans humansIvanovSon1 = new Humans(2,"Коля","Иванов");
        Humans humansSidorova = new Humans(3,"Анастасия","Сидорова");
        Humans humansIvanovGrandson = new Humans(4,"Александр","Иванов");
        Humans humansIvanovSon2 = new Humans(5,"Миша","Иванов");

        humansIvanovSon1.dad = humansIvanov;
        humansIvanovSon1.mom = humansSidorova;
        humansIvanovSon2.dad = humansIvanov;
        humansIvanovGrandson.dad = humansIvanovSon1;


        humansIvanov.children.add(humansIvanovSon1);
        humansIvanov.children.add(humansIvanovSon2);
        humansSidorova.children.add(humansIvanovSon1);
        humansIvanovSon1.children.add(humansIvanovGrandson);

        StringBuilder stringBuilder = new StringBuilder();
        String str = "";
        Iterr.ViewReverse(humansIvanovSon1,stringBuilder,str);
        System.out.println(stringBuilder);
    }
}
