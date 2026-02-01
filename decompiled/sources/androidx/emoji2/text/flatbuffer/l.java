package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class l extends b {
    public l f(int i4, ByteBuffer byteBuffer) {
        b(i4, 4, byteBuffer);
        return this;
    }

    public int g(int i4) {
        return this.f14369d.getInt(a(i4));
    }

    public long h(int i4) {
        return g(i4) & 4294967295L;
    }
}
