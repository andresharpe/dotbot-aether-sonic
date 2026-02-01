package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.preference.Preference;
import androidx.preference.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: G0, reason: collision with root package name */
    private static final String f16801G0 = "PreferenceGroup";

    /* renamed from: A0, reason: collision with root package name */
    private boolean f16802A0;

    /* renamed from: B0, reason: collision with root package name */
    private int f16803B0;

    /* renamed from: C0, reason: collision with root package name */
    private boolean f16804C0;

    /* renamed from: D0, reason: collision with root package name */
    private int f16805D0;

    /* renamed from: E0, reason: collision with root package name */
    private b f16806E0;

    /* renamed from: F0, reason: collision with root package name */
    private final Runnable f16807F0;

    /* renamed from: x0, reason: collision with root package name */
    final androidx.collection.l<String, Long> f16808x0;

    /* renamed from: y0, reason: collision with root package name */
    private final Handler f16809y0;

    /* renamed from: z0, reason: collision with root package name */
    private final List<Preference> f16810z0;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f16808x0.clear();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    public interface c {
        int e(@N Preference preference);

        int g(@N String str);
    }

    public PreferenceGroup(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f16808x0 = new androidx.collection.l<>();
        this.f16809y0 = new Handler(Looper.getMainLooper());
        this.f16802A0 = true;
        this.f16803B0 = 0;
        this.f16804C0 = false;
        this.f16805D0 = Integer.MAX_VALUE;
        this.f16806E0 = null;
        this.f16807F0 = new a();
        this.f16810z0 = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.k.f17128F0, i4, i5);
        int i6 = q.k.f17137I0;
        this.f16802A0 = androidx.core.content.res.n.b(obtainStyledAttributes, i6, i6, true);
        if (obtainStyledAttributes.hasValue(q.k.f17134H0)) {
            int i7 = q.k.f17134H0;
            B1(androidx.core.content.res.n.d(obtainStyledAttributes, i7, i7, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    private boolean z1(@N Preference preference) {
        boolean remove;
        synchronized (this) {
            try {
                preference.k0();
                if (preference.z() == this) {
                    preference.b(null);
                }
                remove = this.f16810z0.remove(preference);
                if (remove) {
                    String u3 = preference.u();
                    if (u3 != null) {
                        this.f16808x0.put(u3, Long.valueOf(preference.s()));
                        this.f16809y0.removeCallbacks(this.f16807F0);
                        this.f16809y0.post(this.f16807F0);
                    }
                    if (this.f16804C0) {
                        preference.g0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return remove;
    }

    public boolean A1(@N CharSequence charSequence) {
        Preference o12 = o1(charSequence);
        if (o12 == null) {
            return false;
        }
        return o12.z().y1(o12);
    }

    public void B1(int i4) {
        if (i4 != Integer.MAX_VALUE && !O()) {
            Log.e(f16801G0, getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f16805D0 = i4;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void C1(@P b bVar) {
        this.f16806E0 = bVar;
    }

    public void D1(boolean z3) {
        this.f16802A0 = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E1() {
        synchronized (this) {
            Collections.sort(this.f16810z0);
        }
    }

    @Override // androidx.preference.Preference
    public void Y(boolean z3) {
        super.Y(z3);
        int s12 = s1();
        for (int i4 = 0; i4 < s12; i4++) {
            r1(i4).j0(this, z3);
        }
    }

    @Override // androidx.preference.Preference
    public void a0() {
        super.a0();
        this.f16804C0 = true;
        int s12 = s1();
        for (int i4 = 0; i4 < s12; i4++) {
            r1(i4).a0();
        }
    }

    @Override // androidx.preference.Preference
    public void g0() {
        super.g0();
        this.f16804C0 = false;
        int s12 = s1();
        for (int i4 = 0; i4 < s12; i4++) {
            r1(i4).g0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void i(@N Bundle bundle) {
        super.i(bundle);
        int s12 = s1();
        for (int i4 = 0; i4 < s12; i4++) {
            r1(i4).i(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void j(@N Bundle bundle) {
        super.j(bundle);
        int s12 = s1();
        for (int i4 = 0; i4 < s12; i4++) {
            r1(i4).j(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void l0(@P Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(d.class)) {
            d dVar = (d) parcelable;
            this.f16805D0 = dVar.f16812E;
            super.l0(dVar.getSuperState());
            return;
        }
        super.l0(parcelable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    @N
    public Parcelable m0() {
        return new d(super.m0(), this.f16805D0);
    }

    public void m1(@N Preference preference) {
        n1(preference);
    }

    public boolean n1(@N Preference preference) {
        long h4;
        if (this.f16810z0.contains(preference)) {
            return true;
        }
        if (preference.u() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.z() != null) {
                preferenceGroup = preferenceGroup.z();
            }
            String u3 = preference.u();
            if (preferenceGroup.o1(u3) != null) {
                Log.e(f16801G0, "Found duplicated key: \"" + u3 + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.y() == Integer.MAX_VALUE) {
            if (this.f16802A0) {
                int i4 = this.f16803B0;
                this.f16803B0 = i4 + 1;
                preference.S0(i4);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).D1(this.f16802A0);
            }
        }
        int binarySearch = Collections.binarySearch(this.f16810z0, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        if (!w1(preference)) {
            return false;
        }
        synchronized (this) {
            this.f16810z0.add(binarySearch, preference);
        }
        n H3 = H();
        String u4 = preference.u();
        if (u4 != null && this.f16808x0.containsKey(u4)) {
            h4 = this.f16808x0.get(u4).longValue();
            this.f16808x0.remove(u4);
        } else {
            h4 = H3.h();
        }
        preference.c0(H3, h4);
        preference.b(this);
        if (this.f16804C0) {
            preference.a0();
        }
        Z();
        return true;
    }

    @P
    public <T extends Preference> T o1(@N CharSequence charSequence) {
        T t3;
        if (charSequence != null) {
            if (TextUtils.equals(u(), charSequence)) {
                return this;
            }
            int s12 = s1();
            for (int i4 = 0; i4 < s12; i4++) {
                PreferenceGroup preferenceGroup = (T) r1(i4);
                if (TextUtils.equals(preferenceGroup.u(), charSequence)) {
                    return preferenceGroup;
                }
                if ((preferenceGroup instanceof PreferenceGroup) && (t3 = (T) preferenceGroup.o1(charSequence)) != null) {
                    return t3;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Key cannot be null");
    }

    public int p1() {
        return this.f16805D0;
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public b q1() {
        return this.f16806E0;
    }

    @N
    public Preference r1(int i4) {
        return this.f16810z0.get(i4);
    }

    public int s1() {
        return this.f16810z0.size();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean t1() {
        return this.f16804C0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean u1() {
        return true;
    }

    public boolean v1() {
        return this.f16802A0;
    }

    protected boolean w1(@N Preference preference) {
        preference.j0(this, g1());
        return true;
    }

    public void x1() {
        synchronized (this) {
            try {
                List<Preference> list = this.f16810z0;
                for (int size = list.size() - 1; size >= 0; size--) {
                    z1(list.get(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Z();
    }

    public boolean y1(@N Preference preference) {
        boolean z12 = z1(preference);
        Z();
        return z12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d extends Preference.b {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        int f16812E;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i4) {
                return new d[i4];
            }
        }

        d(Parcel parcel) {
            super(parcel);
            this.f16812E = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f16812E);
        }

        d(Parcelable parcelable, int i4) {
            super(parcelable);
            this.f16812E = i4;
        }
    }

    public PreferenceGroup(@N Context context, @P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public PreferenceGroup(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
