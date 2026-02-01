package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: A0, reason: collision with root package name */
    private boolean f16843A0;

    /* renamed from: B0, reason: collision with root package name */
    private boolean f16844B0;

    /* renamed from: x0, reason: collision with root package name */
    protected boolean f16845x0;

    /* renamed from: y0, reason: collision with root package name */
    private CharSequence f16846y0;

    /* renamed from: z0, reason: collision with root package name */
    private CharSequence f16847z0;

    public TwoStatePreference(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void e0() {
        super.e0();
        boolean z3 = !p1();
        if (e(Boolean.valueOf(z3))) {
            q1(z3);
        }
    }

    @Override // androidx.preference.Preference
    public boolean g1() {
        if (!this.f16844B0 ? this.f16845x0 : !this.f16845x0) {
            if (!super.g1()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.preference.Preference
    @P
    protected Object h0(@N TypedArray typedArray, int i4) {
        return Boolean.valueOf(typedArray.getBoolean(i4, false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void l0(@P Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(a.class)) {
            a aVar = (a) parcelable;
            super.l0(aVar.getSuperState());
            q1(aVar.f16848E);
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
        aVar.f16848E = p1();
        return aVar;
    }

    public boolean m1() {
        return this.f16844B0;
    }

    @Override // androidx.preference.Preference
    protected void n0(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        q1(A(((Boolean) obj).booleanValue()));
    }

    @P
    public CharSequence n1() {
        return this.f16847z0;
    }

    @P
    public CharSequence o1() {
        return this.f16846y0;
    }

    public boolean p1() {
        return this.f16845x0;
    }

    public void q1(boolean z3) {
        boolean z4;
        if (this.f16845x0 != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || !this.f16843A0) {
            this.f16845x0 = z3;
            this.f16843A0 = true;
            s0(z3);
            if (z4) {
                Y(g1());
                X();
            }
        }
    }

    public void r1(boolean z3) {
        this.f16844B0 = z3;
    }

    public void s1(int i4) {
        t1(m().getString(i4));
    }

    public void t1(@P CharSequence charSequence) {
        this.f16847z0 = charSequence;
        if (!p1()) {
            X();
        }
    }

    public void u1(int i4) {
        v1(m().getString(i4));
    }

    public void v1(@P CharSequence charSequence) {
        this.f16846y0 = charSequence;
        if (p1()) {
            X();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w1(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f16845x0
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.f16846y0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.f16846y0
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.f16845x0
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f16847z0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f16847z0
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.K()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.w1(android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void x1(@N p pVar) {
        w1(pVar.S(R.id.summary));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0160a();

        /* renamed from: E, reason: collision with root package name */
        boolean f16848E;

        /* renamed from: androidx.preference.TwoStatePreference$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0160a implements Parcelable.Creator<a> {
            C0160a() {
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
            this.f16848E = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f16848E ? 1 : 0);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(@N Context context, @P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public TwoStatePreference(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(@N Context context) {
        this(context, null);
    }
}
