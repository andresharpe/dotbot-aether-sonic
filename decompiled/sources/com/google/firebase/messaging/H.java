package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public class H implements Closeable {

    /* renamed from: H, reason: collision with root package name */
    private static final int f36468H = 1048576;

    /* renamed from: E, reason: collision with root package name */
    private final URL f36469E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.P
    private volatile Future<?> f36470F;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.P
    private AbstractC1770k<Bitmap> f36471G;

    private H(URL url) {
        this.f36469E = url;
    }

    private byte[] c() throws IOException {
        URLConnection openConnection = this.f36469E.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] e4 = C1818c.e(C1818c.c(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable(C1821f.f36920a, 2)) {
                    Log.v(C1821f.f36920a, "Downloaded " + e4.length + " bytes from " + this.f36469E);
                }
                if (e4.length <= 1048576) {
                    return e4;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    @androidx.annotation.P
    public static H d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new H(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w(C1821f.f36920a, "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(C1771l c1771l) {
        try {
            c1771l.c(b());
        } catch (Exception e4) {
            c1771l.b(e4);
        }
    }

    public Bitmap b() throws IOException {
        if (Log.isLoggable(C1821f.f36920a, 4)) {
            Log.i(C1821f.f36920a, "Starting download of: " + this.f36469E);
        }
        byte[] c4 = c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c4, 0, c4.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable(C1821f.f36920a, 3)) {
                Log.d(C1821f.f36920a, "Successfully downloaded image: " + this.f36469E);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f36469E);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36470F.cancel(true);
    }

    public AbstractC1770k<Bitmap> f() {
        return (AbstractC1770k) C1285y.l(this.f36471G);
    }

    public void i(ExecutorService executorService) {
        final C1771l c1771l = new C1771l();
        this.f36470F = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.G
            @Override // java.lang.Runnable
            public final void run() {
                H.this.h(c1771l);
            }
        });
        this.f36471G = c1771l.a();
    }
}
