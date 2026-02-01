package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class A implements InterfaceC1030h {

    /* renamed from: a, reason: collision with root package name */
    private final String f23370a;

    public A(String str) {
        if (str != null) {
            this.f23370a = str;
            return;
        }
        throw new IllegalArgumentException("Credentials file path cannot be null");
    }

    @Override // com.amazonaws.auth.InterfaceC1030h
    public InterfaceC1029g a() {
        try {
            return new z(new File(this.f23370a));
        } catch (IOException e4) {
            throw new AmazonClientException("Unable to load AWS credentials from the " + this.f23370a + " file", e4);
        }
    }

    @Override // com.amazonaws.auth.InterfaceC1030h
    public void refresh() {
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f23370a + ")";
    }
}
