package com.google.android.gms.measurement.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.C1821f;

/* loaded from: classes2.dex */
public final class D2 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f30145a = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_background", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", FirebaseAnalytics.a.f34728a, FirebaseAnalytics.a.f34719A, "ga_extra_parameter", "firebase_campaign"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f30146b = {FirebaseAnalytics.a.f34728a};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f30147c = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_ab", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", C1821f.C0339f.f36999l, "_err", "_f", "_v", "_iap", C1821f.C0339f.f37002o, C1821f.C0339f.f37003p, C1821f.C0339f.f37001n, C1821f.C0339f.f37000m, "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", C1821f.C0339f.f36999l};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f30148d = {"purchase", "refund", FirebaseAnalytics.a.f34729b, FirebaseAnalytics.a.f34721C, FirebaseAnalytics.a.f34730c, FirebaseAnalytics.a.f34731d, FirebaseAnalytics.a.f34733f, FirebaseAnalytics.a.f34720B, FirebaseAnalytics.a.f34724F, FirebaseAnalytics.a.f34725G, FirebaseAnalytics.a.f34726H, FirebaseAnalytics.a.f34750w, FirebaseAnalytics.a.f34751x, FirebaseAnalytics.a.f34727I, "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", FirebaseAnalytics.a.f34743p, FirebaseAnalytics.a.f34752y};

    public static String a(String str) {
        return C1722t3.b(str, f30147c, f30145a);
    }

    public static String b(String str) {
        return C1722t3.b(str, f30145a, f30147c);
    }
}
