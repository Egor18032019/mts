import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//Замечательно, что, опустив руку в карман,
        Me I = new Me("Я", new Pocket(new Zwanziger(1, true)));

        Object itemInPocket = I.findInMyPocket();
        Zwanziger zwanziger = isZwanzigerIFindInMyPocket(itemInPocket);
        Boolean personWantedThisZwanziger = zwanziger.thisOriginalZwanziger;
        /*
        Orex  orex = I.buyOrex();
        if(
        I.pozolotit(orex, reason=false) > normal)
        i.udivliatsia = true;

class orexc{

public boolean isNameOrex(String name){
Astronom  astr = new Astronom()
astronom.soskobliv = true;
if(astronom.read() cast in nativeLang ==name//зависит от соскоблив) {
i.somnenie = true;
}


         */

    }

    public static Zwanziger isZwanzigerIFindInMyPocket(Object itemInPocket) {
        Class<?> classFindObject = itemInPocket.getClass();

        System.out.println(classFindObject.getName());
        if (classFindObject.getName().contains("Zwanziger")) {
            return (Zwanziger) itemInPocket;
        }
        return null;
    }

    abstract static class Money {
        public int value;

        public Money(int value) {
            this.value = value;
        }
    }

    //цванцигер
    static class Zwanziger extends Money {
        Boolean thisOriginalZwanziger;

        public Zwanziger(int value, Boolean thisOriginalZwanziger) {
            super(value);
            this.thisOriginalZwanziger = thisOriginalZwanziger;
        }
    }

    abstract static class Man {
        public Man() {
        }
    }

    static class Pocket {
        public List<Object> storage;

        public Pocket() {
            this.storage = new ArrayList<>();
        }

        public Pocket(Object o) {
            this.storage = new ArrayList<>();
            putInPocket(o);
        }

        public void putInPocket(Object o) {
            storage.add(o);
        }

        public Object find() {
            int max = storage.size() - 1;
            int key = (int) (Math.random() * ++max);
            System.out.println(key);
            Object item = storage.get(key);
            storage.remove(key);
            return item;
        }
    }

    static class Me extends Man {
        public String name;
        private Pocket pocket;

        public Me(String name, Pocket pocket) {
            this.name = name;
            this.pocket = pocket;

        }

        public Object findInMyPocket() {
            return pocket.find();
        }

        public void buy() {

        }

        public void putInMYPocket(Object o) {
            pocket.putInPocket(o);
        }

    }
}