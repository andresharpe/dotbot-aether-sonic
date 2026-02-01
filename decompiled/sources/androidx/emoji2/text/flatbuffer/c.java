package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c extends b {
    public c f(int i4, ByteBuffer byteBuffer) {
        b(i4, 1, byteBuffer);
        return this;
    }

    public boolean g(int i4) {
        if (this.f14369d.get(a(i4)) != 0) {
            return true;
        }
        return false;
    }
}
