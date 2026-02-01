package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.InterfaceC0562e;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.preference.Preference;
import androidx.preference.q;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: I0, reason: collision with root package name */
    private static final String f16685I0 = "ListPreference";

    /* renamed from: D0, reason: collision with root package name */
    private CharSequence[] f16686D0;

    /* renamed from: E0, reason: collision with root package name */
    private CharSequence[] f16687E0;

    /* renamed from: F0, reason: collision with root package name */
    private String f16688F0;

    /* renamed from: G0, reason: collision with root package name */
    private String f16689G0;

    /* renamed from: H0, reason: collision with root package name */
    private boolean f16690H0;

    /* loaded from: classes.dex */
    public static final class b implements Preference.g<ListPreference> {

        /* renamed from: a, reason: collision with root package name */
        private static b f16692a;

        private b() {
        }

        @N
        public static b b() {
            if (f16692a == null) {
                f16692a = new b();
            }
            return f16692a;
        }

        @Override // androidx.preference.Preference.g
        @P
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(@N ListPreference listPreference) {
            if (TextUtils.isEmpty(listPreference.F1())) {
                return listPreference.m().getString(q.i.f17075c);
            }
            return listPreference.F1();
        }
    }

    public ListPreference(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.k.f17249z, i4, i5);
        this.f16686D0 = androidx.core.content.res.n.q(obtainStyledAttributes, q.k.f17118C, q.k.f17112A);
        this.f16687E0 = androidx.core.content.res.n.q(obtainStyledAttributes, q.k.f17121D, q.k.f17115B);
        int i6 = q.k.f17124E;
        if (androidx.core.content.res.n.b(obtainStyledAttributes, i6, i6, false)) {
            a1(b.b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, q.k.f17142K, i4, i5);
        this.f16689G0 = androidx.core.content.res.n.o(obtainStyledAttributes2, q.k.f17229s0, q.k.f17158S);
        obtainStyledAttributes2.recycle();
    }

    private int I1() {
        return D1(this.f16688F0);
    }

    public int D1(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.f16687E0) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.f16687E0[length].toString(), str)) {
                    return length;
                }
            }
            return -1;
        }
        return -1;
    }

    public CharSequence[] E1() {
        return this.f16686D0;
    }

    @P
    public CharSequence F1() {
        CharSequence[] charSequenceArr;
        int I12 = I1();
        if (I12 >= 0 && (charSequenceArr = this.f16686D0) != null) {
            return charSequenceArr[I12];
        }
        return null;
    }

    public CharSequence[] G1() {
        return this.f16687E0;
    }

    public String H1() {
        return this.f16688F0;
    }

    public void J1(@InterfaceC0562e int i4) {
        K1(m().getResources().getTextArray(i4));
    }

    @Override // androidx.preference.Preference
    @P
    public CharSequence K() {
        if (L() != null) {
            return L().a(this);
        }
        CharSequence F12 = F1();
        CharSequence K3 = super.K();
        String str = this.f16689G0;
        if (str == null) {
            return K3;
        }
        Object[] objArr = new Object[1];
        if (F12 == null) {
            F12 = "";
        }
        objArr[0] = F12;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, K3)) {
            return K3;
        }
        Log.w(f16685I0, "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    public void K1(CharSequence[] charSequenceArr) {
        this.f16686D0 = charSequenceArr;
    }

    public void L1(@InterfaceC0562e int i4) {
        M1(m().getResources().getTextArray(i4));
    }

    public void M1(CharSequence[] charSequenceArr) {
        this.f16687E0 = charSequenceArr;
    }

    public void N1(String str) {
        boolean z3 = !TextUtils.equals(this.f16688F0, str);
        if (z3 || !this.f16690H0) {
            this.f16688F0 = str;
            this.f16690H0 = true;
            w0(str);
            if (z3) {
                X();
            }
        }
    }

    public void O1(int i4) {
        CharSequence[] charSequenceArr = this.f16687E0;
        if (charSequenceArr != null) {
            N1(charSequenceArr[i4].toString());
        }
    }

    @Override // androidx.preference.Preference
    public void Z0(@P CharSequence charSequence) {
        super.Z0(charSequence);
        if (charSequence == null) {
            this.f16689G0 = null;
        } else {
            this.f16689G0 = charSequence.toString();
        }
    }

    @Override // androidx.preference.Preference
    protected Object h0(@N TypedArray typedArray, int i4) {
        return typedArray.getString(i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void l0(@P Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(a.class)) {
            a aVar = (a) parcelable;
            super.l0(aVar.getSuperState());
            N1(aVar.f16691E);
            return;
        }
        super.l0(parcelable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    @P
    public Parcelable m0() {
        Parcelable m02 = super.m0();
        if (S()) {
            return m02;
        }
        a aVar = new a(m02);
        aVar.f16691E = H1();
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected void n0(Object obj) {
        N1(E((String) obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0158a();

        /* renamed from: E, reason: collision with root package name */
        String f16691E;

        /* renamed from: androidx.preference.ListPreference$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0158a implements Parcelable.Creator<a> {
            C0158a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i4) {
                return new a[i4];
            }
        }

        a(Parcel parcel) {
            super(parcel);
            this.f16691E = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@N Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeString(this.f16691E);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(@N Context context, @P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public ListPreference(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.n.a(context, q.a.f17017k, R.attr.dialogPreferenceStyle));
    }

    public ListPreference(@N Context context) {
        this(context, null);
    }
}
