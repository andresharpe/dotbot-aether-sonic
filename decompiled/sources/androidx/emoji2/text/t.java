package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.annotation.N;
import androidx.annotation.W;
import androidx.core.text.z;
import java.util.stream.IntStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class t implements Spannable {

    /* renamed from: E, reason: collision with root package name */
    private boolean f14565E = false;

    /* renamed from: F, reason: collision with root package name */
    @N
    private Spannable f14566F;

    @W(24)
    /* loaded from: classes.dex */
    private static class a {
        private a() {
        }

        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(28)
    /* loaded from: classes.dex */
    public static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.t.b
        boolean a(CharSequence charSequence) {
            if (!androidx.core.text.h.a(charSequence) && !(charSequence instanceof z)) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(@N Spannable spannable) {
        this.f14566F = spannable;
    }

    private void a() {
        Spannable spannable = this.f14566F;
        if (!this.f14565E && c().a(spannable)) {
            this.f14566F = new SpannableString(spannable);
        }
        this.f14565E = true;
    }

    static b c() {
        if (Build.VERSION.SDK_INT < 28) {
            return new b();
        }
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Spannable b() {
        return this.f14566F;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i4) {
        return this.f14566F.charAt(i4);
    }

    @Override // java.lang.CharSequence
    @N
    @W(api = 24)
    public IntStream chars() {
        return a.a(this.f14566F);
    }

    @Override // java.lang.CharSequence
    @N
    @W(api = 24)
    public IntStream codePoints() {
        return a.b(this.f14566F);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f14566F.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f14566F.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f14566F.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i4, int i5, Class<T> cls) {
        return (T[]) this.f14566F.getSpans(i4, i5, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f14566F.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i4, int i5, Class cls) {
        return this.f14566F.nextSpanTransition(i4, i5, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f14566F.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i4, int i5, int i6) {
        a();
        this.f14566F.setSpan(obj, i4, i5, i6);
    }

    @Override // java.lang.CharSequence
    @N
    public CharSequence subSequence(int i4, int i5) {
        return this.f14566F.subSequence(i4, i5);
    }

    @Override // java.lang.CharSequence
    @N
    public String toString() {
        return this.f14566F.toString();
    }

    t(@N Spanned spanned) {
        this.f14566F = new SpannableString(spanned);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(@N CharSequence charSequence) {
        this.f14566F = new SpannableString(charSequence);
    }
}
