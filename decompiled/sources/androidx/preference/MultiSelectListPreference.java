package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.InterfaceC0562e;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.preference.Preference;
import androidx.preference.q;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: D0, reason: collision with root package name */
    private CharSequence[] f16700D0;

    /* renamed from: E0, reason: collision with root package name */
    private CharSequence[] f16701E0;

    /* renamed from: F0, reason: collision with root package name */
    private Set<String> f16702F0;

    public MultiSelectListPreference(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f16702F0 = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.k.f17127F, i4, i5);
        this.f16700D0 = androidx.core.content.res.n.q(obtainStyledAttributes, q.k.f17136I, q.k.f17130G);
        this.f16701E0 = androidx.core.content.res.n.q(obtainStyledAttributes, q.k.f17139J, q.k.f17133H);
        obtainStyledAttributes.recycle();
    }

    public int D1(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.f16701E0) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.f16701E0[length].toString(), str)) {
                    return length;
                }
            }
            return -1;
        }
        return -1;
    }

    public CharSequence[] E1() {
        return this.f16700D0;
    }

    public CharSequence[] F1() {
        return this.f16701E0;
    }

    protected boolean[] G1() {
        CharSequence[] charSequenceArr = this.f16701E0;
        int length = charSequenceArr.length;
        Set<String> set = this.f16702F0;
        boolean[] zArr = new boolean[length];
        for (int i4 = 0; i4 < length; i4++) {
            zArr[i4] = set.contains(charSequenceArr[i4].toString());
        }
        return zArr;
    }

    public Set<String> H1() {
        return this.f16702F0;
    }

    public void I1(@InterfaceC0562e int i4) {
        J1(m().getResources().getTextArray(i4));
    }

    public void J1(CharSequence[] charSequenceArr) {
        this.f16700D0 = charSequenceArr;
    }

    public void K1(@InterfaceC0562e int i4) {
        L1(m().getResources().getTextArray(i4));
    }

    public void L1(CharSequence[] charSequenceArr) {
        this.f16701E0 = charSequenceArr;
    }

    public void M1(Set<String> set) {
        this.f16702F0.clear();
        this.f16702F0.addAll(set);
        x0(set);
        X();
    }

    @Override // androidx.preference.Preference
    @P
    protected Object h0(@N TypedArray typedArray, int i4) {
        CharSequence[] textArray = typedArray.getTextArray(i4);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void l0(@P Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(a.class)) {
            a aVar = (a) parcelable;
            super.l0(aVar.getSuperState());
            M1(aVar.f16703E);
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
        aVar.f16703E = H1();
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected void n0(Object obj) {
        M1(F((Set) obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0159a();

        /* renamed from: E, reason: collision with root package name */
        Set<String> f16703E;

        /* renamed from: androidx.preference.MultiSelectListPreference$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0159a implements Parcelable.Creator<a> {
            C0159a() {
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
            int readInt = parcel.readInt();
            this.f16703E = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f16703E, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@N Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f16703E.size());
            Set<String> set = this.f16703E;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MultiSelectListPreference(@N Context context, @P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public MultiSelectListPreference(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.n.a(context, q.a.f17017k, R.attr.dialogPreferenceStyle));
    }

    public MultiSelectListPreference(@N Context context) {
        this(context, null);
    }
}
