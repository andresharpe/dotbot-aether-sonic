package androidx.loader.app;

import android.os.Bundle;
import androidx.annotation.K;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.lifecycle.E;
import androidx.lifecycle.q0;
import androidx.loader.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0145a<D> {
        @K
        void a(@N c<D> cVar, D d4);

        @N
        @K
        c<D> b(int i4, @P Bundle bundle);

        @K
        void c(@N c<D> cVar);
    }

    public static void c(boolean z3) {
        b.f15748d = z3;
    }

    @N
    public static <T extends E & q0> a d(@N T t3) {
        return new b(t3, t3.getViewModelStore());
    }

    @K
    public abstract void a(int i4);

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @P
    public abstract <D> c<D> e(int i4);

    public boolean f() {
        return false;
    }

    @N
    @K
    public abstract <D> c<D> g(int i4, @P Bundle bundle, @N InterfaceC0145a<D> interfaceC0145a);

    public abstract void h();

    @N
    @K
    public abstract <D> c<D> i(int i4, @P Bundle bundle, @N InterfaceC0145a<D> interfaceC0145a);
}
