package org.example.seminar.seminar_1;


class A {
    int i;
}

class B extends A {
    int i; // Эта переменная i скрывает переменную i из класса А

    B(int a, int b) {
        super.i = a; // Переменная i из класса А                     // Здесь super.i ссылается на переменную i из класса А
        i = b;
    }

    void show() {
        System.out.println("i в суперклассе = " + super.i);
        System.out.println("i в подклассе = " + this.i);
    }
}

class Test {
    public static void main(String[] args) {
        B ob = new B(1, 4);
        ob.show();
    }
}


