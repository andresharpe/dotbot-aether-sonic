package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.core.location.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0735a {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f12598a = 0;

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f12599b = 1;

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f12600c = 2;

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f12601d = 3;

    /* renamed from: e, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f12602e = 4;

    /* renamed from: f, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f12603f = 5;

    /* renamed from: g, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f12604g = 6;

    /* renamed from: h, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f12605h = 7;

    /* renamed from: androidx.core.location.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0089a {
        public void a(@F(from = 0) int i4) {
        }

        public void b(@N AbstractC0735a abstractC0735a) {
        }

        public void c() {
        }

        public void d() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: androidx.core.location.a$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    @N
    @W(24)
    public static AbstractC0735a n(@N GnssStatus gnssStatus) {
        return new C0736b(gnssStatus);
    }

    @N
    @SuppressLint({"ReferencesDeprecated"})
    public static AbstractC0735a o(@N GpsStatus gpsStatus) {
        return new C0737c(gpsStatus);
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 360.0d)
    public abstract float a(@F(from = 0) int i4);

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 63.0d)
    public abstract float b(@F(from = 0) int i4);

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n)
    public abstract float c(@F(from = 0) int i4);

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 63.0d)
    public abstract float d(@F(from = 0) int i4);

    public abstract int e(@F(from = 0) int i4);

    @InterfaceC0580x(from = -90.0d, to = 90.0d)
    public abstract float f(@F(from = 0) int i4);

    @F(from = 0)
    public abstract int g();

    @F(from = 1, to = 200)
    public abstract int h(@F(from = 0) int i4);

    public abstract boolean i(@F(from = 0) int i4);

    public abstract boolean j(@F(from = 0) int i4);

    public abstract boolean k(@F(from = 0) int i4);

    public abstract boolean l(@F(from = 0) int i4);

    public abstract boolean m(@F(from = 0) int i4);
}
