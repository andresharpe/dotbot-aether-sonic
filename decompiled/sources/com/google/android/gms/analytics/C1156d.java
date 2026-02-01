package com.google.android.gms.analytics;

import android.content.Context;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.analytics.f;
import com.google.android.gms.internal.gtm.zzfc;
import java.lang.Thread;
import java.util.ArrayList;

@com.google.android.gms.common.util.D
/* renamed from: com.google.android.gms.analytics.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1156d implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    @P
    private final Thread.UncaughtExceptionHandler f27758a;

    /* renamed from: b, reason: collision with root package name */
    private final i f27759b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f27760c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private InterfaceC1155c f27761d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private C1157e f27762e;

    public C1156d(@N i iVar, @P Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @N Context context) {
        String name;
        if (iVar != null) {
            if (context != null) {
                this.f27758a = uncaughtExceptionHandler;
                this.f27759b = iVar;
                this.f27761d = new h(context, new ArrayList());
                this.f27760c = context.getApplicationContext();
                if (uncaughtExceptionHandler == null) {
                    name = "null";
                } else {
                    name = uncaughtExceptionHandler.getClass().getName();
                }
                zzfc.zzd("ExceptionReporter created, original handler is ".concat(name));
                return;
            }
            throw new NullPointerException("context cannot be null");
        }
        throw new NullPointerException("tracker cannot be null");
    }

    @P
    public InterfaceC1155c a() {
        return this.f27761d;
    }

    public void b(@P InterfaceC1155c interfaceC1155c) {
        this.f27761d = interfaceC1155c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public final Thread.UncaughtExceptionHandler c() {
        return this.f27758a;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@N Thread thread, @N Throwable th) {
        String str;
        String str2;
        if (this.f27761d != null) {
            if (thread != null) {
                str2 = thread.getName();
            } else {
                str2 = null;
            }
            str = this.f27761d.a(str2, th);
        } else {
            str = "UncaughtException";
        }
        zzfc.zzd("Reporting uncaught exception: ".concat(String.valueOf(str)));
        i iVar = this.f27759b;
        f.c cVar = new f.c();
        cVar.q(str);
        cVar.r(true);
        iVar.h(cVar.d());
        if (this.f27762e == null) {
            this.f27762e = C1157e.k(this.f27760c);
        }
        C1157e c1157e = this.f27762e;
        c1157e.h();
        c1157e.e().zzf().zzn();
        if (this.f27758a != null) {
            zzfc.zzd("Passing exception to the original handler");
            this.f27758a.uncaughtException(thread, th);
        }
    }
}
