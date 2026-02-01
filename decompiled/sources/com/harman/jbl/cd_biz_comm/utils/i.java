package com.harman.jbl.cd_biz_comm.utils;

import androidx.lifecycle.P;
import com.blankj.utilcode.util.C1115z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class i {
    public static final <T> void a(@l3.d P<T> p4, T t3) {
        F.p(p4, "<this>");
        if (F.g(p4.f(), t3)) {
            return;
        }
        p4.r(t3);
    }

    @l3.d
    public static final <T> List<T> b(@l3.d Iterator<? extends T> it, int i4) {
        F.p(it, "<this>");
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < i4; i5++) {
            if (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    @l3.d
    public static final String c(byte b4) {
        String l4 = C1115z.l(new byte[]{b4});
        F.o(l4, "bytes2HexString(...)");
        return l4;
    }

    @l3.d
    public static final String d(int i4, @l3.d ByteOrder order) {
        F.p(order, "order");
        String l4 = C1115z.l(ByteBuffer.allocate(4).order(order).putInt(i4).array());
        F.o(l4, "bytes2HexString(...)");
        return l4;
    }

    @l3.d
    public static final String e(short s4, @l3.d ByteOrder order) {
        F.p(order, "order");
        String l4 = C1115z.l(ByteBuffer.allocate(2).order(order).putShort(s4).array());
        F.o(l4, "bytes2HexString(...)");
        return l4;
    }

    @l3.d
    public static final String f(@l3.d byte[] bArr) {
        F.p(bArr, "<this>");
        String l4 = C1115z.l(bArr);
        F.o(l4, "bytes2HexString(...)");
        return l4;
    }

    public static /* synthetic */ String g(int i4, ByteOrder BIG_ENDIAN, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
            F.o(BIG_ENDIAN, "BIG_ENDIAN");
        }
        return d(i4, BIG_ENDIAN);
    }

    public static /* synthetic */ String h(short s4, ByteOrder BIG_ENDIAN, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
            F.o(BIG_ENDIAN, "BIG_ENDIAN");
        }
        return e(s4, BIG_ENDIAN);
    }
}
