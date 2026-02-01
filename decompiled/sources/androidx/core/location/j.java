package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.annotation.Y;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.AbstractC0735a;
import androidx.core.location.j;
import androidx.core.os.C0742e;
import androidx.core.os.C0746i;
import androidx.core.util.InterfaceC0764e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final long f12635a = 30000;

    /* renamed from: b, reason: collision with root package name */
    private static final long f12636b = 10000;

    /* renamed from: c, reason: collision with root package name */
    private static final long f12637c = 5;

    /* renamed from: d, reason: collision with root package name */
    private static Field f12638d;

    /* renamed from: e, reason: collision with root package name */
    private static Class<?> f12639e;

    /* renamed from: f, reason: collision with root package name */
    private static Method f12640f;

    /* renamed from: g, reason: collision with root package name */
    private static Method f12641g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.annotation.B("sLocationListeners")
    static final WeakHashMap<k, WeakReference<l>> f12642h = new WeakHashMap<>();

    @W(19)
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Class<?> f12643a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f12644b;

        private a() {
        }

        @InterfaceC0577u
        static boolean a(LocationManager locationManager, String str, C c4, androidx.core.location.f fVar, Looper looper) {
            try {
                if (f12643a == null) {
                    f12643a = Class.forName("android.location.LocationRequest");
                }
                if (f12644b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f12643a, LocationListener.class, Looper.class);
                    f12644b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i4 = c4.i(str);
                if (i4 != null) {
                    f12644b.invoke(locationManager, i4, fVar, looper);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        @Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @InterfaceC0577u
        static boolean b(LocationManager locationManager, String str, C c4, l lVar) {
            try {
                if (f12643a == null) {
                    f12643a = Class.forName("android.location.LocationRequest");
                }
                if (f12644b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f12643a, LocationListener.class, Looper.class);
                    f12644b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i4 = c4.i(str);
                if (i4 != null) {
                    synchronized (j.f12642h) {
                        f12644b.invoke(locationManager, i4, lVar, Looper.getMainLooper());
                        j.p(locationManager, lVar);
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(24)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @Y("android.permission.ACCESS_FINE_LOCATION")
        @InterfaceC0577u
        static boolean a(@N LocationManager locationManager, @N GnssMeasurementsEvent.Callback callback, @N Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        @Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @InterfaceC0577u
        static boolean b(LocationManager locationManager, Handler handler, Executor executor, AbstractC0735a.AbstractC0089a abstractC0089a) {
            boolean z3;
            if (handler != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            androidx.core.util.u.a(z3);
            androidx.collection.l<Object, Object> lVar = g.f12653a;
            synchronized (lVar) {
                try {
                    m mVar = (m) lVar.get(abstractC0089a);
                    if (mVar == null) {
                        mVar = new m(abstractC0089a);
                    } else {
                        mVar.j();
                    }
                    mVar.i(executor);
                    if (!locationManager.registerGnssStatusCallback(mVar, handler)) {
                        return false;
                    }
                    lVar.put(abstractC0089a, mVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @InterfaceC0577u
        static void c(@N LocationManager locationManager, @N GnssMeasurementsEvent.Callback callback) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
        }

        @InterfaceC0577u
        static void d(LocationManager locationManager, Object obj) {
            if (obj instanceof m) {
                ((m) obj).j();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    @W(28)
    /* loaded from: classes.dex */
    private static class c {
        private c() {
        }

        @InterfaceC0577u
        static String a(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        @InterfaceC0577u
        static int b(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        @InterfaceC0577u
        static boolean c(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @W(30)
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private static Class<?> f12645a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f12646b;

        private d() {
        }

        @Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @InterfaceC0577u
        static void a(LocationManager locationManager, @N String str, @P C0742e c0742e, @N Executor executor, @N final InterfaceC0764e<Location> interfaceC0764e) {
            CancellationSignal cancellationSignal;
            if (c0742e != null) {
                cancellationSignal = (CancellationSignal) c0742e.b();
            } else {
                cancellationSignal = null;
            }
            Objects.requireNonNull(interfaceC0764e);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new Consumer() { // from class: androidx.core.location.k
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    InterfaceC0764e.this.accept((Location) obj);
                }
            });
        }

        @Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @InterfaceC0577u
        public static boolean b(LocationManager locationManager, Handler handler, Executor executor, AbstractC0735a.AbstractC0089a abstractC0089a) {
            androidx.collection.l<Object, Object> lVar = g.f12653a;
            synchronized (lVar) {
                try {
                    h hVar = (h) lVar.get(abstractC0089a);
                    if (hVar == null) {
                        hVar = new h(abstractC0089a);
                    }
                    if (locationManager.registerGnssStatusCallback(executor, hVar)) {
                        lVar.put(abstractC0089a, hVar);
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @InterfaceC0577u
        public static boolean c(LocationManager locationManager, String str, C c4, Executor executor, androidx.core.location.f fVar) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (f12645a == null) {
                        f12645a = Class.forName("android.location.LocationRequest");
                    }
                    if (f12646b == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f12645a, Executor.class, LocationListener.class);
                        f12646b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest i4 = c4.i(str);
                    if (i4 != null) {
                        f12646b.invoke(locationManager, i4, executor, fVar);
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    @W(ConstraintLayout.b.a.f9573F)
    /* loaded from: classes.dex */
    private static class e {
        private e() {
        }

        @InterfaceC0577u
        static boolean a(LocationManager locationManager, @N String str) {
            return locationManager.hasProvider(str);
        }

        @Y("android.permission.ACCESS_FINE_LOCATION")
        @InterfaceC0577u
        static boolean b(@N LocationManager locationManager, @N Executor executor, @N GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }

        @Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @InterfaceC0577u
        static void c(LocationManager locationManager, @N String str, @N LocationRequest locationRequest, @N Executor executor, @N LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class f implements LocationListener {

        /* renamed from: a, reason: collision with root package name */
        private final LocationManager f12647a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f12648b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f12649c = new Handler(Looper.getMainLooper());

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC0764e<Location> f12650d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.B("this")
        private boolean f12651e;

        /* renamed from: f, reason: collision with root package name */
        @P
        Runnable f12652f;

        f(LocationManager locationManager, Executor executor, InterfaceC0764e<Location> interfaceC0764e) {
            this.f12647a = locationManager;
            this.f12648b = executor;
            this.f12650d = interfaceC0764e;
        }

        @Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        private void d() {
            this.f12650d = null;
            this.f12647a.removeUpdates(this);
            Runnable runnable = this.f12652f;
            if (runnable != null) {
                this.f12649c.removeCallbacks(runnable);
                this.f12652f = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            this.f12652f = null;
            onLocationChanged((Location) null);
        }

        @Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void c() {
            synchronized (this) {
                try {
                    if (this.f12651e) {
                        return;
                    }
                    this.f12651e = true;
                    d();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @SuppressLint({"MissingPermission"})
        public void g(long j4) {
            synchronized (this) {
                try {
                    if (this.f12651e) {
                        return;
                    }
                    Runnable runnable = new Runnable() { // from class: androidx.core.location.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            j.f.this.f();
                        }
                    };
                    this.f12652f = runnable;
                    this.f12649c.postDelayed(runnable, j4);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.location.LocationListener
        @Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(@P final Location location) {
            synchronized (this) {
                try {
                    if (this.f12651e) {
                        return;
                    }
                    this.f12651e = true;
                    final InterfaceC0764e<Location> interfaceC0764e = this.f12650d;
                    this.f12648b.execute(new Runnable() { // from class: androidx.core.location.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC0764e.this.accept(location);
                        }
                    });
                    d();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.location.LocationListener
        @Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(@N String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@N String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i4, Bundle bundle) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.B("sGnssStatusListeners")
        static final androidx.collection.l<Object, Object> f12653a = new androidx.collection.l<>();

        private g() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @W(30)
    /* loaded from: classes.dex */
    public static class h extends GnssStatus.Callback {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC0735a.AbstractC0089a f12654a;

        h(AbstractC0735a.AbstractC0089a abstractC0089a) {
            boolean z3;
            if (abstractC0089a != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            androidx.core.util.u.b(z3, "invalid null callback");
            this.f12654a = abstractC0089a;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i4) {
            this.f12654a.a(i4);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f12654a.b(AbstractC0735a.n(gnssStatus));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.f12654a.c();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.f12654a.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class i implements GpsStatus.Listener {

        /* renamed from: a, reason: collision with root package name */
        private final LocationManager f12655a;

        /* renamed from: b, reason: collision with root package name */
        final AbstractC0735a.AbstractC0089a f12656b;

        /* renamed from: c, reason: collision with root package name */
        @P
        volatile Executor f12657c;

        i(LocationManager locationManager, AbstractC0735a.AbstractC0089a abstractC0089a) {
            boolean z3;
            if (abstractC0089a != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            androidx.core.util.u.b(z3, "invalid null callback");
            this.f12655a = locationManager;
            this.f12656b = abstractC0089a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Executor executor) {
            if (this.f12657c != executor) {
                return;
            }
            this.f12656b.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Executor executor) {
            if (this.f12657c != executor) {
                return;
            }
            this.f12656b.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Executor executor, int i4) {
            if (this.f12657c != executor) {
                return;
            }
            this.f12656b.a(i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Executor executor, AbstractC0735a abstractC0735a) {
            if (this.f12657c != executor) {
                return;
            }
            this.f12656b.b(abstractC0735a);
        }

        public void i(Executor executor) {
            boolean z3;
            if (this.f12657c == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            androidx.core.util.u.n(z3);
            this.f12657c = executor;
        }

        public void j() {
            this.f12657c = null;
        }

        @Override // android.location.GpsStatus.Listener
        @Y("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int i4) {
            GpsStatus gpsStatus;
            final Executor executor = this.f12657c;
            if (executor == null) {
                return;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4 && (gpsStatus = this.f12655a.getGpsStatus(null)) != null) {
                            final AbstractC0735a o4 = AbstractC0735a.o(gpsStatus);
                            executor.execute(new Runnable() { // from class: androidx.core.location.q
                                @Override // java.lang.Runnable
                                public final void run() {
                                    j.i.this.h(executor, o4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    GpsStatus gpsStatus2 = this.f12655a.getGpsStatus(null);
                    if (gpsStatus2 != null) {
                        final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                        executor.execute(new Runnable() { // from class: androidx.core.location.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                j.i.this.g(executor, timeToFirstFix);
                            }
                        });
                        return;
                    }
                    return;
                }
                executor.execute(new Runnable() { // from class: androidx.core.location.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.i.this.f(executor);
                    }
                });
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.n
                @Override // java.lang.Runnable
                public final void run() {
                    j.i.this.e(executor);
                }
            });
        }
    }

    /* renamed from: androidx.core.location.j$j, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class ExecutorC0091j implements Executor {

        /* renamed from: E, reason: collision with root package name */
        private final Handler f12658E;

        ExecutorC0091j(@N Handler handler) {
            this.f12658E = (Handler) androidx.core.util.u.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@N Runnable runnable) {
            if (Looper.myLooper() == this.f12658E.getLooper()) {
                runnable.run();
            } else {
                if (this.f12658E.post((Runnable) androidx.core.util.u.l(runnable))) {
                    return;
                }
                throw new RejectedExecutionException(this.f12658E + " is shutting down");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        final String f12659a;

        /* renamed from: b, reason: collision with root package name */
        final androidx.core.location.f f12660b;

        k(String str, androidx.core.location.f fVar) {
            this.f12659a = (String) androidx.core.util.p.e(str, "invalid null provider");
            this.f12660b = (androidx.core.location.f) androidx.core.util.p.e(fVar, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (!this.f12659a.equals(kVar.f12659a) || !this.f12660b.equals(kVar.f12660b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return androidx.core.util.p.b(this.f12659a, this.f12660b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @W(24)
    /* loaded from: classes.dex */
    public static class m extends GnssStatus.Callback {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC0735a.AbstractC0089a f12663a;

        /* renamed from: b, reason: collision with root package name */
        @P
        volatile Executor f12664b;

        m(AbstractC0735a.AbstractC0089a abstractC0089a) {
            boolean z3;
            if (abstractC0089a != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            androidx.core.util.u.b(z3, "invalid null callback");
            this.f12663a = abstractC0089a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Executor executor, int i4) {
            if (this.f12664b != executor) {
                return;
            }
            this.f12663a.a(i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Executor executor, GnssStatus gnssStatus) {
            if (this.f12664b != executor) {
                return;
            }
            this.f12663a.b(AbstractC0735a.n(gnssStatus));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Executor executor) {
            if (this.f12664b != executor) {
                return;
            }
            this.f12663a.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Executor executor) {
            if (this.f12664b != executor) {
                return;
            }
            this.f12663a.d();
        }

        public void i(Executor executor) {
            boolean z3;
            boolean z4 = false;
            if (executor != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            androidx.core.util.u.b(z3, "invalid null executor");
            if (this.f12664b == null) {
                z4 = true;
            }
            androidx.core.util.u.n(z4);
            this.f12664b = executor;
        }

        public void j() {
            this.f12664b = null;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i4) {
            final Executor executor = this.f12664b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.x
                @Override // java.lang.Runnable
                public final void run() {
                    j.m.this.e(executor, i4);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.f12664b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.y
                @Override // java.lang.Runnable
                public final void run() {
                    j.m.this.f(executor, gnssStatus);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final Executor executor = this.f12664b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.A
                @Override // java.lang.Runnable
                public final void run() {
                    j.m.this.g(executor);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final Executor executor = this.f12664b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.z
                @Override // java.lang.Runnable
                public final void run() {
                    j.m.this.h(executor);
                }
            });
        }
    }

    private j() {
    }

    @Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void c(@N LocationManager locationManager, @N String str, @P C0742e c0742e, @N Executor executor, @N final InterfaceC0764e<Location> interfaceC0764e) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.a(locationManager, str, c0742e, executor, interfaceC0764e);
            return;
        }
        if (c0742e != null) {
            c0742e.e();
        }
        final Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && SystemClock.elapsedRealtime() - androidx.core.location.d.c(lastKnownLocation) < 10000) {
            executor.execute(new Runnable() { // from class: androidx.core.location.g
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC0764e.this.accept(lastKnownLocation);
                }
            });
            return;
        }
        final f fVar = new f(locationManager, executor, interfaceC0764e);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, fVar, Looper.getMainLooper());
        if (c0742e != null) {
            c0742e.d(new C0742e.b() { // from class: androidx.core.location.h
                @Override // androidx.core.os.C0742e.b
                public final void onCancel() {
                    j.f.this.c();
                }
            });
        }
        fVar.g(30000L);
    }

    @P
    public static String d(@N LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(locationManager);
        }
        return null;
    }

    public static int e(@N LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.b(locationManager);
        }
        return 0;
    }

    public static boolean f(@N LocationManager locationManager, @N String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.a(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            if (locationManager.getProvider(str) != null) {
                return true;
            }
            return false;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean g(@N LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.c(locationManager);
        }
        if (!locationManager.isProviderEnabled("network") && !locationManager.isProviderEnabled("gps")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean i(LocationManager locationManager, i iVar) throws Exception {
        return Boolean.valueOf(locationManager.addGpsStatusListener(iVar));
    }

    @Y("android.permission.ACCESS_FINE_LOCATION")
    @W(24)
    public static boolean j(@N LocationManager locationManager, @N GnssMeasurementsEvent.Callback callback, @N Handler handler) {
        if (Build.VERSION.SDK_INT != 30) {
            return b.a(locationManager, callback, handler);
        }
        return l(locationManager, C0746i.a(handler), callback);
    }

    @Y("android.permission.ACCESS_FINE_LOCATION")
    @W(30)
    public static boolean k(@N LocationManager locationManager, @N Executor executor, @N GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT > 30) {
            return e.b(locationManager, executor, callback);
        }
        return l(locationManager, executor, callback);
    }

    @W(30)
    private static boolean l(@N LocationManager locationManager, @N Executor executor, @N GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT == 30) {
            try {
                if (f12639e == null) {
                    f12639e = Class.forName("android.location.GnssRequest$Builder");
                }
                if (f12640f == null) {
                    Method declaredMethod = f12639e.getDeclaredMethod("build", new Class[0]);
                    f12640f = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                if (f12641g == null) {
                    Method declaredMethod2 = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", Class.forName("android.location.GnssRequest"), Executor.class, GnssMeasurementsEvent.Callback.class);
                    f12641g = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                Object invoke = f12641g.invoke(locationManager, f12640f.invoke(f12639e.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]), executor, callback);
                if (invoke == null) {
                    return false;
                }
                if (!((Boolean) invoke).booleanValue()) {
                    return false;
                }
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                return false;
            }
        }
        throw new IllegalStateException();
    }

    @Y("android.permission.ACCESS_FINE_LOCATION")
    private static boolean m(LocationManager locationManager, Handler handler, Executor executor, AbstractC0735a.AbstractC0089a abstractC0089a) {
        if (Build.VERSION.SDK_INT >= 30) {
            return d.b(locationManager, handler, executor, abstractC0089a);
        }
        return b.b(locationManager, handler, executor, abstractC0089a);
    }

    @Y("android.permission.ACCESS_FINE_LOCATION")
    public static boolean n(@N LocationManager locationManager, @N AbstractC0735a.AbstractC0089a abstractC0089a, @N Handler handler) {
        if (Build.VERSION.SDK_INT >= 30) {
            return o(locationManager, C0746i.a(handler), abstractC0089a);
        }
        return o(locationManager, new ExecutorC0091j(handler), abstractC0089a);
    }

    @Y("android.permission.ACCESS_FINE_LOCATION")
    public static boolean o(@N LocationManager locationManager, @N Executor executor, @N AbstractC0735a.AbstractC0089a abstractC0089a) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m(locationManager, null, executor, abstractC0089a);
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return m(locationManager, new Handler(myLooper), executor, abstractC0089a);
    }

    @Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.B("sLocationListeners")
    static void p(LocationManager locationManager, l lVar) {
        l lVar2;
        WeakReference<l> put = f12642h.put(lVar.g(), new WeakReference<>(lVar));
        if (put != null) {
            lVar2 = put.get();
        } else {
            lVar2 = null;
        }
        if (lVar2 != null) {
            lVar2.n();
            locationManager.removeUpdates(lVar2);
        }
    }

    @Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void q(@N LocationManager locationManager, @N androidx.core.location.f fVar) {
        WeakHashMap<k, WeakReference<l>> weakHashMap = f12642h;
        synchronized (weakHashMap) {
            try {
                Iterator<WeakReference<l>> it = weakHashMap.values().iterator();
                ArrayList arrayList = null;
                while (it.hasNext()) {
                    l lVar = it.next().get();
                    if (lVar != null) {
                        k g4 = lVar.g();
                        if (g4.f12660b == fVar) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(g4);
                            lVar.n();
                            locationManager.removeUpdates(lVar);
                        }
                    }
                }
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        f12642h.remove((k) it2.next());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        locationManager.removeUpdates(fVar);
    }

    @Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void r(@N LocationManager locationManager, @N String str, @N C c4, @N androidx.core.location.f fVar, @N Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            e.c(locationManager, str, c4.h(), C0746i.a(new Handler(looper)), fVar);
        } else {
            if (a.a(locationManager, str, c4, fVar, looper)) {
                return;
            }
            locationManager.requestLocationUpdates(str, c4.b(), c4.e(), fVar, looper);
        }
    }

    @Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void s(@N LocationManager locationManager, @N String str, @N C c4, @N Executor executor, @N androidx.core.location.f fVar) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            e.c(locationManager, str, c4.h(), executor, fVar);
            return;
        }
        if (i4 >= 30 && d.c(locationManager, str, c4, executor, fVar)) {
            return;
        }
        l lVar = new l(new k(str, fVar), executor);
        if (a.b(locationManager, str, c4, lVar)) {
            return;
        }
        synchronized (f12642h) {
            locationManager.requestLocationUpdates(str, c4.b(), c4.e(), lVar, Looper.getMainLooper());
            p(locationManager, lVar);
        }
    }

    @W(24)
    public static void t(@N LocationManager locationManager, @N GnssMeasurementsEvent.Callback callback) {
        b.c(locationManager, callback);
    }

    public static void u(@N LocationManager locationManager, @N AbstractC0735a.AbstractC0089a abstractC0089a) {
        androidx.collection.l<Object, Object> lVar = g.f12653a;
        synchronized (lVar) {
            try {
                Object remove = lVar.remove(abstractC0089a);
                if (remove != null) {
                    b.d(locationManager, remove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l implements LocationListener {

        /* renamed from: a, reason: collision with root package name */
        @P
        volatile k f12661a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f12662b;

        l(@P k kVar, Executor executor) {
            this.f12661a = kVar;
            this.f12662b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(int i4) {
            k kVar = this.f12661a;
            if (kVar == null) {
                return;
            }
            kVar.f12660b.onFlushComplete(i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Location location) {
            k kVar = this.f12661a;
            if (kVar == null) {
                return;
            }
            kVar.f12660b.onLocationChanged(location);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(List list) {
            k kVar = this.f12661a;
            if (kVar == null) {
                return;
            }
            kVar.f12660b.onLocationChanged((List<Location>) list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(String str) {
            k kVar = this.f12661a;
            if (kVar == null) {
                return;
            }
            kVar.f12660b.onProviderDisabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(String str) {
            k kVar = this.f12661a;
            if (kVar == null) {
                return;
            }
            kVar.f12660b.onProviderEnabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(String str, int i4, Bundle bundle) {
            k kVar = this.f12661a;
            if (kVar == null) {
                return;
            }
            kVar.f12660b.onStatusChanged(str, i4, bundle);
        }

        public k g() {
            return (k) androidx.core.util.p.d(this.f12661a);
        }

        public void n() {
            this.f12661a = null;
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i4) {
            if (this.f12661a == null) {
                return;
            }
            this.f12662b.execute(new Runnable() { // from class: androidx.core.location.v
                @Override // java.lang.Runnable
                public final void run() {
                    j.l.this.h(i4);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@N final Location location) {
            if (this.f12661a == null) {
                return;
            }
            this.f12662b.execute(new Runnable() { // from class: androidx.core.location.u
                @Override // java.lang.Runnable
                public final void run() {
                    j.l.this.i(location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(@N final String str) {
            if (this.f12661a == null) {
                return;
            }
            this.f12662b.execute(new Runnable() { // from class: androidx.core.location.s
                @Override // java.lang.Runnable
                public final void run() {
                    j.l.this.k(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@N final String str) {
            if (this.f12661a == null) {
                return;
            }
            this.f12662b.execute(new Runnable() { // from class: androidx.core.location.r
                @Override // java.lang.Runnable
                public final void run() {
                    j.l.this.l(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i4, final Bundle bundle) {
            if (this.f12661a == null) {
                return;
            }
            this.f12662b.execute(new Runnable() { // from class: androidx.core.location.w
                @Override // java.lang.Runnable
                public final void run() {
                    j.l.this.m(str, i4, bundle);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@N final List<Location> list) {
            if (this.f12661a == null) {
                return;
            }
            this.f12662b.execute(new Runnable() { // from class: androidx.core.location.t
                @Override // java.lang.Runnable
                public final void run() {
                    j.l.this.j(list);
                }
            });
        }
    }
}
