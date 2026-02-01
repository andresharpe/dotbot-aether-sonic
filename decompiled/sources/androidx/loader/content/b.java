package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.content.C0667b;
import androidx.core.os.C0742e;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* loaded from: classes.dex */
public class b extends a<Cursor> {

    /* renamed from: r, reason: collision with root package name */
    final c<Cursor>.a f15797r;

    /* renamed from: s, reason: collision with root package name */
    Uri f15798s;

    /* renamed from: t, reason: collision with root package name */
    String[] f15799t;

    /* renamed from: u, reason: collision with root package name */
    String f15800u;

    /* renamed from: v, reason: collision with root package name */
    String[] f15801v;

    /* renamed from: w, reason: collision with root package name */
    String f15802w;

    /* renamed from: x, reason: collision with root package name */
    Cursor f15803x;

    /* renamed from: y, reason: collision with root package name */
    C0742e f15804y;

    public b(@N Context context) {
        super(context);
        this.f15797r = new c.a();
    }

    @Override // androidx.loader.content.a
    public void D() {
        super.D();
        synchronized (this) {
            try {
                C0742e c0742e = this.f15804y;
                if (c0742e != null) {
                    c0742e.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.c
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void f(Cursor cursor) {
        if (l()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f15803x;
        this.f15803x = cursor;
        if (m()) {
            super.f(cursor);
        }
        if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
            cursor2.close();
        }
    }

    @P
    public String[] O() {
        return this.f15799t;
    }

    @P
    public String P() {
        return this.f15800u;
    }

    @P
    public String[] Q() {
        return this.f15801v;
    }

    @P
    public String R() {
        return this.f15802w;
    }

    @N
    public Uri S() {
        return this.f15798s;
    }

    @Override // androidx.loader.content.a
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Cursor I() {
        synchronized (this) {
            if (!H()) {
                this.f15804y = new C0742e();
            } else {
                throw new OperationCanceledException();
            }
        }
        try {
            Cursor a4 = C0667b.a(i().getContentResolver(), this.f15798s, this.f15799t, this.f15800u, this.f15801v, this.f15802w, this.f15804y);
            if (a4 != null) {
                try {
                    a4.getCount();
                    a4.registerContentObserver(this.f15797r);
                } catch (RuntimeException e4) {
                    a4.close();
                    throw e4;
                }
            }
            synchronized (this) {
                this.f15804y = null;
            }
            return a4;
        } catch (Throwable th) {
            synchronized (this) {
                this.f15804y = null;
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.a
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void J(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public void V(@P String[] strArr) {
        this.f15799t = strArr;
    }

    public void W(@P String str) {
        this.f15800u = str;
    }

    public void X(@P String[] strArr) {
        this.f15801v = strArr;
    }

    public void Y(@P String str) {
        this.f15802w = str;
    }

    public void Z(@N Uri uri) {
        this.f15798s = uri;
    }

    @Override // androidx.loader.content.a, androidx.loader.content.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f15798s);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f15799t));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f15800u);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f15801v));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f15802w);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f15803x);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f15812h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.loader.content.c
    public void r() {
        super.r();
        t();
        Cursor cursor = this.f15803x;
        if (cursor != null && !cursor.isClosed()) {
            this.f15803x.close();
        }
        this.f15803x = null;
    }

    @Override // androidx.loader.content.c
    protected void s() {
        Cursor cursor = this.f15803x;
        if (cursor != null) {
            f(cursor);
        }
        if (A() || this.f15803x == null) {
            h();
        }
    }

    @Override // androidx.loader.content.c
    protected void t() {
        b();
    }

    public b(@N Context context, @N Uri uri, @P String[] strArr, @P String str, @P String[] strArr2, @P String str2) {
        super(context);
        this.f15797r = new c.a();
        this.f15798s = uri;
        this.f15799t = strArr;
        this.f15800u = str;
        this.f15801v = strArr2;
        this.f15802w = str2;
    }
}
