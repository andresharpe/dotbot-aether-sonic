package androidx.window.layout;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.annotation.i0;
import androidx.window.core.SpecificationComputer;
import androidx.window.layout.q;
import androidx.window.layout.r;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    public static final a f20887b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final String f20888c = t.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final SpecificationComputer.VerificationMode f20889a;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @i0
        @SuppressLint({"BanUncheckedReflection"})
        public final int a(@l3.d SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.F.p(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    if (invoke != null) {
                        return ((Integer) invoke).intValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public final int b(@l3.d SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.F.p(sidecarDeviceState, "sidecarDeviceState");
            int a4 = a(sidecarDeviceState);
            if (a4 < 0 || a4 > 4) {
                return 0;
            }
            return a4;
        }

        @i0
        @l3.d
        @SuppressLint({"BanUncheckedReflection"})
        public final List<SidecarDisplayFeature> c(@l3.d SidecarWindowLayoutInfo info) {
            List<SidecarDisplayFeature> H3;
            List<SidecarDisplayFeature> H4;
            kotlin.jvm.internal.F.p(info, "info");
            try {
                try {
                    List<SidecarDisplayFeature> list = info.displayFeatures;
                    if (list == null) {
                        H4 = CollectionsKt__CollectionsKt.H();
                        return H4;
                    }
                    return list;
                } catch (NoSuchFieldError unused) {
                    Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(info, new Object[0]);
                    if (invoke != null) {
                        return (List) invoke;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                H3 = CollectionsKt__CollectionsKt.H();
                return H3;
            }
        }

        @i0
        @SuppressLint({"BanUncheckedReflection"})
        public final void d(@l3.d SidecarDeviceState sidecarDeviceState, int i4) {
            kotlin.jvm.internal.F.p(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i4;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i4));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @i0
        @SuppressLint({"BanUncheckedReflection"})
        public final void e(@l3.d SidecarWindowLayoutInfo info, @l3.d List<SidecarDisplayFeature> displayFeatures) {
            kotlin.jvm.internal.F.p(info, "info");
            kotlin.jvm.internal.F.p(displayFeatures, "displayFeatures");
            try {
                try {
                    info.displayFeatures = displayFeatures;
                } catch (NoSuchFieldError unused) {
                    SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(info, displayFeatures);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends Lambda implements X2.l<SidecarDisplayFeature, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f20890F = new b();

        b() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d SidecarDisplayFeature require) {
            kotlin.jvm.internal.F.p(require, "$this$require");
            boolean z3 = true;
            if (require.getType() != 1 && require.getType() != 2) {
                z3 = false;
            }
            return Boolean.valueOf(z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends Lambda implements X2.l<SidecarDisplayFeature, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        public static final c f20891F = new c();

        c() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d SidecarDisplayFeature require) {
            boolean z3;
            kotlin.jvm.internal.F.p(require, "$this$require");
            if (require.getRect().width() == 0 && require.getRect().height() == 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            return Boolean.valueOf(z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends Lambda implements X2.l<SidecarDisplayFeature, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        public static final d f20892F = new d();

        d() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d SidecarDisplayFeature require) {
            kotlin.jvm.internal.F.p(require, "$this$require");
            boolean z3 = true;
            if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
                z3 = false;
            }
            return Boolean.valueOf(z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends Lambda implements X2.l<SidecarDisplayFeature, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        public static final e f20893F = new e();

        e() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d SidecarDisplayFeature require) {
            boolean z3;
            kotlin.jvm.internal.F.p(require, "$this$require");
            if (require.getRect().left != 0 && require.getRect().top != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            return Boolean.valueOf(z3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (kotlin.jvm.internal.F.g(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return kotlin.jvm.internal.F.g(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    private final boolean c(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            if (!b(list.get(i4), list2.get(i4))) {
                return false;
            }
            i4 = i5;
        }
        return true;
    }

    public final boolean a(@l3.e SidecarDeviceState sidecarDeviceState, @l3.e SidecarDeviceState sidecarDeviceState2) {
        if (kotlin.jvm.internal.F.g(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        a aVar = f20887b;
        if (aVar.b(sidecarDeviceState) == aVar.b(sidecarDeviceState2)) {
            return true;
        }
        return false;
    }

    public final boolean d(@l3.e SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @l3.e SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (kotlin.jvm.internal.F.g(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        a aVar = f20887b;
        return c(aVar.c(sidecarWindowLayoutInfo), aVar.c(sidecarWindowLayoutInfo2));
    }

    @l3.d
    public final B e(@l3.e SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @l3.d SidecarDeviceState state) {
        List H3;
        kotlin.jvm.internal.F.p(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            H3 = CollectionsKt__CollectionsKt.H();
            return new B(H3);
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        a aVar = f20887b;
        aVar.d(sidecarDeviceState, aVar.b(state));
        return new B(f(aVar.c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    @l3.d
    public final List<l> f(@l3.d List<SidecarDisplayFeature> sidecarDisplayFeatures, @l3.d SidecarDeviceState deviceState) {
        kotlin.jvm.internal.F.p(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        kotlin.jvm.internal.F.p(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            l g4 = g((SidecarDisplayFeature) it.next(), deviceState);
            if (g4 != null) {
                arrayList.add(g4);
            }
        }
        return arrayList;
    }

    @l3.e
    public final l g(@l3.d SidecarDisplayFeature feature, @l3.d SidecarDeviceState deviceState) {
        r.b a4;
        q.c cVar;
        kotlin.jvm.internal.F.p(feature, "feature");
        kotlin.jvm.internal.F.p(deviceState, "deviceState");
        SpecificationComputer.a aVar = SpecificationComputer.f20723a;
        String TAG = f20888c;
        kotlin.jvm.internal.F.o(TAG, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) SpecificationComputer.a.b(aVar, feature, TAG, this.f20889a, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f20890F).c("Feature bounds must not be 0", c.f20891F).c("TYPE_FOLD must have 0 area", d.f20892F).c("Feature be pinned to either left or top", e.f20893F).a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type != 1) {
            if (type != 2) {
                return null;
            }
            a4 = r.b.f20876b.b();
        } else {
            a4 = r.b.f20876b.a();
        }
        int b4 = f20887b.b(deviceState);
        if (b4 == 0 || b4 == 1) {
            return null;
        }
        if (b4 != 2) {
            if (b4 != 3) {
                if (b4 == 4) {
                    return null;
                }
                cVar = q.c.f20869c;
            } else {
                cVar = q.c.f20869c;
            }
        } else {
            cVar = q.c.f20870d;
        }
        Rect rect = feature.getRect();
        kotlin.jvm.internal.F.o(rect, "feature.rect");
        return new r(new androidx.window.core.b(rect), a4, cVar);
    }

    public t(@l3.d SpecificationComputer.VerificationMode verificationMode) {
        kotlin.jvm.internal.F.p(verificationMode, "verificationMode");
        this.f20889a = verificationMode;
    }

    public /* synthetic */ t(SpecificationComputer.VerificationMode verificationMode, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? SpecificationComputer.VerificationMode.QUIET : verificationMode);
    }
}
