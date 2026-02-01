package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.preference.Preference;
import androidx.preference.q;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: D0, reason: collision with root package name */
    private String f16674D0;

    /* renamed from: E0, reason: collision with root package name */
    @P
    private a f16675E0;

    /* loaded from: classes.dex */
    public interface a {
        void a(@N EditText editText);
    }

    /* loaded from: classes.dex */
    public static final class c implements Preference.g<EditTextPreference> {

        /* renamed from: a, reason: collision with root package name */
        private static c f16677a;

        private c() {
        }

        @N
        public static c b() {
            if (f16677a == null) {
                f16677a = new c();
            }
            return f16677a;
        }

        @Override // androidx.preference.Preference.g
        @P
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(@N EditTextPreference editTextPreference) {
            if (TextUtils.isEmpty(editTextPreference.E1())) {
                return editTextPreference.m().getString(q.i.f17075c);
            }
            return editTextPreference.E1();
        }
    }

    public EditTextPreference(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.k.f17243x, i4, i5);
        int i6 = q.k.f17246y;
        if (androidx.core.content.res.n.b(obtainStyledAttributes, i6, i6, false)) {
            a1(c.b());
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public a D1() {
        return this.f16675E0;
    }

    @P
    public String E1() {
        return this.f16674D0;
    }

    public void F1(@P a aVar) {
        this.f16675E0 = aVar;
    }

    public void G1(@P String str) {
        boolean g12 = g1();
        this.f16674D0 = str;
        w0(str);
        boolean g13 = g1();
        if (g13 != g12) {
            Y(g13);
        }
        X();
    }

    @Override // androidx.preference.Preference
    public boolean g1() {
        if (!TextUtils.isEmpty(this.f16674D0) && !super.g1()) {
            return false;
        }
        return true;
    }

    @Override // androidx.preference.Preference
    protected Object h0(@N TypedArray typedArray, int i4) {
        return typedArray.getString(i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void l0(@P Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(b.class)) {
            b bVar = (b) parcelable;
            super.l0(bVar.getSuperState());
            G1(bVar.f16676E);
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
        b bVar = new b(m02);
        bVar.f16676E = E1();
        return bVar;
    }

    @Override // androidx.preference.Preference
    protected void n0(Object obj) {
        G1(E((String) obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends Preference.b {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        String f16676E;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i4) {
                return new b[i4];
            }
        }

        b(Parcel parcel) {
            super(parcel);
            this.f16676E = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeString(this.f16676E);
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(@N Context context, @P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public EditTextPreference(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.n.a(context, q.a.f17021o, R.attr.editTextPreferenceStyle));
    }

    public EditTextPreference(@N Context context) {
        this(context, null);
    }
}
