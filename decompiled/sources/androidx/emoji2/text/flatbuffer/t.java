package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    protected int f14422a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f14423b;

    public void a() {
        b(0, null);
    }

    protected void b(int i4, ByteBuffer byteBuffer) {
        this.f14423b = byteBuffer;
        if (byteBuffer != null) {
            this.f14422a = i4;
        } else {
            this.f14422a = 0;
        }
    }
}
