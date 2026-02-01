package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.K;
import androidx.annotation.Keep;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.Y;
import androidx.annotation.a0;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.measurement.C1421j1;
import com.google.android.gms.measurement.internal.InterfaceC1693o3;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1773n;
import com.google.firebase.installations.i;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class FirebaseAnalytics {

    /* renamed from: c, reason: collision with root package name */
    private static volatile FirebaseAnalytics f34716c;

    /* renamed from: a, reason: collision with root package name */
    private final C1421j1 f34717a;

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f34718b;

    /* loaded from: classes2.dex */
    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    /* loaded from: classes2.dex */
    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: A, reason: collision with root package name */
        @N
        public static final String f34719A = "screen_view";

        /* renamed from: B, reason: collision with root package name */
        @N
        public static final String f34720B = "remove_from_cart";

        /* renamed from: C, reason: collision with root package name */
        @N
        public static final String f34721C = "add_shipping_info";

        /* renamed from: D, reason: collision with root package name */
        @N
        public static final String f34722D = "purchase";

        /* renamed from: E, reason: collision with root package name */
        @N
        public static final String f34723E = "refund";

        /* renamed from: F, reason: collision with root package name */
        @N
        public static final String f34724F = "select_item";

        /* renamed from: G, reason: collision with root package name */
        @N
        public static final String f34725G = "select_promotion";

        /* renamed from: H, reason: collision with root package name */
        @N
        public static final String f34726H = "view_cart";

        /* renamed from: I, reason: collision with root package name */
        @N
        public static final String f34727I = "view_promotion";

        /* renamed from: a, reason: collision with root package name */
        @N
        public static final String f34728a = "ad_impression";

        /* renamed from: b, reason: collision with root package name */
        @N
        public static final String f34729b = "add_payment_info";

        /* renamed from: c, reason: collision with root package name */
        @N
        public static final String f34730c = "add_to_cart";

        /* renamed from: d, reason: collision with root package name */
        @N
        public static final String f34731d = "add_to_wishlist";

        /* renamed from: e, reason: collision with root package name */
        @N
        public static final String f34732e = "app_open";

        /* renamed from: f, reason: collision with root package name */
        @N
        public static final String f34733f = "begin_checkout";

        /* renamed from: g, reason: collision with root package name */
        @N
        public static final String f34734g = "campaign_details";

        /* renamed from: h, reason: collision with root package name */
        @N
        public static final String f34735h = "generate_lead";

        /* renamed from: i, reason: collision with root package name */
        @N
        public static final String f34736i = "join_group";

        /* renamed from: j, reason: collision with root package name */
        @N
        public static final String f34737j = "level_end";

        /* renamed from: k, reason: collision with root package name */
        @N
        public static final String f34738k = "level_start";

        /* renamed from: l, reason: collision with root package name */
        @N
        public static final String f34739l = "level_up";

        /* renamed from: m, reason: collision with root package name */
        @N
        public static final String f34740m = "login";

        /* renamed from: n, reason: collision with root package name */
        @N
        public static final String f34741n = "post_score";

        /* renamed from: o, reason: collision with root package name */
        @N
        public static final String f34742o = "search";

        /* renamed from: p, reason: collision with root package name */
        @N
        public static final String f34743p = "select_content";

        /* renamed from: q, reason: collision with root package name */
        @N
        public static final String f34744q = "share";

        /* renamed from: r, reason: collision with root package name */
        @N
        public static final String f34745r = "sign_up";

        /* renamed from: s, reason: collision with root package name */
        @N
        public static final String f34746s = "spend_virtual_currency";

        /* renamed from: t, reason: collision with root package name */
        @N
        public static final String f34747t = "tutorial_begin";

        /* renamed from: u, reason: collision with root package name */
        @N
        public static final String f34748u = "tutorial_complete";

        /* renamed from: v, reason: collision with root package name */
        @N
        public static final String f34749v = "unlock_achievement";

        /* renamed from: w, reason: collision with root package name */
        @N
        public static final String f34750w = "view_item";

        /* renamed from: x, reason: collision with root package name */
        @N
        public static final String f34751x = "view_item_list";

        /* renamed from: y, reason: collision with root package name */
        @N
        public static final String f34752y = "view_search_results";

        /* renamed from: z, reason: collision with root package name */
        @N
        public static final String f34753z = "earn_virtual_currency";

        protected a() {
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: A, reason: collision with root package name */
        @N
        public static final String f34754A = "origin";

        /* renamed from: B, reason: collision with root package name */
        @N
        public static final String f34755B = "price";

        /* renamed from: C, reason: collision with root package name */
        @N
        public static final String f34756C = "quantity";

        /* renamed from: D, reason: collision with root package name */
        @N
        public static final String f34757D = "score";

        /* renamed from: E, reason: collision with root package name */
        @N
        public static final String f34758E = "shipping";

        /* renamed from: F, reason: collision with root package name */
        @N
        public static final String f34759F = "transaction_id";

        /* renamed from: G, reason: collision with root package name */
        @N
        public static final String f34760G = "search_term";

        /* renamed from: H, reason: collision with root package name */
        @N
        public static final String f34761H = "success";

        /* renamed from: I, reason: collision with root package name */
        @N
        public static final String f34762I = "tax";

        /* renamed from: J, reason: collision with root package name */
        @N
        public static final String f34763J = "value";

        /* renamed from: K, reason: collision with root package name */
        @N
        public static final String f34764K = "virtual_currency_name";

        /* renamed from: L, reason: collision with root package name */
        @N
        public static final String f34765L = "campaign";

        /* renamed from: M, reason: collision with root package name */
        @N
        public static final String f34766M = "source";

        /* renamed from: N, reason: collision with root package name */
        @N
        public static final String f34767N = "medium";

        /* renamed from: O, reason: collision with root package name */
        @N
        public static final String f34768O = "term";

        /* renamed from: P, reason: collision with root package name */
        @N
        public static final String f34769P = "content";

        /* renamed from: Q, reason: collision with root package name */
        @N
        public static final String f34770Q = "aclid";

        /* renamed from: R, reason: collision with root package name */
        @N
        public static final String f34771R = "cp1";

        /* renamed from: S, reason: collision with root package name */
        @N
        public static final String f34772S = "item_brand";

        /* renamed from: T, reason: collision with root package name */
        @N
        public static final String f34773T = "item_variant";

        /* renamed from: U, reason: collision with root package name */
        @N
        public static final String f34774U = "creative_name";

        /* renamed from: V, reason: collision with root package name */
        @N
        public static final String f34775V = "creative_slot";

        /* renamed from: W, reason: collision with root package name */
        @N
        public static final String f34776W = "affiliation";

        /* renamed from: X, reason: collision with root package name */
        @N
        public static final String f34777X = "index";

        /* renamed from: Y, reason: collision with root package name */
        @N
        public static final String f34778Y = "discount";

        /* renamed from: Z, reason: collision with root package name */
        @N
        public static final String f34779Z = "item_category2";

        /* renamed from: a, reason: collision with root package name */
        @N
        public static final String f34780a = "achievement_id";

        /* renamed from: a0, reason: collision with root package name */
        @N
        public static final String f34781a0 = "item_category3";

        /* renamed from: b, reason: collision with root package name */
        @N
        public static final String f34782b = "ad_format";

        /* renamed from: b0, reason: collision with root package name */
        @N
        public static final String f34783b0 = "item_category4";

        /* renamed from: c, reason: collision with root package name */
        @N
        public static final String f34784c = "ad_platform";

        /* renamed from: c0, reason: collision with root package name */
        @N
        public static final String f34785c0 = "item_category5";

        /* renamed from: d, reason: collision with root package name */
        @N
        public static final String f34786d = "ad_source";

        /* renamed from: d0, reason: collision with root package name */
        @N
        public static final String f34787d0 = "item_list_id";

        /* renamed from: e, reason: collision with root package name */
        @N
        public static final String f34788e = "ad_unit_name";

        /* renamed from: e0, reason: collision with root package name */
        @N
        public static final String f34789e0 = "item_list_name";

        /* renamed from: f, reason: collision with root package name */
        @N
        public static final String f34790f = "character";

        /* renamed from: f0, reason: collision with root package name */
        @N
        public static final String f34791f0 = "items";

        /* renamed from: g, reason: collision with root package name */
        @N
        public static final String f34792g = "travel_class";

        /* renamed from: g0, reason: collision with root package name */
        @N
        public static final String f34793g0 = "location_id";

        /* renamed from: h, reason: collision with root package name */
        @N
        public static final String f34794h = "content_type";

        /* renamed from: h0, reason: collision with root package name */
        @N
        public static final String f34795h0 = "payment_type";

        /* renamed from: i, reason: collision with root package name */
        @N
        public static final String f34796i = "currency";

        /* renamed from: i0, reason: collision with root package name */
        @N
        public static final String f34797i0 = "promotion_id";

        /* renamed from: j, reason: collision with root package name */
        @N
        public static final String f34798j = "coupon";

        /* renamed from: j0, reason: collision with root package name */
        @N
        public static final String f34799j0 = "promotion_name";

        /* renamed from: k, reason: collision with root package name */
        @N
        public static final String f34800k = "start_date";

        /* renamed from: k0, reason: collision with root package name */
        @N
        public static final String f34801k0 = "screen_class";

        /* renamed from: l, reason: collision with root package name */
        @N
        public static final String f34802l = "end_date";

        /* renamed from: l0, reason: collision with root package name */
        @N
        public static final String f34803l0 = "screen_name";

        /* renamed from: m, reason: collision with root package name */
        @N
        public static final String f34804m = "extend_session";

        /* renamed from: m0, reason: collision with root package name */
        @N
        public static final String f34805m0 = "shipping_tier";

        /* renamed from: n, reason: collision with root package name */
        @N
        public static final String f34806n = "flight_number";

        /* renamed from: o, reason: collision with root package name */
        @N
        public static final String f34807o = "group_id";

        /* renamed from: p, reason: collision with root package name */
        @N
        public static final String f34808p = "item_category";

        /* renamed from: q, reason: collision with root package name */
        @N
        public static final String f34809q = "item_id";

        /* renamed from: r, reason: collision with root package name */
        @N
        public static final String f34810r = "item_name";

        /* renamed from: s, reason: collision with root package name */
        @N
        public static final String f34811s = "location";

        /* renamed from: t, reason: collision with root package name */
        @N
        public static final String f34812t = "level";

        /* renamed from: u, reason: collision with root package name */
        @N
        public static final String f34813u = "level_name";

        /* renamed from: v, reason: collision with root package name */
        @N
        public static final String f34814v = "method";

        /* renamed from: w, reason: collision with root package name */
        @N
        public static final String f34815w = "number_of_nights";

        /* renamed from: x, reason: collision with root package name */
        @N
        public static final String f34816x = "number_of_passengers";

        /* renamed from: y, reason: collision with root package name */
        @N
        public static final String f34817y = "number_of_rooms";

        /* renamed from: z, reason: collision with root package name */
        @N
        public static final String f34818z = "destination";

        protected b() {
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @N
        public static final String f34819a = "sign_up_method";

        /* renamed from: b, reason: collision with root package name */
        @N
        public static final String f34820b = "allow_personalized_ads";

        protected c() {
        }
    }

    public FirebaseAnalytics(C1421j1 c1421j1) {
        C1285y.l(c1421j1);
        this.f34717a = c1421j1;
    }

    @Y(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Keep
    @N
    public static FirebaseAnalytics getInstance(@N Context context) {
        if (f34716c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f34716c == null) {
                        f34716c = new FirebaseAnalytics(C1421j1.C(context, null, null, null, null));
                    }
                } finally {
                }
            }
        }
        return f34716c;
    }

    @P
    @Keep
    public static InterfaceC1693o3 getScionFrontendApiImplementation(Context context, @P Bundle bundle) {
        C1421j1 C3 = C1421j1.C(context, null, null, null, bundle);
        if (C3 == null) {
            return null;
        }
        return new com.google.firebase.analytics.c(C3);
    }

    @N
    public AbstractC1770k<String> a() {
        ExecutorService executorService;
        try {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (this.f34718b == null) {
                        this.f34718b = new com.google.firebase.analytics.a(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                    }
                    executorService = this.f34718b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return C1773n.d(executorService, new com.google.firebase.analytics.b(this));
        } catch (RuntimeException e4) {
            this.f34717a.a(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return C1773n.f(e4);
        }
    }

    public void b(@N @a0(max = 40, min = 1) String str, @P Bundle bundle) {
        this.f34717a.T(str, bundle);
    }

    public void c() {
        this.f34717a.c();
    }

    public void d(boolean z3) {
        this.f34717a.k(Boolean.valueOf(z3));
    }

    public void e(@N Map<ConsentType, ConsentStatus> map) {
        Bundle bundle = new Bundle();
        ConsentStatus consentStatus = map.get(ConsentType.AD_STORAGE);
        if (consentStatus != null) {
            int ordinal = consentStatus.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    bundle.putString("ad_storage", "denied");
                }
            } else {
                bundle.putString("ad_storage", "granted");
            }
        }
        ConsentStatus consentStatus2 = map.get(ConsentType.ANALYTICS_STORAGE);
        if (consentStatus2 != null) {
            int ordinal2 = consentStatus2.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    bundle.putString("analytics_storage", "denied");
                }
            } else {
                bundle.putString("analytics_storage", "granted");
            }
        }
        this.f34717a.f(bundle);
    }

    public void f(@P Bundle bundle) {
        this.f34717a.i(bundle);
    }

    public void g(long j4) {
        this.f34717a.l(j4);
    }

    @Keep
    @N
    public String getFirebaseInstanceId() {
        try {
            return (String) C1773n.b(i.s().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            throw new IllegalStateException(e4);
        } catch (ExecutionException e5) {
            throw new IllegalStateException(e5.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public void h(@P String str) {
        this.f34717a.m(str);
    }

    public void i(@N @a0(max = 24, min = 1) String str, @P @a0(max = 36) String str2) {
        this.f34717a.n(null, str, str2, false);
    }

    @Keep
    @K
    @Deprecated
    public void setCurrentScreen(@N Activity activity, @P @a0(max = 36, min = 1) String str, @P @a0(max = 36, min = 1) String str2) {
        this.f34717a.g(activity, str, str2);
    }
}
