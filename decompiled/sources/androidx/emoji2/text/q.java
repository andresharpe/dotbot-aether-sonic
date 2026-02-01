package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.InterfaceC0561d;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.i0;
import androidx.core.os.L;
import androidx.core.util.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@InterfaceC0561d
@W(19)
/* loaded from: classes.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    private static final int f14552e = 1024;

    /* renamed from: f, reason: collision with root package name */
    private static final String f14553f = "EmojiCompat.MetadataRepo.create";

    /* renamed from: a, reason: collision with root package name */
    @N
    private final androidx.emoji2.text.flatbuffer.o f14554a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final char[] f14555b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final a f14556c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    @N
    private final Typeface f14557d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray<a> f14558a;

        /* renamed from: b, reason: collision with root package name */
        private j f14559b;

        private a() {
            this(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a(int i4) {
            SparseArray<a> sparseArray = this.f14558a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final j b() {
            return this.f14559b;
        }

        void c(@N j jVar, int i4, int i5) {
            a a4 = a(jVar.b(i4));
            if (a4 == null) {
                a4 = new a();
                this.f14558a.put(jVar.b(i4), a4);
            }
            if (i5 > i4) {
                a4.c(jVar, i4 + 1, i5);
            } else {
                a4.f14559b = jVar;
            }
        }

        a(int i4) {
            this.f14558a = new SparseArray<>(i4);
        }
    }

    private q(@N Typeface typeface, @N androidx.emoji2.text.flatbuffer.o oVar) {
        this.f14557d = typeface;
        this.f14554a = oVar;
        this.f14555b = new char[oVar.K() * 2];
        a(oVar);
    }

    private void a(androidx.emoji2.text.flatbuffer.o oVar) {
        int K3 = oVar.K();
        for (int i4 = 0; i4 < K3; i4++) {
            j jVar = new j(this, i4);
            Character.toChars(jVar.g(), this.f14555b, i4 * 2);
            k(jVar);
        }
    }

    @N
    public static q b(@N AssetManager assetManager, @N String str) throws IOException {
        try {
            L.b(f14553f);
            return new q(Typeface.createFromAsset(assetManager, str), p.b(assetManager, str));
        } finally {
            L.d();
        }
    }

    @N
    @RestrictTo({RestrictTo.Scope.TESTS})
    public static q c(@N Typeface typeface) {
        try {
            L.b(f14553f);
            return new q(typeface, new androidx.emoji2.text.flatbuffer.o());
        } finally {
            L.d();
        }
    }

    @N
    public static q d(@N Typeface typeface, @N InputStream inputStream) throws IOException {
        try {
            L.b(f14553f);
            return new q(typeface, p.c(inputStream));
        } finally {
            L.d();
        }
    }

    @N
    public static q e(@N Typeface typeface, @N ByteBuffer byteBuffer) throws IOException {
        try {
            L.b(f14553f);
            return new q(typeface, p.d(byteBuffer));
        } finally {
            L.d();
        }
    }

    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public char[] f() {
        return this.f14555b;
    }

    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public androidx.emoji2.text.flatbuffer.o g() {
        return this.f14554a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int h() {
        return this.f14554a.S();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public a i() {
        return this.f14556c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Typeface j() {
        return this.f14557d;
    }

    @i0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    void k(@N j jVar) {
        boolean z3;
        u.m(jVar, "emoji metadata cannot be null");
        if (jVar.c() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u.b(z3, "invalid metadata codepoint length");
        this.f14556c.c(jVar, 0, jVar.c() - 1);
    }
}
