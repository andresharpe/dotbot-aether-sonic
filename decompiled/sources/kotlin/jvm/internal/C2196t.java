package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2207m;

@W2.i(name = "CollectionToArray")
@U({"SMAP\nCollectionToArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,88:1\n63#1,22:89\n63#1,22:111\n26#2:133\n*S KotlinDebug\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n22#1:89,22\n37#1:111,22\n14#1:133\n*E\n"})
/* renamed from: kotlin.jvm.internal.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2196t {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private static final Object[] f52373a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    private static final int f52374b = 2147483645;

    @l3.d
    @InterfaceC2205l(message = "This function will be made internal in a future release")
    @W2.i(name = "toArray")
    @InterfaceC2207m(warningSince = "1.9")
    public static final Object[] a(@l3.d Collection<?> collection) {
        F.p(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    objArr[i4] = it.next();
                    if (i5 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i6 = ((i5 * 3) + 1) >>> 1;
                        if (i6 <= i5) {
                            i6 = f52374b;
                            if (i5 >= f52374b) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i6);
                        F.o(objArr, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i5);
                        F.o(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i4 = i5;
                }
            }
        }
        return f52373a;
    }

    @l3.d
    @InterfaceC2205l(message = "This function will be made internal in a future release")
    @W2.i(name = "toArray")
    @InterfaceC2207m(warningSince = "1.9")
    public static final Object[] b(@l3.d Collection<?> collection, @l3.e Object[] objArr) {
        Object[] objArr2;
        F.p(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i4 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            F.n(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i5 = i4 + 1;
            objArr2[i4] = it.next();
            if (i5 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i6 = ((i5 * 3) + 1) >>> 1;
                if (i6 <= i5) {
                    i6 = f52374b;
                    if (i5 >= f52374b) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i6);
                F.o(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i5] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i5);
                F.o(copyOf, "copyOf(...)");
                return copyOf;
            }
            i4 = i5;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    private static final Object[] c(Collection<?> collection, X2.a<Object[]> aVar, X2.l<? super Integer, Object[]> lVar, X2.p<? super Object[], ? super Integer, Object[]> pVar) {
        int size = collection.size();
        if (size == 0) {
            return aVar.n();
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return aVar.n();
        }
        Object[] C3 = lVar.C(Integer.valueOf(size));
        int i4 = 0;
        ?? r32 = C3;
        while (true) {
            int i5 = i4 + 1;
            r32[i4] = it.next();
            if (i5 >= r32.length) {
                if (!it.hasNext()) {
                    return r32;
                }
                int i6 = ((i5 * 3) + 1) >>> 1;
                if (i6 <= i5) {
                    i6 = f52374b;
                    if (i5 >= f52374b) {
                        throw new OutOfMemoryError();
                    }
                }
                r32 = Arrays.copyOf((Object[]) r32, i6);
                F.o(r32, "copyOf(...)");
            } else if (!it.hasNext()) {
                return pVar.c0(r32, Integer.valueOf(i5));
            }
            i4 = i5;
            r32 = r32;
        }
    }
}
