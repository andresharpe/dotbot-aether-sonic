package com.google.android.material.datepicker;

import T0.a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import com.google.android.material.internal.E;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class r implements f<androidx.core.util.q<Long, Long>> {
    public static final Parcelable.Creator<r> CREATOR = new c();

    /* renamed from: E, reason: collision with root package name */
    private String f32248E;

    /* renamed from: F, reason: collision with root package name */
    private final String f32249F = " ";

    /* renamed from: G, reason: collision with root package name */
    @P
    private Long f32250G = null;

    /* renamed from: H, reason: collision with root package name */
    @P
    private Long f32251H = null;

    /* renamed from: I, reason: collision with root package name */
    @P
    private Long f32252I = null;

    /* renamed from: J, reason: collision with root package name */
    @P
    private Long f32253J = null;

    /* loaded from: classes2.dex */
    class a extends e {

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f32254L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f32255M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ p f32256N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, com.google.android.material.datepicker.a aVar, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, p pVar) {
            super(str, dateFormat, textInputLayout, aVar);
            this.f32254L = textInputLayout2;
            this.f32255M = textInputLayout3;
            this.f32256N = pVar;
        }

        @Override // com.google.android.material.datepicker.e
        void e() {
            r.this.f32252I = null;
            r.this.n(this.f32254L, this.f32255M, this.f32256N);
        }

        @Override // com.google.android.material.datepicker.e
        void f(@P Long l4) {
            r.this.f32252I = l4;
            r.this.n(this.f32254L, this.f32255M, this.f32256N);
        }
    }

    /* loaded from: classes2.dex */
    class b extends e {

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f32258L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f32259M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ p f32260N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, com.google.android.material.datepicker.a aVar, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, p pVar) {
            super(str, dateFormat, textInputLayout, aVar);
            this.f32258L = textInputLayout2;
            this.f32259M = textInputLayout3;
            this.f32260N = pVar;
        }

        @Override // com.google.android.material.datepicker.e
        void e() {
            r.this.f32253J = null;
            r.this.n(this.f32258L, this.f32259M, this.f32260N);
        }

        @Override // com.google.android.material.datepicker.e
        void f(@P Long l4) {
            r.this.f32253J = l4;
            r.this.n(this.f32258L, this.f32259M, this.f32260N);
        }
    }

    /* loaded from: classes2.dex */
    class c implements Parcelable.Creator<r> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r createFromParcel(@N Parcel parcel) {
            r rVar = new r();
            rVar.f32250G = (Long) parcel.readValue(Long.class.getClassLoader());
            rVar.f32251H = (Long) parcel.readValue(Long.class.getClassLoader());
            return rVar;
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r[] newArray(int i4) {
            return new r[i4];
        }
    }

    private void g(@N TextInputLayout textInputLayout, @N TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f32248E.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError(null);
        }
    }

    private boolean i(long j4, long j5) {
        return j4 <= j5;
    }

    private void l(@N TextInputLayout textInputLayout, @N TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f32248E);
        textInputLayout2.setError(" ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(@N TextInputLayout textInputLayout, @N TextInputLayout textInputLayout2, @N p<androidx.core.util.q<Long, Long>> pVar) {
        Long l4 = this.f32252I;
        if (l4 != null && this.f32253J != null) {
            if (i(l4.longValue(), this.f32253J.longValue())) {
                this.f32250G = this.f32252I;
                this.f32251H = this.f32253J;
                pVar.b(V());
                return;
            } else {
                l(textInputLayout, textInputLayout2);
                pVar.a();
                return;
            }
        }
        g(textInputLayout, textInputLayout2);
        pVar.a();
    }

    @Override // com.google.android.material.datepicker.f
    public int A(@N Context context) {
        int i4;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(a.f.f7)) {
            i4 = a.c.Za;
        } else {
            i4 = a.c.Oa;
        }
        return com.google.android.material.resources.b.g(context, i4, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.f
    public boolean F() {
        Long l4 = this.f32250G;
        if (l4 != null && this.f32251H != null && i(l4.longValue(), this.f32251H.longValue())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.datepicker.f
    @N
    public Collection<Long> H() {
        ArrayList arrayList = new ArrayList();
        Long l4 = this.f32250G;
        if (l4 != null) {
            arrayList.add(l4);
        }
        Long l5 = this.f32251H;
        if (l5 != null) {
            arrayList.add(l5);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.f
    public void a0(long j4) {
        Long l4 = this.f32250G;
        if (l4 == null) {
            this.f32250G = Long.valueOf(j4);
        } else if (this.f32251H == null && i(l4.longValue(), j4)) {
            this.f32251H = Long.valueOf(j4);
        } else {
            this.f32251H = null;
            this.f32250G = Long.valueOf(j4);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.f
    @N
    public String f(@N Context context) {
        Resources resources = context.getResources();
        Long l4 = this.f32250G;
        if (l4 == null && this.f32251H == null) {
            return resources.getString(a.m.f3084X0);
        }
        Long l5 = this.f32251H;
        if (l5 == null) {
            return resources.getString(a.m.f3078U0, g.c(l4.longValue()));
        }
        if (l4 == null) {
            return resources.getString(a.m.f3076T0, g.c(l5.longValue()));
        }
        androidx.core.util.q<String, String> a4 = g.a(l4, l5);
        return resources.getString(a.m.f3080V0, a4.f13025a, a4.f13026b);
    }

    @Override // com.google.android.material.datepicker.f
    @N
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public androidx.core.util.q<Long, Long> V() {
        return new androidx.core.util.q<>(this.f32250G, this.f32251H);
    }

    @Override // com.google.android.material.datepicker.f
    @N
    public Collection<androidx.core.util.q<Long, Long>> j() {
        if (this.f32250G != null && this.f32251H != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new androidx.core.util.q(this.f32250G, this.f32251H));
            return arrayList;
        }
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@N androidx.core.util.q<Long, Long> qVar) {
        Long valueOf;
        Long l4 = qVar.f13025a;
        if (l4 != null && qVar.f13026b != null) {
            androidx.core.util.u.a(i(l4.longValue(), qVar.f13026b.longValue()));
        }
        Long l5 = qVar.f13025a;
        Long l6 = null;
        if (l5 == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(v.a(l5.longValue()));
        }
        this.f32250G = valueOf;
        Long l7 = qVar.f13026b;
        if (l7 != null) {
            l6 = Long.valueOf(v.a(l7.longValue()));
        }
        this.f32251H = l6;
    }

    @Override // com.google.android.material.datepicker.f
    public View p(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle, com.google.android.material.datepicker.a aVar, @N p<androidx.core.util.q<Long, Long>> pVar) {
        View inflate = layoutInflater.inflate(a.k.f2945N0, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(a.h.z3);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(a.h.y3);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (com.google.android.material.internal.i.a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f32248E = inflate.getResources().getString(a.m.f3070Q0);
        SimpleDateFormat p4 = v.p();
        Long l4 = this.f32250G;
        if (l4 != null) {
            editText.setText(p4.format(l4));
            this.f32252I = this.f32250G;
        }
        Long l5 = this.f32251H;
        if (l5 != null) {
            editText2.setText(p4.format(l5));
            this.f32253J = this.f32251H;
        }
        String q4 = v.q(inflate.getResources(), p4);
        textInputLayout.setPlaceholderText(q4);
        textInputLayout2.setPlaceholderText(q4);
        editText.addTextChangedListener(new a(q4, p4, textInputLayout, aVar, textInputLayout, textInputLayout2, pVar));
        editText2.addTextChangedListener(new b(q4, p4, textInputLayout2, aVar, textInputLayout, textInputLayout2, pVar));
        E.p(editText);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.f
    public int t() {
        return a.m.f3082W0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        parcel.writeValue(this.f32250G);
        parcel.writeValue(this.f32251H);
    }
}
