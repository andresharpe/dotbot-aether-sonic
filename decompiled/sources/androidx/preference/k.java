package androidx.preference;

import java.util.Iterator;
import kotlin.H0;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class k {

    /* loaded from: classes.dex */
    public static final class a implements kotlin.sequences.m<Preference> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PreferenceGroup f16933a;

        a(PreferenceGroup preferenceGroup) {
            this.f16933a = preferenceGroup;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<Preference> iterator() {
            return k.j(this.f16933a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Iterator<Preference>, Y2.d {

        /* renamed from: E, reason: collision with root package name */
        private int f16934E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ PreferenceGroup f16935F;

        b(PreferenceGroup preferenceGroup) {
            this.f16935F = preferenceGroup;
        }

        @Override // java.util.Iterator
        @l3.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Preference next() {
            PreferenceGroup preferenceGroup = this.f16935F;
            int i4 = this.f16934E;
            this.f16934E = i4 + 1;
            Preference r12 = preferenceGroup.r1(i4);
            F.o(r12, "getPreference(index++)");
            return r12;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f16934E < this.f16935F.s1()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            PreferenceGroup preferenceGroup = this.f16935F;
            int i4 = this.f16934E - 1;
            this.f16934E = i4;
            preferenceGroup.y1(preferenceGroup.r1(i4));
        }
    }

    public static final boolean a(@l3.d PreferenceGroup preferenceGroup, @l3.d Preference preference) {
        F.p(preferenceGroup, "<this>");
        F.p(preference, "preference");
        int s12 = preferenceGroup.s1();
        int i4 = 0;
        while (i4 < s12) {
            int i5 = i4 + 1;
            if (F.g(preferenceGroup.r1(i4), preference)) {
                return true;
            }
            i4 = i5;
        }
        return false;
    }

    public static final void b(@l3.d PreferenceGroup preferenceGroup, @l3.d X2.l<? super Preference, H0> action) {
        F.p(preferenceGroup, "<this>");
        F.p(action, "action");
        int s12 = preferenceGroup.s1();
        for (int i4 = 0; i4 < s12; i4++) {
            action.C(d(preferenceGroup, i4));
        }
    }

    public static final void c(@l3.d PreferenceGroup preferenceGroup, @l3.d X2.p<? super Integer, ? super Preference, H0> action) {
        F.p(preferenceGroup, "<this>");
        F.p(action, "action");
        int s12 = preferenceGroup.s1();
        for (int i4 = 0; i4 < s12; i4++) {
            action.c0(Integer.valueOf(i4), d(preferenceGroup, i4));
        }
    }

    @l3.d
    public static final Preference d(@l3.d PreferenceGroup preferenceGroup, int i4) {
        F.p(preferenceGroup, "<this>");
        Preference r12 = preferenceGroup.r1(i4);
        F.o(r12, "getPreference(index)");
        return r12;
    }

    @l3.e
    public static final <T extends Preference> T e(@l3.d PreferenceGroup preferenceGroup, @l3.d CharSequence key) {
        F.p(preferenceGroup, "<this>");
        F.p(key, "key");
        return (T) preferenceGroup.o1(key);
    }

    @l3.d
    public static final kotlin.sequences.m<Preference> f(@l3.d PreferenceGroup preferenceGroup) {
        F.p(preferenceGroup, "<this>");
        return new a(preferenceGroup);
    }

    public static final int g(@l3.d PreferenceGroup preferenceGroup) {
        F.p(preferenceGroup, "<this>");
        return preferenceGroup.s1();
    }

    public static final boolean h(@l3.d PreferenceGroup preferenceGroup) {
        F.p(preferenceGroup, "<this>");
        if (preferenceGroup.s1() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean i(@l3.d PreferenceGroup preferenceGroup) {
        F.p(preferenceGroup, "<this>");
        if (preferenceGroup.s1() != 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final Iterator<Preference> j(@l3.d PreferenceGroup preferenceGroup) {
        F.p(preferenceGroup, "<this>");
        return new b(preferenceGroup);
    }

    public static final void k(@l3.d PreferenceGroup preferenceGroup, @l3.d Preference preference) {
        F.p(preferenceGroup, "<this>");
        F.p(preference, "preference");
        preferenceGroup.y1(preference);
    }

    public static final void l(@l3.d PreferenceGroup preferenceGroup, @l3.d Preference preference) {
        F.p(preferenceGroup, "<this>");
        F.p(preference, "preference");
        preferenceGroup.n1(preference);
    }
}
