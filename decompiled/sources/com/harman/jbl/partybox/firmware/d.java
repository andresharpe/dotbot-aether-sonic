package com.harman.jbl.partybox.firmware;

import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.message.WirelessMicInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C2101p;
import kotlin.collections.C2109w;
import kotlin.collections.P;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.ranges.l;
import kotlin.ranges.u;
import kotlin.text.A;
import kotlin.text.z;

@U({"SMAP\nOTAUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTAUtils.kt\ncom/harman/jbl/partybox/firmware/OTAUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,145:1\n1549#2:146\n1620#2,3:147\n1549#2:152\n1620#2,3:153\n1855#2,2:158\n37#3,2:150\n37#3,2:156\n*S KotlinDebug\n*F\n+ 1 OTAUtils.kt\ncom/harman/jbl/partybox/firmware/OTAUtils\n*L\n23#1:146\n23#1:147,3\n30#1:152\n30#1:153,3\n37#1:158,2\n23#1:150,2\n30#1:156,2\n*E\n"})
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final d f40541a = new d();

    private d() {
    }

    public final boolean a(@l3.d WirelessMicInfo wirelessMicInfo) {
        BatteryInfo g4;
        F.p(wirelessMicInfo, "<this>");
        if ((wirelessMicInfo.m() != 1 && wirelessMicInfo.m() != 3) || wirelessMicInfo.c() == 0 || (g4 = wirelessMicInfo.g()) == null) {
            return false;
        }
        if (!g4.a() && !g4.d() && g4.c() < 30) {
            return false;
        }
        return true;
    }

    public final boolean b(@l3.d WirelessMicInfo wirelessMicInfo) {
        BatteryInfo l4;
        F.p(wirelessMicInfo, "<this>");
        if ((wirelessMicInfo.m() != 2 && wirelessMicInfo.m() != 3) || wirelessMicInfo.h() == 0 || (l4 = wirelessMicInfo.l()) == null) {
            return false;
        }
        if (!l4.a() && !l4.d() && l4.c() < 30) {
            return false;
        }
        return true;
    }

    public final boolean c(@l3.d WirelessMicInfo wirelessMicInfo) {
        F.p(wirelessMicInfo, "<this>");
        if (!a(wirelessMicInfo) && !b(wirelessMicInfo)) {
            return false;
        }
        return true;
    }

    public final int d(@l3.d WirelessMicInfo wirelessMicInfo) {
        F.p(wirelessMicInfo, "<this>");
        int i4 = 0;
        if (wirelessMicInfo.m() == 0) {
            return 0;
        }
        int m4 = wirelessMicInfo.m();
        if (m4 != 1) {
            if (m4 != 2) {
                if (m4 != 3) {
                    return 0;
                }
                if (wirelessMicInfo.c() != 0) {
                    i4 = 1;
                }
                if (wirelessMicInfo.h() != 0) {
                    return i4 + 1;
                }
                return i4;
            }
            if (wirelessMicInfo.h() == 0) {
                return 0;
            }
        } else if (wirelessMicInfo.c() == 0) {
            return 0;
        }
        return 1;
    }

    public final boolean e(@l3.e String str, @l3.e String str2) {
        boolean S12;
        boolean S13;
        List Q4;
        int b02;
        List Q42;
        int b03;
        int u3;
        l W12;
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

    public final boolean f(@l3.e String str, @l3.e String str2, @l3.e String str3, @l3.e String str4) {
        boolean S12;
        boolean S13;
        if (str4 != null) {
            S13 = z.S1(str4);
            if (!S13 && !e(str, str4)) {
                return false;
            }
        }
        if (str3 != null) {
            S12 = z.S1(str3);
            if (!S12 && !e(str2, str3)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
