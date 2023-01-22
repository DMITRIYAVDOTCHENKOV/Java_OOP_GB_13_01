package org.example.seminar.seminar_1.HomeWork.familyTree.family;

public class Test {
    public static void main(String[] args) {
        if (args.length != 2) System.err.println("Enter Input Correctly");
        else {
            Famili.familyTree tree = new Famili.familyTree();
            String filename = "/Users/alfiememo/Documents/Projects/FamilyTree/" + args[0];
            tree.fillTree(filename);
            int depth = Integer.parseInt(args[1]);
            tree.search(depth);
        }


//        famili1();




    }

    public static void famili1() {
        //List<FamilyTree> children = new LinkedList<FamilyTree>();

        Famili1.FamilyTree son1 = null, dad = null, son2 = null;

        dad = new Famili1.FamilyTree(true, "Sambi", null, null, null, null, null);

        son1 = new Famili1.FamilyTree(true, "jay", dad, null, null, null, null);
        son2 = new Famili1.FamilyTree(true, "bha", dad, null, null, null, null);

        //wife1 = new FamilyTree(false, "w1", null, null, son1, null, null);
        //wife2 = new FamilyTree(false, "w2", null, null, son2, null, null);


        dad.setChild(son1);
        dad.setChild(son2);


        System.out.println(dad.getRelationshipDegree(son1));

    }


}

