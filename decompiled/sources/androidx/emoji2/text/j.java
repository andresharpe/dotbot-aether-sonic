package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0561d;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@InterfaceC0561d
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@W(19)
/* loaded from: classes.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    public static final int f14491d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14492e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14493f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final ThreadLocal<androidx.emoji2.text.flatbuffer.n> f14494g = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    private final int f14495a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final q f14496b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f14497c = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(@N q qVar, @F(from = 0) int i4) {
        this.f14496b = qVar;
        this.f14495a = i4;
    }

    private androidx.emoji2.text.flatbuffer.n h() {
        ThreadLocal<androidx.emoji2.text.flatbuffer.n> threadLocal = f14494g;
        androidx.emoji2.text.flatbuffer.n nVar = threadLocal.get();
        if (nVar == null) {
            nVar = new androidx.emoji2.text.flatbuffer.n();
            threadLocal.set(nVar);
        }
        this.f14496b.g().J(nVar, this.f14495a);
        return nVar;
    }

    public void a(@N Canvas canvas, float f4, float f5, @N Paint paint) {
        Typeface j4 = this.f14496b.j();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(j4);
        canvas.drawText(this.f14496b.f(), this.f14495a * 2, 2, f4, f5, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i4) {
        return h().F(i4);
    }

    public int c() {
        return h().I();
    }

    public short d() {
        return h().L();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int e() {
        return this.f14497c;
    }

    public short f() {
        return h().S();
    }

    public int g() {
        return h().T();
    }

    public short i() {
        return h().U();
    }

    @N
    public Typeface j() {
        return this.f14496b.j();
    }

    public short k() {
        return h().X();
    }

    public boolean l() {
        return h().O();
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public void m() {
        this.f14497c = 0;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void n(boolean z3) {
        int i4;
        if (z3) {
            i4 = 2;
        } else {
            i4 = 1;
        }
        this.f14497c = i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(g()));
        sb.append(", codepoints:");
        int c4 = c();
        for (int i4 = 0; i4 < c4; i4++) {
            sb.append(Integer.toHexString(b(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
