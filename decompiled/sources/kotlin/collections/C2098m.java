package kotlin.collections;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;

@kotlin.jvm.internal.U({"SMAP\nArraysJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,61:1\n26#2:62\n*S KotlinDebug\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n18#1:62\n*E\n"})
/* renamed from: kotlin.collections.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2098m {
    @l3.d
    public static final <T> T[] a(@l3.d T[] reference, int i4) {
        kotlin.jvm.internal.F.p(reference, "reference");
        Object newInstance = Array.newInstance(reference.getClass().getComponentType(), i4);
        kotlin.jvm.internal.F.n(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }

    @W2.i(name = "contentDeepHashCode")
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static final <T> int b(@l3.e T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @kotlin.Y(version = "1.3")
    public static final void c(int i4, int i5) {
        if (i4 <= i5) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + i5 + ").");
    }

    public static final /* synthetic */ <T> T[] d(T[] tArr) {
        if (tArr == null) {
            kotlin.jvm.internal.F.y(0, "T?");
            return (T[]) new Object[0];
        }
        return tArr;
    }

    @kotlin.internal.f
    private static final String e(byte[] bArr, Charset charset) {
        kotlin.jvm.internal.F.p(bArr, "<this>");
        kotlin.jvm.internal.F.p(charset, "charset");
        return new String(bArr, charset);
    }

    public static final /* synthetic */ <T> T[] f(Collection<? extends T> collection) {
        kotlin.jvm.internal.F.p(collection, "<this>");
        kotlin.jvm.internal.F.y(0, "T?");
        return (T[]) collection.toArray(new Object[0]);
    }
}
