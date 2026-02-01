package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.C1131a;
import com.google.auto.value.AutoValue;

/* JADX INFO: Access modifiers changed from: package-private */
@AutoValue
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1135e {

    /* renamed from: b, reason: collision with root package name */
    private static final int f27666b = 200;

    /* renamed from: c, reason: collision with root package name */
    private static final int f27667c = 10000;

    /* renamed from: a, reason: collision with root package name */
    private static final long f27665a = 10485760;

    /* renamed from: d, reason: collision with root package name */
    private static final long f27668d = 604800000;

    /* renamed from: e, reason: collision with root package name */
    private static final int f27669e = 81920;

    /* renamed from: f, reason: collision with root package name */
    static final AbstractC1135e f27670f = a().f(f27665a).d(200).b(10000).c(f27668d).e(f27669e).a();

    /* JADX INFO: Access modifiers changed from: package-private */
    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.e$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        abstract AbstractC1135e a();

        abstract a b(int i4);

        abstract a c(long j4);

        abstract a d(int i4);

        abstract a e(int i4);

        abstract a f(long j4);
    }

    static a a() {
        return new C1131a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long f();

    a g() {
        return a().f(f()).d(d()).b(b()).c(c()).e(e());
    }
}
