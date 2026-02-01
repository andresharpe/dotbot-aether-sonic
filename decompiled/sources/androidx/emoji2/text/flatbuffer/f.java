package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class f extends b {
    public f f(int i4, ByteBuffer byteBuffer) {
        b(i4, 1, byteBuffer);
        return this;
    }

    public byte g(int i4) {
        return this.f14369d.get(a(i4));
    }

    public int h(int i4) {
        return g(i4) & 255;
    }
}
