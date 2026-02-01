package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import java.io.IOException;
import java.io.InputStream;

@Deprecated
/* loaded from: classes.dex */
public class r implements InterfaceC1030h {

    /* renamed from: b, reason: collision with root package name */
    private static String f23496b = "AwsCredentials.properties";

    /* renamed from: a, reason: collision with root package name */
    private final String f23497a;

    public r() {
        this(f23496b);
    }

    @Override // com.amazonaws.auth.InterfaceC1030h
    public InterfaceC1029g a() {
        InputStream resourceAsStream = getClass().getResourceAsStream(this.f23497a);
        if (resourceAsStream != null) {
            try {
                return new z(resourceAsStream);
            } catch (IOException e4) {
                throw new AmazonClientException("Unable to load AWS credentials from the " + this.f23497a + " file on the classpath", e4);
            }
        }
        throw new AmazonClientException("Unable to load AWS credentials from the " + this.f23497a + " file on the classpath");
    }

    @Override // com.amazonaws.auth.InterfaceC1030h
    public void refresh() {
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f23497a + ")";
    }

    public r(String str) {
        if (str != null) {
            if (!str.startsWith("/")) {
                this.f23497a = "/" + str;
                return;
            }
            this.f23497a = str;
            return;
        }
        throw new IllegalArgumentException("Credentials file path cannot be null");
    }
}
