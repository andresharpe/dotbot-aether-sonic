package t0;

import androidx.annotation.N;
import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2412a implements e<ByteBuffer> {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f57655a;

    /* renamed from: t0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0545a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        @N
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @N
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new C2412a(byteBuffer);
        }
    }

    public C2412a(ByteBuffer byteBuffer) {
        this.f57655a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    @N
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a() {
        this.f57655a.position(0);
        return this.f57655a;
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }
}
