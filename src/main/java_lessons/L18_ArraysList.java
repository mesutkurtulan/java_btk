import java.util.ArrayList;
import java.util.Arrays;

public class L18_ArraysList {
    public static void main(String[] args) {
        // Arrays List
        // Wrapper Class should be written in the ArrayList<>

        // add(E element) -> Add an element to the end of the array list.
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Mesut");
        arrayList1.add("Ahmet");
        arrayList1.add("Ali");
        arrayList1.add("Ayşe");
        arrayList1.add("Fatma");
        System.out.println(arrayList1); // [Mesut, Ahmet, Ali, Ayşe, Fatma]

        // add(int index, E element) -> adding an element to the beginning of the array list and all other elements are shifted one position to the right.
        arrayList1.add(0, "Murat");
        System.out.println(arrayList1); // [Murat, Mesut, Ahmet, Ali, Ayşe, Fatma]

        // get(int index) -> Get the element at the specified position in this list.
        System.out.println(arrayList1.get(0)); // Murat

        // set(int index, E element) -> Change the element at the specified position in this list.
        arrayList1.set(0, "Fuat");
        System.out.println(arrayList1); // [Fuat, Mesut, Ahmet, Ali, Ayşe, Fatma]

        // remove(int index) -> Remove the element at the specified position in this list.
        System.out.println(arrayList1.remove(0)); // Fuat
        // System.out.println(arrayList1.remove(10)); // Index 10 out of bounds for length 5
        System.out.println(arrayList1); // [Mesut, Ahmet, Ali, Ayşe, Fatma]

        // remove(E element) -> Remove the first occurrence of the specified element from this list, if it is present.
        System.out.println(arrayList1.remove("Ahmet")); // true
        System.out.println(arrayList1.remove("Murat")); // false
        System.out.println(arrayList1); // [Mesut, Ali, Ayşe, Fatma]

        // size() -> Return the number of elements in this list.
        System.out.println(arrayList1.size()); // 4

        // isEmpty() -> Returns true if this list contains no elements.
        System.out.println(arrayList1.isEmpty()); // false

        // clear() -> Removes all of the elements from this list.
        // arrayList1.clear();

        // isEmpty() -> Returns true if this list contains no elements.
        System.out.println(arrayList1.isEmpty()); // false

        // contains(Object o) -> Returns true if this list contains the specified element.
        System.out.println(arrayList1.contains("Mesut")); // true
        System.out.println(arrayList1.contains("Murat")); // false

        // indexOf(Object o) -> Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        System.out.println(arrayList1.indexOf("Mesut")); // 0
        System.out.println(arrayList1.indexOf("Murat")); // -1

        // lastIndexOf(Object o) -> Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
        System.out.println(arrayList1.lastIndexOf("Mesut")); // 0
        System.out.println(arrayList1.lastIndexOf("Murat")); // -1

        // toArray() -> Returns an array containing all of the elements in this list in proper sequence (from first to last element).
        String[] stringArray = arrayList1.toArray(new String[arrayList1.size()]);
        System.out.println(Arrays.toString(stringArray)); // [Mesut, Ali, Ayşe, Fatma]

        // subList(int fromIndex, int toIndex) -> Returns a sublist of elements in the specified range.
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("Mesut", "Ali", "Ayşe", "Fatma"));
        System.out.println(arrayList2.subList(1, 3)); // [Ali, Ayşe]

        // addAll(Collection<? extends E> c) -> Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.addAll(arrayList2);
        System.out.println(arrayList3); // [Mesut, Ali, Ayşe, Fatma]

        // addAll(int index, Collection<? extends E> c) -> Appends all of the elements in the specified collection to the end of this list, starting at the specified position.
        arrayList3.addAll(0, arrayList2);
        System.out.println(arrayList3); // [Mesut, Ali, Ayşe, Fatma, Mesut, Ali, Ayşe, Fatma]

        // retainAll(Collection<?> c) -> Retains only the elements in this list that are contained in the specified collection (optional operation).
        arrayList3.retainAll(arrayList2);
        System.out.println(arrayList3); // [Mesut, Ali, Ayşe, Fatma, Mesut, Ali, Ayşe, Fatma]

        // removeAll(Collection<?> c) -> Removes from this list all of its elements that are contained in the specified collection (optional operation).
        arrayList3.removeAll(arrayList2);
        System.out.println(arrayList3); // []

        // equals(Object o) -> Compares the specified object with this list for equality.
        ArrayList<String> arrayList4 = new ArrayList<>(Arrays.asList(""));
        System.out.println(arrayList3.equals(arrayList4)); // false

        // forEach(Consumer<? super E> action) -> Performs the given action for each element of the array list until all elements have been processed or the action throws an exception.
        ArrayList<String> arrayList5 = new ArrayList<>(Arrays.asList("Mesut", "Ali", "Ayşe", "Fatma"));
        arrayList5.forEach(System.out::println); // Mesut Ali Ayşe Fatma
    }
}
