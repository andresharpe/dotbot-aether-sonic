package com.harman.jbl.partylight.lib.ota.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C2101p;
import kotlin.collections.C2109w;
import kotlin.collections.P;
import kotlin.jvm.internal.U;
import kotlin.ranges.u;
import kotlin.text.A;
import kotlin.text.z;

@U({"SMAP\nOTAUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTAUtils.kt\ncom/harman/jbl/partylight/lib/ota/sdk/OTAUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,78:1\n1549#2:79\n1620#2,3:80\n1549#2:85\n1620#2,3:86\n1855#2,2:91\n37#3,2:83\n37#3,2:89\n*S KotlinDebug\n*F\n+ 1 OTAUtils.kt\ncom/harman/jbl/partylight/lib/ota/sdk/OTAUtils\n*L\n20#1:79\n20#1:80,3\n27#1:85\n27#1:86,3\n34#1:91,2\n20#1:83,2\n27#1:89,2\n*E\n"})
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final i f47376a = new i();

    private i() {
    }

    public final boolean a(@l3.e String str, @l3.e String str2) {
        boolean S12;
        boolean S13;
        List Q4;
        int b02;
        List Q42;
        int b03;
        int u3;
        kotlin.ranges.l W12;
        Object Pe;
        Object Pe2;
        if (str != null) {
            S12 = z.S1(str);
            if (!S12 && str2 != null) {
                S13 = z.S1(str2);
                if (!S13) {
                    Q4 = A.Q4(str, new char[]{'.'}, false, 0, 6, null);
                    try {
                        b02 = C2109w.b0(Q4, 10);
                        ArrayList arrayList = new ArrayList(b02);
                        Iterator it = Q4.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                        }
                        Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
                        Q42 = A.Q4(str2, new char[]{'.'}, false, 0, 6, null);
                        b03 = C2109w.b0(Q42, 10);
                        ArrayList arrayList2 = new ArrayList(b03);
                        Iterator it2 = Q42.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
                        }
                        Integer[] numArr2 = (Integer[]) arrayList2.toArray(new Integer[0]);
                        u3 = u.u(numArr2.length, numArr.length);
                        W12 = u.W1(0, u3);
                        Iterator<Integer> it3 = W12.iterator();
                        while (it3.hasNext()) {
                            int c4 = ((P) it3).c();
                            Pe = C2101p.Pe(numArr, c4);
                            Integer num = (Integer) Pe;
                            Pe2 = C2101p.Pe(numArr2, c4);
                            Integer num2 = (Integer) Pe2;
                            if ((num == null && num2 == null) || num == null) {
                                return false;
                            }
                            if (num2 == null) {
                                return true;
                            }
                            if (num.intValue() < num2.intValue()) {
                                return false;
                            }
                            if (num.intValue() > num2.intValue()) {
                                return true;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return false;
    }

    public final boolean b(@l3.e String str, @l3.e String str2, @l3.e String str3, @l3.e String str4) {
        boolean S12;
        boolean S13;
        if (str4 != null) {
            S13 = z.S1(str4);
            if (!S13 && !a(str, str4)) {
                return false;
            }
        }
        if (str3 != null) {
            S12 = z.S1(str3);
            if (!S12 && !a(str2, str3)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
