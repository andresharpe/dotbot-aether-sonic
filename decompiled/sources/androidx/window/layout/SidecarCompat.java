package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.i0;
import androidx.window.layout.n;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.H0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C2197u;

/* loaded from: classes.dex */
public final class SidecarCompat implements n {

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    public static final a f20826f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private static final String f20827g = "SidecarCompat";

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private final SidecarInterface f20828a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final t f20829b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final Map<IBinder, Activity> f20830c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final Map<Activity, ComponentCallbacks> f20831d;

    /* renamed from: e, reason: collision with root package name */
    @l3.e
    private n.a f20832e;

    @kotlin.E(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lkotlin/H0;", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "token", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "Landroidx/window/layout/t;", "a", "Landroidx/window/layout/t;", "sidecarAdapter", com.harman.log.b.f47574c, "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "callbackInterface", "Ljava/util/concurrent/locks/ReentrantLock;", "c", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "d", "Landroidx/window/sidecar/SidecarDeviceState;", "lastDeviceState", "Ljava/util/WeakHashMap;", "e", "Ljava/util/WeakHashMap;", "mActivityWindowLayoutInfo", "<init>", "(Landroidx/window/layout/t;Landroidx/window/sidecar/SidecarInterface$SidecarCallback;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    private static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final t f20833a;

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        private final SidecarInterface.SidecarCallback f20834b;

        /* renamed from: c, reason: collision with root package name */
        @l3.d
        private final ReentrantLock f20835c;

        /* renamed from: d, reason: collision with root package name */
        @l3.e
        @androidx.annotation.B("lock")
        private SidecarDeviceState f20836d;

        /* renamed from: e, reason: collision with root package name */
        @l3.d
        @androidx.annotation.B("mLock")
        private final WeakHashMap<IBinder, SidecarWindowLayoutInfo> f20837e;

        public DistinctSidecarElementCallback(@l3.d t sidecarAdapter, @l3.d SidecarInterface.SidecarCallback callbackInterface) {
            kotlin.jvm.internal.F.p(sidecarAdapter, "sidecarAdapter");
            kotlin.jvm.internal.F.p(callbackInterface, "callbackInterface");
            this.f20833a = sidecarAdapter;
            this.f20834b = callbackInterface;
            this.f20835c = new ReentrantLock();
            this.f20837e = new WeakHashMap<>();
        }

        public void onDeviceStateChanged(@l3.d SidecarDeviceState newDeviceState) {
            kotlin.jvm.internal.F.p(newDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.f20835c;
            reentrantLock.lock();
            try {
                if (this.f20833a.a(this.f20836d, newDeviceState)) {
                    return;
                }
                this.f20836d = newDeviceState;
                this.f20834b.onDeviceStateChanged(newDeviceState);
                H0 h02 = H0.f51801a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(@l3.d IBinder token, @l3.d SidecarWindowLayoutInfo newLayout) {
            kotlin.jvm.internal.F.p(token, "token");
            kotlin.jvm.internal.F.p(newLayout, "newLayout");
            synchronized (this.f20835c) {
                if (this.f20833a.d(this.f20837e.get(token), newLayout)) {
                    return;
                }
                this.f20837e.put(token, newLayout);
                this.f20834b.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    @kotlin.E(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lkotlin/H0;", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "<init>", "(Landroidx/window/layout/SidecarCompat;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SidecarCompat f20838a;

        public TranslatingCallback(SidecarCompat this$0) {
            kotlin.jvm.internal.F.p(this$0, "this$0");
            this.f20838a = this$0;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(@l3.d SidecarDeviceState newDeviceState) {
            SidecarInterface h4;
            kotlin.jvm.internal.F.p(newDeviceState, "newDeviceState");
            Collection<Activity> values = this.f20838a.f20830c.values();
            SidecarCompat sidecarCompat = this.f20838a;
            for (Activity activity : values) {
                IBinder a4 = SidecarCompat.f20826f.a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (a4 != null && (h4 = sidecarCompat.h()) != null) {
                    sidecarWindowLayoutInfo = h4.getWindowLayoutInfo(a4);
                }
                n.a aVar = sidecarCompat.f20832e;
                if (aVar != null) {
                    aVar.a(activity, sidecarCompat.f20829b.e(sidecarWindowLayoutInfo, newDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(@l3.d IBinder windowToken, @l3.d SidecarWindowLayoutInfo newLayout) {
            SidecarDeviceState deviceState;
            kotlin.jvm.internal.F.p(windowToken, "windowToken");
            kotlin.jvm.internal.F.p(newLayout, "newLayout");
            Activity activity = (Activity) this.f20838a.f20830c.get(windowToken);
            if (activity != null) {
                t tVar = this.f20838a.f20829b;
                SidecarInterface h4 = this.f20838a.h();
                if (h4 == null) {
                    deviceState = null;
                } else {
                    deviceState = h4.getDeviceState();
                }
                if (deviceState == null) {
                    deviceState = new SidecarDeviceState();
                }
                B e4 = tVar.e(newLayout, deviceState);
                n.a aVar = this.f20838a.f20832e;
                if (aVar != null) {
                    aVar.a(activity, e4);
                    return;
                }
                return;
            }
            Log.w(SidecarCompat.f20827g, "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.e
        public final IBinder a(@l3.e Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        @l3.e
        public final SidecarInterface b(@l3.d Context context) {
            kotlin.jvm.internal.F.p(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        @l3.e
        public final androidx.window.core.h c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return androidx.window.core.h.f20742J.e(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements n.a {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final n.a f20839a;

        /* renamed from: b, reason: collision with root package name */
        @l3.d
        private final ReentrantLock f20840b;

        /* renamed from: c, reason: collision with root package name */
        @l3.d
        @androidx.annotation.B("mLock")
        private final WeakHashMap<Activity, B> f20841c;

        public b(@l3.d n.a callbackInterface) {
            kotlin.jvm.internal.F.p(callbackInterface, "callbackInterface");
            this.f20839a = callbackInterface;
            this.f20840b = new ReentrantLock();
            this.f20841c = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.n.a
        public void a(@l3.d Activity activity, @l3.d B newLayout) {
            kotlin.jvm.internal.F.p(activity, "activity");
            kotlin.jvm.internal.F.p(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.f20840b;
            reentrantLock.lock();
            try {
                if (kotlin.jvm.internal.F.g(newLayout, this.f20841c.get(activity))) {
                    return;
                }
                this.f20841c.put(activity, newLayout);
                reentrantLock.unlock();
                this.f20839a.a(activity, newLayout);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final SidecarCompat f20842E;

        /* renamed from: F, reason: collision with root package name */
        @l3.d
        private final WeakReference<Activity> f20843F;

        public c(@l3.d SidecarCompat sidecarCompat, @l3.d Activity activity) {
            kotlin.jvm.internal.F.p(sidecarCompat, "sidecarCompat");
            kotlin.jvm.internal.F.p(activity, "activity");
            this.f20842E = sidecarCompat;
            this.f20843F = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@l3.d View view) {
            kotlin.jvm.internal.F.p(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.f20843F.get();
            IBinder a4 = SidecarCompat.f20826f.a(activity);
            if (activity == null || a4 == null) {
                return;
            }
            this.f20842E.j(a4, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@l3.d View view) {
            kotlin.jvm.internal.F.p(view, "view");
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements ComponentCallbacks {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Activity f20845F;

        d(Activity activity) {
            this.f20845F = activity;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@l3.d Configuration newConfig) {
            kotlin.jvm.internal.F.p(newConfig, "newConfig");
            n.a aVar = SidecarCompat.this.f20832e;
            if (aVar != null) {
                Activity activity = this.f20845F;
                aVar.a(activity, SidecarCompat.this.i(activity));
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    @i0
    public SidecarCompat(@i0 @l3.e SidecarInterface sidecarInterface, @l3.d t sidecarAdapter) {
        kotlin.jvm.internal.F.p(sidecarAdapter, "sidecarAdapter");
        this.f20828a = sidecarInterface;
        this.f20829b = sidecarAdapter;
        this.f20830c = new LinkedHashMap();
        this.f20831d = new LinkedHashMap();
    }

    private final void k(Activity activity) {
        if (this.f20831d.get(activity) == null) {
            d dVar = new d(activity);
            this.f20831d.put(activity, dVar);
            activity.registerComponentCallbacks(dVar);
        }
    }

    private final void l(Activity activity) {
        activity.unregisterComponentCallbacks(this.f20831d.get(activity));
        this.f20831d.remove(activity);
    }

    @Override // androidx.window.layout.n
    public void a(@l3.d Activity activity) {
        kotlin.jvm.internal.F.p(activity, "activity");
        IBinder a4 = f20826f.a(activity);
        if (a4 != null) {
            j(a4, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    @Override // androidx.window.layout.n
    public void b(@l3.d n.a extensionCallback) {
        kotlin.jvm.internal.F.p(extensionCallback, "extensionCallback");
        this.f20832e = new b(extensionCallback);
        SidecarInterface sidecarInterface = this.f20828a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.f20829b, new TranslatingCallback(this)));
        }
    }

    @Override // androidx.window.layout.n
    public void c(@l3.d Activity activity) {
        boolean z3;
        SidecarInterface sidecarInterface;
        kotlin.jvm.internal.F.p(activity, "activity");
        IBinder a4 = f20826f.a(activity);
        if (a4 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f20828a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a4);
        }
        l(activity);
        if (this.f20830c.size() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f20830c.remove(a4);
        if (z3 && (sidecarInterface = this.f20828a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[Catch: all -> 0x0192, TRY_LEAVE, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0162 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a4 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016e A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0080 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017a A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0059 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0186 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0020 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008a, B:36:0x00a8, B:38:0x00ae, B:41:0x00b4, B:42:0x00ea, B:44:0x0106, B:49:0x0109, B:51:0x0138, B:53:0x0142, B:54:0x0149, B:55:0x014a, B:56:0x0151, B:58:0x00b7, B:60:0x00e2, B:62:0x0152, B:63:0x0159, B:64:0x015a, B:65:0x0161, B:66:0x0162, B:67:0x016d, B:68:0x00a4, B:69:0x0090, B:72:0x0097, B:73:0x016e, B:74:0x0179, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017a, B:81:0x0185, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x0186, B:90:0x0191, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #1, #2 }] */
    @Override // androidx.window.layout.n
    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d() {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.d():boolean");
    }

    @l3.e
    public final SidecarInterface h() {
        return this.f20828a;
    }

    @i0
    @l3.d
    public final B i(@l3.d Activity activity) {
        SidecarWindowLayoutInfo windowLayoutInfo;
        List H3;
        kotlin.jvm.internal.F.p(activity, "activity");
        IBinder a4 = f20826f.a(activity);
        if (a4 == null) {
            H3 = CollectionsKt__CollectionsKt.H();
            return new B(H3);
        }
        SidecarInterface sidecarInterface = this.f20828a;
        SidecarDeviceState sidecarDeviceState = null;
        if (sidecarInterface == null) {
            windowLayoutInfo = null;
        } else {
            windowLayoutInfo = sidecarInterface.getWindowLayoutInfo(a4);
        }
        t tVar = this.f20829b;
        SidecarInterface sidecarInterface2 = this.f20828a;
        if (sidecarInterface2 != null) {
            sidecarDeviceState = sidecarInterface2.getDeviceState();
        }
        if (sidecarDeviceState == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return tVar.e(windowLayoutInfo, sidecarDeviceState);
    }

    public final void j(@l3.d IBinder windowToken, @l3.d Activity activity) {
        SidecarInterface sidecarInterface;
        kotlin.jvm.internal.F.p(windowToken, "windowToken");
        kotlin.jvm.internal.F.p(activity, "activity");
        this.f20830c.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.f20828a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.f20830c.size() == 1 && (sidecarInterface = this.f20828a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        n.a aVar = this.f20832e;
        if (aVar != null) {
            aVar.a(activity, i(activity));
        }
        k(activity);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(@l3.d Context context) {
        this(f20826f.b(context), new t(null, 1, null));
        kotlin.jvm.internal.F.p(context, "context");
    }
}
