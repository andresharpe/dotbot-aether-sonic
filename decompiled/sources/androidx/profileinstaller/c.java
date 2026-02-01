package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.profileinstaller.j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY})
@W(19)
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final AssetManager f17310a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final Executor f17311b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final j.d f17312c;

    /* renamed from: e, reason: collision with root package name */
    @N
    private final File f17314e;

    /* renamed from: f, reason: collision with root package name */
    @N
    private final String f17315f;

    /* renamed from: g, reason: collision with root package name */
    @N
    private final String f17316g;

    /* renamed from: h, reason: collision with root package name */
    @N
    private final String f17317h;

    /* renamed from: j, reason: collision with root package name */
    @P
    private d[] f17319j;

    /* renamed from: k, reason: collision with root package name */
    @P
    private byte[] f17320k;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17318i = false;

    /* renamed from: d, reason: collision with root package name */
    @P
    private final byte[] f17313d = d();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public c(@N AssetManager assetManager, @N Executor executor, @N j.d dVar, @N String str, @N String str2, @N String str3, @N File file) {
        this.f17310a = assetManager;
        this.f17311b = executor;
        this.f17312c = dVar;
        this.f17315f = str;
        this.f17316g = str2;
        this.f17317h = str3;
        this.f17314e = file;
    }

    @P
    private c b(d[] dVarArr, byte[] bArr) {
        InputStream h4;
        try {
            h4 = h(this.f17310a, this.f17317h);
        } catch (FileNotFoundException e4) {
            this.f17312c.b(9, e4);
        } catch (IOException e5) {
            this.f17312c.b(7, e5);
        } catch (IllegalStateException e6) {
            this.f17319j = null;
            this.f17312c.b(8, e6);
        }
        if (h4 != null) {
            try {
                this.f17319j = o.q(h4, o.o(h4, o.f17381g), bArr, dVarArr);
                h4.close();
                return this;
            } catch (Throwable th) {
                try {
                    h4.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (h4 != null) {
            h4.close();
        }
        return null;
    }

    private void c() {
        if (this.f17318i) {
        } else {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    @P
    private static byte[] d() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 33) {
            return null;
        }
        switch (i4) {
            case 24:
            case 25:
                return q.f17411e;
            case 26:
                return q.f17410d;
            case 27:
                return q.f17409c;
            case 28:
            case ConstraintLayout.b.a.f9571D /* 29 */:
            case 30:
                return q.f17408b;
            case ConstraintLayout.b.a.f9573F /* 31 */:
            case 32:
            case 33:
                return q.f17407a;
            default:
                return null;
        }
    }

    @P
    private InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f17316g);
        } catch (FileNotFoundException e4) {
            this.f17312c.b(6, e4);
            return null;
        } catch (IOException e5) {
            this.f17312c.b(7, e5);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i4, Object obj) {
        this.f17312c.b(i4, obj);
    }

    @P
    private InputStream h(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f17312c.a(5, null);
            }
            return null;
        }
    }

    @P
    private d[] j(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        d[] w3 = o.w(inputStream, o.o(inputStream, o.f17380f), this.f17315f);
                        try {
                            inputStream.close();
                            return w3;
                        } catch (IOException e4) {
                            this.f17312c.b(7, e4);
                            return w3;
                        }
                    } catch (IOException e5) {
                        this.f17312c.b(7, e5);
                        return null;
                    }
                } catch (IllegalStateException e6) {
                    this.f17312c.b(8, e6);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e7) {
                this.f17312c.b(7, e7);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e8) {
                this.f17312c.b(7, e8);
            }
            throw th;
        }
    }

    private static boolean k() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 33) {
            return false;
        }
        if (i4 != 24 && i4 != 25) {
            switch (i4) {
                case ConstraintLayout.b.a.f9573F /* 31 */:
                case 32:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private void l(final int i4, @P final Object obj) {
        this.f17311b.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.g(i4, obj);
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean e() {
        if (this.f17313d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f17314e.canWrite()) {
            l(4, null);
            return false;
        }
        this.f17318i = true;
        return true;
    }

    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public c i() {
        c b4;
        c();
        if (this.f17313d == null) {
            return this;
        }
        InputStream f4 = f(this.f17310a);
        if (f4 != null) {
            this.f17319j = j(f4);
        }
        d[] dVarArr = this.f17319j;
        if (dVarArr != null && k() && (b4 = b(dVarArr, this.f17313d)) != null) {
            return b4;
        }
        return this;
    }

    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public c m() {
        ByteArrayOutputStream byteArrayOutputStream;
        d[] dVarArr = this.f17319j;
        byte[] bArr = this.f17313d;
        if (dVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    o.E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e4) {
                this.f17312c.b(7, e4);
            } catch (IllegalStateException e5) {
                this.f17312c.b(8, e5);
            }
            if (!o.B(byteArrayOutputStream, bArr, dVarArr)) {
                this.f17312c.b(5, null);
                this.f17319j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f17320k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f17319j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean n() {
        byte[] bArr = this.f17320k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f17314e);
                    try {
                        e.l(byteArrayInputStream, fileOutputStream);
                        l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.f17320k = null;
                this.f17319j = null;
            }
        } catch (FileNotFoundException e4) {
            l(6, e4);
            return false;
        } catch (IOException e5) {
            l(7, e5);
            return false;
        }
    }
}
