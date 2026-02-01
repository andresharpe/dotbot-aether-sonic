package kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

@kotlin.jvm.internal.U({"SMAP\nGrouping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n1#1,291:1\n80#1,6:292\n53#1:298\n80#1,6:299\n80#1,6:305\n53#1:311\n80#1,6:312\n80#1,6:318\n53#1:324\n80#1,6:325\n80#1,6:331\n189#1:337\n80#1,6:338\n*S KotlinDebug\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n53#1:292,6\n112#1:298\n112#1:299,6\n143#1:305,6\n164#1:311\n164#1:312,6\n189#1:318,6\n211#1:324\n211#1:325,6\n239#1:331,6\n257#1:337\n257#1:338,6\n*E\n"})
/* loaded from: classes2.dex */
class L extends K {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <T, K, R> Map<K, R> c(@l3.d I<T, ? extends K> i4, @l3.d X2.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        boolean z3;
        kotlin.jvm.internal.F.p(i4, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b4 = i4.b();
        while (b4.hasNext()) {
            ?? next = b4.next();
            Object a4 = i4.a(next);
            A1.a aVar = (Object) linkedHashMap.get(a4);
            if (aVar == null && !linkedHashMap.containsKey(a4)) {
                z3 = true;
            } else {
                z3 = false;
            }
            linkedHashMap.put(a4, operation.N(a4, aVar, next, Boolean.valueOf(z3)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <T, K, R, M extends Map<? super K, R>> M d(@l3.d I<T, ? extends K> i4, @l3.d M destination, @l3.d X2.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        boolean z3;
        kotlin.jvm.internal.F.p(i4, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(operation, "operation");
        Iterator<T> b4 = i4.b();
        while (b4.hasNext()) {
            ?? next = b4.next();
            Object a4 = i4.a(next);
            A1.a aVar = (Object) destination.get(a4);
            if (aVar == null && !destination.containsKey(a4)) {
                z3 = true;
            } else {
                z3 = false;
            }
            destination.put(a4, operation.N(a4, aVar, next, Boolean.valueOf(z3)));
        }
        return destination;
    }

    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <T, K, M extends Map<? super K, Integer>> M e(@l3.d I<T, ? extends K> i4, @l3.d M destination) {
        boolean z3;
        kotlin.jvm.internal.F.p(i4, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        Iterator<T> b4 = i4.b();
        while (b4.hasNext()) {
            K a4 = i4.a(b4.next());
            Object obj = destination.get(a4);
            if (obj == null && !destination.containsKey(a4)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                obj = 0;
            }
            destination.put(a4, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <T, K, R> Map<K, R> f(@l3.d I<T, ? extends K> i4, @l3.d X2.p<? super K, ? super T, ? extends R> initialValueSelector, @l3.d X2.q<? super K, ? super R, ? super T, ? extends R> operation) {
        boolean z3;
        kotlin.jvm.internal.F.p(i4, "<this>");
        kotlin.jvm.internal.F.p(initialValueSelector, "initialValueSelector");
        kotlin.jvm.internal.F.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b4 = i4.b();
        while (b4.hasNext()) {
            ?? next = b4.next();
            Object a4 = i4.a(next);
            R r4 = (Object) linkedHashMap.get(a4);
            if (r4 == null && !linkedHashMap.containsKey(a4)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                r4 = initialValueSelector.c0(a4, next);
            }
            linkedHashMap.put(a4, operation.z(a4, r4, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <T, K, R> Map<K, R> g(@l3.d I<T, ? extends K> i4, R r4, @l3.d X2.p<? super R, ? super T, ? extends R> operation) {
        boolean z3;
        kotlin.jvm.internal.F.p(i4, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b4 = i4.b();
        while (b4.hasNext()) {
            ?? next = b4.next();
            K a4 = i4.a(next);
            A2.a aVar = (Object) linkedHashMap.get(a4);
            if (aVar == null && !linkedHashMap.containsKey(a4)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                aVar = (Object) r4;
            }
            linkedHashMap.put(a4, operation.c0(aVar, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <T, K, R, M extends Map<? super K, R>> M h(@l3.d I<T, ? extends K> i4, @l3.d M destination, @l3.d X2.p<? super K, ? super T, ? extends R> initialValueSelector, @l3.d X2.q<? super K, ? super R, ? super T, ? extends R> operation) {
        boolean z3;
        kotlin.jvm.internal.F.p(i4, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(initialValueSelector, "initialValueSelector");
        kotlin.jvm.internal.F.p(operation, "operation");
        Iterator<T> b4 = i4.b();
        while (b4.hasNext()) {
            ?? next = b4.next();
            Object a4 = i4.a(next);
            R r4 = (Object) destination.get(a4);
            if (r4 == null && !destination.containsKey(a4)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                r4 = initialValueSelector.c0(a4, next);
            }
            destination.put(a4, operation.z(a4, r4, next));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <T, K, R, M extends Map<? super K, R>> M i(@l3.d I<T, ? extends K> i4, @l3.d M destination, R r4, @l3.d X2.p<? super R, ? super T, ? extends R> operation) {
        boolean z3;
        kotlin.jvm.internal.F.p(i4, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(operation, "operation");
        Iterator<T> b4 = i4.b();
        while (b4.hasNext()) {
            ?? next = b4.next();
            K a4 = i4.a(next);
            A2.a aVar = (Object) destination.get(a4);
            if (aVar == null && !destination.containsKey(a4)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                aVar = (Object) r4;
            }
            destination.put(a4, operation.c0(aVar, next));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <S, T extends S, K> Map<K, S> j(@l3.d I<T, ? extends K> i4, @l3.d X2.q<? super K, ? super S, ? super T, ? extends S> operation) {
        boolean z3;
        kotlin.jvm.internal.F.p(i4, "<this>");
        kotlin.jvm.internal.F.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator b4 = i4.b();
        while (b4.hasNext()) {
            S s4 = (Object) b4.next();
            Object a4 = i4.a(s4);
            A1.a aVar = (Object) linkedHashMap.get(a4);
            if (aVar == null && !linkedHashMap.containsKey(a4)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                s4 = operation.z(a4, aVar, s4);
            }
            linkedHashMap.put(a4, s4);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    @kotlin.Y(version = "1.1")
    public static final <S, T extends S, K, M extends Map<? super K, S>> M k(@l3.d I<T, ? extends K> i4, @l3.d M destination, @l3.d X2.q<? super K, ? super S, ? super T, ? extends S> operation) {
        boolean z3;
        kotlin.jvm.internal.F.p(i4, "<this>");
        kotlin.jvm.internal.F.p(destination, "destination");
        kotlin.jvm.internal.F.p(operation, "operation");
        Iterator b4 = i4.b();
        while (b4.hasNext()) {
            S s4 = (Object) b4.next();
            Object a4 = i4.a(s4);
            A1.a aVar = (Object) destination.get(a4);
            if (aVar == null && !destination.containsKey(a4)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                s4 = operation.z(a4, aVar, s4);
            }
            destination.put(a4, s4);
        }
        return destination;
    }
}
