package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.h0;
import androidx.core.os.L;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class z implements Spannable {

    /* renamed from: I, reason: collision with root package name */
    private static final char f12948I = '\n';

    /* renamed from: J, reason: collision with root package name */
    private static final Object f12949J = new Object();

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.B("sLock")
    @N
    private static Executor f12950K;

    /* renamed from: E, reason: collision with root package name */
    @N
    private final Spannable f12951E;

    /* renamed from: F, reason: collision with root package name */
    @N
    private final a f12952F;

    /* renamed from: G, reason: collision with root package name */
    @N
    private final int[] f12953G;

    /* renamed from: H, reason: collision with root package name */
    @P
    private final PrecomputedText f12954H;

    /* loaded from: classes.dex */
    private static class b extends FutureTask<z> {

        /* loaded from: classes.dex */
        private static class a implements Callable<z> {

            /* renamed from: a, reason: collision with root package name */
            private a f12964a;

            /* renamed from: b, reason: collision with root package name */
            private CharSequence f12965b;

            a(@N a aVar, @N CharSequence charSequence) {
                this.f12964a = aVar;
                this.f12965b = charSequence;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public z call() throws Exception {
                return z.a(this.f12965b, this.f12964a);
            }
        }

        b(@N a aVar, @N CharSequence charSequence) {
            super(new a(aVar, charSequence));
        }
    }

    private z(@N CharSequence charSequence, @N a aVar, @N int[] iArr) {
        this.f12951E = new SpannableString(charSequence);
        this.f12952F = aVar;
        this.f12953G = iArr;
        this.f12954H = null;
    }

    @SuppressLint({"WrongConstant"})
    public static z a(@N CharSequence charSequence, @N a aVar) {
        PrecomputedText.Params params;
        PrecomputedText create;
        androidx.core.util.u.l(charSequence);
        androidx.core.util.u.l(aVar);
        try {
            L.b("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = aVar.f12959e) != null) {
                create = PrecomputedText.create(charSequence, params);
                return new z(create, aVar);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i4 = 0;
            while (i4 < length) {
                int indexOf = TextUtils.indexOf(charSequence, f12948I, i4, length);
                if (indexOf < 0) {
                    i4 = length;
                } else {
                    i4 = indexOf + 1;
                }
                arrayList.add(Integer.valueOf(i4));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), aVar.e(), Integer.MAX_VALUE).setBreakStrategy(aVar.b()).setHyphenationFrequency(aVar.c()).setTextDirection(aVar.d()).build();
            return new z(charSequence, aVar, iArr);
        } finally {
            L.d();
        }
    }

    @h0
    public static Future<z> g(@N CharSequence charSequence, @N a aVar, @P Executor executor) {
        b bVar = new b(aVar, charSequence);
        if (executor == null) {
            synchronized (f12949J) {
                try {
                    if (f12950K == null) {
                        f12950K = Executors.newFixedThreadPool(1);
                    }
                    executor = f12950K;
                } finally {
                }
            }
        }
        executor.execute(bVar);
        return bVar;
    }

    @androidx.annotation.F(from = 0)
    public int b() {
        int paragraphCount;
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphCount = this.f12954H.getParagraphCount();
            return paragraphCount;
        }
        return this.f12953G.length;
    }

    @androidx.annotation.F(from = 0)
    public int c(@androidx.annotation.F(from = 0) int i4) {
        int paragraphEnd;
        androidx.core.util.u.g(i4, 0, b(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphEnd = this.f12954H.getParagraphEnd(i4);
            return paragraphEnd;
        }
        return this.f12953G[i4];
    }

    @Override // java.lang.CharSequence
    public char charAt(int i4) {
        return this.f12951E.charAt(i4);
    }

    @androidx.annotation.F(from = 0)
    public int d(@androidx.annotation.F(from = 0) int i4) {
        int paragraphStart;
        androidx.core.util.u.g(i4, 0, b(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphStart = this.f12954H.getParagraphStart(i4);
            return paragraphStart;
        }
        if (i4 == 0) {
            return 0;
        }
        return this.f12953G[i4 - 1];
    }

    @N
    public a e() {
        return this.f12952F;
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @W(28)
    public PrecomputedText f() {
        if (h.a(this.f12951E)) {
            return i.a(this.f12951E);
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f12951E.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f12951E.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f12951E.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i4, int i5, Class<T> cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT >= 29) {
            spans = this.f12954H.getSpans(i4, i5, cls);
            return (T[]) spans;
        }
        return (T[]) this.f12951E.getSpans(i4, i5, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f12951E.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i4, int i5, Class cls) {
        return this.f12951E.nextSpanTransition(i4, i5, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f12954H.removeSpan(obj);
                return;
            } else {
                this.f12951E.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i4, int i5, int i6) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f12954H.setSpan(obj, i4, i5, i6);
                return;
            } else {
                this.f12951E.setSpan(obj, i4, i5, i6);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i4, int i5) {
        return this.f12951E.subSequence(i4, i5);
    }

    @Override // java.lang.CharSequence
    @N
    public String toString() {
        return this.f12951E.toString();
    }

    @W(28)
    private z(@N PrecomputedText precomputedText, @N a aVar) {
        this.f12951E = precomputedText;
        this.f12952F = aVar;
        this.f12953G = null;
        this.f12954H = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final TextPaint f12955a;

        /* renamed from: b, reason: collision with root package name */
        @P
        private final TextDirectionHeuristic f12956b;

        /* renamed from: c, reason: collision with root package name */
        private final int f12957c;

        /* renamed from: d, reason: collision with root package name */
        private final int f12958d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f12959e;

        /* renamed from: androidx.core.text.z$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0103a {

            /* renamed from: a, reason: collision with root package name */
            @N
            private final TextPaint f12960a;

            /* renamed from: c, reason: collision with root package name */
            private int f12962c = 1;

            /* renamed from: d, reason: collision with root package name */
            private int f12963d = 1;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f12961b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0103a(@N TextPaint textPaint) {
                this.f12960a = textPaint;
            }

            @N
            public a a() {
                return new a(this.f12960a, this.f12961b, this.f12962c, this.f12963d);
            }

            @W(23)
            public C0103a b(int i4) {
                this.f12962c = i4;
                return this;
            }

            @W(23)
            public C0103a c(int i4) {
                this.f12963d = i4;
                return this;
            }

            @W(18)
            public C0103a d(@N TextDirectionHeuristic textDirectionHeuristic) {
                this.f12961b = textDirectionHeuristic;
                return this;
            }
        }

        a(@N TextPaint textPaint, @N TextDirectionHeuristic textDirectionHeuristic, int i4, int i5) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = y.a(textPaint).setBreakStrategy(i4);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i5);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f12959e = build;
            } else {
                this.f12959e = null;
            }
            this.f12955a = textPaint;
            this.f12956b = textDirectionHeuristic;
            this.f12957c = i4;
            this.f12958d = i5;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean a(@N a aVar) {
            if (this.f12957c != aVar.b() || this.f12958d != aVar.c() || this.f12955a.getTextSize() != aVar.e().getTextSize() || this.f12955a.getTextScaleX() != aVar.e().getTextScaleX() || this.f12955a.getTextSkewX() != aVar.e().getTextSkewX() || this.f12955a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f12955a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f12955a.getFlags() != aVar.e().getFlags() || !this.f12955a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return false;
            }
            if (this.f12955a.getTypeface() == null) {
                if (aVar.e().getTypeface() != null) {
                    return false;
                }
                return true;
            }
            if (!this.f12955a.getTypeface().equals(aVar.e().getTypeface())) {
                return false;
            }
            return true;
        }

        @W(23)
        public int b() {
            return this.f12957c;
        }

        @W(23)
        public int c() {
            return this.f12958d;
        }

        @P
        @W(18)
        public TextDirectionHeuristic d() {
            return this.f12956b;
        }

        @N
        public TextPaint e() {
            return this.f12955a;
        }

        public boolean equals(@P Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (a(aVar) && this.f12956b == aVar.d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return androidx.core.util.p.b(Float.valueOf(this.f12955a.getTextSize()), Float.valueOf(this.f12955a.getTextScaleX()), Float.valueOf(this.f12955a.getTextSkewX()), Float.valueOf(this.f12955a.getLetterSpacing()), Integer.valueOf(this.f12955a.getFlags()), this.f12955a.getTextLocales(), this.f12955a.getTypeface(), Boolean.valueOf(this.f12955a.isElegantTextHeight()), this.f12956b, Integer.valueOf(this.f12957c), Integer.valueOf(this.f12958d));
        }

        public String toString() {
            String fontVariationSettings;
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f12955a.getTextSize());
            sb.append(", textScaleX=" + this.f12955a.getTextScaleX());
            sb.append(", textSkewX=" + this.f12955a.getTextSkewX());
            int i4 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f12955a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f12955a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f12955a.getTextLocales());
            sb.append(", typeface=" + this.f12955a.getTypeface());
            if (i4 >= 26) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(", variationSettings=");
                fontVariationSettings = this.f12955a.getFontVariationSettings();
                sb2.append(fontVariationSettings);
                sb.append(sb2.toString());
            }
            sb.append(", textDir=" + this.f12956b);
            sb.append(", breakStrategy=" + this.f12957c);
            sb.append(", hyphenationFrequency=" + this.f12958d);
            sb.append("}");
            return sb.toString();
        }

        @W(28)
        public a(@N PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f12955a = textPaint;
            textDirection = params.getTextDirection();
            this.f12956b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f12957c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f12958d = hyphenationFrequency;
            this.f12959e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
