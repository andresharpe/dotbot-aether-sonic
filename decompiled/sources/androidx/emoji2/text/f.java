package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.InterfaceC0561d;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.G;
import androidx.emoji2.text.g;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC0561d
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class f implements g.e {

    /* renamed from: b, reason: collision with root package name */
    private static final int f14313b = 10;

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f14314c = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f14315a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f() {
        TextPaint textPaint = new TextPaint();
        this.f14315a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = f14314c;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.g.e
    public boolean a(@N CharSequence charSequence, int i4, int i5, int i6) {
        StringBuilder b4 = b();
        b4.setLength(0);
        while (i4 < i5) {
            b4.append(charSequence.charAt(i4));
            i4++;
        }
        return G.a(this.f14315a, b4.toString());
    }
}
