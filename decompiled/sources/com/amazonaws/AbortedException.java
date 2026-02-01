package com.amazonaws;

/* loaded from: classes.dex */
public class AbortedException extends AmazonClientException {

    /* renamed from: F, reason: collision with root package name */
    private static final long f23344F = 1;

    public AbortedException(String str, Throwable th) {
        super(str, th);
    }

    @Override // com.amazonaws.AmazonClientException
    public boolean a() {
        return false;
    }

    public AbortedException(Throwable th) {
        super("", th);
    }

    public AbortedException(String str) {
        super(str);
    }

    public AbortedException() {
        super("");
    }
}
