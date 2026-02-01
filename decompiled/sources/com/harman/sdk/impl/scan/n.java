package com.harman.sdk.impl.scan;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.BitSet;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class n {
    public static final int a(@l3.d BitSet bitSet, int i4) {
        F.p(bitSet, "bitSet");
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            if (bitSet.get(i6)) {
                i5 |= 1 << i6;
            }
        }
        return i5;
    }

    public static final short b(short s4, @l3.d ByteOrder endian) {
        F.p(endian, "endian");
        Buffer rewind = ByteBuffer.allocate(2).putShort(s4).order(endian).rewind();
        F.n(rewind, "null cannot be cast to non-null type java.nio.ByteBuffer");
        return ((ByteBuffer) rewind).getShort();
    }
}
