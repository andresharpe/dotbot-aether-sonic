package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.K;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.util.C0768i;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class c<D> {

    /* renamed from: a, reason: collision with root package name */
    int f15805a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC0148c<D> f15806b;

    /* renamed from: c, reason: collision with root package name */
    b<D> f15807c;

    /* renamed from: d, reason: collision with root package name */
    Context f15808d;

    /* renamed from: e, reason: collision with root package name */
    boolean f15809e = false;

    /* renamed from: f, reason: collision with root package name */
    boolean f15810f = false;

    /* renamed from: g, reason: collision with root package name */
    boolean f15811g = true;

    /* renamed from: h, reason: collision with root package name */
    boolean f15812h = false;

    /* renamed from: i, reason: collision with root package name */
    boolean f15813i = false;

    /* loaded from: classes.dex */
    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z3) {
            c.this.p();
        }
    }

    /* loaded from: classes.dex */
    public interface b<D> {
        void a(@N c<D> cVar);
    }

    /* renamed from: androidx.loader.content.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0148c<D> {
        void a(@N c<D> cVar, @P D d4);
    }

    public c(@N Context context) {
        this.f15808d = context.getApplicationContext();
    }

    public boolean A() {
        boolean z3 = this.f15812h;
        this.f15812h = false;
        this.f15813i |= z3;
        return z3;
    }

    @K
    public void B(@N InterfaceC0148c<D> interfaceC0148c) {
        InterfaceC0148c<D> interfaceC0148c2 = this.f15806b;
        if (interfaceC0148c2 != null) {
            if (interfaceC0148c2 == interfaceC0148c) {
                this.f15806b = null;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    @K
    public void C(@N b<D> bVar) {
        b<D> bVar2 = this.f15807c;
        if (bVar2 != null) {
            if (bVar2 == bVar) {
                this.f15807c = null;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    @K
    public void a() {
        this.f15810f = true;
        n();
    }

    @K
    public boolean b() {
        return o();
    }

    public void c() {
        this.f15813i = false;
    }

    @N
    public String d(@P D d4) {
        StringBuilder sb = new StringBuilder(64);
        C0768i.a(d4, sb);
        sb.append("}");
        return sb.toString();
    }

    @K
    public void e() {
        b<D> bVar = this.f15807c;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @K
    public void f(@P D d4) {
        InterfaceC0148c<D> interfaceC0148c = this.f15806b;
        if (interfaceC0148c != null) {
            interfaceC0148c.a(this, d4);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f15805a);
        printWriter.print(" mListener=");
        printWriter.println(this.f15806b);
        if (this.f15809e || this.f15812h || this.f15813i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f15809e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f15812h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f15813i);
        }
        if (this.f15810f || this.f15811g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f15810f);
            printWriter.print(" mReset=");
            printWriter.println(this.f15811g);
        }
    }

    @K
    public void h() {
        q();
    }

    @N
    public Context i() {
        return this.f15808d;
    }

    public int j() {
        return this.f15805a;
    }

    public boolean k() {
        return this.f15810f;
    }

    public boolean l() {
        return this.f15811g;
    }

    public boolean m() {
        return this.f15809e;
    }

    @K
    protected void n() {
    }

    @K
    protected boolean o() {
        return false;
    }

    @K
    public void p() {
        if (this.f15809e) {
            h();
        } else {
            this.f15812h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @K
    public void q() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @K
    public void r() {
    }

    @K
    protected void s() {
    }

    @K
    protected void t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0768i.a(this, sb);
        sb.append(" id=");
        sb.append(this.f15805a);
        sb.append("}");
        return sb.toString();
    }

    @K
    public void u(int i4, @N InterfaceC0148c<D> interfaceC0148c) {
        if (this.f15806b == null) {
            this.f15806b = interfaceC0148c;
            this.f15805a = i4;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @K
    public void v(@N b<D> bVar) {
        if (this.f15807c == null) {
            this.f15807c = bVar;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @K
    public void w() {
        r();
        this.f15811g = true;
        this.f15809e = false;
        this.f15810f = false;
        this.f15812h = false;
        this.f15813i = false;
    }

    public void x() {
        if (this.f15813i) {
            p();
        }
    }

    @K
    public final void y() {
        this.f15809e = true;
        this.f15811g = false;
        this.f15810f = false;
        s();
    }

    @K
    public void z() {
        this.f15809e = false;
        t();
    }
}
