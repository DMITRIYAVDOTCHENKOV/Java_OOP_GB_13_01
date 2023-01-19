package org.example.seminar.seminar_1.HomeWork.familyTree;

import java.util.ArrayList;

public class FamilyTree {
    public static void main(String[] params) {
        ArrayList<Data> items = new ArrayList<>();

        items.add(new Data(1, "Дима Авдотченков", 0));
        items.add(new Data(2, "Алиса Авдотченкова(Иванова)", 1));
        items.add(new Data(3, "Сережа Иванов", 2));
        items.add(new Data(4, "Ника Иванова", 2));
        items.add(new Data(5, "Настя Авдотченкова(Снегирева)", 0));
        items.add(new Data(6, "Алиса Авдотченкова(Иванова)", 5));
        items.add(new Data(7, "Евгения (Снегирева)", 5));
        items.add(new Data(8, "Петя Снегирев", 7));
        items.add(new Data(9, "Алексей Снегирев", 5));
        items.add(new Data(10, "", 5));

        DataNode tree = DataNode.makeTree(items, new TreeNode.TypeAdapter<Data, DataNode>() {
            @Override
            public DataNode newInstance() {
                return new DataNode();
            }

            @Override
            public boolean isChildOf(Data parentNodeData, Data childNodeData) {
                return parentNodeData.id == childNodeData.parentId;
            }

            @Override
            public boolean isTopLevelItem(Data data) {
                return data.parentId == 0;
            }
        });

        String names = tree.reduce((node, names1) -> {
            if (node.children == null || node.children.isEmpty()) {
                if (names1.length() > 0) {
                    names1 = names1 + ", ";
                }
                names1 = names1 + node.data.name;
            }
            return names1;
        }, "");

        System.out.println("Имена Детей: " + names);
    }

    static class DataNode extends TreeNode<Data, DataNode> {
        @Override
        public String toString() {
            return data.name;
        }
    }


    public static class Data {
        int id;
        String name;
        int parentId;

        public Data(int id, String name, int parentId) {
            this.id = id;
            this.name = name;
            this.parentId = parentId;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}