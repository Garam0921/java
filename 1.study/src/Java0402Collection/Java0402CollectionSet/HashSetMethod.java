package Java0402Collection.Java0402CollectionSet;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethod {
    public static void main(String[] args) {

        Set<String> hSet1 = new HashSet<>();   // 보자기!!! 특징 1. 인덱스가 없다, 2.중복을 허용하지 않는다. (중복확인 기준을 우리가 만들수 있다. 책 653p~661p 꼭 읽어보기)

        //#1. add(E element)
        hSet1.add("가");
        hSet1.add("나");
        hSet1.add("가");  // 넣지 않음 [가 나만 들어 있음
        System.out.println(hSet1.toString()); //[가 나]

        //#2. addAll(다른 set 객체)
        Set<String> hSet2 = new HashSet<>();
        hSet2.add("나");
        hSet2.add("다");
        hSet2.addAll(hSet1);
        System.out.println(hSet2.toString()); //[가, 다, 나]

        //#3. remove(Object o)
        hSet2.remove("나");
        System.out.println(hSet2.toString()); //[가, 다]

        //#4. clear()
        hSet2.clear();
        System.out.println(hSet2.toString()); //[]

        //#5. isEmpty();
        System.out.println(hSet2.isEmpty()); //true

        //#6. contains (Object o)
        Set<String> hSet3 = new HashSet<>();
        hSet3.add("가");
        hSet3.add("나");
        hSet3.add("다");
        System.out.println(hSet3.contains("나")); //true
        System.out.println(hSet3.contains("라")); //false

        //#7. size()
        System.out.println(hSet3.size()); //3

        //#8. iterator()  ★★★★★
        Iterator<String> iterator = hSet3.iterator();   // hSet3.iterato 순회할 수 있는 기능
        while(iterator.hasNext()) { //총 3바퀴           // 인덱스를 안쓰기 때문에 while를 쓰는게 편함 (for문 으로는 보자기안을 확이할 수가 없다.)
            System.out.println(iterator.next());
        }

        // 일반적인 for는 set가 인덱스가 없으므로 사용할 수 없지만 아래 방식으로는 가능함!
        for(String str : hSet3) {
            System.out.println("forEach : " + str);
        }

        //#9. toArray()
        Object[] objArray = hSet3.toArray();
        System.out.println(Arrays.toString(objArray));  //[가, 다, 나]

        //#10-1. toArray(T[] t)
        String[] strArray1 = hSet3.toArray(new String[0]);
        System.out.println(Arrays.toString(strArray1)); //[가, 다, 나]

        //#10-2. toArray(T[] t)
        String[] strArray2 = hSet3.toArray(new String[5]);
        System.out.println(Arrays.toString(strArray2)); //[가, 다, 나, null, null]

    }
}
