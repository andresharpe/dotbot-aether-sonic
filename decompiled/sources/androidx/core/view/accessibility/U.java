package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public interface U {

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        Bundle f13410a;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void a(@androidx.annotation.P Bundle bundle) {
            this.f13410a = bundle;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {
        public boolean b() {
            return this.f13410a.getBoolean(M.f13300R);
        }

        public int c() {
            return this.f13410a.getInt(M.f13298P);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a {
        @androidx.annotation.P
        public String b() {
            return this.f13410a.getString(M.f13299Q);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends a {
        public int b() {
            return this.f13410a.getInt(M.f13307Y);
        }

        public int c() {
            return this.f13410a.getInt(M.f13308Z);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends a {
        public int b() {
            return this.f13410a.getInt(M.f13305W);
        }

        public int c() {
            return this.f13410a.getInt(M.f13304V);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends a {
        public float b() {
            return this.f13410a.getFloat(M.f13306X);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends a {
        public int b() {
            return this.f13410a.getInt(M.f13302T);
        }

        public int c() {
            return this.f13410a.getInt(M.f13301S);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends a {
        @androidx.annotation.P
        public CharSequence b() {
            return this.f13410a.getCharSequence(M.f13303U);
        }
    }

    boolean a(@androidx.annotation.N View view, @androidx.annotation.P a aVar);
}
