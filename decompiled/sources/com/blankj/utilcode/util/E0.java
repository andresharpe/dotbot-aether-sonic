package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import com.blankj.utilcode.util.y0;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static Application f24750a;

    /* loaded from: classes.dex */
    public static class a {
        public void a(@androidx.annotation.N Activity activity) {
        }

        public void b(@androidx.annotation.N Activity activity) {
        }

        public void c(@androidx.annotation.N Activity activity) {
        }

        public void d(@androidx.annotation.N Activity activity) {
        }

        public void e(@androidx.annotation.N Activity activity) {
        }

        public void f(@androidx.annotation.N Activity activity) {
        }

        public void g(@androidx.annotation.N Activity activity, Lifecycle.Event event) {
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void accept(T t3);
    }

    /* loaded from: classes.dex */
    public interface c<Ret, Par> {
        Ret a(Par par);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(Activity activity);

        void b(Activity activity);
    }

    /* loaded from: classes.dex */
    public interface e<T> {
        T get();
    }

    /* loaded from: classes.dex */
    public static abstract class f<Result> extends y0.e<Result> {

        /* renamed from: S, reason: collision with root package name */
        private b<Result> f24751S;

        public f(b<Result> bVar) {
            this.f24751S = bVar;
        }

        @Override // com.blankj.utilcode.util.y0.g
        public void m(Result result) {
            b<Result> bVar = this.f24751S;
            if (bVar != null) {
                bVar.accept(result);
            }
        }
    }

    private E0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static Application a() {
        Application application = f24750a;
        if (application != null) {
            return application;
        }
        b(H0.L());
        if (f24750a != null) {
            Log.i("Utils", H0.N() + " reflect app success.");
            return f24750a;
        }
        throw new NullPointerException("reflect failed.");
    }

    public static void b(Application application) {
        if (application == null) {
            Log.e("Utils", "app is null.");
            return;
        }
        Application application2 = f24750a;
        if (application2 == null) {
            f24750a = application;
            H0.l0(application);
            H0.L0();
        } else {
            if (application2.equals(application)) {
                return;
            }
            H0.e1(f24750a);
            f24750a = application;
            H0.l0(application);
        }
    }
}
