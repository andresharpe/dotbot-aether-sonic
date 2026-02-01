package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import kotlin.D0;

/* loaded from: classes.dex */
public final class r extends b {
    public r f(int i4, ByteBuffer byteBuffer) {
        b(i4, 2, byteBuffer);
        return this;
    }

    public short g(int i4) {
        return this.f14369d.getShort(a(i4));
    }

    public int h(int i4) {
        return g(i4) & D0.f51794H;
    }
}
