package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.C2122h0;
import kotlin.E0;
import kotlin.Pair;
import kotlin.u0;
import kotlin.y0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.jvm.internal.U({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* renamed from: kotlin.collections.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2099n extends C2098m {
    /* JADX WARN: Multi-variable type inference failed */
    @W2.i(name = "contentDeepEquals")
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static final <T> boolean g(@l3.e T[] tArr, @l3.e T[] tArr2) {
        boolean V02;
        boolean T02;
        boolean S02;
        boolean U02;
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            Object[] objArr = tArr[i4];
            Object[] objArr2 = tArr2[i4];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!g(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof kotlin.q0) && (objArr2 instanceof kotlin.q0)) {
                    U02 = kotlin.collections.unsigned.c.U0(((kotlin.q0) objArr).y(), ((kotlin.q0) objArr2).y());
                    if (!U02) {
                        return false;
                    }
                } else if ((objArr instanceof E0) && (objArr2 instanceof E0)) {
                    S02 = kotlin.collections.unsigned.c.S0(((E0) objArr).y(), ((E0) objArr2).y());
                    if (!S02) {
                        return false;
                    }
                } else if ((objArr instanceof u0) && (objArr2 instanceof u0)) {
                    T02 = kotlin.collections.unsigned.c.T0(((u0) objArr).y(), ((u0) objArr2).y());
                    if (!T02) {
                        return false;
                    }
                } else if ((objArr instanceof y0) && (objArr2 instanceof y0)) {
                    V02 = kotlin.collections.unsigned.c.V0(((y0) objArr).y(), ((y0) objArr2).y());
                    if (!V02) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.F.g(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @l3.d
    @W2.i(name = "contentDeepToString")
    @kotlin.U
    @kotlin.Y(version = "1.3")
    public static final <T> String h(@l3.e T[] tArr) {
        int B3;
        if (tArr != null) {
            B3 = kotlin.ranges.u.B(tArr.length, 429496729);
            StringBuilder sb = new StringBuilder((B3 * 5) + 2);
            i(tArr, sb, new ArrayList());
            String sb2 = sb.toString();
            kotlin.jvm.internal.F.o(sb2, "toString(...)");
            return sb2;
        }
        return "null";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void i(T[] tArr, StringBuilder sb, List<Object[]> list) {
        int J3;
        String d12;
        String b12;
        String c12;
        String a12;
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0) {
                sb.append(", ");
            }
            Object[] objArr = tArr[i4];
            if (objArr == 0) {
                sb.append("null");
            } else if (objArr instanceof Object[]) {
                i(objArr, sb, list);
            } else if (objArr instanceof byte[]) {
                String arrays = Arrays.toString((byte[]) objArr);
                kotlin.jvm.internal.F.o(arrays, "toString(...)");
                sb.append(arrays);
            } else if (objArr instanceof short[]) {
                String arrays2 = Arrays.toString((short[]) objArr);
                kotlin.jvm.internal.F.o(arrays2, "toString(...)");
                sb.append(arrays2);
            } else if (objArr instanceof int[]) {
                String arrays3 = Arrays.toString((int[]) objArr);
                kotlin.jvm.internal.F.o(arrays3, "toString(...)");
                sb.append(arrays3);
            } else if (objArr instanceof long[]) {
                String arrays4 = Arrays.toString((long[]) objArr);
                kotlin.jvm.internal.F.o(arrays4, "toString(...)");
                sb.append(arrays4);
            } else if (objArr instanceof float[]) {
                String arrays5 = Arrays.toString((float[]) objArr);
                kotlin.jvm.internal.F.o(arrays5, "toString(...)");
                sb.append(arrays5);
            } else if (objArr instanceof double[]) {
                String arrays6 = Arrays.toString((double[]) objArr);
                kotlin.jvm.internal.F.o(arrays6, "toString(...)");
                sb.append(arrays6);
            } else if (objArr instanceof char[]) {
                String arrays7 = Arrays.toString((char[]) objArr);
                kotlin.jvm.internal.F.o(arrays7, "toString(...)");
                sb.append(arrays7);
            } else if (objArr instanceof boolean[]) {
                String arrays8 = Arrays.toString((boolean[]) objArr);
                kotlin.jvm.internal.F.o(arrays8, "toString(...)");
                sb.append(arrays8);
            } else if (objArr instanceof kotlin.q0) {
                a12 = kotlin.collections.unsigned.c.a1(((kotlin.q0) objArr).y());
                sb.append(a12);
            } else if (objArr instanceof E0) {
                c12 = kotlin.collections.unsigned.c.c1(((E0) objArr).y());
                sb.append(c12);
            } else if (objArr instanceof u0) {
                b12 = kotlin.collections.unsigned.c.b1(((u0) objArr).y());
                sb.append(b12);
            } else if (objArr instanceof y0) {
                d12 = kotlin.collections.unsigned.c.d1(((y0) objArr).y());
                sb.append(d12);
            } else {
                sb.append(objArr.toString());
            }
        }
        sb.append(']');
        J3 = CollectionsKt__CollectionsKt.J(list);
        list.remove(J3);
    }

    @l3.d
    public static final <T> List<T> j(@l3.d T[][] tArr) {
        kotlin.jvm.internal.F.p(tArr, "<this>");
        int i4 = 0;
        for (T[] tArr2 : tArr) {
            i4 += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(i4);
        for (T[] tArr3 : tArr) {
            A.s0(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;LX2/a<+TR;>;)TR; */
    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final Object k(Object[] objArr, X2.a defaultValue) {
        kotlin.jvm.internal.F.p(defaultValue, "defaultValue");
        if (objArr.length == 0) {
            return defaultValue.n();
        }
        return objArr;
    }

    @kotlin.Y(version = "1.3")
    @kotlin.internal.f
    private static final boolean l(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            return false;
        }
        return true;
    }

    @l3.d
    public static final <T, R> Pair<List<T>, List<R>> m(@l3.d Pair<? extends T, ? extends R>[] pairArr) {
        kotlin.jvm.internal.F.p(pairArr, "<this>");
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.e());
            arrayList2.add(pair.f());
        }
        return C2122h0.a(arrayList, arrayList2);
    }
}
