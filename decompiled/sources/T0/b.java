package t0;

import androidx.annotation.N;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.util.l;

/* loaded from: classes.dex */
public class b implements u<byte[]> {

    /* renamed from: E, reason: collision with root package name */
    private final byte[] f57656E;

    public b(byte[] bArr) {
        this.f57656E = (byte[]) l.d(bArr);
    }

    @Override // com.bumptech.glide.load.engine.u
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f57656E;
    }

    @Override // com.bumptech.glide.load.engine.u
    public int c() {
        return this.f57656E.length;
    }

    @Override // com.bumptech.glide.load.engine.u
    @N
    public Class<byte[]> d() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.u
    public void a() {
    }
}
