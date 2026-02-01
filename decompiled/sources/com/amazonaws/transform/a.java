package com.amazonaws.transform;

import com.amazonaws.AmazonServiceException;

/* loaded from: classes.dex */
public abstract class a<T> implements m<AmazonServiceException, T> {

    /* renamed from: a, reason: collision with root package name */
    protected final Class<? extends AmazonServiceException> f24211a;

    public a() {
        this(AmazonServiceException.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AmazonServiceException b(String str) throws Exception {
        return this.f24211a.getConstructor(String.class).newInstance(str);
    }

    public a(Class<? extends AmazonServiceException> cls) {
        this.f24211a = cls;
    }
}
