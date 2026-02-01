package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.H0;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class TextViewKt {

    /* loaded from: classes.dex */
    public static final class a implements TextWatcher {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ X2.l<Editable, H0> f13739E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ X2.r<CharSequence, Integer, Integer, Integer, H0> f13740F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ X2.r<CharSequence, Integer, Integer, Integer, H0> f13741G;

        /* JADX WARN: Multi-variable type inference failed */
        public a(X2.l<? super Editable, H0> lVar, X2.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, H0> rVar, X2.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, H0> rVar2) {
            this.f13739E = lVar;
            this.f13740F = rVar;
            this.f13741G = rVar2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@l3.e Editable editable) {
            this.f13739E.C(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@l3.e CharSequence charSequence, int i4, int i5, int i6) {
            this.f13740F.N(charSequence, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@l3.e CharSequence charSequence, int i4, int i5, int i6) {
            this.f13741G.N(charSequence, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements TextWatcher {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ X2.l f13745E;

        public b(X2.l lVar) {
            this.f13745E = lVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@l3.e Editable editable) {
            this.f13745E.C(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@l3.e CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@l3.e CharSequence charSequence, int i4, int i5, int i6) {
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements TextWatcher {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ X2.r f13746E;

        public c(X2.r rVar) {
            this.f13746E = rVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@l3.e Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@l3.e CharSequence charSequence, int i4, int i5, int i6) {
            this.f13746E.N(charSequence, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@l3.e CharSequence charSequence, int i4, int i5, int i6) {
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements TextWatcher {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ X2.r f13747E;

        public d(X2.r rVar) {
            this.f13747E = rVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@l3.e Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@l3.e CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@l3.e CharSequence charSequence, int i4, int i5, int i6) {
            this.f13747E.N(charSequence, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
        }
    }

    @l3.d
    public static final TextWatcher a(@l3.d TextView textView, @l3.d X2.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, H0> beforeTextChanged, @l3.d X2.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, H0> onTextChanged, @l3.d X2.l<? super Editable, H0> afterTextChanged) {
        F.p(textView, "<this>");
        F.p(beforeTextChanged, "beforeTextChanged");
        F.p(onTextChanged, "onTextChanged");
        F.p(afterTextChanged, "afterTextChanged");
        a aVar = new a(afterTextChanged, beforeTextChanged, onTextChanged);
        textView.addTextChangedListener(aVar);
        return aVar;
    }

    public static /* synthetic */ TextWatcher b(TextView textView, X2.r beforeTextChanged, X2.r onTextChanged, X2.l afterTextChanged, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            beforeTextChanged = new X2.r<CharSequence, Integer, Integer, Integer, H0>() { // from class: androidx.core.widget.TextViewKt$addTextChangedListener$1
                @Override // X2.r
                public /* bridge */ /* synthetic */ H0 N(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    c(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return H0.f51801a;
                }

                public final void c(@l3.e CharSequence charSequence, int i5, int i6, int i7) {
                }
            };
        }
        if ((i4 & 2) != 0) {
            onTextChanged = new X2.r<CharSequence, Integer, Integer, Integer, H0>() { // from class: androidx.core.widget.TextViewKt$addTextChangedListener$2
                @Override // X2.r
                public /* bridge */ /* synthetic */ H0 N(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    c(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return H0.f51801a;
                }

                public final void c(@l3.e CharSequence charSequence, int i5, int i6, int i7) {
                }
            };
        }
        if ((i4 & 4) != 0) {
            afterTextChanged = new X2.l<Editable, H0>() { // from class: androidx.core.widget.TextViewKt$addTextChangedListener$3
                @Override // X2.l
                public /* bridge */ /* synthetic */ H0 C(Editable editable) {
                    c(editable);
                    return H0.f51801a;
                }

                public final void c(@l3.e Editable editable) {
                }
            };
        }
        F.p(textView, "<this>");
        F.p(beforeTextChanged, "beforeTextChanged");
        F.p(onTextChanged, "onTextChanged");
        F.p(afterTextChanged, "afterTextChanged");
        a aVar = new a(afterTextChanged, beforeTextChanged, onTextChanged);
        textView.addTextChangedListener(aVar);
        return aVar;
    }

    @l3.d
    public static final TextWatcher c(@l3.d TextView textView, @l3.d X2.l<? super Editable, H0> action) {
        F.p(textView, "<this>");
        F.p(action, "action");
        b bVar = new b(action);
        textView.addTextChangedListener(bVar);
        return bVar;
    }

    @l3.d
    public static final TextWatcher d(@l3.d TextView textView, @l3.d X2.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, H0> action) {
        F.p(textView, "<this>");
        F.p(action, "action");
        c cVar = new c(action);
        textView.addTextChangedListener(cVar);
        return cVar;
    }

    @l3.d
    public static final TextWatcher e(@l3.d TextView textView, @l3.d X2.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, H0> action) {
        F.p(textView, "<this>");
        F.p(action, "action");
        d dVar = new d(action);
        textView.addTextChangedListener(dVar);
        return dVar;
    }
}
