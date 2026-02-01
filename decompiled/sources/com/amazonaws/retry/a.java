package com.amazonaws.retry;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.retry.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Random;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final int f23906b = 100;

    /* renamed from: c, reason: collision with root package name */
    private static final int f23907c = 20000;

    /* renamed from: d, reason: collision with root package name */
    public static final int f23908d = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f23910f = 10;

    /* renamed from: a, reason: collision with root package name */
    public static final com.amazonaws.retry.b f23905a = new com.amazonaws.retry.b(b.InterfaceC0205b.f23922a, b.a.f23921a, 0, false);

    /* renamed from: h, reason: collision with root package name */
    public static final b.InterfaceC0205b f23912h = new c();

    /* renamed from: i, reason: collision with root package name */
    public static final b.a f23913i = new b(100, 20000);

    /* renamed from: e, reason: collision with root package name */
    public static final com.amazonaws.retry.b f23909e = a();

    /* renamed from: g, reason: collision with root package name */
    public static final com.amazonaws.retry.b f23911g = c();

    /* loaded from: classes.dex */
    private static final class b implements b.a {

        /* renamed from: b, reason: collision with root package name */
        private final Random f23914b;

        /* renamed from: c, reason: collision with root package name */
        private final int f23915c;

        /* renamed from: d, reason: collision with root package name */
        private final int f23916d;

        @Override // com.amazonaws.retry.b.a
        public final long a(com.amazonaws.b bVar, AmazonClientException amazonClientException, int i4) {
            if (i4 <= 0) {
                return 0L;
            }
            return this.f23914b.nextInt(Math.min(this.f23916d, (1 << i4) * this.f23915c));
        }

        private b(int i4, int i5) {
            this.f23914b = new Random();
            this.f23915c = i4;
            this.f23916d = i5;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements b.InterfaceC0205b {
        @Override // com.amazonaws.retry.b.InterfaceC0205b
        public boolean a(com.amazonaws.b bVar, AmazonClientException amazonClientException, int i4) {
            if ((amazonClientException.getCause() instanceof IOException) && !(amazonClientException.getCause() instanceof InterruptedIOException)) {
                return true;
            }
            if (amazonClientException instanceof AmazonServiceException) {
                AmazonServiceException amazonServiceException = (AmazonServiceException) amazonClientException;
                int g4 = amazonServiceException.g();
                if (g4 == 500 || g4 == 503 || g4 == 502 || g4 == 504 || com.amazonaws.retry.c.d(amazonServiceException) || com.amazonaws.retry.c.a(amazonServiceException)) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    public static com.amazonaws.retry.b a() {
        return new com.amazonaws.retry.b(f23912h, f23913i, 3, true);
    }

    public static com.amazonaws.retry.b b(int i4) {
        return new com.amazonaws.retry.b(f23912h, f23913i, i4, false);
    }

    public static com.amazonaws.retry.b c() {
        return new com.amazonaws.retry.b(f23912h, f23913i, 10, true);
    }

    public static com.amazonaws.retry.b d(int i4) {
        return new com.amazonaws.retry.b(f23912h, f23913i, i4, false);
    }
}
