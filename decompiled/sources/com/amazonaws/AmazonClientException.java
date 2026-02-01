package com.amazonaws;

/* loaded from: classes.dex */
public class AmazonClientException extends RuntimeException {

    /* renamed from: E, reason: collision with root package name */
    private static final long f23345E = 1;

    public AmazonClientException(String str, Throwable th) {
        super(str, th);
    }

    public boolean a() {
        return true;
    }

    public AmazonClientException(String str) {
        super(str);
    }

    public AmazonClientException(Throwable th) {
        super(th);
    }
}
