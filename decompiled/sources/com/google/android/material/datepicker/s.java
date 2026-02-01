package com.google.android.material.datepicker;

import T0.a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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
public class s implements f<Long> {
    public static final Parcelable.Creator<s> CREATOR = new b();

    /* renamed from: E, reason: collision with root package name */
    @P
    private Long f32262E;

    /* loaded from: classes2.dex */
    class a extends e {

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ p f32263L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, com.google.android.material.datepicker.a aVar, p pVar) {
            super(str, dateFormat, textInputLayout, aVar);
            this.f32263L = pVar;
        }

        @Override // com.google.android.material.datepicker.e
        void e() {
            this.f32263L.a();
        }

        @Override // com.google.android.material.datepicker.e
        void f(@P Long l4) {
            if (l4 == null) {
                s.this.c();
            } else {
                s.this.a0(l4.longValue());
            }
            this.f32263L.b(s.this.V());
        }
    }

    /* loaded from: classes2.dex */
    class b implements Parcelable.Creator<s> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s createFromParcel(@N Parcel parcel) {
            s sVar = new s();
            sVar.f32262E = (Long) parcel.readValue(Long.class.getClassLoader());
            return sVar;
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s[] newArray(int i4) {
            return new s[i4];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f32262E = null;
    }

    @Override // com.google.android.material.datepicker.f
    public int A(Context context) {
        return com.google.android.material.resources.b.g(context, a.c.Za, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.f
    public boolean F() {
        if (this.f32262E != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.datepicker.f
    @N
    public Collection<Long> H() {
        ArrayList arrayList = new ArrayList();
        Long l4 = this.f32262E;
        if (l4 != null) {
            arrayList.add(l4);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.f
    public void a0(long j4) {
        this.f32262E = Long.valueOf(j4);
    }

    @Override // com.google.android.material.datepicker.f
    @P
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long V() {
        return this.f32262E;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void k(@P Long l4) {
        Long valueOf;
        if (l4 == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(v.a(l4.longValue()));
        }
        this.f32262E = valueOf;
    }

    @Override // com.google.android.material.datepicker.f
    @N
    public String f(@N Context context) {
        Resources resources = context.getResources();
        Long l4 = this.f32262E;
        if (l4 == null) {
            return resources.getString(a.m.f3060L0);
        }
        return resources.getString(a.m.f3056J0, g.j(l4.longValue()));
    }

    @Override // com.google.android.material.datepicker.f
    @N
    public Collection<androidx.core.util.q<Long, Long>> j() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.f
    public View p(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, @P Bundle bundle, com.google.android.material.datepicker.a aVar, @N p<Long> pVar) {
        View inflate = layoutInflater.inflate(a.k.f2943M0, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(a.h.x3);
        EditText editText = textInputLayout.getEditText();
        if (com.google.android.material.internal.i.a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat p4 = v.p();
        String q4 = v.q(inflate.getResources(), p4);
        textInputLayout.setPlaceholderText(q4);
        Long l4 = this.f32262E;
        if (l4 != null) {
            editText.setText(p4.format(l4));
        }
        editText.addTextChangedListener(new a(q4, p4, textInputLayout, aVar, pVar));
        E.p(editText);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.f
    public int t() {
        return a.m.f3058K0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        parcel.writeValue(this.f32262E);
    }
}
