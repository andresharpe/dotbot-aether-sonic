package com.google.android.gms.measurement;

import N0.a;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.N;
import androidx.annotation.Y;
import androidx.annotation.a0;
import androidx.annotation.j0;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.measurement.C1468p0;
import com.google.android.gms.measurement.internal.C1638f2;
import com.google.android.gms.measurement.internal.C1722t3;
import com.google.android.gms.measurement.internal.C2;
import com.google.android.gms.measurement.internal.G2;
import com.google.android.gms.measurement.internal.H2;
import com.google.android.gms.measurement.internal.InterfaceC1693o3;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@D
@I0.a
@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    @D
    @I0.a
    @N
    public static final String f30086b = "crash";

    /* renamed from: c, reason: collision with root package name */
    @D
    @I0.a
    @N
    public static final String f30087c = "fcm";

    /* renamed from: d, reason: collision with root package name */
    @D
    @I0.a
    @N
    public static final String f30088d = "fiam";

    /* renamed from: e, reason: collision with root package name */
    private static volatile AppMeasurement f30089e;

    /* renamed from: a, reason: collision with root package name */
    private final e f30090a;

    @D
    @I0.a
    /* loaded from: classes2.dex */
    public static class ConditionalUserProperty {

        @D
        @I0.a
        @Keep
        public boolean mActive;

        @D
        @Keep
        @N
        @I0.a
        public String mAppId;

        @D
        @I0.a
        @Keep
        public long mCreationTimestamp;

        @Keep
        @N
        public String mExpiredEventName;

        @Keep
        @N
        public Bundle mExpiredEventParams;

        @D
        @Keep
        @N
        @I0.a
        public String mName;

        @D
        @Keep
        @N
        @I0.a
        public String mOrigin;

        @D
        @I0.a
        @Keep
        public long mTimeToLive;

        @Keep
        @N
        public String mTimedOutEventName;

        @Keep
        @N
        public Bundle mTimedOutEventParams;

        @D
        @Keep
        @N
        @I0.a
        public String mTriggerEventName;

        @D
        @I0.a
        @Keep
        public long mTriggerTimeout;

        @Keep
        @N
        public String mTriggeredEventName;

        @Keep
        @N
        public Bundle mTriggeredEventParams;

        @D
        @I0.a
        @Keep
        public long mTriggeredTimestamp;

        @D
        @Keep
        @N
        @I0.a
        public Object mValue;

        @I0.a
        public ConditionalUserProperty() {
        }

        @com.google.android.gms.common.util.D
        ConditionalUserProperty(@N Bundle bundle) {
            C1285y.l(bundle);
            this.mAppId = (String) C2.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) C2.a(bundle, "origin", String.class, null);
            this.mName = (String) C2.a(bundle, a.C0015a.f1688b, String.class, null);
            this.mValue = C2.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C2.a(bundle, a.C0015a.f1690d, String.class, null);
            this.mTriggerTimeout = ((Long) C2.a(bundle, a.C0015a.f1691e, Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) C2.a(bundle, a.C0015a.f1692f, String.class, null);
            this.mTimedOutEventParams = (Bundle) C2.a(bundle, a.C0015a.f1693g, Bundle.class, null);
            this.mTriggeredEventName = (String) C2.a(bundle, a.C0015a.f1694h, String.class, null);
            this.mTriggeredEventParams = (Bundle) C2.a(bundle, a.C0015a.f1695i, Bundle.class, null);
            this.mTimeToLive = ((Long) C2.a(bundle, a.C0015a.f1696j, Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) C2.a(bundle, a.C0015a.f1697k, String.class, null);
            this.mExpiredEventParams = (Bundle) C2.a(bundle, a.C0015a.f1698l, Bundle.class, null);
            this.mActive = ((Boolean) C2.a(bundle, a.C0015a.f1700n, Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C2.a(bundle, a.C0015a.f1699m, Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C2.a(bundle, a.C0015a.f1701o, Long.class, 0L)).longValue();
        }

        @I0.a
        public ConditionalUserProperty(@N ConditionalUserProperty conditionalUserProperty) {
            C1285y.l(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                Object a4 = C1722t3.a(obj);
                this.mValue = a4;
                if (a4 == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            Bundle bundle = conditionalUserProperty.mTimedOutEventParams;
            if (bundle != null) {
                this.mTimedOutEventParams = new Bundle(bundle);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            Bundle bundle2 = conditionalUserProperty.mTriggeredEventParams;
            if (bundle2 != null) {
                this.mTriggeredEventParams = new Bundle(bundle2);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            Bundle bundle3 = conditionalUserProperty.mExpiredEventParams;
            if (bundle3 != null) {
                this.mExpiredEventParams = new Bundle(bundle3);
            }
        }
    }

    @D
    @I0.a
    /* loaded from: classes2.dex */
    public interface a extends G2 {
        @Override // com.google.android.gms.measurement.internal.G2
        @D
        @I0.a
        @j0
        void a(@N String str, @N String str2, @N Bundle bundle, long j4);
    }

    @D
    @I0.a
    /* loaded from: classes2.dex */
    public interface b extends H2 {
        @Override // com.google.android.gms.measurement.internal.H2
        @D
        @I0.a
        @j0
        void a(@N String str, @N String str2, @N Bundle bundle, long j4);
    }

    public AppMeasurement(C1638f2 c1638f2) {
        this.f30090a = new com.google.android.gms.measurement.b(c1638f2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @D
    @Y(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Keep
    @N
    @Deprecated
    @I0.a
    public static AppMeasurement getInstance(@N Context context) {
        if (f30089e == null) {
            synchronized (AppMeasurement.class) {
                if (f30089e == null) {
                    InterfaceC1693o3 interfaceC1693o3 = (InterfaceC1693o3) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (interfaceC1693o3 != null) {
                        f30089e = new AppMeasurement(interfaceC1693o3);
                    } else {
                        f30089e = new AppMeasurement(C1638f2.F(context, new C1468p0(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f30089e;
    }

    @I0.a
    @N
    public Boolean a() {
        return this.f30090a.l();
    }

    @I0.a
    @N
    public Double b() {
        return this.f30090a.m();
    }

    @Keep
    public void beginAdUnitExposure(@N @a0(min = 1) String str) {
        this.f30090a.f(str);
    }

    @I0.a
    @N
    public Integer c() {
        return this.f30090a.n();
    }

    @D
    @I0.a
    @Keep
    public void clearConditionalUserProperty(@N @a0(max = 24, min = 1) String str, @N String str2, @N Bundle bundle) {
        this.f30090a.h(str, str2, bundle);
    }

    @I0.a
    @N
    public Long d() {
        return this.f30090a.o();
    }

    @I0.a
    @N
    public String e() {
        return this.f30090a.p();
    }

    @Keep
    public void endAdUnitExposure(@N @a0(min = 1) String str) {
        this.f30090a.i(str);
    }

    @D
    @N
    @I0.a
    @j0
    public Map<String, Object> f(boolean z3) {
        return this.f30090a.q(z3);
    }

    @D
    @I0.a
    public void g(@N String str, @N String str2, @N Bundle bundle, long j4) {
        this.f30090a.c(str, str2, bundle, j4);
    }

    @Keep
    public long generateEventId() {
        return this.f30090a.zzb();
    }

    @Keep
    @N
    public String getAppInstanceId() {
        return this.f30090a.zzh();
    }

    @D
    @Keep
    @N
    @I0.a
    @j0
    public List<ConditionalUserProperty> getConditionalUserProperties(@N String str, @N @a0(max = 23, min = 1) String str2) {
        int size;
        List a4 = this.f30090a.a(str, str2);
        if (a4 == null) {
            size = 0;
        } else {
            size = a4.size();
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = a4.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @Keep
    @N
    public String getCurrentScreenClass() {
        return this.f30090a.zzi();
    }

    @Keep
    @N
    public String getCurrentScreenName() {
        return this.f30090a.zzj();
    }

    @Keep
    @N
    public String getGmpAppId() {
        return this.f30090a.zzk();
    }

    @D
    @Keep
    @I0.a
    @j0
    public int getMaxUserProperties(@N @a0(min = 1) String str) {
        return this.f30090a.zza(str);
    }

    @Keep
    @N
    @j0
    @com.google.android.gms.common.util.D
    protected Map<String, Object> getUserProperties(@N String str, @N @a0(max = 24, min = 1) String str2, boolean z3) {
        return this.f30090a.b(str, str2, z3);
    }

    @D
    @I0.a
    public void h(@N b bVar) {
        this.f30090a.k(bVar);
    }

    @D
    @I0.a
    @j0
    public void i(@N a aVar) {
        this.f30090a.j(aVar);
    }

    @D
    @I0.a
    public void j(@N b bVar) {
        this.f30090a.g(bVar);
    }

    @D
    @Keep
    public void logEventInternal(@N String str, @N String str2, @N Bundle bundle) {
        this.f30090a.e(str, str2, bundle);
    }

    @D
    @I0.a
    @Keep
    public void setConditionalUserProperty(@N ConditionalUserProperty conditionalUserProperty) {
        C1285y.l(conditionalUserProperty);
        e eVar = this.f30090a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString(a.C0015a.f1688b, str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            C2.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString(a.C0015a.f1690d, str4);
        }
        bundle.putLong(a.C0015a.f1691e, conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString(a.C0015a.f1692f, str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle(a.C0015a.f1693g, bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString(a.C0015a.f1694h, str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle(a.C0015a.f1695i, bundle3);
        }
        bundle.putLong(a.C0015a.f1696j, conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString(a.C0015a.f1697k, str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle(a.C0015a.f1698l, bundle4);
        }
        bundle.putLong(a.C0015a.f1699m, conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(a.C0015a.f1700n, conditionalUserProperty.mActive);
        bundle.putLong(a.C0015a.f1701o, conditionalUserProperty.mTriggeredTimestamp);
        eVar.d(bundle);
    }

    public AppMeasurement(InterfaceC1693o3 interfaceC1693o3) {
        this.f30090a = new c(interfaceC1693o3);
    }
}
