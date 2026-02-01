package r2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.N;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.harman.log.f;
import com.harman.rating.model.RatingBlackList;
import com.harman.rating.model.RatingEventStorage;
import com.harman.rating.model.RatingGuideType;
import com.harman.rating.model.RatingRemoteConfig;
import com.harman.rating.model.UserAction;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.z;
import l3.d;
import l3.e;
import q2.InterfaceC2399a;
import r0.InterfaceC2401a;

@U({"SMAP\nRatingInAppDefaultImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RatingInAppDefaultImpl.kt\ncom/harman/rating/impl/RatingInAppDefaultImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,317:1\n1855#2,2:318\n1855#2,2:320\n*S KotlinDebug\n*F\n+ 1 RatingInAppDefaultImpl.kt\ncom/harman/rating/impl/RatingInAppDefaultImpl\n*L\n104#1:318,2\n291#1:320,2\n*E\n"})
/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2405a implements InterfaceC2399a {

    /* renamed from: h, reason: collision with root package name */
    @d
    private static final String f57441h = "RatingInApp";

    /* renamed from: a, reason: collision with root package name */
    @d
    private final Context f57443a;

    /* renamed from: b, reason: collision with root package name */
    private final Gson f57444b;

    /* renamed from: c, reason: collision with root package name */
    @e
    private RatingRemoteConfig f57445c;

    /* renamed from: d, reason: collision with root package name */
    @d
    private final AtomicBoolean f57446d;

    /* renamed from: e, reason: collision with root package name */
    @d
    private final AtomicBoolean f57447e;

    /* renamed from: f, reason: collision with root package name */
    @d
    private RatingEventStorage f57448f;

    /* renamed from: g, reason: collision with root package name */
    @d
    public static final C0542a f57440g = new C0542a(null);

    /* renamed from: i, reason: collision with root package name */
    @d
    private static final String f57442i = C2405a.class.getSimpleName() + ":RatingInAppShareP";

    /* renamed from: r2.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0542a {
        public /* synthetic */ C0542a(C2197u c2197u) {
            this();
        }

        private C0542a() {
        }
    }

    public C2405a(@d Context context, @d @N String remoteConfigStr) {
        String string;
        F.p(context, "context");
        F.p(remoteConfigStr, "remoteConfigStr");
        this.f57443a = context;
        Gson create = new GsonBuilder().setPrettyPrinting().create();
        this.f57444b = create;
        this.f57446d = new AtomicBoolean(false);
        this.f57447e = new AtomicBoolean(false);
        this.f57448f = new RatingEventStorage(null, null, null, null, 15, null);
        SharedPreferences m4 = m();
        if (m4 != null && (string = m4.getString(f57442i, "")) != null) {
            try {
                Object fromJson = create.fromJson(string, (Class<Object>) RatingEventStorage.class);
                F.o(fromJson, "fromJson(...)");
                this.f57448f = (RatingEventStorage) fromJson;
            } catch (Exception unused) {
            }
        }
        try {
            this.f57445c = (RatingRemoteConfig) this.f57444b.fromJson(remoteConfigStr, RatingRemoteConfig.class);
        } catch (JsonParseException unused2) {
        }
    }

    private final void l() {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        f.a(f57441h, "cached user action : " + this.f57448f);
        SharedPreferences m4 = m();
        if (m4 != null && (edit = m4.edit()) != null && (putString = edit.putString(f57442i, this.f57444b.toJson(this.f57448f))) != null) {
            putString.apply();
        }
    }

    private final SharedPreferences m() {
        Context context = this.f57443a;
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
    }

    private final boolean n() {
        List<String> l4;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        RatingRemoteConfig ratingRemoteConfig = this.f57445c;
        if (ratingRemoteConfig != null && (l4 = ratingRemoteConfig.l()) != null) {
            for (String str : l4) {
                try {
                    PackageManager packageManager = this.f57443a.getPackageManager();
                    if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 0)) != null && (applicationInfo = packageInfo.applicationInfo) != null && applicationInfo.enabled) {
                        return true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    private final boolean o(String str) {
        RatingBlackList j4;
        Map<String, String> h4;
        RatingRemoteConfig ratingRemoteConfig = this.f57445c;
        if (ratingRemoteConfig == null || (j4 = ratingRemoteConfig.j()) == null || (h4 = j4.h()) == null || !h4.containsKey(str)) {
            return false;
        }
        return true;
    }

    private final boolean p() {
        RatingBlackList j4;
        Map<String, String> i4;
        RatingRemoteConfig ratingRemoteConfig = this.f57445c;
        if (ratingRemoteConfig == null || (j4 = ratingRemoteConfig.j()) == null || (i4 = j4.i()) == null || !i4.containsKey(Build.MODEL)) {
            return false;
        }
        return true;
    }

    private final boolean q() {
        RatingBlackList j4;
        List<String> j5;
        RatingRemoteConfig ratingRemoteConfig = this.f57445c;
        if (ratingRemoteConfig == null || (j4 = ratingRemoteConfig.j()) == null || (j5 = j4.j()) == null || !j5.contains(String.valueOf(Build.VERSION.SDK_INT))) {
            return false;
        }
        return true;
    }

    private final boolean r() {
        RatingBlackList j4;
        List<String> g4;
        RatingRemoteConfig ratingRemoteConfig = this.f57445c;
        if (ratingRemoteConfig == null || (j4 = ratingRemoteConfig.j()) == null || (g4 = j4.g()) == null || !g4.contains("3.12.20")) {
            return false;
        }
        return true;
    }

    @Override // q2.InterfaceC2399a
    public void a(@d UserAction userAction) {
        boolean K12;
        F.p(userAction, "userAction");
        K12 = z.K1("3.12.20", this.f57448f.g(), true);
        if (!K12) {
            g();
        }
        UserAction userAction2 = UserAction.ACTION_NEVER;
        if (userAction != userAction2 && userAction != UserAction.ACTION_NOT_NOW && userAction != UserAction.ACTION_RATE_US) {
            f.a(f57441h, "Invalid parameter : " + userAction);
            return;
        }
        if (i() != userAction2 && i() != UserAction.ACTION_RATE_US) {
            if (this.f57446d.getAndSet(true)) {
                f.a(f57441h, "Don't log user action repeatedly in one app life cycle!");
                return;
            }
            this.f57448f.l(userAction);
            RatingEventStorage.ActionRecord actionRecord = this.f57448f.j().get(userAction);
            if (actionRecord == null) {
                actionRecord = new RatingEventStorage.ActionRecord(0L, 0, 3, null);
            }
            actionRecord.g(actionRecord.e() + 1);
            actionRecord.h(System.currentTimeMillis());
            this.f57448f.j().put(userAction, actionRecord);
            this.f57448f.m(new HashMap());
            l();
            return;
        }
        f.a(f57441h, "Ignore log user action because last action is : " + i());
    }

    @Override // q2.InterfaceC2399a
    public long b(@d UserAction userAction) {
        F.p(userAction, "userAction");
        RatingEventStorage.ActionRecord actionRecord = this.f57448f.j().get(userAction);
        if (actionRecord != null) {
            return actionRecord.f();
        }
        return 0L;
    }

    @Override // q2.InterfaceC2399a
    public int c(@d UserAction userAction) {
        F.p(userAction, "userAction");
        RatingEventStorage.ActionRecord actionRecord = this.f57448f.j().get(userAction);
        if (actionRecord != null) {
            return actionRecord.e();
        }
        return 0;
    }

    @Override // q2.InterfaceC2399a
    @e
    public RatingRemoteConfig d() {
        return this.f57445c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q2.InterfaceC2399a
    public void e(@d String devicePid, @d String eventName) {
        boolean K12;
        Object[] objArr;
        long j4;
        int i4;
        int i5;
        RatingEventStorage.EventRecord eventRecord;
        RatingEventStorage.EventRecord eventRecord2;
        F.p(devicePid, "devicePid");
        F.p(eventName, "eventName");
        f.a(f57441h, "logTriggerEvent: " + eventName + ", pid : " + devicePid);
        if (k(devicePid)) {
            K12 = z.K1("3.12.20", this.f57448f.g(), true);
            if (!K12) {
                g();
            }
            if (i() != UserAction.ACTION_NEVER && i() != UserAction.ACTION_RATE_US) {
                long currentTimeMillis = System.currentTimeMillis();
                UserAction userAction = UserAction.ACTION_NOT_NOW;
                int i6 = 0;
                if (currentTimeMillis < b(userAction)) {
                    RatingEventStorage.ActionRecord actionRecord = this.f57448f.j().get(userAction);
                    if (actionRecord != null) {
                        actionRecord.h(currentTimeMillis);
                    }
                    objArr = true;
                } else {
                    objArr = false;
                }
                Map<String, RatingEventStorage.EventRecord> map = this.f57448f.i().get(devicePid);
                long j5 = 0;
                if (map != null && (eventRecord2 = map.get(eventName)) != null) {
                    j4 = eventRecord2.f();
                } else {
                    j4 = 0;
                }
                Integer num = null;
                RatingEventStorage.EventRecord eventRecord3 = null;
                if (currentTimeMillis < j4) {
                    Map<String, RatingEventStorage.EventRecord> map2 = this.f57448f.i().get(devicePid);
                    if (map2 != null) {
                        eventRecord3 = map2.get(eventName);
                    }
                    if (eventRecord3 != null) {
                        eventRecord3.h(currentTimeMillis);
                    }
                } else if (objArr == false) {
                    RatingRemoteConfig ratingRemoteConfig = this.f57445c;
                    if (ratingRemoteConfig != null) {
                        i4 = ratingRemoteConfig.k();
                    } else {
                        i4 = 0;
                    }
                    if (currentTimeMillis < (i4 * InterfaceC2401a.f57375d * 1000) + b(userAction)) {
                        f.a(f57441h, "In sink period, ignore this trigger event!");
                        return;
                    }
                    RatingRemoteConfig ratingRemoteConfig2 = this.f57445c;
                    if (ratingRemoteConfig2 != null) {
                        i5 = ratingRemoteConfig2.n();
                    } else {
                        i5 = 0;
                    }
                    long j6 = i5 * 3600 * 1000;
                    Map<String, RatingEventStorage.EventRecord> map3 = this.f57448f.i().get(devicePid);
                    if (map3 != null && (eventRecord = map3.get(eventName)) != null) {
                        j5 = eventRecord.f();
                    }
                    if (currentTimeMillis < j6 + j5) {
                        RatingRemoteConfig ratingRemoteConfig3 = this.f57445c;
                        if (ratingRemoteConfig3 != null) {
                            num = Integer.valueOf(ratingRemoteConfig3.n());
                        }
                        f.a(f57441h, "Ignore this event " + eventName + ", event interval is " + num + " hours!");
                        return;
                    }
                    if (this.f57447e.getAndSet(true)) {
                        f.a(f57441h, "Trigger event logged more than 1 time in this app life cycle! Ignore this log action!");
                        return;
                    }
                    Map<String, RatingEventStorage.EventRecord> map4 = this.f57448f.i().get(devicePid);
                    if (map4 == null) {
                        map4 = new HashMap<>();
                        map4.put(eventName, new RatingEventStorage.EventRecord(currentTimeMillis, 0));
                    }
                    RatingEventStorage.EventRecord eventRecord4 = map4.get(eventName);
                    if (eventRecord4 != null) {
                        i6 = eventRecord4.e();
                    }
                    map4.put(eventName, new RatingEventStorage.EventRecord(currentTimeMillis, i6 + 1));
                    this.f57448f.i().put(devicePid, map4);
                    l();
                    return;
                }
                f.a(f57441h, "Legacy time is incorrect, sync action / event time with current time!");
                l();
                return;
            }
            f.a(f57441h, "Ignore log trigger event " + eventName + " because last action is : " + i());
        }
    }

    @Override // q2.InterfaceC2399a
    @e
    public RatingEventStorage f() {
        return this.f57448f;
    }

    @Override // q2.InterfaceC2399a
    public void g() {
        this.f57448f = new RatingEventStorage(null, null, null, null, 15, null);
        l();
    }

    @Override // q2.InterfaceC2399a
    public int h(@d String devicePid, @d String eventName) {
        RatingEventStorage.EventRecord eventRecord;
        F.p(devicePid, "devicePid");
        F.p(eventName, "eventName");
        Map<String, RatingEventStorage.EventRecord> map = this.f57448f.i().get(devicePid);
        if (map != null && (eventRecord = map.get(eventName)) != null) {
            return eventRecord.e();
        }
        return 0;
    }

    @Override // q2.InterfaceC2399a
    @d
    public UserAction i() {
        return this.f57448f.h();
    }

    @Override // q2.InterfaceC2399a
    @d
    public RatingGuideType j(@d String devicePid) {
        int i4;
        List<RatingRemoteConfig.Condition> o4;
        F.p(devicePid, "devicePid");
        RatingGuideType ratingGuideType = RatingGuideType.RATING_NONE;
        if (!k(devicePid)) {
            return ratingGuideType;
        }
        if (i() != UserAction.ACTION_RATE_US && i() != UserAction.ACTION_NEVER) {
            if (this.f57446d.get()) {
                f.a(f57441h, "Ignore requesting show rating guide dialog repeatedly in one app life cycle!");
                return ratingGuideType;
            }
            long currentTimeMillis = System.currentTimeMillis();
            RatingRemoteConfig ratingRemoteConfig = this.f57445c;
            if (ratingRemoteConfig != null) {
                i4 = ratingRemoteConfig.k();
            } else {
                i4 = 0;
            }
            if (currentTimeMillis < (i4 * InterfaceC2401a.f57375d * 1000) + b(UserAction.ACTION_NOT_NOW)) {
                f.a(f57441h, "Don't show rating guide dialog in sink period!");
                return ratingGuideType;
            }
            RatingRemoteConfig ratingRemoteConfig2 = this.f57445c;
            if (ratingRemoteConfig2 != null && (o4 = ratingRemoteConfig2.o()) != null) {
                for (RatingRemoteConfig.Condition condition : o4) {
                    if (condition.f() <= h(devicePid, condition.e())) {
                        int c4 = c(UserAction.ACTION_NOT_NOW) + 1;
                        RatingRemoteConfig ratingRemoteConfig3 = this.f57445c;
                        F.m(ratingRemoteConfig3);
                        if (c4 < ratingRemoteConfig3.m()) {
                            return RatingGuideType.RATING_WITH_NOT_NOW;
                        }
                        return RatingGuideType.RATING_WITH_NEVER;
                    }
                }
            }
            return RatingGuideType.RATING_NONE;
        }
        return ratingGuideType;
    }

    @Override // q2.InterfaceC2399a
    public boolean k(@d String devicePid) {
        RatingRemoteConfig ratingRemoteConfig;
        List<RatingRemoteConfig.Condition> o4;
        F.p(devicePid, "devicePid");
        RatingRemoteConfig ratingRemoteConfig2 = this.f57445c;
        if (ratingRemoteConfig2 != null && ratingRemoteConfig2.p() && (ratingRemoteConfig = this.f57445c) != null && (o4 = ratingRemoteConfig.o()) != null && (!o4.isEmpty()) && !p() && !r() && !q() && !o(devicePid) && n()) {
            return true;
        }
        return false;
    }
}
