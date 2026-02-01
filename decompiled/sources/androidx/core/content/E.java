package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import androidx.annotation.W;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private final String f12161a;

    /* renamed from: b, reason: collision with root package name */
    private final LocusId f12162b;

    @W(ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    private static class a {
        private a() {
        }

        @androidx.annotation.N
        static LocusId a(@androidx.annotation.N String str) {
            return new LocusId(str);
        }

        @androidx.annotation.N
        static String b(@androidx.annotation.N LocusId locusId) {
            return locusId.getId();
        }
    }

    public E(@androidx.annotation.N String str) {
        this.f12161a = (String) androidx.core.util.u.q(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f12162b = a.a(str);
        } else {
            this.f12162b = null;
        }
    }

    @androidx.annotation.N
    private String b() {
        return this.f12161a.length() + "_chars";
    }

    @androidx.annotation.N
    @W(ConstraintLayout.b.a.f9571D)
    public static E d(@androidx.annotation.N LocusId locusId) {
        androidx.core.util.u.m(locusId, "locusId cannot be null");
        return new E((String) androidx.core.util.u.q(a.b(locusId), "id cannot be empty"));
    }

    @androidx.annotation.N
    public String a() {
        return this.f12161a;
    }

    @androidx.annotation.N
    @W(ConstraintLayout.b.a.f9571D)
    public LocusId c() {
        return this.f12162b;
    }

    public boolean equals(@androidx.annotation.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e4 = (E) obj;
        String str = this.f12161a;
        if (str == null) {
            if (e4.f12161a == null) {
                return true;
            }
            return false;
        }
        return str.equals(e4.f12161a);
    }

    public int hashCode() {
        int hashCode;
        String str = this.f12161a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    @androidx.annotation.N
    public String toString() {
        return "LocusIdCompat[" + b() + "]";
    }
}
