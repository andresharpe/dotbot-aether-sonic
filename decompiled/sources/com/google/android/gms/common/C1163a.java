package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1285y;
import java.util.ArrayList;
import java.util.List;
import l1.InterfaceC2354a;

/* renamed from: com.google.android.gms.common.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1163a {

    /* renamed from: com.google.android.gms.common.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0263a {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.P
        private Account f27996a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f27997b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.P
        private ArrayList f27998c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.P
        private ArrayList f27999d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f28000e;

        /* renamed from: f, reason: collision with root package name */
        @androidx.annotation.P
        private String f28001f;

        /* renamed from: g, reason: collision with root package name */
        @androidx.annotation.P
        private Bundle f28002g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f28003h;

        /* renamed from: i, reason: collision with root package name */
        private int f28004i;

        /* renamed from: j, reason: collision with root package name */
        @androidx.annotation.P
        private String f28005j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f28006k;

        /* renamed from: l, reason: collision with root package name */
        @androidx.annotation.P
        private C1310x f28007l;

        /* renamed from: m, reason: collision with root package name */
        @androidx.annotation.P
        private String f28008m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f28009n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f28010o;

        /* renamed from: com.google.android.gms.common.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0264a {

            /* renamed from: a, reason: collision with root package name */
            @androidx.annotation.P
            private Account f28011a;

            /* renamed from: b, reason: collision with root package name */
            @androidx.annotation.P
            private ArrayList f28012b;

            /* renamed from: c, reason: collision with root package name */
            @androidx.annotation.P
            private ArrayList f28013c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f28014d = false;

            /* renamed from: e, reason: collision with root package name */
            @androidx.annotation.P
            private String f28015e;

            /* renamed from: f, reason: collision with root package name */
            @androidx.annotation.P
            private Bundle f28016f;

            @androidx.annotation.N
            public C0263a a() {
                C1285y.b(true, "We only support hostedDomain filter for account chip styled account picker");
                C1285y.b(true, "Consent is only valid for account chip styled account picker");
                C0263a c0263a = new C0263a();
                c0263a.f27999d = this.f28013c;
                c0263a.f27998c = this.f28012b;
                c0263a.f28000e = this.f28014d;
                c0263a.f28007l = null;
                c0263a.f28005j = null;
                c0263a.f28002g = this.f28016f;
                c0263a.f27996a = this.f28011a;
                c0263a.f27997b = false;
                c0263a.f28003h = false;
                c0263a.f28008m = null;
                c0263a.f28004i = 0;
                c0263a.f28001f = this.f28015e;
                c0263a.f28006k = false;
                c0263a.f28009n = false;
                c0263a.f28010o = false;
                return c0263a;
            }

            @InterfaceC2354a
            @androidx.annotation.N
            public C0264a b(@androidx.annotation.P List<Account> list) {
                ArrayList arrayList;
                if (list == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(list);
                }
                this.f28012b = arrayList;
                return this;
            }

            @InterfaceC2354a
            @androidx.annotation.N
            public C0264a c(@androidx.annotation.P List<String> list) {
                ArrayList arrayList;
                if (list == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(list);
                }
                this.f28013c = arrayList;
                return this;
            }

            @InterfaceC2354a
            @androidx.annotation.N
            public C0264a d(boolean z3) {
                this.f28014d = z3;
                return this;
            }

            @InterfaceC2354a
            @androidx.annotation.N
            public C0264a e(@androidx.annotation.P Bundle bundle) {
                this.f28016f = bundle;
                return this;
            }

            @InterfaceC2354a
            @androidx.annotation.N
            public C0264a f(@androidx.annotation.P Account account) {
                this.f28011a = account;
                return this;
            }

            @InterfaceC2354a
            @androidx.annotation.N
            public C0264a g(@androidx.annotation.P String str) {
                this.f28015e = str;
                return this;
            }
        }

        static /* bridge */ /* synthetic */ boolean D(C0263a c0263a) {
            boolean z3 = c0263a.f28009n;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean a(C0263a c0263a) {
            boolean z3 = c0263a.f28010o;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean b(C0263a c0263a) {
            boolean z3 = c0263a.f27997b;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean c(C0263a c0263a) {
            boolean z3 = c0263a.f28003h;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean d(C0263a c0263a) {
            boolean z3 = c0263a.f28006k;
            return false;
        }

        static /* bridge */ /* synthetic */ int e(C0263a c0263a) {
            int i4 = c0263a.f28004i;
            return 0;
        }

        static /* bridge */ /* synthetic */ C1310x h(C0263a c0263a) {
            C1310x c1310x = c0263a.f28007l;
            return null;
        }

        static /* bridge */ /* synthetic */ String i(C0263a c0263a) {
            String str = c0263a.f28005j;
            return null;
        }

        static /* bridge */ /* synthetic */ String j(C0263a c0263a) {
            String str = c0263a.f28008m;
            return null;
        }
    }

    private C1163a() {
    }

    @androidx.annotation.N
    @Deprecated
    public static Intent a(@androidx.annotation.P Account account, @androidx.annotation.P ArrayList<Account> arrayList, @androidx.annotation.P String[] strArr, boolean z3, @androidx.annotation.P String str, @androidx.annotation.P String str2, @androidx.annotation.P String[] strArr2, @androidx.annotation.P Bundle bundle) {
        Intent intent = new Intent();
        C1285y.b(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z3);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        return intent;
    }

    @androidx.annotation.N
    public static Intent b(@androidx.annotation.N C0263a c0263a) {
        Intent intent = new Intent();
        C0263a.d(c0263a);
        C0263a.i(c0263a);
        C1285y.b(true, "We only support hostedDomain filter for account chip styled account picker");
        C0263a.h(c0263a);
        C1285y.b(true, "Consent is only valid for account chip styled account picker");
        C0263a.b(c0263a);
        C1285y.b(true, "Making the selected account non-clickable is only supported for the theme THEME_DAY_NIGHT_GOOGLE_MATERIAL2");
        C0263a.d(c0263a);
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", c0263a.f27998c);
        if (c0263a.f27999d != null) {
            intent.putExtra("allowableAccountTypes", (String[]) c0263a.f27999d.toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", c0263a.f28002g);
        intent.putExtra("selectedAccount", c0263a.f27996a);
        C0263a.b(c0263a);
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", c0263a.f28000e);
        intent.putExtra("descriptionTextOverride", c0263a.f28001f);
        C0263a.c(c0263a);
        intent.putExtra("setGmsCoreAccount", false);
        C0263a.j(c0263a);
        intent.putExtra("realClientPackage", (String) null);
        C0263a.e(c0263a);
        intent.putExtra("overrideTheme", 0);
        C0263a.d(c0263a);
        intent.putExtra("overrideCustomTheme", 0);
        C0263a.i(c0263a);
        intent.putExtra("hostedDomainFilter", (String) null);
        Bundle bundle = new Bundle();
        C0263a.d(c0263a);
        C0263a.h(c0263a);
        C0263a.D(c0263a);
        C0263a.a(c0263a);
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
