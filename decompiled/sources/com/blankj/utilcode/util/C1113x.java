package com.blankj.utilcode.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: com.blankj.utilcode.util.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1113x {

    /* renamed from: com.blankj.utilcode.util.x$a */
    /* loaded from: classes.dex */
    public interface a<E> {
        void a(int i4, E e4);
    }

    /* renamed from: com.blankj.utilcode.util.x$b */
    /* loaded from: classes.dex */
    public interface b<E> {
        boolean a(E e4);
    }

    /* renamed from: com.blankj.utilcode.util.x$c */
    /* loaded from: classes.dex */
    public interface c<E1, E2> {
        E2 a(E1 e12);
    }

    private C1113x() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @SafeVarargs
    public static <E> LinkedList<E> A(E... eArr) {
        LinkedList<E> linkedList = new LinkedList<>();
        if (eArr != null && eArr.length != 0) {
            for (E e4 : eArr) {
                linkedList.add(e4);
            }
        }
        return linkedList;
    }

    @SafeVarargs
    public static <E> LinkedList<E> B(E... eArr) {
        LinkedList<E> linkedList = new LinkedList<>();
        if (eArr != null && eArr.length != 0) {
            for (E e4 : eArr) {
                if (e4 != null) {
                    linkedList.add(e4);
                }
            }
        }
        return linkedList;
    }

    public static Collection C(Collection collection) {
        return Collections.synchronizedCollection(collection);
    }

    @SafeVarargs
    public static <E> TreeSet<E> D(Comparator<E> comparator, E... eArr) {
        TreeSet<E> treeSet = new TreeSet<>(comparator);
        if (eArr != null && eArr.length != 0) {
            for (E e4 : eArr) {
                treeSet.add(e4);
            }
        }
        return treeSet;
    }

    @SafeVarargs
    public static <E> TreeSet<E> E(Comparator<E> comparator, E... eArr) {
        TreeSet<E> treeSet = new TreeSet<>(comparator);
        if (eArr != null && eArr.length != 0) {
            for (E e4 : eArr) {
                if (e4 != null) {
                    treeSet.add(e4);
                }
            }
        }
        return treeSet;
    }

    public static Collection F(Collection collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @SafeVarargs
    public static <E> List<E> G(E... eArr) {
        return Collections.unmodifiableList(w(eArr));
    }

    @SafeVarargs
    public static <E> List<E> H(E... eArr) {
        return Collections.unmodifiableList(x(eArr));
    }

    public static <E> Collection<E> I(Collection<E> collection, Collection<E> collection2) {
        if (collection == null) {
            return new ArrayList();
        }
        if (collection2 == null) {
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList();
        for (E e4 : collection) {
            if (!collection2.contains(e4)) {
                arrayList.add(e4);
            }
        }
        return arrayList;
    }

    public static <E> Collection<E> J(Collection<E> collection, Collection<E> collection2) {
        if (collection != null && collection2 != null) {
            ArrayList arrayList = new ArrayList();
            for (E e4 : collection) {
                if (collection2.contains(e4)) {
                    arrayList.add(e4);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public static <E> Collection<E> K(Collection<E> collection, b<E> bVar) {
        if (collection != null && bVar != null) {
            ArrayList arrayList = new ArrayList(collection.size());
            for (E e4 : collection) {
                if (bVar.a(e4)) {
                    arrayList.add(e4);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public static <E> Collection<E> L(Collection<E> collection, b<E> bVar) {
        if (collection != null && bVar != null) {
            ArrayList arrayList = new ArrayList(collection.size());
            for (E e4 : collection) {
                if (!bVar.a(e4)) {
                    arrayList.add(e4);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public static <T> void M(List<T> list) {
        Collections.shuffle(list);
    }

    public static int N(Object obj) {
        int i4 = 0;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Map) {
            return ((Map) obj).size();
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).size();
        }
        if (obj instanceof Object[]) {
            return ((Object[]) obj).length;
        }
        if (obj instanceof Iterator) {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                i4++;
                it.next();
            }
        } else if (obj instanceof Enumeration) {
            Enumeration enumeration = (Enumeration) obj;
            while (enumeration.hasMoreElements()) {
                i4++;
                enumeration.nextElement();
            }
        } else {
            try {
                return Array.getLength(obj);
            } catch (IllegalArgumentException unused) {
                throw new IllegalArgumentException("Unsupported object type: " + obj.getClass().getName());
            }
        }
        return i4;
    }

    public static boolean O(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        if (obj instanceof Object[]) {
            if (((Object[]) obj).length == 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof Iterator) {
            return !((Iterator) obj).hasNext();
        }
        if (obj instanceof Enumeration) {
            return !((Enumeration) obj).hasMoreElements();
        }
        try {
            if (Array.getLength(obj) == 0) {
                return true;
            }
            return false;
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Unsupported object type: " + obj.getClass().getName());
        }
    }

    public static Collection P(Collection collection, Collection collection2) {
        if (collection == null) {
            return new ArrayList();
        }
        if (collection2 == null) {
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
        return arrayList;
    }

    public static String Q(Collection collection) {
        if (collection == null) {
            return "null";
        }
        return collection.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E1, E2> void R(Collection<E1> collection, c<E1, E2> cVar) {
        if (collection != null && cVar != 0) {
            if (collection instanceof List) {
                ListIterator listIterator = ((List) collection).listIterator();
                while (listIterator.hasNext()) {
                    listIterator.set(cVar.a(listIterator.next()));
                }
            } else {
                Collection<? extends E1> f4 = f(collection, cVar);
                collection.clear();
                collection.addAll(f4);
            }
        }
    }

    public static Collection S(Collection collection, Collection collection2) {
        if (collection == null && collection2 == null) {
            return new ArrayList();
        }
        if (collection == null) {
            return new ArrayList(collection2);
        }
        if (collection2 == null) {
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList();
        Map<Object, Integer> o4 = o(collection);
        Map<Object, Integer> o5 = o(collection2);
        HashSet hashSet = new HashSet(collection);
        hashSet.addAll(collection2);
        for (Object obj : hashSet) {
            int max = Math.max(p(obj, o4), p(obj, o5));
            for (int i4 = 0; i4 < max; i4++) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <E> void a(Collection<E> collection, Enumeration<E> enumeration) {
        if (collection != null && enumeration != null) {
            while (enumeration.hasMoreElements()) {
                collection.add(enumeration.nextElement());
            }
        }
    }

    public static <E> void b(Collection<E> collection, Iterator<E> it) {
        if (collection != null && it != null) {
            while (it.hasNext()) {
                collection.add(it.next());
            }
        }
    }

    public static <E> void c(Collection<E> collection, E[] eArr) {
        if (collection != null && eArr != null && eArr.length != 0) {
            collection.addAll(Arrays.asList(eArr));
        }
    }

    public static <E> boolean d(Collection<E> collection, E e4) {
        if (collection == null || e4 == null || !collection.add(e4)) {
            return false;
        }
        return true;
    }

    public static <E> int e(E e4, Collection<E> collection) {
        int i4 = 0;
        if (collection == null) {
            return 0;
        }
        if (collection instanceof Set) {
            return collection.contains(e4) ? 1 : 0;
        }
        if (e4 == null) {
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    i4++;
                }
            }
        } else {
            Iterator<E> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (e4.equals(it2.next())) {
                    i4++;
                }
            }
        }
        return i4;
    }

    public static <E1, E2> Collection<E2> f(Collection<E1> collection, c<E1, E2> cVar) {
        ArrayList arrayList = new ArrayList();
        if (collection != null && cVar != null) {
            Iterator<E1> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(cVar.a(it.next()));
            }
        }
        return arrayList;
    }

    public static boolean g(Collection collection, Collection collection2) {
        if (collection != null && collection2 != null) {
            if (collection.size() < collection2.size()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (collection2.contains(it.next())) {
                        return true;
                    }
                }
            } else {
                Iterator it2 = collection2.iterator();
                while (it2.hasNext()) {
                    if (collection.contains(it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static <E> int h(Collection<E> collection, b<E> bVar) {
        int i4 = 0;
        if (collection != null && bVar != null) {
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                if (bVar.a(it.next())) {
                    i4++;
                }
            }
        }
        return i4;
    }

    public static Collection i(Collection collection, Collection collection2) {
        if (collection == null && collection2 == null) {
            return new ArrayList();
        }
        if (collection == null) {
            return new ArrayList(collection2);
        }
        if (collection2 == null) {
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList();
        Map<Object, Integer> o4 = o(collection);
        Map<Object, Integer> o5 = o(collection2);
        HashSet hashSet = new HashSet(collection);
        hashSet.addAll(collection2);
        for (Object obj : hashSet) {
            int max = Math.max(p(obj, o4), p(obj, o5)) - Math.min(p(obj, o4), p(obj, o5));
            for (int i4 = 0; i4 < max; i4++) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <E> boolean j(Collection<E> collection, b<E> bVar) {
        if (collection != null && bVar != null) {
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                if (bVar.a(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <E> void k(Collection<E> collection, b<E> bVar) {
        if (collection != null && bVar != null) {
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                if (!bVar.a(it.next())) {
                    it.remove();
                }
            }
        }
    }

    public static <E> E l(Collection<E> collection, b<E> bVar) {
        if (collection != null && bVar != null) {
            for (E e4 : collection) {
                if (bVar.a(e4)) {
                    return e4;
                }
            }
        }
        return null;
    }

    public static <E> void m(Collection<E> collection, a<E> aVar) {
        if (collection != null && aVar != null) {
            Iterator<E> it = collection.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                aVar.a(i4, it.next());
                i4++;
            }
        }
    }

    public static Object n(Object obj, int i4) {
        if (obj == null) {
            return null;
        }
        if (i4 >= 0) {
            if (obj instanceof Map) {
                return n(((Map) obj).entrySet().iterator(), i4);
            }
            if (obj instanceof List) {
                return ((List) obj).get(i4);
            }
            if (obj instanceof Object[]) {
                return ((Object[]) obj)[i4];
            }
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    i4--;
                    if (i4 == -1) {
                        return it.next();
                    }
                    it.next();
                }
                throw new IndexOutOfBoundsException("Entry does not exist: " + i4);
            }
            if (obj instanceof Collection) {
                return n(((Collection) obj).iterator(), i4);
            }
            if (obj instanceof Enumeration) {
                Enumeration enumeration = (Enumeration) obj;
                while (enumeration.hasMoreElements()) {
                    i4--;
                    if (i4 == -1) {
                        return enumeration.nextElement();
                    }
                    enumeration.nextElement();
                }
                throw new IndexOutOfBoundsException("Entry does not exist: " + i4);
            }
            try {
                return Array.get(obj, i4);
            } catch (IllegalArgumentException unused) {
                throw new IllegalArgumentException("Unsupported object type: " + obj.getClass().getName());
            }
        }
        throw new IndexOutOfBoundsException("Index cannot be negative: " + i4);
    }

    public static Map<Object, Integer> o(Collection collection) {
        HashMap hashMap = new HashMap();
        if (collection == null) {
            return hashMap;
        }
        for (Object obj : collection) {
            Integer num = (Integer) hashMap.get(obj);
            if (num == null) {
                hashMap.put(obj, 1);
            } else {
                hashMap.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
        return hashMap;
    }

    private static int p(Object obj, Map map) {
        Integer num = (Integer) map.get(obj);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static Collection q(Collection collection, Collection collection2) {
        if (collection != null && collection2 != null) {
            ArrayList arrayList = new ArrayList();
            Map<Object, Integer> o4 = o(collection);
            Map<Object, Integer> o5 = o(collection2);
            HashSet hashSet = new HashSet(collection);
            hashSet.addAll(collection2);
            for (Object obj : hashSet) {
                int min = Math.min(p(obj, o4), p(obj, o5));
                for (int i4 = 0; i4 < min; i4++) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public static boolean r(Collection collection) {
        if (collection != null && collection.size() != 0) {
            return false;
        }
        return true;
    }

    public static boolean s(Collection collection, Collection collection2) {
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        Map<Object, Integer> o4 = o(collection);
        Map<Object, Integer> o5 = o(collection2);
        if (o4.size() != o5.size()) {
            return false;
        }
        for (Object obj : o4.keySet()) {
            if (p(obj, o4) != p(obj, o5)) {
                return false;
            }
        }
        return true;
    }

    public static boolean t(Collection collection) {
        return !r(collection);
    }

    public static boolean u(Collection collection, Collection collection2) {
        if (collection == null || collection2 == null || collection.size() >= collection2.size() || !v(collection, collection2)) {
            return false;
        }
        return true;
    }

    public static boolean v(Collection collection, Collection collection2) {
        if (collection == null || collection2 == null) {
            return false;
        }
        Map<Object, Integer> o4 = o(collection);
        Map<Object, Integer> o5 = o(collection2);
        for (Object obj : collection) {
            if (p(obj, o4) > p(obj, o5)) {
                return false;
            }
        }
        return true;
    }

    @SafeVarargs
    public static <E> ArrayList<E> w(E... eArr) {
        ArrayList<E> arrayList = new ArrayList<>();
        if (eArr != null && eArr.length != 0) {
            for (E e4 : eArr) {
                arrayList.add(e4);
            }
        }
        return arrayList;
    }

    @SafeVarargs
    public static <E> ArrayList<E> x(E... eArr) {
        ArrayList<E> arrayList = new ArrayList<>();
        if (eArr != null && eArr.length != 0) {
            for (E e4 : eArr) {
                if (e4 != null) {
                    arrayList.add(e4);
                }
            }
        }
        return arrayList;
    }

    @SafeVarargs
    public static <E> HashSet<E> y(E... eArr) {
        HashSet<E> hashSet = new HashSet<>();
        if (eArr != null && eArr.length != 0) {
            for (E e4 : eArr) {
                hashSet.add(e4);
            }
        }
        return hashSet;
    }

    @SafeVarargs
    public static <E> HashSet<E> z(E... eArr) {
        HashSet<E> hashSet = new HashSet<>();
        if (eArr != null && eArr.length != 0) {
            for (E e4 : eArr) {
                if (e4 != null) {
                    hashSet.add(e4);
                }
            }
        }
        return hashSet;
    }
}
