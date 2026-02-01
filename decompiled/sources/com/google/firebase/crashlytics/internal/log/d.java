package com.google.firebase.crashlytics.internal.log;

import com.google.firebase.crashlytics.internal.common.C1799g;
import com.google.firebase.crashlytics.internal.f;
import com.google.firebase.crashlytics.internal.log.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes2.dex */
class d implements com.google.firebase.crashlytics.internal.log.a {

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f35257d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final File f35258a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35259b;

    /* renamed from: c, reason: collision with root package name */
    private c f35260c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements c.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f35261a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f35262b;

        a(byte[] bArr, int[] iArr) {
            this.f35261a = bArr;
            this.f35262b = iArr;
        }

        @Override // com.google.firebase.crashlytics.internal.log.c.d
        public void d(InputStream inputStream, int i4) throws IOException {
            try {
                inputStream.read(this.f35261a, this.f35262b[0], i4);
                int[] iArr = this.f35262b;
                iArr[0] = iArr[0] + i4;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f35264a;

        /* renamed from: b, reason: collision with root package name */
        public final int f35265b;

        b(byte[] bArr, int i4) {
            this.f35264a = bArr;
            this.f35265b = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(File file, int i4) {
        this.f35258a = file;
        this.f35259b = i4;
    }

    private void f(long j4, String str) {
        if (this.f35260c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i4 = this.f35259b / 4;
            if (str.length() > i4) {
                str = "..." + str.substring(str.length() - i4);
            }
            this.f35260c.f(String.format(Locale.US, "%d %s%n", Long.valueOf(j4), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f35257d));
            while (!this.f35260c.p() && this.f35260c.i0() > this.f35259b) {
                this.f35260c.P();
            }
        } catch (IOException e4) {
            f.f().e("There was a problem writing to the Crashlytics log.", e4);
        }
    }

    private b g() {
        if (!this.f35258a.exists()) {
            return null;
        }
        h();
        c cVar = this.f35260c;
        if (cVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[cVar.i0()];
        try {
            this.f35260c.k(new a(bArr, iArr));
        } catch (IOException e4) {
            f.f().e("A problem occurred while reading the Crashlytics log file.", e4);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f35260c == null) {
            try {
                this.f35260c = new c(this.f35258a);
            } catch (IOException e4) {
                f.f().e("Could not open log file: " + this.f35258a, e4);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.log.a
    public void a() {
        C1799g.e(this.f35260c, "There was a problem closing the Crashlytics log file.");
        this.f35260c = null;
    }

    @Override // com.google.firebase.crashlytics.internal.log.a
    public String b() {
        byte[] c4 = c();
        if (c4 != null) {
            return new String(c4, f35257d);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.log.a
    public byte[] c() {
        b g4 = g();
        if (g4 == null) {
            return null;
        }
        int i4 = g4.f35265b;
        byte[] bArr = new byte[i4];
        System.arraycopy(g4.f35264a, 0, bArr, 0, i4);
        return bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.log.a
    public void d() {
        a();
        this.f35258a.delete();
    }

    @Override // com.google.firebase.crashlytics.internal.log.a
    public void e(long j4, String str) {
        h();
        f(j4, str);
    }
}
