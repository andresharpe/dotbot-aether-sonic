package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C2122h0;
import kotlin.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2109w extends CollectionsKt__CollectionsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.jvm.internal.U({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n*L\n1#1,70:1\n*E\n"})
    /* renamed from: kotlin.collections.w$a */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Iterable<T>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ X2.a<Iterator<T>> f52001E;

        /* JADX WARN: Multi-variable type inference failed */
        public a(X2.a<? extends Iterator<? extends T>> aVar) {
            this.f52001E = aVar;
        }

        @Override // java.lang.Iterable
        @l3.d
        public Iterator<T> iterator() {
            return this.f52001E.n();
        }
    }

    @kotlin.internal.f
    private static final <T> Iterable<T> a0(X2.a<? extends Iterator<? extends T>> iterator) {
        kotlin.jvm.internal.F.p(iterator, "iterator");
        return new a(iterator);
    }

    @kotlin.U
    public static <T> int b0(@l3.d Iterable<? extends T> iterable, int i4) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i4;
    }

    @l3.e
    @kotlin.U
    public static final <T> Integer c0(@l3.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @l3.d
    public static final <T> List<T> d0(@l3.d Iterable<? extends Iterable<? extends T>> iterable) {
        kotlin.jvm.internal.F.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            A.q0(arrayList, it.next());
        }
        return arrayList;
    }

    @l3.d
    public static final <T, R> Pair<List<T>, List<R>> e0(@l3.d Iterable<? extends Pair<? extends T, ? extends R>> iterable) {
        int b02;
        kotlin.jvm.internal.F.p(iterable, "<this>");
        b02 = b0(iterable, 10);
        ArrayList arrayList = new ArrayList(b02);
        ArrayList arrayList2 = new ArrayList(b02);
        for (Pair<? extends T, ? extends R> pair : iterable) {
            arrayList.add(pair.e());
            arrayList2.add(pair.f());
        }
        return C2122h0.a(arrayList, arrayList2);
    }
}
