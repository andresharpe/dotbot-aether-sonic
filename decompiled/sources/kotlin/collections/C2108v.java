package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.H0;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.C2196t;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.jvm.internal.U({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
/* renamed from: kotlin.collections.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2108v {
    @l3.d
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static <E> List<E> a(@l3.d List<E> builder) {
        kotlin.jvm.internal.F.p(builder, "builder");
        return ((ListBuilder) builder).o();
    }

    @kotlin.U
    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final <E> List<E> b(int i4, X2.l<? super List<E>, H0> builderAction) {
        List j4;
        List<E> a4;
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        j4 = j(i4);
        builderAction.C(j4);
        a4 = a(j4);
        return a4;
    }

    @kotlin.U
    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final <E> List<E> c(X2.l<? super List<E>, H0> builderAction) {
        List i4;
        List<E> a4;
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        i4 = i();
        builderAction.C(i4);
        a4 = a(i4);
        return a4;
    }

    @kotlin.U
    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final int d(int i4) {
        if (i4 < 0) {
            if (kotlin.internal.m.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.Y();
            } else {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i4;
    }

    @kotlin.U
    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final int e(int i4) {
        if (i4 < 0) {
            if (kotlin.internal.m.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.Z();
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        return i4;
    }

    @kotlin.internal.f
    private static final Object[] f(Collection<?> collection) {
        kotlin.jvm.internal.F.p(collection, "collection");
        return C2196t.a(collection);
    }

    @kotlin.internal.f
    private static final <T> T[] g(Collection<?> collection, T[] array) {
        kotlin.jvm.internal.F.p(collection, "collection");
        kotlin.jvm.internal.F.p(array, "array");
        return (T[]) C2196t.b(collection, array);
    }

    @l3.d
    public static final <T> Object[] h(@l3.d T[] tArr, boolean z3) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        if (!z3 || !kotlin.jvm.internal.F.g(tArr.getClass(), Object[].class)) {
            Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
            kotlin.jvm.internal.F.o(copyOf, "copyOf(...)");
            return copyOf;
        }
        return tArr;
    }

    @l3.d
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static <E> List<E> i() {
        return new ListBuilder();
    }

    @l3.d
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static <E> List<E> j(int i4) {
        return new ListBuilder(i4);
    }

    @l3.d
    public static <T> List<T> k(T t3) {
        List<T> singletonList = Collections.singletonList(t3);
        kotlin.jvm.internal.F.o(singletonList, "singletonList(...)");
        return singletonList;
    }

    @l3.d
    @kotlin.Y(version = "1.2")
    public static final <T> List<T> l(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        List<T> X5 = D.X5(iterable);
        Collections.shuffle(X5);
        return X5;
    }

    @l3.d
    @kotlin.Y(version = "1.2")
    public static final <T> List<T> m(@l3.d Iterable<? extends T> iterable, @l3.d Random random) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        kotlin.jvm.internal.F.p(random, "random");
        List<T> X5 = D.X5(iterable);
        Collections.shuffle(X5, random);
        return X5;
    }

    @l3.d
    public static <T> T[] n(int i4, @l3.d T[] array) {
        kotlin.jvm.internal.F.p(array, "array");
        if (i4 < array.length) {
            array[i4] = null;
        }
        return array;
    }

    @kotlin.internal.f
    private static final <T> List<T> o(Enumeration<T> enumeration) {
        kotlin.jvm.internal.F.p(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        kotlin.jvm.internal.F.o(list, "list(...)");
        return list;
    }
}
