package org.example.seminar_1.HomeWork.familyTree.family;

public class Iterr {
    static void ViewForward(Humans n, String space) {
        if (n != null) {
            System.out.printf("%s%s %s %s\n", space, n.getId(), n.getName(), n.getSurname());

            if (n.dad != null) {
                ViewForward(n.dad, space + " ");
            }
            if (n.mom != null) {
                ViewForward(n.mom, space + " ");
            }
        }
    }

    static void ViewReverse(Humans n, StringBuilder sb, String str) {
        if (n != null) {
            sb.append(String.format("%sid:%d Имя: %s Фамелия :%s\n", str,  n.getId(), n.getName(), n.getSurname()));
            if (!n.children.isEmpty()) {
                str += ' ';
                for (Humans child : n.children) {
                    ViewReverse(child, sb, str);
                }
            }
        }
    }
}
