package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.core.util.u;

@W(19)
/* loaded from: classes.dex */
public abstract class l extends ReplacementSpan {

    /* renamed from: F, reason: collision with root package name */
    @N
    private final j f14518F;

    /* renamed from: E, reason: collision with root package name */
    private final Paint.FontMetricsInt f14517E = new Paint.FontMetricsInt();

    /* renamed from: G, reason: collision with root package name */
    private short f14519G = -1;

    /* renamed from: H, reason: collision with root package name */
    private short f14520H = -1;

    /* renamed from: I, reason: collision with root package name */
    private float f14521I = 1.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public l(@N j jVar) {
        u.m(jVar, "metadata cannot be null");
        this.f14518F = jVar;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public final int a() {
        return this.f14520H;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public final int b() {
        return c().g();
    }

    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final j c() {
        return this.f14518F;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    final float d() {
        return this.f14521I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final int e() {
        return this.f14519G;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@N Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i4, int i5, @P Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f14517E);
        Paint.FontMetricsInt fontMetricsInt2 = this.f14517E;
        this.f14521I = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f14518F.f();
        this.f14520H = (short) (this.f14518F.f() * this.f14521I);
        short k4 = (short) (this.f14518F.k() * this.f14521I);
        this.f14519G = k4;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f14517E;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return k4;
    }
}
