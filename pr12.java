// Name : Savaliya Jaivin P.
// ID : 21CE120

// Create an Association class that encapsulates two objects of different types. Similar
// to Exercise above, create a Transition class that does the same of Association class
// with three objects.

class Association<T1, T2> {
    T1 object1;
    T2 object2;

    public Association(T1 object1, T2 object2) {
        this.object1 = object1;
        this.object2 = object2;
    }
}

class Transition<T1, T2, T3> {
    T1 object1;
    T2 object2;
    T3 object3;

    public Transition(T1 object1, T2 object2, T3 object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }
}

public class pr12 {
    public static void main(String[] args) {
        Association<String, Integer> asso1 = new Association<String, Integer>("One", 1);
        System.out.println(asso1.object1 + " " + asso1.object2);

        Transition<String, Integer, Float> tran1 = new Transition<String, Integer, Float>("Int-Float", 10, 11.234F);
        System.out.println(tran1.object1 + " " + tran1.object2 + " " + tran1.object3);
    }
}