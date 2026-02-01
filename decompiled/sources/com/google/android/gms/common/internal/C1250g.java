package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.i;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@I0.a
@com.google.android.gms.common.util.D
/* renamed from: com.google.android.gms.common.internal.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1250g {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Account f28730a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Scope> f28731b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Scope> f28732c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<C1164a<?>, P> f28733d;

    /* renamed from: e, reason: collision with root package name */
    private final int f28734e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final View f28735f;

    /* renamed from: g, reason: collision with root package name */
    private final String f28736g;

    /* renamed from: h, reason: collision with root package name */
    private final String f28737h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.signin.a f28738i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f28739j;

    @I0.a
    /* renamed from: com.google.android.gms.common.internal.g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private Account f28740a;

        /* renamed from: b, reason: collision with root package name */
        private androidx.collection.c<Scope> f28741b;

        /* renamed from: c, reason: collision with root package name */
        private String f28742c;

        /* renamed from: d, reason: collision with root package name */
        private String f28743d;

        /* renamed from: e, reason: collision with root package name */
        private com.google.android.gms.signin.a f28744e = com.google.android.gms.signin.a.f31071N;

        @I0.a
        @androidx.annotation.N
        public C1250g a() {
            return new C1250g(this.f28740a, this.f28741b, null, 0, null, this.f28742c, this.f28743d, this.f28744e, false);
        }

        @I0.a
        @androidx.annotation.N
        public a b(@androidx.annotation.N String str) {
            this.f28742c = str;
            return this;
        }

        @androidx.annotation.N
        public final a c(@androidx.annotation.N Collection<Scope> collection) {
            if (this.f28741b == null) {
                this.f28741b = new androidx.collection.c<>();
            }
            this.f28741b.addAll(collection);
            return this;
        }

        @androidx.annotation.N
        public final a d(@Nullable Account account) {
            this.f28740a = account;
            return this;
        }

        @androidx.annotation.N
        public final a e(@androidx.annotation.N String str) {
            this.f28743d = str;
            return this;
        }
    }

    @I0.a
    public C1250g(@androidx.annotation.N Account account, @androidx.annotation.N Set<Scope> set, @androidx.annotation.N Map<C1164a<?>, P> map, int i4, @Nullable View view, @androidx.annotation.N String str, @androidx.annotation.N String str2, @Nullable com.google.android.gms.signin.a aVar) {
        this(account, set, map, i4, view, str, str2, aVar, false);
    }

    @I0.a
    @androidx.annotation.N
    public static C1250g a(@androidx.annotation.N Context context) {
        return new i.a(context).p();
    }

    @androidx.annotation.P
    @I0.a
    public Account b() {
        return this.f28730a;
    }

    @androidx.annotation.P
    @I0.a
    @Deprecated
    public String c() {
        Account account = this.f28730a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @I0.a
    @androidx.annotation.N
    public Account d() {
        Account account = this.f28730a;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", C1240b.f28682a);
    }

    @I0.a
    @androidx.annotation.N
    public Set<Scope> e() {
        return this.f28732c;
    }

    @I0.a
    @androidx.annotation.N
    public Set<Scope> f(@androidx.annotation.N C1164a<?> c1164a) {
        P p4 = this.f28733d.get(c1164a);
        if (p4 != null && !p4.f28637a.isEmpty()) {
            HashSet hashSet = new HashSet(this.f28731b);
            hashSet.addAll(p4.f28637a);
            return hashSet;
        }
        return this.f28731b;
    }

    @I0.a
    public int g() {
        return this.f28734e;
    }

    @I0.a
    @androidx.annotation.N
    public String h() {
        return this.f28736g;
    }

    @I0.a
    @androidx.annotation.N
    public Set<Scope> i() {
        return this.f28731b;
    }

    @androidx.annotation.P
    @I0.a
    public View j() {
        return this.f28735f;
    }

    @androidx.annotation.N
    public final com.google.android.gms.signin.a k() {
        return this.f28738i;
    }

    @androidx.annotation.P
    public final Integer l() {
        return this.f28739j;
    }

    @androidx.annotation.P
    public final String m() {
        return this.f28737h;
    }

    @androidx.annotation.N
    public final Map<C1164a<?>, P> n() {
        return this.f28733d;
    }

    public final void o(@androidx.annotation.N Integer num) {
        this.f28739j = num;
    }

    public C1250g(@Nullable Account account, @androidx.annotation.N Set<Scope> set, @androidx.annotation.N Map<C1164a<?>, P> map, int i4, @Nullable View view, @androidx.annotation.N String str, @androidx.annotation.N String str2, @Nullable com.google.android.gms.signin.a aVar, boolean z3) {
        this.f28730a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f28731b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f28733d = map;
        this.f28735f = view;
        this.f28734e = i4;
        this.f28736g = str;
        this.f28737h = str2;
        this.f28738i = aVar == null ? com.google.android.gms.signin.a.f31071N : aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator<P> it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().f28637a);
        }
        this.f28732c = Collections.unmodifiableSet(hashSet);
    }
}
