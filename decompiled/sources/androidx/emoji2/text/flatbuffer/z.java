package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.z;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class z extends w {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<a> f14433b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final CharsetEncoder f14434a;

        /* renamed from: b, reason: collision with root package name */
        final CharsetDecoder f14435b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f14436c = null;

        /* renamed from: d, reason: collision with root package name */
        ByteBuffer f14437d = null;

        a() {
            Charset charset = StandardCharsets.UTF_8;
            this.f14434a = charset.newEncoder();
            this.f14435b = charset.newDecoder();
        }
    }

    static {
        final Supplier supplier = new Supplier() { // from class: androidx.emoji2.text.flatbuffer.x
            @Override // java.util.function.Supplier
            public final Object get() {
                z.a g4;
                g4 = z.g();
                return g4;
            }
        };
        f14433b = new ThreadLocal() { // from class: androidx.emoji2.text.flatbuffer.y
            @Override // java.lang.ThreadLocal
            protected /* synthetic */ Object initialValue() {
                return supplier.get();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a g() {
        return new a();
    }

    @Override // androidx.emoji2.text.flatbuffer.w
    public String a(ByteBuffer byteBuffer, int i4, int i5) {
        CharsetDecoder charsetDecoder = f14433b.get().f14435b;
        charsetDecoder.reset();
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i4);
        duplicate.limit(i4 + i5);
        try {
            return charsetDecoder.decode(duplicate).toString();
        } catch (CharacterCodingException e4) {
            throw new IllegalArgumentException("Bad encoding", e4);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.w
    public void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        a aVar = f14433b.get();
        if (aVar.f14436c != charSequence) {
            c(charSequence);
        }
        byteBuffer.put(aVar.f14437d);
    }

    @Override // androidx.emoji2.text.flatbuffer.w
    public int c(CharSequence charSequence) {
        CharBuffer wrap;
        a aVar = f14433b.get();
        int length = (int) (charSequence.length() * aVar.f14434a.maxBytesPerChar());
        ByteBuffer byteBuffer = aVar.f14437d;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            aVar.f14437d = ByteBuffer.allocate(Math.max(128, length));
        }
        aVar.f14437d.clear();
        aVar.f14436c = charSequence;
        if (charSequence instanceof CharBuffer) {
            wrap = (CharBuffer) charSequence;
        } else {
            wrap = CharBuffer.wrap(charSequence);
        }
        CoderResult encode = aVar.f14434a.encode(wrap, aVar.f14437d, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e4) {
                throw new IllegalArgumentException("bad character encoding", e4);
            }
        }
        aVar.f14437d.flip();
        return aVar.f14437d.remaining();
    }
}
