package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.util.u;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class r extends SpannableStringBuilder {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final Class<?> f14560E;

    /* renamed from: F, reason: collision with root package name */
    @N
    private final List<a> f14561F;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: E, reason: collision with root package name */
        final Object f14562E;

        /* renamed from: F, reason: collision with root package name */
        private final AtomicInteger f14563F = new AtomicInteger(0);

        a(Object obj) {
            this.f14562E = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof l;
        }

        final void a() {
            this.f14563F.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f14562E).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            ((TextWatcher) this.f14562E).beforeTextChanged(charSequence, i4, i5, i6);
        }

        final void c() {
            this.f14563F.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i4, int i5) {
            if (this.f14563F.get() > 0 && b(obj)) {
                return;
            }
            ((SpanWatcher) this.f14562E).onSpanAdded(spannable, obj, i4, i5);
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i4, int i5, int i6, int i7) {
            int i8;
            int i9;
            if (this.f14563F.get() > 0 && b(obj)) {
                return;
            }
            if (Build.VERSION.SDK_INT < 28) {
                if (i4 > i5) {
                    i4 = 0;
                }
                if (i6 > i7) {
                    i8 = i4;
                    i9 = 0;
                    ((SpanWatcher) this.f14562E).onSpanChanged(spannable, obj, i8, i5, i9, i7);
                }
            }
            i8 = i4;
            i9 = i6;
            ((SpanWatcher) this.f14562E).onSpanChanged(spannable, obj, i8, i5, i9, i7);
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i4, int i5) {
            if (this.f14563F.get() > 0 && b(obj)) {
                return;
            }
            ((SpanWatcher) this.f14562E).onSpanRemoved(spannable, obj, i4, i5);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            ((TextWatcher) this.f14562E).onTextChanged(charSequence, i4, i5, i6);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    r(@N Class<?> cls) {
        this.f14561F = new ArrayList();
        u.m(cls, "watcherClass cannot be null");
        this.f14560E = cls;
    }

    private void b() {
        for (int i4 = 0; i4 < this.f14561F.size(); i4++) {
            this.f14561F.get(i4).a();
        }
    }

    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static r c(@N Class<?> cls, @N CharSequence charSequence) {
        return new r(cls, charSequence);
    }

    private void e() {
        for (int i4 = 0; i4 < this.f14561F.size(); i4++) {
            this.f14561F.get(i4).onTextChanged(this, 0, length(), length());
        }
    }

    private a f(Object obj) {
        for (int i4 = 0; i4 < this.f14561F.size(); i4++) {
            a aVar = this.f14561F.get(i4);
            if (aVar.f14562E == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean g(@N Class<?> cls) {
        if (this.f14560E == cls) {
            return true;
        }
        return false;
    }

    private boolean h(@P Object obj) {
        if (obj != null && g(obj.getClass())) {
            return true;
        }
        return false;
    }

    private void i() {
        for (int i4 = 0; i4 < this.f14561F.size(); i4++) {
            this.f14561F.get(i4).c();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a() {
        b();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void d() {
        i();
        e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@P Object obj) {
        a f4;
        if (h(obj) && (f4 = f(obj)) != null) {
            obj = f4;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@P Object obj) {
        a f4;
        if (h(obj) && (f4 = f(obj)) != null) {
            obj = f4;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@P Object obj) {
        a f4;
        if (h(obj) && (f4 = f(obj)) != null) {
            obj = f4;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i4, int i5, @N Class<T> cls) {
        if (g(cls)) {
            a[] aVarArr = (a[]) super.getSpans(i4, i5, a.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
            for (int i6 = 0; i6 < aVarArr.length; i6++) {
                tArr[i6] = aVarArr[i6].f14562E;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i4, i5, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i4, int i5, @P Class cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i4, i5, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@P Object obj) {
        a aVar;
        if (h(obj)) {
            aVar = f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f14561F.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@P Object obj, int i4, int i5, int i6) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f14561F.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i4, i5, i6);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i4, int i5) {
        return new r(this.f14560E, this, i4, i5);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i4, int i5) {
        super.delete(i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i4, CharSequence charSequence) {
        super.insert(i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i4, int i5, CharSequence charSequence) {
        b();
        super.replace(i4, i5, charSequence);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i4, CharSequence charSequence, int i5, int i6) {
        super.insert(i4, charSequence, i5, i6);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    r(@N Class<?> cls, @N CharSequence charSequence) {
        super(charSequence);
        this.f14561F = new ArrayList();
        u.m(cls, "watcherClass cannot be null");
        this.f14560E = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i4, int i5, CharSequence charSequence, int i6, int i7) {
        b();
        super.replace(i4, i5, charSequence, i6, i7);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @N
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @N
    public SpannableStringBuilder append(char c4) {
        super.append(c4);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    r(@N Class<?> cls, @N CharSequence charSequence, int i4, int i5) {
        super(charSequence, i4, i5);
        this.f14561F = new ArrayList();
        u.m(cls, "watcherClass cannot be null");
        this.f14560E = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @N
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i4, int i5) {
        super.append(charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i4) {
        super.append(charSequence, obj, i4);
        return this;
    }
}
