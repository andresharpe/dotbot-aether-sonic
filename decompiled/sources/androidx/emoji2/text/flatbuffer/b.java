package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private int f14366a;

    /* renamed from: b, reason: collision with root package name */
    private int f14367b;

    /* renamed from: c, reason: collision with root package name */
    private int f14368c;

    /* renamed from: d, reason: collision with root package name */
    protected ByteBuffer f14369d;

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(int i4) {
        return this.f14366a + (i4 * this.f14368c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(int i4, int i5, ByteBuffer byteBuffer) {
        this.f14369d = byteBuffer;
        if (byteBuffer != null) {
            this.f14366a = i4;
            this.f14367b = byteBuffer.getInt(i4 - 4);
            this.f14368c = i5;
        } else {
            this.f14366a = 0;
            this.f14367b = 0;
            this.f14368c = 0;
        }
    }

    protected int c() {
        return this.f14366a;
    }

    public int d() {
        return this.f14367b;
    }

    public void e() {
        b(0, 0, null);
    }
}
